package com.vm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//num = 5
		//combination of 1 and 2 sum = 5
		//1 5 times 
		//1 +2 +2
		//2+111
		
//		List<String> lt = new ArrayList<String>();
//		fun(lt);
		
		//linked list 1 2 3 4 5
		//n = 2 
		// 2 1 4 3 5
		
//		nexIndex = 2;
//		preIndex = temp;
//		temp = nextIndex;
//		
//		t = preIndex.next; 2
//		
//		temp.nextIndex = preIndex;
//		preIndex = temp;
//		temp = t;
		
		
		
		LinkedListClass ltc = new LinkedListClass();
		
		LinkedListClass preIndex, nextIndex, temp ,head = ltc;
		
		nextIndex = temp = head;
		preIndex = null;
		
		while(temp != null) {
			nextIndex = nextIndex.nextIndex;
			preIndex = temp;
			temp = nextIndex;
			
//			t = preIndex.next; 2
//			
//			temp.nextIndex = preIndex;
//			preIndex = temp;
//			temp = t;
		}
		
		
		reverseLinkedList(head);
		
		
		
		
		
		
		
		
//		countNumber();
		
	}

	private static void reverseLinkedList(LinkedListClass head) {
       LinkedListClass preIndex, nextIndex, temp, midIndex;
		
       preIndex = midIndex= temp =nextIndex= head;
       
       while(temp != null) {
    	   nextIndex = nextIndex.nextIndex.nextIndex;
    	   temp = temp.nextIndex;
    	   midIndex = temp; 
   		   temp.nextIndex = preIndex; 
   		   preIndex.nextIndex = nextIndex; 
//   		   preIndex = midIndex; 
   		  preIndex = temp = nextIndex; 
       }
       
       
       
       
//		nextIndex = temp = head;
//		preIndex = null;
//		
//		while(temp != null) {
//			nextIndex = nextIndex.nextIndex;
//			temp.nextIndex = preIndex;
//			preIndex = temp;
//			temp = nextIndex;
//		}
//		
//	   head = temp;
		
	}

	private static void countNumber() {
		int num = 5,count = 0, num1=1, num2 =2;
		int temp=0;
		int index = 1;
		for (int i=num1; i<=num2; i++) {
			if(num%i == 0) {
				System.out.print("count num : "+index);
				index++;
				for(int j=1; j<=num; j++) {
					System.out.print(i );
				}
				count++;
			}
			if(i == num1) {
				temp=num2;
			}else {
				temp=num1;
			}
			
			int sum = i;
			while(sum<num) {
				sum = sum+temp;
				if(sum == num) {
					System.out.print("\ncount num : "+index);
					count = count+2;
				}
			}
		}
		
		System.out.println("count : "+count);
		
	}

	public static List<Object> fun(List<?> obj) {
		return new ArrayList();
	}

}

class LinkedListClass {
	static int num;
	static LinkedListClass nextIndex;
}
