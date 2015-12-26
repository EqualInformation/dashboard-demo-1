package com.vaadin.addon.charts.model.style;

/**
 * Created by bpupadhyaya on 12/25/15.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GradientColor implements Color {
    private List<List<Object>> stops;
    private GradientColor.RadialGradient radialGradient;
    private GradientColor.LinearGradient linearGradient;

    private GradientColor() {
    }

    public GradientColor.LinearGradient getLinearGradient() {
        return this.linearGradient;
    }

    public GradientColor.RadialGradient getRadialGradient() {
        return this.radialGradient;
    }

    List<List<Object>> getStops() {
        return this.stops;
    }

    public void addColorStop(double d, SolidColor color) {
        if(this.stops == null) {
            this.stops = new ArrayList();
        }

        ArrayList colorStop = new ArrayList(2);
        colorStop.add(Double.valueOf(d));
        colorStop.add(color);
        this.stops.add(colorStop);
    }

    public static GradientColor createLinear(double startX, double startY, double endX, double endY) {
        GradientColor ret = new GradientColor();
        ret.linearGradient = new GradientColor.LinearGradient(startX, startY, endX, endY);
        return ret;
    }

    public static GradientColor createRadial(double centerX, double centerY, double radius) {
        GradientColor ret = new GradientColor();
        ret.radialGradient = new GradientColor.RadialGradient(centerX, centerY, radius);
        return ret;
    }

    public static class LinearGradient implements Serializable {
        private final Number x1;
        private final Number y1;
        private final Number x2;
        private final Number y2;

        public LinearGradient(double x1, double y1, double x2, double y2) {
            this.x1 = Double.valueOf(x1);
            this.y1 = Double.valueOf(y1);
            this.x2 = Double.valueOf(x2);
            this.y2 = Double.valueOf(y2);
        }

        public Number getX1() {
            return this.x1;
        }

        public Number getY1() {
            return this.y1;
        }

        public Number getX2() {
            return this.x2;
        }

        public Number getY2() {
            return this.y2;
        }
    }

    public static class RadialGradient implements Serializable {
        private final Number cx;
        private final Number cy;
        private final Number r;

        public RadialGradient(double centerX, double centerY, double radius) {
            this.cx = Double.valueOf(centerX);
            this.cy = Double.valueOf(centerY);
            this.r = Double.valueOf(radius);
        }

        public Number getCx() {
            return this.cx;
        }

        public Number getCy() {
            return this.cy;
        }

        public Number getR() {
            return this.r;
        }
    }
}

