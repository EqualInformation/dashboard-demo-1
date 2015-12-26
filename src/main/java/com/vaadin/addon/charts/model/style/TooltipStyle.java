package com.vaadin.addon.charts.model.style;

/**
 * Created by bpupadhyaya on 12/25/15.
 */
import com.vaadin.addon.charts.model.AbstractConfigurationObject;

public class TooltipStyle extends AbstractConfigurationObject {
    private Color backgroundColor;
    private Number borderWidth;
    private Number borderRadius;
    private Boolean followPointer = Boolean.valueOf(false);
    private Style style = new Style();

    public TooltipStyle() {
    }

    public Color getBackgroundColor() {
        return this.backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Number getBorderWidth() {
        return this.borderWidth;
    }

    public void setBorderWidth(Number borderWidth) {
        this.borderWidth = borderWidth;
    }

    public Style getStyle() {
        return this.style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public Number getBorderRadius() {
        return this.borderRadius;
    }

    public void setBorderRadius(Number borderRadius) {
        this.borderRadius = borderRadius;
    }

    public Boolean getFollowPointer() {
        return this.followPointer;
    }

    public void setFollowPointer(Boolean followPointer) {
        this.followPointer = followPointer;
    }
}
