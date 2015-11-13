package com.vaadin.addon.charts.model;

import com.vaadin.addon.charts.model.style.Color;
public class Hover extends AbstractConfigurationObject {

	private static final long serialVersionUID = 1L;
	private Boolean enabled;
	private Halo halo;
	private Number lineWidth;
	private Number lineWidthPlus;
	private Marker marker;
	private Color fillColor;
	private Color lineColor;
	private Number radius;
	private Number radiusPlus;

	public Hover() {
	}

	public Hover(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Halo getHalo() {
		return halo;
	}

	public void setHalo(Halo halo) {
		this.halo = halo;
	}

	public Number getLineWidth() {
		return lineWidth;
	}

	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
	}

	public Number getLineWidthPlus() {
		return lineWidthPlus;
	}

	public void setLineWidthPlus(Number lineWidthPlus) {
		this.lineWidthPlus = lineWidthPlus;
	}

	public Marker getMarker() {
		return marker;
	}

	public void setMarker(Marker marker) {
		this.marker = marker;
	}

	public Color getFillColor() {
		return fillColor;
	}

	public void setFillColor(Color fillColor) {
		this.fillColor = fillColor;
	}

	public Color getLineColor() {
		return lineColor;
	}

	public void setLineColor(Color lineColor) {
		this.lineColor = lineColor;
	}

	public Number getRadius() {
		return radius;
	}

	public void setRadius(Number radius) {
		this.radius = radius;
	}

	public Number getRadiusPlus() {
		return radiusPlus;
	}

	public void setRadiusPlus(Number radiusPlus) {
		this.radiusPlus = radiusPlus;
	}
}