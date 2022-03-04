package com.te.project.Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coaches {
	@Id
	private Integer coachId;
	private String coachName;
	private Double phNo;
	private String emial;
	private String badge;
	
	public Integer getCoachId() {
		return coachId;
	}
	public void setCoachId(Integer coachId) {
		this.coachId = coachId;
	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	public Double getPhNo() {
		return phNo;
	}
	public void setPhNo(Double phNo) {
		this.phNo = phNo;
	}
	public String getEmial() {
		return emial;
	}
	public void setEmial(String emial) {
		this.emial = emial;
	}
	public String getBadge() {
		return badge;
	}
	public void setBadge(String badge) {
		this.badge = badge;
	}
	
	

}
