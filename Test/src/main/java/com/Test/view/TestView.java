package com.Test.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.Test.controller.TestControllerInterface;
import com.Test.utility.ControllerFactory;

public class TestView {
	public static void main(String args[]) throws Exception
	{
		 
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		//establishing communication between layers through by using factory method.

		TestControllerInterface sci;
		 
		sci=ControllerFactory.createObject("admincontroller");
		
		String cc="y";
		while(cc.equals("y")) {
			
			System.out.println("*********************************MAIN MENU************************");
			System.out.println("press 1 for Food Item");
			System.out.println("press 2 for Apparel");
			System.out.println("press 3 for Electronics");
			
			System.out.println("enter your choice... ");
			int i=Integer.parseInt(br.readLine());
			int j=0;
			int k=0;
			int l=0;
			
				switch(i) {
				case 1: 
					System.out.println("press 1 for insertion");
					System.out.println("press 2 for view");
					System.out.println("enter your choice... ");
					j=Integer.parseInt(br.readLine());
					
					switch(j)
					{
					case 1: sci.addController();
			        break;
					case 2: sci.viewController();
					break;
					}
					break;
				case 2:
					System.out.println("press 1 for insertion");
					System.out.println("press 2 for view");
					System.out.println("enter your choice... ");
					k=Integer.parseInt(br.readLine());
					
					switch(k)
					{
					case 1: sci.addController();
			        break;
					case 2: sci.viewController();
					break;
					}
					break;
				case 3:
					System.out.println("press 1 for insertion");
					System.out.println("press 2 for view");
					System.out.println("enter your choice... ");
					k=Integer.parseInt(br.readLine());
					
					switch(l)
					{
					case 1: sci.addController();
			        break;
					case 2: sci.viewController();
					break;
					}
					break;
				
				default:System.out.println("wrong choice");
				
				}
				System.out.print("Do you want to continue....");
				cc=br.readLine();
			}
					
	}

}
