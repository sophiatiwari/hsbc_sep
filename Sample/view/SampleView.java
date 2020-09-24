package com.Sample.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.Sample.controller.SampleControllerInterface;
import com.Sample.utility.ControllerFactory;


public class SampleView {

	public static void main(String[] args) throws Exception {
		 
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		//establishing communication between layers through by using factory method.

		SampleControllerInterface sci;
		 
		sci=ControllerFactory.createObject("admincontroller");
		String cc="y";
		while(cc.equals("y")) {
			
			System.out.println("*********************************MAIN MENU************************");
			System.out.println("press 1 to insertion");
			System.out.println("press 2 to deletion");
			System.out.println("press 3 to searching");
			System.out.println("press 4 to view");
		

			System.out.println("enter your choice ");
			int i=Integer.parseInt(br.readLine());
			
				switch(i) {
				case 1: sci.insertInListController();  
					break;
				case 2:sci.deleteFromListController();
					break;
				case 3:sci.searchInListController();
				    break;
				case 4:sci.viewFromListController();
					break;
				
				default:System.out.println("wrong choice");
				
				}
				System.out.print("Do you want to continue....");
				cc=br.readLine();
			}
					
			
			

	}

}
