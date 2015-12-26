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

import com.vaadin.addon.charts.model.style.Style;
/**
 * Options for displaying a message like "No data to display". This feature
 * requires the file <code>no-data-to-display.js</code> to be loaded in the
 * page. The actual text to display is set in the <a
 * href="#lang.noData">lang.noData</a> option.
 */
public class NoData extends AbstractConfigurationObject {

	private static final long serialVersionUID = 1L;
	private Object attr;
	private Position position;
	private Style style;

	public NoData() {
	}

	/**
	 * @see #setAttr(Object)
	 */
	public Object getAttr() {
		return attr;
	}

	/**
	 * An object of additional SVG attributes for the no-data label.
	 */
	public void setAttr(Object attr) {
		this.attr = attr;
	}

	/**
	 * @see #setPosition(Position)
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * The position of the no-data label, relative to the plot area.
	 * <p>
	 * Defaults to: { "x": 0, "y": 0, "align": "center", "verticalAlign":
	 * "middle" }
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

	/**
	 * @see #setStyle(Style)
	 */
	public Style getStyle() {
		return style;
	}

	/**
	 * CSS styles for the no-data label.
	 * <p>
	 * Defaults to: { "fontSize": "12px", "fontWeight": "bold", "color":
	 * "#60606a" }
	 */
	public void setStyle(Style style) {
		this.style = style;
	}
}