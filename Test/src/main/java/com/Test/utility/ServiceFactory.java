package com.Test.utility;

import com.Test.service.TestService;
import com.Test.service.TestServiceInterface;


//This is the factory class approach to connect the different layers among themselves.
public class ServiceFactory {
	
	private ServiceFactory() {}  //no one can access this for initialization.

	public static TestServiceInterface createObject(String nn)
	{
		TestServiceInterface sci=null;
		if(nn.equals("adminservice"))
		{
			sci=new TestService();
		}
		return sci;
	}

}
