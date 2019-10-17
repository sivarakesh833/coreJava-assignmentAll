package com.cg;

public class AllArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int originalNumber,remainder,result = 0;
for(int i=100;i<=999;i++) {
	originalNumber=i;
	 while (originalNumber > 0)
     {
         remainder = originalNumber % 10;
         result += Math.pow(remainder, 3);
         originalNumber /= 10;
     }
	
	 if(result == i)
         System.out.println(i + " is an Armstrong number.");
	 result=0;
}
	}
}
