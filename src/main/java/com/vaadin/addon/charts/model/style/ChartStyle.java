package com.vaadin.addon.charts.model.style;

/**
 * Created by bpupadhyaya on 12/25/15.
 */
import com.vaadin.addon.charts.model.AbstractConfigurationObject;

public class ChartStyle extends AbstractConfigurationObject {
    private Color backgroundColor;
    private Color plotBackgroundColor;
    private String plotBackgroundImage;
    private Boolean plotShadow;
    private Number plotBorderWidth;
    private Color plotBorderColor;
    private String className;
    private Number borderWidth;
    private Number borderRadius;
    private Style style;

    public ChartStyle() {
    }

    public Color getBackgroundColor() {
        return this.backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Color getPlotBackgroundColor() {
        return this.plotBackgroundColor;
    }

    public void setPlotBackgroundColor(Color plotBackgroundColor) {
        this.plotBackgroundColor = plotBackgroundColor;
    }

    public String getPlotBackgroundImage() {
        return this.plotBackgroundImage;
    }

    public void setPlotBackgroundImage(String plotBackgroundImage) {
        this.plotBackgroundImage = plotBackgroundImage;
    }

    public Boolean isPlotShadow() {
        return this.plotShadow;
    }

    public void setPlotShadow(Boolean plotShadow) {
        this.plotShadow = plotShadow;
    }

    public Number getPlotBorderWidth() {
        return this.plotBorderWidth;
    }

    public void setPlotBorderWidth(Number plotBorderWidth) {
        this.plotBorderWidth = plotBorderWidth;
    }

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Number getBorderWidth() {
        return this.borderWidth;
    }

    public void setBorderWidth(Number borderWidth) {
        this.borderWidth = borderWidth;
    }

    public Number getBorderRadius() {
        return this.borderRadius;
    }

    public void setBorderRadius(Number borderRadius) {
        this.borderRadius = borderRadius;
    }

    public Color getPlotBorderColor() {
        return this.plotBorderColor;
    }

    public void setPlotBorderColor(Color plotBorderColor) {
        this.plotBorderColor = plotBorderColor;
    }

    public Style getStyle() {
        return this.style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }
}
