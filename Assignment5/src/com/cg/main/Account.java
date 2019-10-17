package com.cg.main;

import javax.naming.InsufficientResourcesException;

import com.cg.exception.InsufficientBalanceException1;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		// checked user defined exception,,shows error at compile time.
		try {
			account.withDraw();
		} catch (InsufficientResourcesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		account.withDraw1();
	}

	public void withDraw() throws InsufficientResourcesException {
		throw new InsufficientResourcesException("USer defined Excption was thrown and");
	}

	public void withDraw1() throws InsufficientBalanceException1 {
		throw new InsufficientBalanceException1("USer defined Excption1 was thrown and");
	}
}
