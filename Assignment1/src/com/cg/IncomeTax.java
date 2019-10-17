package com.cg;

import java.util.Scanner;

public class IncomeTax {
	static Scanner sc = null;
	static double income = 0;
	static double incomeTax = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		System.out.println("Enter income Range(CTC):- ");
		income = sc.nextDouble();
		if (income >= 0 && income <= 180000) {
			System.out.println("You no need to pay tax and it comes under Slab A");
		} else if (income >= 180001 && income <= 300000) {
			incomeTax = (income * 10) / 100;
			System.out.println("You have to pay " + incomeTax + " tax and it comes under Slab B");
		} else if (income >= 300001 && income <= 500000) {
			incomeTax = (income * 20) / 100;
			System.out.println("YYou have to pay " + incomeTax + " tax and it comes under Slab C");
		} else if (income >= 500001 && income <= 1000000) {
			incomeTax = (income * 30) / 100;
			System.out.println("You have to pay " + incomeTax + " tax and it comes under Slab D");
		}
	}
}
