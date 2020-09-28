package com.facebookweb.utility;

import com.facebookweb.service.RegistrationServiceInterface;
import com.facebookweb.service.RegsitrationService;

public class ServiceFactory {

	private ServiceFactory() {}  //no one can access this for initialization.

	public static RegistrationServiceInterface createObject(String nn)
	{
		RegistrationServiceInterface registrationServiceInterface=null;
		if(nn.equals("adminservice"))
		{
			registrationServiceInterface=new RegsitrationService();
		}
		return registrationServiceInterface;
	}

}
