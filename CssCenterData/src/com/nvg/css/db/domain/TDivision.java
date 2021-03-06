package com.nvg.css.db.domain;

// Generated Jun 10, 2016 7:15:43 PM by Hibernate Tools 4.0.0

/**
 * TDivision generated by hbm2java
 */
public class TDivision implements java.io.Serializable {

	private String divId;
	private TTemplate TTemplate;
	private String divName;
	private Integer divIndex;
	private Integer divColumn;
	private Integer divRow;
	private Integer divTop;
	private Integer divLeft;
	private Integer divBottom;
	private Integer divRight;
	private Integer divHeight;
	private Integer divWidth;
	private String divDisplay;
	private String divPosition;
	private String divOverflow;
	private Integer divLayer;
	private Integer divPaddingTop;
	private Integer divPaddingRight;
	private Integer divPaddingBottom;
	private Integer divPaddingLeft;

	public TDivision() {
	}

	public TDivision(String divId) {
		this.divId = divId;
	}

	public TDivision(String divId, TTemplate TTemplate, String divName,
			Integer divIndex, Integer divColumn, Integer divRow,
			Integer divTop, Integer divLeft, Integer divBottom,
			Integer divRight, Integer divHeight, Integer divWidth,
			String divDisplay, String divPosition, String divOverflow,
			Integer divLayer, Integer divPaddingTop, Integer divPaddingRight,
			Integer divPaddingBottom, Integer divPaddingLeft) {
		this.divId = divId;
		this.TTemplate = TTemplate;
		this.divName = divName;
		this.divIndex = divIndex;
		this.divColumn = divColumn;
		this.divRow = divRow;
		this.divTop = divTop;
		this.divLeft = divLeft;
		this.divBottom = divBottom;
		this.divRight = divRight;
		this.divHeight = divHeight;
		this.divWidth = divWidth;
		this.divDisplay = divDisplay;
		this.divPosition = divPosition;
		this.divOverflow = divOverflow;
		this.divLayer = divLayer;
		this.divPaddingTop = divPaddingTop;
		this.divPaddingRight = divPaddingRight;
		this.divPaddingBottom = divPaddingBottom;
		this.divPaddingLeft = divPaddingLeft;
	}

	public String getDivId() {
		return this.divId;
	}

	public void setDivId(String divId) {
		this.divId = divId;
	}

	public TTemplate getTTemplate() {
		return this.TTemplate;
	}

	public void setTTemplate(TTemplate TTemplate) {
		this.TTemplate = TTemplate;
	}

	public String getDivName() {
		return this.divName;
	}

	public void setDivName(String divName) {
		this.divName = divName;
	}

	public Integer getDivIndex() {
		return this.divIndex;
	}

	public void setDivIndex(Integer divIndex) {
		this.divIndex = divIndex;
	}

	public Integer getDivColumn() {
		return this.divColumn;
	}

	public void setDivColumn(Integer divColumn) {
		this.divColumn = divColumn;
	}

	public Integer getDivRow() {
		return this.divRow;
	}

	public void setDivRow(Integer divRow) {
		this.divRow = divRow;
	}

	public Integer getDivTop() {
		return this.divTop;
	}

	public void setDivTop(Integer divTop) {
		this.divTop = divTop;
	}

	public Integer getDivLeft() {
		return this.divLeft;
	}

	public void setDivLeft(Integer divLeft) {
		this.divLeft = divLeft;
	}

	public Integer getDivBottom() {
		return this.divBottom;
	}

	public void setDivBottom(Integer divBottom) {
		this.divBottom = divBottom;
	}

	public Integer getDivRight() {
		return this.divRight;
	}

	public void setDivRight(Integer divRight) {
		this.divRight = divRight;
	}

	public Integer getDivHeight() {
		return this.divHeight;
	}

	public void setDivHeight(Integer divHeight) {
		this.divHeight = divHeight;
	}

	public Integer getDivWidth() {
		return this.divWidth;
	}

	public void setDivWidth(Integer divWidth) {
		this.divWidth = divWidth;
	}

	public String getDivDisplay() {
		return this.divDisplay;
	}

	public void setDivDisplay(String divDisplay) {
		this.divDisplay = divDisplay;
	}

	public String getDivPosition() {
		return this.divPosition;
	}

	public void setDivPosition(String divPosition) {
		this.divPosition = divPosition;
	}

	public String getDivOverflow() {
		return this.divOverflow;
	}

	public void setDivOverflow(String divOverflow) {
		this.divOverflow = divOverflow;
	}

	public Integer getDivLayer() {
		return this.divLayer;
	}

	public void setDivLayer(Integer divLayer) {
		this.divLayer = divLayer;
	}

	public Integer getDivPaddingTop() {
		return this.divPaddingTop;
	}

	public void setDivPaddingTop(Integer divPaddingTop) {
		this.divPaddingTop = divPaddingTop;
	}

	public Integer getDivPaddingRight() {
		return this.divPaddingRight;
	}

	public void setDivPaddingRight(Integer divPaddingRight) {
		this.divPaddingRight = divPaddingRight;
	}

	public Integer getDivPaddingBottom() {
		return this.divPaddingBottom;
	}

	public void setDivPaddingBottom(Integer divPaddingBottom) {
		this.divPaddingBottom = divPaddingBottom;
	}

	public Integer getDivPaddingLeft() {
		return this.divPaddingLeft;
	}

	public void setDivPaddingLeft(Integer divPaddingLeft) {
		this.divPaddingLeft = divPaddingLeft;
	}

}
