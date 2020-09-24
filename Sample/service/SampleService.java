package com.Sample.service;

import java.util.List;

import com.Sample.dao.SampleDaoInterface;
import com.Sample.entity.UserAddressInfo;
import com.Sample.utility.DaoFactory;
import com.Sample.utility.SampleException;

public class SampleService implements SampleServiceInterface{

    private SampleDaoInterface sdi;   //object creation using factory method.
	
	public  SampleService() {
		sdi=DaoFactory.createObject("admindao");
	}
	
//---------------------------------------------------------------------------------------------------------------------------
	@Override
	public int insertInListService(UserAddressInfo uai) throws Exception{
		
		return sdi.insertInListDao(uai);
	
		
	}

//----------------------------------------------------------------------------------------------------------------------------
	@Override
	public boolean deleteFromListService(UserAddressInfo uai) throws Exception{
		return sdi.deleteFromListDao(uai);
		
		
	}

//-------------------------------------------------------------------------------------------------------------------------------
	@Override
	public boolean searchInListService(UserAddressInfo uai) throws Exception {
		return sdi.searchInListDao(uai);
		
	}

//----------------------------------------------------------------------------------------------------------------------------
	@Override
	public List<UserAddressInfo> viewFromListService() throws SampleException {
		List<UserAddressInfo> ll = null;
		try {
			ll=sdi.viewFromListDao();
		}
		catch(SampleException se)
		{
			throw se;                   //rethrowing of exception.
		}
		return ll;
		// TODO Auto-generated method stub
		
	}
	

}
