package com.facebookweb.service;

import java.util.List;

import com.facebookweb.dao.RegistrationDaoInterface;
import com.facebookweb.entity.RegistrationEntity;
import com.facebookweb.utility.DaoFactory;

public class RegsitrationService implements RegistrationServiceInterface {
	
	
//------------------------------------------FACTORY OBJECT---------------------------------------------------------------

	 private RegistrationDaoInterface sdi;   //object creation using factory method.
		
		public  RegsitrationService() {
			sdi=DaoFactory.createObject("admindao");
		}
	

//------------------------------------------ADD FUNCTION--------------------------------------------------------------

	@Override
	public int addToDatabaseService(RegistrationEntity uai) {
		
		return sdi.addToDatabaseDao(uai);
	}


//------------------------------------------LOGIN----------------------------------------------------------------------------
	@Override
	public boolean loginProfileService(RegistrationEntity fe) {
		
		return sdi.loginProfileDao(fe);
	}

//-----------------------------------------FRIENDLIST---------------------------------------------------------------------
	@Override
	public List<RegistrationEntity> friendProfileService(RegistrationEntity fe) {
		
		return sdi.friendProfileDao(fe);
	}

}
