package com.laptrinhjavaweb.view;

import java.util.List;
import java.util.Scanner;

import com.laptrinhjavaweb.controller.BuildingController;
import com.laptrinhjavaweb.model.BuildingModel;

public class BuildingView {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập tên tòa nhà: ");
		String name = input.nextLine();
		System.out.println("Số tầng hầm: ");
		String numberOfBasement = input.nextLine();
		BuildingModel buildingModel = new BuildingModel();
		buildingModel.setName(name);
		buildingModel.setNumberOfBasement(Integer.parseInt(numberOfBasement));
		BuildingController buildingController = new BuildingController();
		List<BuildingModel> result = buildingController.findAll(buildingModel);
		
		for(BuildingModel item: result) {
			System.out.println(item.getName() + item.getNumberOfBasement());
		}
	}
}
