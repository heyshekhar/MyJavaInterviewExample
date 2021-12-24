package com.ushur;

import java.util.Arrays;

public class TestExample {

	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2};
		int sum = 5;
		fun(arr, sum);
	}

	private static void fun(int[] arr, int sum) {
		int total = 0;
		Arrays.sort(arr);
		int maxNum = arr[arr.length-1];
		int countArr[] = new int[maxNum+1];
//		System.out.println("count"+countArr.length);
		for(int i=0; i<arr.length; i++) {
			if(sum%arr[i] == 0) {
				count++;
//				System.out.println("arr size"+arr[i]);
				countArr[arr[i]] = sum / arr[i];
			}
			findCombination(countArr, i ,arr,sum,total);
			
		}
		System.out.println("number of combination : "+count);
	}

	private static void findCombination(int[] countArr, int i, int[] arr, int sum, int total) {
		
		int countNum = countArr[arr[i]];
		for(int j = 0; j<arr.length; j++) {
			if(i != j) {
				while(countNum>0) {
					countNum = countNum - arr[i];
					total = countNum;
					while(total<sum) {
						total = total + arr[j];
						if(total == sum) {
							count++;
						}
					}
				}
				countNum = countArr[arr[i]];
			}
		}
		
	}

}
