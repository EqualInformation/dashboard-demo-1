package com.vaadin.addon.charts.model.style;

/**
 * Created by bpupadhyaya on 12/25/15.
 */
import com.vaadin.addon.charts.model.AbstractConfigurationObject;

public class AxisStyle extends AbstractConfigurationObject {
    private TickIntervalStyle minorTickInterval;
    private Color lineColor;
    private Number lineWidth;
    private Number tickWidth;
    private Color tickColor;
    private Color gridLineColor;
    private Number gridLineWidth;
    private Color alternateGridColor;
    private final StyleWrapper title = new StyleWrapper();
    private final StyleWrapper subtitle = new StyleWrapper();
    private final StyleWrapper labels = new StyleWrapper();

    public AxisStyle() {
    }

    public TickIntervalStyle getMinorTickInterval() {
        return this.minorTickInterval;
    }

    public void setMinorTickInterval(TickIntervalStyle minorTickInterval) {
        this.minorTickInterval = minorTickInterval;
    }

    public Color getLineColor() {
        return this.lineColor;
    }

    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }

    public Number getLineWidth() {
        return this.lineWidth;
    }

    public void setLineWidth(Number lineWidth) {
        this.lineWidth = lineWidth;
    }

    public Number getTickWidth() {
        return this.tickWidth;
    }

    public void setTickWidth(Number tickWidth) {
        this.tickWidth = tickWidth;
    }

    public Color getTickColor() {
        return this.tickColor;
    }

    public void setTickColor(Color tickColor) {
        this.tickColor = tickColor;
    }

    public Style getTitle() {
        return this.title.getStyle();
    }

    public void setTitle(Style style) {
        this.title.setStyle(style);
    }

    public Style getSubtitle() {
        return this.subtitle.getStyle();
    }

    public void setSubtitle(Style style) {
        this.subtitle.setStyle(style);
    }

    public Style getLabels() {
        return this.labels.getStyle();
    }

    public void setLabels(Style style) {
        this.labels.setStyle(style);
    }

    public Number getGridLineWidth() {
        return this.gridLineWidth;
    }

    public void setGridLineWidth(Number gridLineWidth) {
        this.gridLineWidth = gridLineWidth;
    }

    public Color getAlternateGridColor() {
        return this.alternateGridColor;
    }

    public void setAlternateGridColor(Color alternateGridColor) {
        this.alternateGridColor = alternateGridColor;
    }

    public Color getGridLineColor() {
        return this.gridLineColor;
    }

    public void setGridLineColor(Color gridLineColor) {
        this.gridLineColor = gridLineColor;
    }
}
