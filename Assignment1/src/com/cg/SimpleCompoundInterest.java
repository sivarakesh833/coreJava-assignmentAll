package com.cg;

import java.util.Scanner;

public class SimpleCompoundInterest {
static Scanner sc=null;
static double amount,time,interest,simpleIntr,compoIntr=0;
static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
sc=new Scanner(System.in);
System.out.println("Enter amount :- ");
amount=sc.nextDouble();
System.out.println("Enter number of years:- ");
time=sc.nextDouble();
System.out.println("Enter interest rate:- ");
interest=sc.nextDouble();
System.out.println("enter 1 for simple interest 2 for compound interest ");
SimpleCompoundInterest compoundInterest=new SimpleCompoundInterest();
while(true) {
System.out.println("Enter choice:- ");
i=sc.nextInt();
switch(i) {
case 1:
	compoundInterest.simpleInterest(amount,time,interest);
	break;
case 2:
	compoundInterest.compoundInterest(amount,time,interest);
	break;
default:
	System.out.println("Enter choice as 1 or 2 only");
	break;
}
}
	}
	private void compoundInterest(double amount2, double years2, double interest2) {
		// TODO Auto-generated method stub
		System.out.println("Compound interest is:- ");
		compoIntr = amount2 * 
                 (Math.pow((1 + interest2 / 100), time)); 
       		System.out.println(compoIntr);
	}
	private void simpleInterest(double amount2, double years2, double interest2) {
		// TODO Auto-generated method stub
		System.out.println("Simple Interest is:- ");
		simpleIntr=(amount2*years2*interest2)/100;
		System.out.println(simpleIntr);
	}
}
