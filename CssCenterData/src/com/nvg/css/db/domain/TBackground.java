package com.nvg.css.db.domain;

// Generated Jun 10, 2016 7:15:43 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * TBackground generated by hbm2java
 */
public class TBackground implements java.io.Serializable {

	private String bgId;
	private TMonitor TMonitor;
	private TGroup TGroup;
	private String bgType;
	private String bgUri;
	private String bgComment;
	private Set<TBackgroundPlay> TBackgroundPlays = new HashSet<TBackgroundPlay>(
			0);

	public TBackground() {
	}

	public TBackground(String bgId) {
		this.bgId = bgId;
	}

	public TBackground(String bgId, TMonitor TMonitor, TGroup TGroup,
			String bgType, String bgUri, String bgComment,
			Set<TBackgroundPlay> TBackgroundPlays) {
		this.bgId = bgId;
		this.TMonitor = TMonitor;
		this.TGroup = TGroup;
		this.bgType = bgType;
		this.bgUri = bgUri;
		this.bgComment = bgComment;
		this.TBackgroundPlays = TBackgroundPlays;
	}

	public String getBgId() {
		return this.bgId;
	}

	public void setBgId(String bgId) {
		this.bgId = bgId;
	}

	public TMonitor getTMonitor() {
		return this.TMonitor;
	}

	public void setTMonitor(TMonitor TMonitor) {
		this.TMonitor = TMonitor;
	}

	public TGroup getTGroup() {
		return this.TGroup;
	}

	public void setTGroup(TGroup TGroup) {
		this.TGroup = TGroup;
	}

	public String getBgType() {
		return this.bgType;
	}

	public void setBgType(String bgType) {
		this.bgType = bgType;
	}

	public String getBgUri() {
		return this.bgUri;
	}

	public void setBgUri(String bgUri) {
		this.bgUri = bgUri;
	}

	public String getBgComment() {
		return this.bgComment;
	}

	public void setBgComment(String bgComment) {
		this.bgComment = bgComment;
	}

	public Set<TBackgroundPlay> getTBackgroundPlays() {
		return this.TBackgroundPlays;
	}

	public void setTBackgroundPlays(Set<TBackgroundPlay> TBackgroundPlays) {
		this.TBackgroundPlays = TBackgroundPlays;
	}

}