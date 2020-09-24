package com.Test.controller;


import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.Sample.entity.UserAddressInfo;
import com.Test.entity.Apparel;
import com.Test.entity.Electronics;
import com.Test.entity.FoodItems;
import com.Test.service.TestServiceInterface;
import com.Test.utility.ControllerFactory;
import com.Test.utility.ServiceFactory;

public class TestController implements TestControllerInterface  {
	
//--------------------------------------ESTABLISHING THE LINK BETWEEN LAYERS---------------------------------------------------
private TestServiceInterface ssi;   //object creation using factory method.
	
	public  TestController() {
		ssi=ServiceFactory.createObject("admincontroller");
	}
//------------------------------------------------ADDING ELEMENTS IN THE FIELD-------------------------------------------------
	@Override
	public void addController() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i=0;
	
		//User Input from console.
		System.out.println("Enter the name of user...");
		String itemCode = br.readLine();
		System.out.println("Enter the email of user...");
		String itemName = br.readLine();
		System.out.println("Enter the password of user...");
		String unitPrice = br.readLine();
		//System.out.println("Enter the address of user...");
		//String address = br.readLine();
		System.out.println("Enter the owner of the house ...");
		String dateOfManufacturing = br.readLine();
		System.out.println("Enter the country of user...");
		String dateOfExpiry = br.readLine();
		System.out.println("Enter the street of user...");
		String vegetarian = br.readLine();
		
		
		System.out.println("Enter the name of user...");
		String size = br.readLine();
		System.out.println("Enter the email of user...");
		String material= br.readLine();
		System.out.println("Enter the password of user...");
		String quantity = br.readLine();
		
		System.out.println("Enter the owner of the house ...");
		String warranty = br.readLine();
		
		//object of POJO class.
		FoodItems food = new FoodItems();
		Apparel apparel = new Apparel();
		Electronics electronics = new Electronics();
		
		
		//wrapping the entered data into the POJO object.
		
		food.setItemCode(Integer.parseInt(itemCode));
		food.setItemName(itemName);
		food.setUnitPrice(Integer.parseInt(unitPrice));
		food.setDateOfManufacturer(dateOfManufacturing);
		food.setDateOfExpiry(dateOfExpiry);
		food.setVegetarian(vegetarian);
		
		
		apparel.setItemCode(Integer.parseInt(itemCode));
		apparel.setItemName(itemName);
		apparel.setMaterial(material);
		apparel.setSize(size);
		apparel.setQuantity(Integer.parseInt(quantity));
		
		electronics.setItemCode(Integer.parseInt(itemCode));
		electronics.setItemName(itemName);
		electronics.setQuantity(Integer.parseInt(quantity));
		electronics.setUnitPrice(Integer.parseInt(unitPrice));
		electronics.setWarranty(Integer.parseInt(warranty));
		
		
		
		i=ssi.addService(food);
		j=ssi.addService(apparel);
		k=ssi.addService(electronics);
		//getting response from dao to service to controller layer.
		
		if(i>0)
		{
			System.out.println("Information inserted successfully...");
		}
		else 
			System.out.println("Information insertion is unsuccessfull...");
		
	}
	
	
	
//------------------------------------------------VIEW THE REPORT----------------------------------------------------------------
	
	

	@Override
	public void viewController() {
		// TODO Auto-generated method stub
		
	}

}
