package com.cammscope;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//linkedList --> 
		//LinkedHashSet -->
		
		
//		Thread t1 = new Thread(new SingletonRef());
//		Thread t2 = new Thread(new SingletonRef());
//		
//		t1.start();
//		t2.start();
		
		
//		LinkedListExample temp, nextNode,preNode;
//		
//		temp = nextNode = head;
//		preNode = null;
//		
//		while(temp != null) {
//			nextNode = nextNode.next;
//			temp.next = preNode;
//			preNode = temp;
//			temp =nextNode;
//		}
//		
//		head = preNode;
		
		
		//abcabbabcbba
		//abc abb abc bba
		//abc 
		
		String str = "abcabbabcbba";
		findNonRepitativeString(str);

}

	private static void findNonRepitativeString(String str) {
		
		String s1 = str;
		Set<String> ltStr = new HashSet<String>();
		while(s1.length()>3) {
			ltStr.add(s1.substring(0,3));
			s1 = s1.substring(3);
		}
		
		if(!s1.isEmpty()) {
			ltStr.add(s1);
		}
		
	}

}

//head
//[1,200] [2,300]....[5,null]
//
//class LinkedListExample {
//	int data;
//	LinkedListExample next;
//}









class SingletonRef extends Thread {
	public void run() {
		SingletonExmaple singletonExmaple = SingletonExmaple.getInstance();
		System.out.println("instance : "+singletonExmaple+" with Thread : "+Thread.currentThread());
	}
}


class SingletonExmaple {
	private static volatile SingletonExmaple obj = new SingletonExmaple();
	private SingletonExmaple() {}
	
	public static SingletonExmaple getInstance() {
//		return obj;
		
//		if(obj == null) {
//			synchronized (SingletonExmaple.class) {
//				if(obj == null) {
//					obj = new SingletonExmaple();
//				}
//				
//			}
//		}
		
		return obj;
	}
}