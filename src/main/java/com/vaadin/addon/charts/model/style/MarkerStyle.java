package com.vaadin.addon.charts.model.style;

/**
 * Created by bpupadhyaya on 12/25/15.
 */
import com.vaadin.addon.charts.model.AbstractConfigurationObject;

public class MarkerStyle extends AbstractConfigurationObject {
    private Color lineColor;

    public MarkerStyle() {
    }

    public Color getLineColor() {
        return this.lineColor;
    }

    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }
}
