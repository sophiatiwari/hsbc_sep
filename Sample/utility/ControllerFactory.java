package com.Sample.utility;

import com.Sample.controller.SampleController;
import com.Sample.controller.SampleControllerInterface;



public class ControllerFactory {
	private ControllerFactory() {}  //no one can access this for initialization.

	public static SampleControllerInterface createObject(String nn)
	{
		SampleControllerInterface sci=null;
		if(nn.equals("admincontroller"))
		{
			sci=new SampleController();
		}
		return sci;
	}


}
