package com.Test.service;

import java.util.List;

import com.Test.entity.FoodItems;

public interface TestServiceInterface {
	int addService(FoodItems food);
	List<FoodItems> viewService();

}
