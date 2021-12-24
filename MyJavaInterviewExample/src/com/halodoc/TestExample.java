package com.halodoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestExample {

	static StackExample temp,next,head;
	
	static int min;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		{1,3}, {5,7}, {8,9}, {2,20}, {10,19}, {3,1}, {20,2}
		//output {1,3}, {2,20}
		
//		[0,1,1,0,1,0,1,0,1]
//		[0,0,0,0,1,1,1,1,1]

		
		
//		findThePairs();
//		
//		createAStack();
		
		arrayProblem();
	}

	private static void arrayProblem() {
		int arr[] = {0,1,1,0,1,0,1,0,1};
		int index = arr.length-1;
		for(int i=0; i<arr.length; i++) {
			if(i == index) {
				break;
			}
			if(arr[i] != 0) {
				while(arr[index] != 0) {
					index--;
				}
				System.out.println("swap : "+arr[i]+" ---- "+arr[index]);
				arr[index] = arr[i];
				arr[i] = 0;
				index--;
			}
		}
		
		System.out.print("sorted array : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(+arr[i]);
		}
		
	}

	private static void createAStack() {
		int num = 0;
		pushOperation(num);
		
		popOperation();
		
		int mini = getMin();
		System.out.println("minimum : "+mini);
	}

	private static int getMin() {
		return min;
	}

	private static void popOperation() {
		if(head == null) {
			System.out.println("stack is empty");
		}else {
			if(min==head.getNum()) {
				StackExample t = head.getNext();
				min = t.getNext().getNum();
				while(t != null) {
					if(min>t.getNum()) {
						min = t.getNum();
					}
				}
			}
			temp = head.getNext();
			head = temp;
		}
		
	}

	private static void pushOperation(int num) {
		if(head == null) {
			min = num;
			temp.setNum(num);
			temp.setNext(null);
		}else {
			if(min>num) {
				min = num;
			}
			temp.setNum(num);
			temp.setNext(head);
			head = temp;
		}
		
	}

	private static void findThePairs() {
		int arr[][] = { { 1, 3 }, { 5, 7 }, { 8, 9 }, { 2, 20 }, { 10, 19 }, { 3, 1 }, { 20, 2 } };

		HashMap<List<Integer>, Integer> mp = new HashMap<List<Integer>, Integer>();
		for (int i = 0; i < arr.length; i++) {
			List<Integer> in = new ArrayList<Integer>();
			for (int j = 0; j < arr[0].length; j++) {
				in.add(arr[i][j]);
			}

			Collections.sort(in);
			if (mp.containsKey(in)) {
				mp.put(in, mp.get(in) + 1);
			} else {
				mp.put(in, 0);
			}

		}

		for (Map.Entry<List<Integer>, Integer> m : mp.entrySet()) {
			if (m.getValue() > 0) {
				System.out.println("pairs : " + m.getKey());
			}
		}

	}

}


class StackExample{
	private int num;
	private StackExample next;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public StackExample getNext() {
		return next;
	}
	public void setNext(StackExample next) {
		this.next = next;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StackExample [num=");
		builder.append(num);
		builder.append(", next=");
		builder.append(next);
		builder.append("]");
		return builder.toString();
	}
	
	
}
