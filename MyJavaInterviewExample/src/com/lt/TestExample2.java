package com.lt;

public class TestExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abc";
		String strObj = new String("abc");

	}

}

class SingletonExp {
	
	private static SingletonExp singletonExp;
	private static volatile int instanceCount = 0; 
	
	private SingletonExp() {}
	
	public static SingletonExp getInstance() {
		if(instanceCount <= 5) {
			synchronized (SingletonExp.class) {
				instanceCount++;
				singletonExp = new SingletonExp();
			}
		}

		return singletonExp;
	}
}
