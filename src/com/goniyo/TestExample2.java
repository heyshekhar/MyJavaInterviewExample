package com.goniyo;

import java.util.LinkedList;

public class TestExample2 {

	static LinkedListExample head = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		head.setData(1);
//		LinkedListExample l1 = new LinkedListExample();
//		l1.setData(2);
//		head.setNext(l1);
		int num = 10;
		addValue(10);
		addValue(11);
		System.out.println("before reverse......");
//		printValue();
		
		reversLinkedList(head);
		System.out.println("after reverse......");
//		printValue();
	}

	private static void printValue() {
		if(head == null) {
			System.out.println("list is empty");
		}else {
			LinkedListExample temp = head;
			while(temp != null) {
				System.out.println(temp.data);
				temp.next = temp;
			}
		}
		
	}

	private static void addValue(int num) {
		 LinkedListExample list = new LinkedListExample(num);
		if(head == null) {
			list.next = null;
			head = list;
		}else {
			System.out.println("head : "+head);
			LinkedListExample temp = head;
			list.next = null;
			temp.next = list;
		}
		
	}

	private static void reversLinkedList(LinkedListExample head) {
		LinkedListExample nextNode, temp, preNode;
		
		preNode = null;
		temp = nextNode = head;
		while(temp != null) {
			nextNode = nextNode.next;
			temp.next = preNode;
			preNode = temp;
			temp = nextNode;
		}
		head = preNode;
	}

}

class LinkedListExample{
	int data;
	LinkedListExample next;
	
	public LinkedListExample(int data) {
		this.data = data;
		this.next = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public LinkedListExample getNext() {
		return next;
	}
	public void setNext(LinkedListExample next) {
		this.next = next;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LinkedListExample [data=");
		builder.append(data);
		builder.append(", next=");
		builder.append(next);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}


//class FactoryPattern{
//	
//	public Object 
//}


class SingletonExample implements Cloneable {
	
	private static volatile SingletonExample obj;
	
	private SingletonExample() throws Exception {
		if(obj != null) {
			throw new Exception("object is already created");
		}
	}
	
	public static SingletonExample getInstance() throws Exception {
		if(obj == null) {
			synchronized(SingletonExample.class) {
				if(obj == null) {
					obj = new SingletonExample();
				}
			}
		}
		return obj;
	}
}










