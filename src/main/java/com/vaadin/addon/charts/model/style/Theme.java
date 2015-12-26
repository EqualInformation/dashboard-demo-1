package com.vaadin.addon.charts.model.style;

/**
 * Created by bpupadhyaya on 12/25/15.
 */
import com.vaadin.addon.charts.model.AbstractConfigurationObject;
import com.vaadin.addon.charts.model.Credits;

public class Theme extends AbstractConfigurationObject {
    private Color[] colors;
    private ChartStyle chart = new ChartStyle();
    private StyleWrapper title = new StyleWrapper();
    private StyleWrapper subtitle = new StyleWrapper();
    private AxisStyle xAxis = new AxisStyle();
    private AxisStyle yAxis = new AxisStyle();
    private StyleWrapper labels = new StyleWrapper();
    private LegendStyle legend = new LegendStyle();
    private TooltipStyle tooltip = new TooltipStyle();
    private PlotOptionsStyle plotOptions = new PlotOptionsStyle();
    private Credits credits = new Credits();

    public Theme() {
    }

    public void setColors(Color... colors) {
        this.colors = colors;
    }

    public Color[] getColors() {
        return this.colors;
    }

    public ChartStyle getChart() {
        return this.chart;
    }

    public void setChart(ChartStyle style) {
        this.chart = style;
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

    public LegendStyle getLegend() {
        return this.legend;
    }

    public void setLegend(LegendStyle style) {
        this.legend = style;
    }

    public AxisStyle getxAxis() {
        return this.xAxis;
    }

    public void setxAxis(AxisStyle style) {
        this.xAxis = style;
    }

    public AxisStyle getyAxis() {
        return this.yAxis;
    }

    public void setyAxis(AxisStyle style) {
        this.yAxis = style;
    }

    public TooltipStyle getTooltip() {
        return this.tooltip;
    }

    public void setTooltip(TooltipStyle tooltip) {
        this.tooltip = tooltip;
    }

    public PlotOptionsStyle getPlotOptions() {
        return this.plotOptions;
    }

    public void setPlotOptions(PlotOptionsStyle plotOptions) {
        this.plotOptions = plotOptions;
    }

    public Credits getCredits() {
        return this.credits;
    }

    public void setCredits(Credits credits) {
        this.credits = credits;
    }
}
