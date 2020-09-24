package com.Test.dao;

import java.util.ArrayList;
import java.util.List;

import com.Sample.utility.SampleException;
import com.Test.entity.Apparel;
import com.Test.entity.Electronics;
import com.Test.entity.FoodItems;
import com.Test.utility.DaoFactory;

public class TestDao implements TestDaoInterface {
	
	private ArrayList<FoodItems> fd=null;
	private ArrayList<Apparel> ap=null;
	private ArrayList<Electronics> e=null;//ArrayList contains POJO class objects.It is declared as private cz no one can access it outside the Dao class.
    public TestDao() {    
    									  //making a global ArrayList.
    	fd=new ArrayList<FoodItems>();
    	ap=new ArrayList<Apparel>();
    	e=new ArrayList<Electronics>();
		
    }

//---------------------------------------------------Connection between Layers--------------------------------------
	

	@Override
	public int addDao(FoodItems food){
		  int i=0;
		  fd.add(food);  //this the way we will ad items to the respective arraylist.
		  
		  if(fd.size()>0) //it checks whether data is entered into the ArrayList or not.If yes, return 1. 
		  {
			  i=1; 
		  }
	        return i;
	        
	      
		
		
		
	}

	
//-----------------------------------------------------------------------------------------------------------
	
	@Override
	public List<FoodItems>viewDao() {
		return fd;                    //returning the whole ArrsyList.
	}

}
