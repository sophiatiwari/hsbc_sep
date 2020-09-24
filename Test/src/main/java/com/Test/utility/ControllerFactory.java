package com.Test.utility;

import com.Test.controller.TestController;
import com.Test.controller.TestControllerInterface;


//This is the factory class approach to connect the different layers among themselves.

public class ControllerFactory {

	private ControllerFactory() {}  //no one can access this for initialization.

	public static TestControllerInterface createObject(String nn)
	{
		TestControllerInterface sci=null;
		if(nn.equals("admincontroller"))
		{
			sci=new TestController();
		}
		return sci;
	}
}
