package com;

public class Crickets {
	//Declaration
	//static variables
	static int countryid;
	static String countryName;

	//instance variable
	int jerseyNumber;
	String cricketerName;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method Started");
		System.out.println("Welcome to Indian Cricket team");
		
		System.out.println("befor initilization of static variables");
		System.out.println(countryid);
		System.out.println(countryName);
		
		 countryid=91;
		 countryName="India";
		//accessing static variable
		
		System.out.println("after initilization of static variables");
		System.out.println(countryid);
		System.out.println(countryName);
		
		
		//accessing instance variables
		//Cannot make a static reference to the non-static field jerseyNumber
		//	System.out.println(jerseyNumber);
		//System.out.println(cricketerName);
		
		
		//create an object of class of instances variable to access
		Crickets msd = new Crickets();
		//msd is not obj it is a reference variable not an objects
		System.out.println("befor initilization of instance variables");
		System.out.println(msd.jerseyNumber);
		System.out.println(msd.cricketerName);
		
		msd.jerseyNumber=7;
		msd.cricketerName="mahendra sinhg dhoni";
		
		System.out.println("after initilization of instance variables");
		System.out.println("jersey number "+msd.jerseyNumber);
		System.out.println("Cricketer Name"+msd.cricketerName);
	
		int y;
		
		
		}

}
