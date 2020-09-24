package com.Sample.dao;

import java.util.List;

import com.Sample.entity.UserAddressInfo;
import com.Sample.utility.SampleException;

public interface SampleDaoInterface {
	int insertInListDao(UserAddressInfo uad)throws Exception;
	boolean deleteFromListDao(UserAddressInfo uai)throws Exception;
	boolean searchInListDao(UserAddressInfo uai) throws Exception;
	List<UserAddressInfo> viewFromListDao()throws SampleException;

}
