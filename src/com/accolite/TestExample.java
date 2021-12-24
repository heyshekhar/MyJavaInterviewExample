package com.accolite;

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}


class SingletonExample {
	
	private SingletonExample singletonExample;
	private SingletonExample() {}
	
	public SingletonExample getInstance() {
		if(singletonExample == null) {
			synchronized (SingletonExample.class) {
				if(singletonExample == null) {
					singletonExample = new SingletonExample();
				}
			}
		}
		
		return singletonExample;
	}
}

//[1,100] [2,200] [3,300] [4,400] [5,200]
//
//100+200+300+400 =1000
//
//1000-200 = 800

		
		
