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
 * The loading options control the appearance of the loading screen that covers
 * the plot area on chart operations. This screen only appears after an explicit
 * call to <code>chart.showLoading()</code>. It is a utility for developers to
 * communicate to the end user that something is going on, for example while
 * retrieving new data via an XHR connection. The "Loading..." text itself is
 * not part of this configuration object, but part of the <code>lang</code>
 * object.
 */
public class Loading extends AbstractConfigurationObject {

	private static final long serialVersionUID = 1L;
	private Number hideDuration;
	private Style labelStyle;
	private Number showDuration;
	private Style style;

	public Loading() {
	}

	/**
	 * @see #setHideDuration(Number)
	 */
	public Number getHideDuration() {
		return hideDuration;
	}

	/**
	 * The duration in milliseconds of the fade out effect.
	 * <p>
	 * Defaults to: 100
	 */
	public void setHideDuration(Number hideDuration) {
		this.hideDuration = hideDuration;
	}

	/**
	 * @see #setLabelStyle(Style)
	 */
	public Style getLabelStyle() {
		return labelStyle;
	}

	/**
	 * CSS styles for the loading label <code>span</code>.
	 * <p>
	 * Defaults to: { "fontWeight": "bold", "position": "relative", "top": "45%"
	 * }
	 */
	public void setLabelStyle(Style labelStyle) {
		this.labelStyle = labelStyle;
	}

	/**
	 * @see #setShowDuration(Number)
	 */
	public Number getShowDuration() {
		return showDuration;
	}

	/**
	 * The duration in milliseconds of the fade in effect.
	 * <p>
	 * Defaults to: 100
	 */
	public void setShowDuration(Number showDuration) {
		this.showDuration = showDuration;
	}

	/**
	 * @see #setStyle(Style)
	 */
	public Style getStyle() {
		return style;
	}

	/**
	 * CSS styles for the loading screen that covers the plot area. Defaults to:
	 * 
	 * <pre>
	 * style: {
	 * 		position: 'absolute',
	 * 		backgroundColor: 'white',
	 * 		opacity: 0.5,
	 * 		textAlign: 'center'
	 * 	}
	 * </pre>
	 */
	public void setStyle(Style style) {
		this.style = style;
	}
}