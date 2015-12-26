package com.vaadin.addon.charts.util;

/**
 * Created by bpupadhyaya on 12/25/15.
 */

import com.vaadin.addon.charts.model.Unit;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SizeWithUnit implements Serializable {
    public static String pattern = "^(-?\\d*(?:\\.\\d+)?)(%|px)?$";
    public static final Pattern sizePattern;
    private float size;
    private Unit unit;

    public SizeWithUnit(float size, Unit unit) {
        this.size = size;
        this.unit = unit;
    }

    public float getSize() {
        return this.size;
    }

    public Unit getUnit() {
        return this.unit;
    }

    public static SizeWithUnit parseStringSize(String s, Unit defaultUnit) {
        if(s == null) {
            return null;
        } else {
            s = s.trim();
            if("".equals(s)) {
                return null;
            } else {
                float size = 0.0F;
                Unit unit = null;
                Matcher matcher = sizePattern.matcher(s);
                if(!matcher.find()) {
                    throw new IllegalArgumentException("Invalid size argument: \"" + s + "\" (should match " + sizePattern.pattern() + ")");
                } else {
                    size = Float.parseFloat(matcher.group(1));
                    if(size < 0.0F) {
                        size = -1.0F;
                        unit = Unit.PIXELS;
                    } else {
                        String symbol = matcher.group(2);
                        if((symbol == null || symbol.length() <= 0) && defaultUnit != null) {
                            unit = defaultUnit;
                        } else {
                            unit = Unit.getUnitFromSymbol(symbol);
                        }
                    }

                    return new SizeWithUnit(size, unit);
                }
            }
        }
    }

    public static SizeWithUnit parseStringSize(String s) {
        return parseStringSize(s, (Unit)null);
    }

    static {
        sizePattern = Pattern.compile(pattern);
    }
}
