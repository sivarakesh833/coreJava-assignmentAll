package com.cg.autoClosable;

public class AutoClosablee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (UserAutoCLosable autoCLosable = new UserAutoCLosable()) {
			System.out.println("try block");
		} catch (Exception e) {
			System.out.println("Catch block");
			e.printStackTrace();
		}
	}
}

class UserAutoCLosable implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("User defined Autoclosable class close() method.");
	}

}
