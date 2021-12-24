package com.netwest;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new TestException();
		} catch (TestException e) {
			System.out.println("got the test excetion");
		}finally {
			
			System.out.println("inside excetion");
		}
	}

}

class TestException extends Exception{
	
}
