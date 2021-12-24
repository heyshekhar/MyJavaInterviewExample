package com.informatica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//use 2 thread
		//thread 1 = print upper case
		//thread 2 = print lower case
		
//		List<Integer> lt = new ArrayList<Integer>();
//		lt.add(1);
//		UpperCase upperCase = new UpperCase(lt);
//		LowerCase lowerCase = new LowerCase(lt);
//		
//		Thread t1 = new Thread(upperCase);
//		Thread t2 = new Thread(lowerCase);
//		
//		t1.start();
//		t2.start();
		
		
		int n1 = 15;
		int n2 = 6;
		int n3 = 35;
		
		int newNum = Math.min(n1, n2);
		int sum = n1+n2;
		n2 = sum-newNum; 
		n1 = sum-n2; 
		newNum = Math.min(n2, n3);
		sum = n2+n3; 
		n3 = sum-newNum; 
		n2 = sum-n3; 
		
		System.out.println(n1+" "+n2+" "+n3);
		
		
		
		
		
	}

}

class UpperCase implements Runnable{
	
	List<Integer>  obj;
	boolean flag = true;
	public UpperCase(List<Integer>  obj) {
		this.obj = obj;
	}
	public void run() {
		synchronized (obj) {
			for(int i=96; i<127; i++) {
				if(obj.isEmpty()) {
					try {
						obj.wait();
					}catch(Exception e) {
						
					}
				}
				System.out.print(Character.toChars(i));
				obj.clear();
				obj.notifyAll();
			}
		}
	}
}

class LowerCase implements Runnable{
	
	List<Integer>  obj;
	
	public LowerCase(List<Integer>  obj) {
		this.obj = obj;
	}
	public void run() {
		synchronized (obj) {
			for(int i=65; i<96; i++) {
				if (!obj.isEmpty()) {
					try {
						obj.wait();
					} catch (Exception e) {

					}
				}
				System.out.print(Character.toChars(i));
				obj.add(1);
				obj.notifyAll();
				System.out.println();
				
			}
		}
	}
}











final class ImmutalbeExample {
	private String name;
	
	public ImmutalbeExample(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
