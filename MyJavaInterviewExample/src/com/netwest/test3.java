package com.netwest;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread t = new TestThread();
		t.run();
	}

}

class TestThread extends Thread{
	public void run() {
		System.out.println("run");
	}
}


