package com.vaadin.addon.charts.model;

import com.vaadin.addon.charts.model.style.Color;
public class Back extends AbstractConfigurationObject {

	private static final long serialVersionUID = 1L;
	private Color color;
	private Number size;

	public Back() {
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Number getSize() {
		return size;
	}

	public void setSize(Number size) {
		this.size = size;
	}
}