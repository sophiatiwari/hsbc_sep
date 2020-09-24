package com.Sample.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.Sample.entity.UserAddressInfo;
import com.Sample.service.SampleServiceInterface;
import com.Sample.utility.SampleException;
import com.Sample.utility.ServiceFactory;

public class SampleController implements SampleControllerInterface{
	
	private SampleServiceInterface ssi;   //object creation using factory method.
	
	public  SampleController() {
		ssi=ServiceFactory.createObject("adminservice");
	}
	
//------------------------------------------------INSERTION---------------------------------------------------------------------------
	@Override
	public  void insertInListController() throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i=0;
	
		//User Input from console.
		System.out.println("Enter the name of user...");
		String name = br.readLine();
		System.out.println("Enter the email of user...");
		String email = br.readLine();
		System.out.println("Enter the password of user...");
		String password = br.readLine();
		//System.out.println("Enter the address of user...");
		//String address = br.readLine();
		System.out.println("Enter the owner of the house ...");
		String owner = br.readLine();
		System.out.println("Enter the country of user...");
		String country = br.readLine();
		System.out.println("Enter the street of user...");
		String street = br.readLine();
		
		//SampleUserInfo sui=new UserAddressInfo();
		UserAddressInfo uai = new UserAddressInfo();  //object of POJO class.
		
		//wrapping the entered data into the POJO object.
		uai.setName(name);
		uai.setEmail(email);
		uai.setPassword(password);
		uai.setOwner(owner);
		uai.setCountry(country);
		uai.setStreet(street);
		
		i=ssi.insertInListService(uai);
		//getting response from dao to service to controller layer.
		
		if(i>0)
		{
			System.out.println("Information inserted successfully...");
		}
		else 
			System.out.println("Information insertion is unsuccessfull...");
		
	}
	
//------------------------------------------------DELETION------------------------------------------------------------------
	@Override
	public void deleteFromListController() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean response;
	
		//User Input from console.
		System.out.println("Enter the name of user...");
		String name = br.readLine();
		
		UserAddressInfo uai = new UserAddressInfo();
		
		uai.setName(name);
		
		response=ssi.deleteFromListService(uai);
		System.out.println(response);
		if(response)
		{
			System.out.println("Information deleted successfully...");
		}
		else
			System.out.println("Information deletion is unsuccessfulls...");
			
			
		
	}
	
//---------------------------------------------------SEARCH----------------------------------------------------------------------

	@Override
	public void searchInListController() throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the user to whom u want to search...");
		String name=br.readLine();
		boolean result;
		
        UserAddressInfo uai = new UserAddressInfo();		
		uai.setName(name);
		
		result=ssi.searchInListService(uai);
		if(result)
		{
			System.out.println("user exists...");
		}
		else
			System.out.println("user doesn't exist...");
		
	}

//----------------------------------------------------VIEW-----------------------------------------------------------------------
	@Override
	public void viewFromListController() {
		List<UserAddressInfo> ll = new ArrayList<UserAddressInfo>();
		
		try{
			ll=ssi.viewFromListService();
			for(UserAddressInfo oo:ll)
			{
				System.out.println("**********************************");
				
				System.out.println("Name:"+" "+oo.getName());
				System.out.println("Email:"+" "+oo.getEmail());
				System.out.println("Password:"+" "+oo.getPassword());
				System.out.println("Owner:"+" "+oo.getOwner());
				System.out.println("Country:"+" "+oo.getCountry());
				System.out.println("Street:"+" "+oo.getStreet());
				
				System.out.println("**********************************");
				
			}
		
		}
		catch(SampleException se)
		{
			se.printStackTrace();
		}
		
	}
}
