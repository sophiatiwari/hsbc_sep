package com.Test.utility;


import com.Test.dao.TestDao;
import com.Test.dao.TestDaoInterface;


//This is the factory class approach to connect the different layers among themselves.
public class DaoFactory {
	
	private DaoFactory() {}  //no one can access this for initialization.

	public static TestDaoInterface createObject(String nn)
	{
		TestDaoInterface sci=null;
		if(nn.equals("admindao"))
		{
			sci=new TestDao();
		}
		return sci;
	}

}
