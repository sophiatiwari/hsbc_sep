package com.Test.dao;

import java.util.List;

import com.Test.entity.FoodItems;

public interface TestDaoInterface {
	
	int addDao(FoodItems food);
	List<FoodItems> viewDao();


}
