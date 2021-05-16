package com.laptrinhjavaweb.controller;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.model.BuildingModel;
import com.laptrinhjavaweb.service.BuildingService;
import com.laptrinhjavaweb.service.IBuildingService;

public class BuildingController {
	private IBuildingService buildingService = new BuildingService();
	public List<BuildingModel> findAll(BuildingModel searchModel){
		List<BuildingModel> result = new ArrayList<BuildingModel>();
		result = buildingService.fillAll(searchModel);
		return result;
	}
}
