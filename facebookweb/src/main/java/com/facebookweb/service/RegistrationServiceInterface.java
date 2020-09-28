package com.facebookweb.service;

import java.util.List;

import com.facebookweb.entity.RegistrationEntity;

public interface RegistrationServiceInterface {
	
	int addToDatabaseService(RegistrationEntity uai);

	boolean loginProfileService(RegistrationEntity fe);

	List<RegistrationEntity> friendProfileService(RegistrationEntity fe);

}
