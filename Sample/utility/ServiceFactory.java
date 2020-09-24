package com.Sample.utility;

import com.Sample.service.SampleService;
import com.Sample.service.SampleServiceInterface;

public class ServiceFactory {
	
	private ServiceFactory() {}  //no one can access this for initialization.

	public static SampleServiceInterface createObject(String nn)
	{
		SampleServiceInterface ssi=null;
		if(nn.equals("adminservice"))
		{
			ssi=new SampleService();
		}
		return ssi;
	}

}
