package com.wallmart;

import java.util.Map;

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int num[] = {1,6,3,4,5};
//		
//		int size = num.length-1;
//		
//		for(int i=0; i<num.length; i++) {
//			swapElement(i,num, size);
//		}
//		
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
		
		
		int empId[] = {1,3,4,6,2,};
   	


//		Map<Integer, String> mp = new Map<Integer, String>();
//		mp.put(1, Employee);
//		mp.put(3, "M");
//		mp.put(4, "M");
//		mp.put(6, "TL");
//		mp.put(2, "E");
//		
		
		
		

	}

	private static void swapElement(int i, int[] num, int size) {
		
		int n = num[i]; 
		if(n>size) {
			num[i] = -1;
		}else {
			if(n != -1 && i != n) {
				int temp = num[num[i]]; //5
				num[num[i]] = num[i]; //5=4
				num[i] = temp; //2 =5
				swapElement(i, num, size);
			}
		}
		
	}

}


class Employee{
	int id;
	String desi;
	int salary;
}