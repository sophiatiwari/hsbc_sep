package com.Sample.utility;

import com.Sample.dao.SampleDao;
import com.Sample.dao.SampleDaoInterface;

public class DaoFactory {
	private DaoFactory() {}  //no one can access this for initialization.

	public static SampleDaoInterface createObject(String nn)
	{
		SampleDaoInterface sdi=null;
		if(nn.equals("admindao"))
		{
			sdi=new SampleDao();
		}
		return sdi;
	}

}
