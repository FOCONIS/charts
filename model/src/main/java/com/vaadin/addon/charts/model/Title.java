package com.vaadin.addon.charts.model;

import java.util.ArrayList;
import java.util.Arrays;
import com.vaadin.addon.charts.model.style.Style;
public class Title extends AbstractConfigurationObject {

	private static final long serialVersionUID = 1L;
	private String align;
	private ArrayList<Number> margin;
	private Number offset;
	private Number rotation;
	private Style style;
	private String text;
	private Number x;
	private Number y;
	private Boolean floating;
	private Boolean useHTML;
	private String verticalAlign;

	public Title() {
	}

	public String getAlign() {
		return align;
	}

	public void setAlign(String align) {
		this.align = align;
	}

	public Number[] getMargin() {
		Number[] arr = new Number[margin.size()];
		margin.toArray(arr);
		return arr;
	}

	public void setMargin(Number... margin) {
		this.margin = new ArrayList<Number>(Arrays.asList(margin));
	}

	public void addMargin(Number margin) {
		if (this.margin == null) {
			this.margin = new ArrayList<Number>();
		}
		this.margin.add(margin);
	}

	public void removeMargin(Number margin) {
		this.margin.remove(margin);
	}

	public Number getOffset() {
		return offset;
	}

	public void setOffset(Number offset) {
		this.offset = offset;
	}

	public Number getRotation() {
		return rotation;
	}

	public void setRotation(Number rotation) {
		this.rotation = rotation;
	}

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

	public Title(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Number getX() {
		return x;
	}

	public void setX(Number x) {
		this.x = x;
	}

	public Number getY() {
		return y;
	}

	public void setY(Number y) {
		this.y = y;
	}

	public Boolean getFloating() {
		return floating;
	}

	public void setFloating(Boolean floating) {
		this.floating = floating;
	}

	public Boolean getUseHTML() {
		return useHTML;
	}

	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
	}

	public String getVerticalAlign() {
		return verticalAlign;
	}

	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
	}
}