package com.Sample.utility;

public class SampleException extends Exception{
	private String name;
	
	public SampleException(String string) {
		// TODO Auto-generated constructor stub
	}
    @Override
	public String toString()
	{
		return "User doesn't exist";
		
	}

}
