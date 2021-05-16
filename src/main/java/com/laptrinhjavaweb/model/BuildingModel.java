package com.laptrinhjavaweb.model;

public class BuildingModel {
	private String name;
	private Integer numberOfBasement;

	// 
	public BuildingModel() {
		super();
	}
	public BuildingModel(String name, Integer numberOfBasement) {
		super();
		this.name = name;
		this.numberOfBasement = numberOfBasement;
	}
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumberOfBasement() {
		return numberOfBasement;
	}
	public void setNumberOfBasement(Integer numberOfBasement) {
		this.numberOfBasement = numberOfBasement;
	}
	
	
}
