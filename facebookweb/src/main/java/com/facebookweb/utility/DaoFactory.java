package com.facebookweb.utility;

import com.facebookweb.dao.RegistrationDaoInterface;
import com.facebookweb.dao.ResgistrationDao;
import com.facebookweb.service.RegistrationServiceInterface;
import com.facebookweb.service.RegsitrationService;

public class DaoFactory {
	
	private DaoFactory() {}  //no one can access this for initialization.

	public static RegistrationDaoInterface createObject(String nn)
	{
		RegistrationDaoInterface registrationdaoInterface=null;
		if(nn.equals("admindao"))
		{
			registrationdaoInterface=new ResgistrationDao();
		}
		return registrationdaoInterface;
	}


}
