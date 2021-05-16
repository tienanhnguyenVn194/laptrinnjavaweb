package com.laptrinhjavaweb.service;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.model.BuildingModel;
import com.laptrinhjavaweb.respository.BuildingRepository;
import com.laptrinhjavaweb.respository.IBuildingRepository;

public class BuildingService implements IBuildingService{
	
	private IBuildingRepository buildingRepository = new BuildingRepository();

	public List<BuildingModel> fillAll(BuildingModel search) {
		List<BuildingModel> result = new ArrayList<BuildingModel>();
		List<BuildingEntity> buildingEntities = buildingRepository.findALl();
		
		for(BuildingEntity item: buildingEntities) {
			BuildingModel buildingModel = new BuildingModel();
			buildingModel.setName(item.getName());
			buildingModel.setNumberOfBasement(item.getNumberOfBasement());
			result.add(buildingModel);
		}
		return result;
	}

} 