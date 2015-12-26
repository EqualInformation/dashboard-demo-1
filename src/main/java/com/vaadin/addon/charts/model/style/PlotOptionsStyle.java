package com.vaadin.addon.charts.model.style;

/**
 * Created by bpupadhyaya on 12/25/15.
 */
import com.vaadin.addon.charts.model.AbstractConfigurationObject;
import com.vaadin.addon.charts.model.PlotOptionsArea;
import com.vaadin.addon.charts.model.PlotOptionsAreaRange;
import com.vaadin.addon.charts.model.PlotOptionsAreaSpline;
import com.vaadin.addon.charts.model.PlotOptionsAreaSplineRange;
import com.vaadin.addon.charts.model.PlotOptionsBar;
import com.vaadin.addon.charts.model.PlotOptionsColumn;
import com.vaadin.addon.charts.model.PlotOptionsLine;
import com.vaadin.addon.charts.model.PlotOptionsPie;
import com.vaadin.addon.charts.model.PlotOptionsPolygon;
import com.vaadin.addon.charts.model.PlotOptionsPyramid;
import com.vaadin.addon.charts.model.PlotOptionsSeries;
import com.vaadin.addon.charts.model.PlotOptionsSpline;
import com.vaadin.addon.charts.model.PlotOptionsTreeMap;
import com.vaadin.addon.charts.model.PlotOptionsWaterfall;

public class PlotOptionsStyle extends AbstractConfigurationObject {
    private PlotOptionsBar bar = new PlotOptionsBar();
    private PlotOptionsArea area = new PlotOptionsArea();
    private PlotOptionsAreaRange arearange = new PlotOptionsAreaRange();
    private PlotOptionsAreaSpline areaspline = new PlotOptionsAreaSpline();
    private PlotOptionsAreaSplineRange areasplinerange = new PlotOptionsAreaSplineRange();
    private PlotOptionsPie pie = new PlotOptionsPie();
    private PlotOptionsLine line = new PlotOptionsLine();
    private PlotOptionsColumn column = new PlotOptionsColumn();
    private PlotOptionsSpline spline = new PlotOptionsSpline();
    private PlotOptionsSeries series = new PlotOptionsSeries();
    private PlotOptionsPyramid pyramid = new PlotOptionsPyramid();
    private PlotOptionsWaterfall waterfall = new PlotOptionsWaterfall();
    private PlotOptionsTreeMap treemap = new PlotOptionsTreeMap();
    private PlotOptionsPolygon polygon = new PlotOptionsPolygon();

    public PlotOptionsStyle() {
    }

    public PlotOptionsBar getBar() {
        return this.bar;
    }

    public void setBar(PlotOptionsBar bar) {
        this.bar = bar;
    }

    public PlotOptionsArea getArea() {
        return this.area;
    }

    public void setArea(PlotOptionsArea area) {
        this.area = area;
    }

    public PlotOptionsPie getPie() {
        return this.pie;
    }

    public void setPie(PlotOptionsPie pie) {
        this.pie = pie;
    }

    public PlotOptionsLine getLine() {
        return this.line;
    }

    public void setLine(PlotOptionsLine line) {
        this.line = line;
    }

    public PlotOptionsColumn getColumn() {
        return this.column;
    }

    public void setColumn(PlotOptionsColumn column) {
        this.column = column;
    }

    public PlotOptionsSpline getSpline() {
        return this.spline;
    }

    public void setSpline(PlotOptionsSpline spline) {
        this.spline = spline;
    }

    public PlotOptionsSeries getSeries() {
        return this.series;
    }

    public void setSeries(PlotOptionsSeries series) {
        this.series = series;
    }

    public PlotOptionsAreaRange getArearange() {
        return this.arearange;
    }

    public void setArearange(PlotOptionsAreaRange arearange) {
        this.arearange = arearange;
    }

    public PlotOptionsAreaSplineRange getAreasplinerange() {
        return this.areasplinerange;
    }

    public void setAreasplinerange(PlotOptionsAreaSplineRange areasplinerange) {
        this.areasplinerange = areasplinerange;
    }

    public PlotOptionsAreaSpline getAreaspline() {
        return this.areaspline;
    }

    public void setAreaspline(PlotOptionsAreaSpline areaspline) {
        this.areaspline = areaspline;
    }

    public PlotOptionsPyramid getPyramid() {
        return this.pyramid;
    }

    public void setPyramid(PlotOptionsPyramid pyramid) {
        this.pyramid = pyramid;
    }

    public PlotOptionsWaterfall getWaterfall() {
        return this.waterfall;
    }

    public void setWaterfall(PlotOptionsWaterfall waterfall) {
        this.waterfall = waterfall;
    }

    public PlotOptionsTreeMap getTreeMap() {
        return this.treemap;
    }

    public void setTreemap(PlotOptionsTreeMap treemap) {
        this.treemap = treemap;
    }

    public PlotOptionsPolygon getPolygon() {
        return this.polygon;
    }

    public void setPolygon(PlotOptionsPolygon polygon) {
        this.polygon = polygon;
    }
}
