package com.vaadin.addon.charts.model;

/*
 * #%L
 * Vaadin Charts
 * %%
 * Copyright (C) 2012 - 2015 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).
 * 
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv3 along with this program.
 * If not, see <https://vaadin.com/license/cval-3>.
 * #L%
 */

import com.vaadin.addon.charts.model.style.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import com.vaadin.addon.charts.util.Util;
/**
 * The area range is a cartesian series type with higher and lower Y values
 * along an X axis. Requires <code>highcharts-more.js</code>.
 */
public class PlotOptionsAreaRange extends AbstractPlotOptions {

	private static final long serialVersionUID = 1L;
	private Boolean allowPointSelect;
	private Boolean animation;
	private Color color;
	private Boolean connectNulls;
	private Number cropThreshold;
	private Cursor cursor;
	private DashStyle dashStyle;
	private DataLabelsRange dataLabels;
	private Boolean enableMouseTracking;
	private Color fillColor;
	private Number fillOpacity;
	private Boolean getExtremesFromAll;
	private ArrayList<String> keys;
	private Color lineColor;
	private Number lineWidth;
	private String linkedTo;
	private Color negativeColor;
	private Color negativeFillColor;
	private Number pointInterval;
	private IntervalUnit pointIntervalUnit;
	private PointPlacement pointPlacement;
	private Number pointStart;
	private Boolean selected;
	private Object shadow;
	private Boolean showCheckbox;
	private Boolean showInLegend;
	private States states;
	private StepType step;
	private Boolean stickyTracking;
	private SeriesTooltip tooltip;
	private Boolean trackByArea;
	private Number turboThreshold;
	private Boolean visible;
	private String zoneAxis;
	private ArrayList<Zones> zones;
	private Number threshold;

	public PlotOptionsAreaRange() {
	}

	@Override
	public ChartType getChartType() {
		return ChartType.AREARANGE;
	}

	/**
	 * @see #setAllowPointSelect(Boolean)
	 */
	public Boolean getAllowPointSelect() {
		return allowPointSelect;
	}

	/**
	 * Allow this series' points to be selected by clicking on the markers, bars
	 * or pie slices.
	 * <p>
	 * Defaults to: false
	 */
	public void setAllowPointSelect(Boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
	}

	/**
	 * @see #setAnimation(Boolean)
	 */
	public Boolean getAnimation() {
		return animation;
	}

	/**
	 * <p>
	 * Enable or disable the initial animation when a series is displayed. The
	 * animation can also be set as a configuration object. Please note that
	 * this option only applies to the initial animation of the series itself.
	 * For other animations, see <a href="#chart.animation">chart.animation</a>
	 * and the animation parameter under the API methods. The following
	 * properties are supported:
	 * </p>
	 * <dl>
	 * <dt>duration</dt>
	 * <dd>The duration of the animation in milliseconds.</dd>
	 * <dt>easing</dt>
	 * <dd>When using jQuery as the general framework, the easing can be set to
	 * <code>linear</code> or <code>swing</code>. More easing functions are
	 * available with the use of jQuery plug-ins, most notably the jQuery UI
	 * suite. See <a href="http://api.jquery.com/animate/">the jQuery docs</a>.
	 * When using MooTools as the general framework, use the property name
	 * <code>transition</code> instead of <code>easing</code>.</dd>
	 * </dl>
	 * <p>
	 * Due to poor performance, animation is disabled in old IE browsers for
	 * column charts and polar charts.
	 * </p>
	 * <p>
	 * Defaults to: true
	 */
	public void setAnimation(Boolean animation) {
		this.animation = animation;
	}

	/**
	 * @see #setColor(Color)
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * The main color or the series. In line type series it applies to the line
	 * and the point markers unless otherwise specified. In bar type series it
	 * applies to the bars unless a color is specified per point. The default
	 * value is pulled from the <code>options.colors</code> array.
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @see #setConnectNulls(Boolean)
	 */
	public Boolean getConnectNulls() {
		return connectNulls;
	}

	/**
	 * Whether to connect a graph line across null points.
	 * <p>
	 * Defaults to: false
	 */
	public void setConnectNulls(Boolean connectNulls) {
		this.connectNulls = connectNulls;
	}

	/**
	 * @see #setCropThreshold(Number)
	 */
	public Number getCropThreshold() {
		return cropThreshold;
	}

	/**
	 * When the series contains less points than the crop threshold, all points
	 * are drawn, event if the points fall outside the visible plot area at the
	 * current zoom. The advantage of drawing all points (including markers and
	 * columns), is that animation is performed on updates. On the other hand,
	 * when the series contains more points than the crop threshold, the series
	 * data is cropped to only contain points that fall within the plot area.
	 * The advantage of cropping away invisible points is to increase
	 * performance on large series. .
	 * <p>
	 * Defaults to: 300
	 */
	public void setCropThreshold(Number cropThreshold) {
		this.cropThreshold = cropThreshold;
	}

	/**
	 * @see #setCursor(Cursor)
	 */
	public Cursor getCursor() {
		return cursor;
	}

	/**
	 * You can set the cursor to "pointer" if you have click events attached to
	 * the series, to signal to the user that the points and lines can be
	 * clicked.
	 */
	public void setCursor(Cursor cursor) {
		this.cursor = cursor;
	}

	/**
	 * @see #setDashStyle(DashStyle)
	 */
	public DashStyle getDashStyle() {
		return dashStyle;
	}

	/**
	 * A name for the dash style to use for the graph. Applies only to series
	 * type having a graph, like <code>line</code>, <code>spline</code>,
	 * <code>area</code> and <code>scatter</code> in case it has a
	 * <code>lineWidth</code>. The value for the <code>dashStyle</code> include:
	 * <ul>
	 * <li>Solid</li>
	 * <li>ShortDash</li>
	 * <li>ShortDot</li>
	 * <li>ShortDashDot</li>
	 * <li>ShortDashDotDot</li>
	 * <li>Dot</li>
	 * <li>Dash</li>
	 * <li>LongDash</li>
	 * <li>DashDot</li>
	 * <li>LongDashDot</li>
	 * <li>LongDashDotDot</li>
	 * </ul>
	 * <p>
	 * Defaults to: Solid
	 */
	public void setDashStyle(DashStyle dashStyle) {
		this.dashStyle = dashStyle;
	}

	/**
	 * @see #setDataLabels(DataLabelsRange)
	 */
	public DataLabelsRange getDataLabels() {
		return dataLabels;
	}

	/**
	 * Extended data labels for range series types. Range series data labels
	 * have no <code>x</code> and <code>y</code> options. Instead, they have
	 * <code>xLow</code>, <code>xHigh</code>, <code>yLow</code> and
	 * <code>yHigh</code> options to allow the higher and lower data label sets
	 * individually.
	 * <p>
	 * Defaults to:
	 */
	public void setDataLabels(DataLabelsRange dataLabels) {
		this.dataLabels = dataLabels;
	}

	/**
	 * @see #setEnableMouseTracking(Boolean)
	 */
	public Boolean getEnableMouseTracking() {
		return enableMouseTracking;
	}

	/**
	 * Enable or disable the mouse tracking for a specific series. This includes
	 * point tooltips and click events on graphs and points. For large datasets
	 * it improves performance.
	 * <p>
	 * Defaults to: true
	 */
	public void setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
	}

	/**
	 * @see #setFillColor(Color)
	 */
	public Color getFillColor() {
		return fillColor;
	}

	/**
	 * Fill color or gradient for the area. When <code>null</code>, the series'
	 * <code>color</code> is used with the series' <code>fillOpacity</code>.
	 */
	public void setFillColor(Color fillColor) {
		this.fillColor = fillColor;
	}

	/**
	 * @see #setFillOpacity(Number)
	 */
	public Number getFillOpacity() {
		return fillOpacity;
	}

	/**
	 * Fill opacity for the area. Note that when you set an explicit
	 * <code>fillColor</code>, the <code>fillOpacity</code> is not applied.
	 * Instead, you should define the opacity in the <code>fillColor</code> with
	 * an rgba color definition.
	 * <p>
	 * Defaults to: 0.75
	 */
	public void setFillOpacity(Number fillOpacity) {
		this.fillOpacity = fillOpacity;
	}

	/**
	 * @see #setGetExtremesFromAll(Boolean)
	 */
	public Boolean getGetExtremesFromAll() {
		return getExtremesFromAll;
	}

	/**
	 * Whether to use the Y extremes of the total chart width or only the zoomed
	 * area when zooming in on parts of the X axis. By default, the Y axis
	 * adjusts to the min and max of the visible data. Cartesian series only.
	 * <p>
	 * Defaults to: false
	 */
	public void setGetExtremesFromAll(Boolean getExtremesFromAll) {
		this.getExtremesFromAll = getExtremesFromAll;
	}

	public String[] getKeys() {
		String[] arr = new String[keys.size()];
		keys.toArray(arr);
		return arr;
	}

	public void setKeys(String... keys) {
		this.keys = new ArrayList<String>(Arrays.asList(keys));
	}

	public void addKey(String key) {
		if (this.keys == null) {
			this.keys = new ArrayList<String>();
		}
		this.keys.add(key);
	}

	public void removeKey(String key) {
		this.keys.remove(key);
	}

	/**
	 * @see #setLineColor(Color)
	 */
	public Color getLineColor() {
		return lineColor;
	}

	/**
	 * A separate color for the graph line. By default the line takes the
	 * <code>color</code> of the series, but the lineColor setting allows
	 * setting a separate color for the line without altering the
	 * <code>fillColor</code>.
	 */
	public void setLineColor(Color lineColor) {
		this.lineColor = lineColor;
	}

	/**
	 * @see #setLineWidth(Number)
	 */
	public Number getLineWidth() {
		return lineWidth;
	}

	/**
	 * Pixel width of the arearange graph line.
	 * <p>
	 * Defaults to: 1
	 */
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
	}

	/**
	 * @see #setLinkedTo(String)
	 */
	public String getLinkedTo() {
		return linkedTo;
	}

	/**
	 * The <a href="#series.id">id</a> of another series to link to.
	 * Additionally, the value can be ":previous" to link to the previous
	 * series. When two series are linked, only the first one appears in the
	 * legend. Toggling the visibility of this also toggles the linked series.
	 * <p>
	 * Defaults to:
	 */
	public void setLinkedTo(String linkedTo) {
		this.linkedTo = linkedTo;
	}

	/**
	 * @see #setNegativeColor(Color)
	 */
	public Color getNegativeColor() {
		return negativeColor;
	}

	/**
	 * The color for the parts of the graph or points that are below the <a
	 * href="#plotOptions.series.threshold">threshold</a>.
	 * <p>
	 * Defaults to: null
	 */
	public void setNegativeColor(Color negativeColor) {
		this.negativeColor = negativeColor;
	}

	/**
	 * @see #setNegativeFillColor(Color)
	 */
	public Color getNegativeFillColor() {
		return negativeFillColor;
	}

	/**
	 * A separate color for the negative part of the area.
	 * <p>
	 * Defaults to:
	 */
	public void setNegativeFillColor(Color negativeFillColor) {
		this.negativeFillColor = negativeFillColor;
	}

	/**
	 * @see #setPointInterval(Number)
	 */
	public Number getPointInterval() {
		return pointInterval;
	}

	/**
	 * <p>
	 * If no x values are given for the points in a series, pointInterval
	 * defines the interval of the x values. For example, if a series contains
	 * one value every decade starting from year 0, set pointInterval to 10.
	 * </p>
	 * <p>
	 * Since Highcharts 4.1, it can be combined with
	 * <code>pointIntervalUnit</code> to draw irregular intervals.
	 * </p>
	 * <p>
	 * Defaults to: 1
	 */
	public void setPointInterval(Number pointInterval) {
		this.pointInterval = pointInterval;
	}

	/**
	 * @see #setPointIntervalUnit(IntervalUnit)
	 */
	public IntervalUnit getPointIntervalUnit() {
		return pointIntervalUnit;
	}

	/**
	 * On datetime series, this allows for setting the <a
	 * href="plotOptions.series.pointInterval">pointInterval</a> to the two
	 * irregular time units, <code>month</code> and <code>year</code>. Combine
	 * it with <code>pointInterval</code> to draw quarters, 6 months, 10 years
	 * etc.
	 */
	public void setPointIntervalUnit(IntervalUnit pointIntervalUnit) {
		this.pointIntervalUnit = pointIntervalUnit;
	}

	/**
	 * @see #setPointPlacement(PointPlacement)
	 */
	public PointPlacement getPointPlacement() {
		return pointPlacement;
	}

	/**
	 * <p>
	 * Possible values: <code>null</code>, <code>"on"</code>,
	 * <code>"between"</code>.
	 * </p>
	 * <p>
	 * In a column chart, when pointPlacement is <code>"on"</code>, the point
	 * will not create any padding of the X axis. In a polar column chart this
	 * means that the first column points directly north. If the pointPlacement
	 * is <code>"between"</code>, the columns will be laid out between ticks.
	 * This is useful for example for visualising an amount between two points
	 * in time or in a certain sector of a polar chart.
	 * </p>
	 * <p>
	 * Since Highcharts 3.0.2, the point placement can also be numeric, where 0
	 * is on the axis value, -0.5 is between this value and the previous, and
	 * 0.5 is between this value and the next. Unlike the textual options,
	 * numeric point placement options won't affect axis padding.
	 * </p>
	 * <p>
	 * Note that pointPlacement needs a <a
	 * href="#plotOptions.series.pointRange">pointRange</a> to work. For column
	 * series this is computed, but for line-type series it needs to be set.
	 * </p>
	 * <p>
	 * Defaults to <code>null</code> in cartesian charts, <code>"between"</code>
	 * in polar charts.
	 */
	public void setPointPlacement(PointPlacement pointPlacement) {
		this.pointPlacement = pointPlacement;
	}

	/**
	 * @see #setPointStart(Number)
	 */
	public Number getPointStart() {
		return pointStart;
	}

	/**
	 * If no x values are given for the points in a series, pointStart defines
	 * on what value to start. For example, if a series contains one yearly
	 * value starting from 1945, set pointStart to 1945.
	 * <p>
	 * Defaults to: 0
	 */
	public void setPointStart(Number pointStart) {
		this.pointStart = pointStart;
	}

	/**
	 * @see #setSelected(Boolean)
	 */
	public Boolean getSelected() {
		return selected;
	}

	/**
	 * Whether to select the series initially. If <code>showCheckbox</code> is
	 * true, the checkbox next to the series name will be checked for a selected
	 * series.
	 * <p>
	 * Defaults to: false
	 */
	public void setSelected(Boolean selected) {
		this.selected = selected;
	}

	/**
	 * @see #setShadow(Object)
	 */
	public Object getShadow() {
		return shadow;
	}

	/**
	 * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow
	 * can be an object configuration containing <code>color</code>,
	 * <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and
	 * <code>width</code>.
	 * <p>
	 * Defaults to: false
	 */
	public void setShadow(Object shadow) {
		this.shadow = shadow;
	}

	/**
	 * @see #setShowCheckbox(Boolean)
	 */
	public Boolean getShowCheckbox() {
		return showCheckbox;
	}

	/**
	 * If true, a checkbox is displayed next to the legend item to allow
	 * selecting the series. The state of the checkbox is determined by the
	 * <code>selected</code> option.
	 * <p>
	 * Defaults to: false
	 */
	public void setShowCheckbox(Boolean showCheckbox) {
		this.showCheckbox = showCheckbox;
	}

	/**
	 * @see #setShowInLegend(Boolean)
	 */
	public Boolean getShowInLegend() {
		return showInLegend;
	}

	/**
	 * Whether to display this particular series or series type in the legend.
	 * The default value is <code>true</code> for standalone series,
	 * <code>false</code> for linked series.
	 * <p>
	 * Defaults to: true
	 */
	public void setShowInLegend(Boolean showInLegend) {
		this.showInLegend = showInLegend;
	}

	/**
	 * @see #setStates(States)
	 */
	public States getStates() {
		return states;
	}

	/**
	 * A wrapper object for all the series options in specific states.
	 */
	public void setStates(States states) {
		this.states = states;
	}

	/**
	 * @see #setStep(StepType)
	 */
	public StepType getStep() {
		return step;
	}

	/**
	 * Whether to apply steps to the line. Possible values are <code>left</code>
	 * , <code>center</code> and <code>right</code>. Prior to 2.3.5, only
	 * <code>left</code> was supported.
	 * <p>
	 * Defaults to: false
	 */
	public void setStep(StepType step) {
		this.step = step;
	}

	/**
	 * @see #setStickyTracking(Boolean)
	 */
	public Boolean getStickyTracking() {
		return stickyTracking;
	}

	/**
	 * Sticky tracking of mouse events. When true, the <code>mouseOut</code>
	 * event on a series isn't triggered until the mouse moves over another
	 * series, or out of the plot area. When false, the <code>mouseOut</code>
	 * event on a series is triggered when the mouse leaves the area around the
	 * series' graph or markers. This also implies the tooltip. When
	 * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is
	 * false, the tooltip will be hidden when moving the mouse between series.
	 * Defaults to true for line and area type series, but to false for columns,
	 * pies etc.
	 * <p>
	 * Defaults to: true
	 */
	public void setStickyTracking(Boolean stickyTracking) {
		this.stickyTracking = stickyTracking;
	}

	/**
	 * @see #setTooltip(SeriesTooltip)
	 */
	public SeriesTooltip getTooltip() {
		return tooltip;
	}

	/**
	 * A configuration object for the tooltip rendering of each single series.
	 * Properties are inherited from <a href="#tooltip">tooltip</a>, but only
	 * the following properties can be defined on a series level.
	 */
	public void setTooltip(SeriesTooltip tooltip) {
		this.tooltip = tooltip;
	}

	/**
	 * @see #setTrackByArea(Boolean)
	 */
	public Boolean getTrackByArea() {
		return trackByArea;
	}

	/**
	 * Whether the whole area or just the line should respond to mouseover
	 * tooltips and other mouse or touch events.
	 * <p>
	 * Defaults to: true
	 */
	public void setTrackByArea(Boolean trackByArea) {
		this.trackByArea = trackByArea;
	}

	/**
	 * @see #setTurboThreshold(Number)
	 */
	public Number getTurboThreshold() {
		return turboThreshold;
	}

	/**
	 * When a series contains a data array that is longer than this, only one
	 * dimensional arrays of numbers, or two dimensional arrays with x and y
	 * values are allowed. Also, only the first point is tested, and the rest
	 * are assumed to be the same format. This saves expensive data checking and
	 * indexing in long series. Set it to <code>0</code> disable.
	 * <p>
	 * Defaults to: 1000
	 */
	public void setTurboThreshold(Number turboThreshold) {
		this.turboThreshold = turboThreshold;
	}

	/**
	 * @see #setVisible(Boolean)
	 */
	public Boolean getVisible() {
		return visible;
	}

	/**
	 * Set the initial visibility of the series.
	 * <p>
	 * Defaults to: true
	 */
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	/**
	 * @see #setZoneAxis(String)
	 */
	public String getZoneAxis() {
		return zoneAxis;
	}

	/**
	 * Defines the Axis on which the zones are applied.
	 * <p>
	 * Defaults to: y
	 */
	public void setZoneAxis(String zoneAxis) {
		this.zoneAxis = zoneAxis;
	}

	public Zones[] getZones() {
		Zones[] arr = new Zones[zones.size()];
		zones.toArray(arr);
		return arr;
	}

	public void setZones(Zones... zones) {
		this.zones = new ArrayList<Zones>(Arrays.asList(zones));
	}

	public void addZone(Zones zone) {
		if (this.zones == null) {
			this.zones = new ArrayList<Zones>();
		}
		this.zones.add(zone);
	}

	public void removeZone(Zones zone) {
		this.zones.remove(zone);
	}

	public void setPointStart(Date date) {
		this.pointStart = Util.toHighchartsTS(date);
	}

	/**
	 * @see #setThreshold(Number)
	 */
	public Number getThreshold() {
		return threshold;
	}

	/**
	 * 
	 */
	public void setThreshold(Number threshold) {
		this.threshold = threshold;
	}
}