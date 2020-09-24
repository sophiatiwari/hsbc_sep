package com.Sample.service;

import java.util.List;

import com.Sample.entity.UserAddressInfo;
import com.Sample.utility.SampleException;

public interface SampleServiceInterface {
	int insertInListService(UserAddressInfo uai)throws Exception;
	boolean deleteFromListService(UserAddressInfo uai)throws Exception;
	boolean searchInListService(UserAddressInfo uai)throws Exception;
	List<UserAddressInfo> viewFromListService()throws SampleException;

}
