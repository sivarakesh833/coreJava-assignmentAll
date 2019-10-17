package com.cg.differentForms;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.naming.InsufficientResourcesException;

public class TryCatchDifferentForms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchDifferentForms catchDifferentForms=new TryCatchDifferentForms();
	try {
		catchDifferentForms.withDraw();
		try {
			FileReader file = new FileReader("C:\\test\\a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	} catch (InsufficientResourcesException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		System.out.println("Finally block.");
	}
	}

	private void withdraw1() throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter wr = new BufferedWriter(new FileWriter("abc.txt"));
	}

	private void withDraw() throws InsufficientResourcesException {
		// TODO Auto-generated method stub
		throw new InsufficientResourcesException("User defined checked Exception.");
	}
}
