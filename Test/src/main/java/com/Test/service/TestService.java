package com.Test.service;

import java.util.List;

import com.Test.dao.TestDaoInterface;
import com.Test.entity.FoodItems;
import com.Test.utility.DaoFactory;

public class TestService implements TestServiceInterface {
	
	
	
   private TestDaoInterface ssi;   //object creation using factory method.
	
	public  TestService() {
		ssi=DaoFactory.createObject("admindao");
	}
	
//---------------------------------------------------------------------------------------------------------------
	@Override
	public int addService(FoodItems food) {
		return ssi.addDao(food);
		
		
	}
	
	
	
	

	@Override
	public List<FoodItems> viewService() {
		return ssi.viewDao();  //returning the objects to the controller. this way we will send the objects of three ArrayList
		
	}

}
