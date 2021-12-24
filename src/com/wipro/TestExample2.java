package com.wipro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestExample2 {

	public static void main(String[] args) {
//		Employee e1 = new Employee(1, name)
		
//		List<String> lt = new ArrayList<String>();
//		lt.add("shekhar");
//		lt.add("rathore");
//		
//		List<Object> str = lt.stream().filter(l -> l.startsWith("sh")).collect(Collectors.toList());
//		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		ThreadExp1 t1 = new ThreadExp1(obj1, obj2);
		ThreadExp2 t2 = new ThreadExp2(obj1, obj2);
		
		t1.start();
		t2.start();

	}

}

class ThreadExp1 extends Thread{
	
	private Object obj1;
	private Object obj2;
	
	public ThreadExp1(Object obj1, Object obj2) {
	
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void run() {
		synchronized (obj1) {
			try {
				System.out.print("lock on object 1");
				while(true) {
					System.out.print(".");
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		synchronized (obj2) {
			try {
				System.out.println("waiting for object 2");
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class ThreadExp2 extends Thread{
	
	private Object obj1;
	private Object obj2;
	
	public ThreadExp2(Object obj1, Object obj2) {
	
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void run() {
		synchronized (obj2) {
			try {
				System.out.print("\nlock on object 2");
				while(true) {
					System.out.print(".");
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		synchronized (obj1) {
			try {
				System.out.println("waiting for object 1");
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
