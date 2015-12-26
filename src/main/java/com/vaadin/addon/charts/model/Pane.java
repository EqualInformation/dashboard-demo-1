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

import com.vaadin.addon.charts.util.SizeWithUnit;
/**
 * Applies only to polar charts and angular gauges. This configuration object
 * holds general options for the combined X and Y axes set. Each xAxis or yAxis
 * can reference the pane by index.
 */
public class Pane extends AbstractConfigurationObject {

	private static final long serialVersionUID = 1L;
	private Integer paneIndex;
	private Object[] background;
	private Object[] center;
	private Number endAngle;
	private String size;
	private Number startAngle;

	public Pane() {
	}

	/**
	 * @see #setPaneIndex(Integer)
	 */
	Integer getPaneIndex() {
		return paneIndex;
	}

	/**
	 * 
	 */
	void setPaneIndex(Integer paneIndex) {
		this.paneIndex = paneIndex;
	}

	/**
	 * @see #setBackground(Object[])
	 */
	public Object[] getBackground() {
		return background;
	}

	/**
	 * An object, or array of objects, for backgrounds. Sub options include
	 * <code>backgroundColor</code> (can be solid or gradient),
	 * <code>shape</code> ("solid" or "arc"), <code>innerWidth</code>,
	 * <code>outerWidth</code>, <code>borderWidth</code>,
	 * <code>borderColor</code>.
	 */
	public void setBackground(Object[] background) {
		this.background = background;
	}

	/**
	 * @see #setCenter(Object[])
	 */
	public Object[] getCenter() {
		return center;
	}

	/**
	 * @see #setEndAngle(Number)
	 */
	public Number getEndAngle() {
		return endAngle;
	}

	/**
	 * The end angle of the polar X axis or gauge value axis, given in degrees
	 * where 0 is north. Defaults to <a href="#pane.startAngle">startAngle</a> +
	 * 360.
	 */
	public void setEndAngle(Number endAngle) {
		this.endAngle = endAngle;
	}

	public float getSize() {
		String tmp = size;
		if (size == null) {
			return -1.0f;
		}
		if (this.size.contains("%")) {
			tmp = tmp.replace("%", "");
		}
		return Float.valueOf(tmp).floatValue();
	}

	public Unit getSizeUnit() {
		if (this.size == null) {
			return Unit.PIXELS;
		}
		if (this.size.contains("%")) {
			return Unit.PERCENTAGE;
		}
		return Unit.PIXELS;
	}

	public void setSize(String size) {
		SizeWithUnit tmp = SizeWithUnit.parseStringSize(size);
		if (tmp != null) {
			setSize(tmp.getSize(), tmp.getUnit());
		} else {
			setSize(-1, Unit.PIXELS);
		}
	}

	public void setSize(float size, Unit unit) {
		String value = Float.toString(size);
		if (unit.equals(Unit.PERCENTAGE)) {
			value += "%";
		}
		if (size == -1) {
			value = null;
		}
		this.size = value;
	}

	/**
	 * @see #setStartAngle(Number)
	 */
	public Number getStartAngle() {
		return startAngle;
	}

	/**
	 * The start angle of the polar X axis or gauge axis, given in degrees where
	 * 0 is north. Defaults to 0.
	 */
	public void setStartAngle(Number startAngle) {
		this.startAngle = startAngle;
	}

	public Pane(Number startAngle, Number endAngle) {
		this.startAngle = startAngle;
		this.endAngle = endAngle;
	}

	public void setCenter(String x, String y) {
		this.center = new String[]{x, y};
	}

	public void setCenter(Number x, Number y) {
		this.center = new Number[]{x, y};
	}
}