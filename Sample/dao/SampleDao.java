package com.Sample.dao;

import java.util.ArrayList;
import java.util.List;

import com.Sample.entity.UserAddressInfo;
import com.Sample.utility.SampleException;

public class SampleDao implements SampleDaoInterface {

    private ArrayList<UserAddressInfo> al=null;  //ArrayList contains POJO class objects.It is declared as private cz no one can access it outside the Dao class.
    public SampleDao() {    
    	//making a global ArrayList.
    	al=new ArrayList<UserAddressInfo>();
		System.out.println("again");
    }

//---------------------------------------------------INSERTION---------------------------------------------------------------
    @Override
	
	  public int insertInListDao(UserAddressInfo uad) throws Exception
    { int i=0;
	  al.add(uad);
	  
	  if(al.size()>0) //it checks whether data is entered into the ArrayList or not.If yes, return 1. 
	  {
		  i=1; 
	  }
         return i;
    }
   
//---------------------------------------------------DELETION-------------------------------------------------------------
		

	@Override
	public boolean deleteFromListDao(UserAddressInfo uai)throws Exception {
		/*
		 * for(UserAddressInfo uu:al) { if(uu.getName().equalsIgnoreCase(uai.getName()))
		 * { al.remove(uai); } }
		 */
		 System.out.println(al.size());
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).getName());
			if(al.get(i).getName().equalsIgnoreCase(uai.getName())) {
				 al.remove(i);
				 return true;
			}
		}
		return false;
		
		
		
		
	}
	
//-----------------------------------------------------SEARCH--------------------------------------------------------------------

	@Override
	public boolean searchInListDao(UserAddressInfo uai)throws Exception {
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).getName().contains(uai.getName()))
			{
				return true;
			}
		}
		return false;
		
	}

//--------------------------------------------------------------------------------------------------------------------------------
	@Override
	public List<UserAddressInfo> viewFromListDao()throws SampleException {
		if(al.size()==0)
		{
			throw new SampleException("");
		}
		return al;
		
		
	}
	

}
