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
/**
 * A wrapper object for all the series options in specific states.
 */
public class States extends AbstractConfigurationObject {

	private static final long serialVersionUID = 1L;
	private Hover hover;
	private Select select;

	public States() {
	}

	/**
	 * @see #setHover(Hover)
	 */
	public Hover getHover() {
		return hover;
	}

	/**
	 * Options for the hovered series
	 */
	public void setHover(Hover hover) {
		this.hover = hover;
	}

	/**
	 * @see #setSelect(Select)
	 */
	public Select getSelect() {
		return select;
	}

	/**
	 * The appearance of the point marker when selected. In order to allow a
	 * point to be selected, set the <code>series.allowPointSelect</code> option
	 * to true.
	 */
	public void setSelect(Select select) {
		this.select = select;
	}
}