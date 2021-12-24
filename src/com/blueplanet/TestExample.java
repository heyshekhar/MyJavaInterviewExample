package com.blueplanet;

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1,2,3,4,5....11
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11};
		
		int startIndex = 0;
		int endIndex = 0;
//		for(int i=0; i<arr.length/2; i++) {
//			endIndex++;
//		}
		
		while(startIndex<arr.length/2) {
			startIndex++;
			
		}
		
//		int midIndex = startIndex+endIndex/2;
		int midIndex = startIndex;
		
		System.out.println("mid element : "+arr[midIndex]);

	}

}
