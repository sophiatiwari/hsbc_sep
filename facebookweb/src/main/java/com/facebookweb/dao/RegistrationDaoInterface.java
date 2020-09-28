package com.facebookweb.dao;

import java.util.List;

import com.facebookweb.entity.RegistrationEntity;

public interface RegistrationDaoInterface {
	
	int addToDatabaseDao(RegistrationEntity uai);

	boolean loginProfileDao(RegistrationEntity fe);

	List<RegistrationEntity> friendProfileDao(RegistrationEntity fe);

}
