package com;
import java.util.Scanner;
public class bank {
	static Scanner sc = new Scanner (System.in);
	static double balance ;
	static {
		System.out.println("Enter the amount balane : ");
		double h = sc.nextDouble() ;
		balance=h;
		
	}
	{
		System.out.println("the balance u had in your account : "+balance);
	}
	double deposit(double money) {
		if(money>=0) {
			System.out.println(" Balance added because the amount is  valid ");
			balance +=money;
			return balance;
		}
		System.out.println("No balance added because the amount is not valid ");
		return balance;
	}
	static void withdraw(double amount) {
		if(amount>=0 && amount<=balance) {
			System.out.println(" after with draw Balance is : "+(balance -amount));
			balance -=amount;
			
		}
		System.out.println("No amount with draw from  balance and remaining balance : "+balance);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b = new bank();
		System.out.println("Enter the money u want to add ");
		
		double money =sc.nextDouble();
		System.out.println(b.deposit(money));
		System.out.println("Enter the amount  u want to withdraw ");
		double amount  =sc.nextDouble();
		withdraw(amount);
		
	}

}
