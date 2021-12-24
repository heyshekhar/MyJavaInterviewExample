package com.wallmart;

import java.util.HashMap;
import java.util.Map;

public class TestExample2 {

	public static void main(String[] args) {
		
		
//		Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.

//		Example 1:
//		Input: nums = [1,1,1], k = 2
//		Output: 2
//		Example 2:
//		Input: nums = [1,2,3], k = 3
//		Output: 2
//		Input: nums = [1,4,2,1,3,3], k = 6
//		Output: 2
//		i
//		3+4 = 7 -> 7-3 = 4
//		
//		4+2 = 6
//		
//		1,3,4,2,1,3,3
//		
//		1+ 3+  4+2 = 8-1 =7
//		7+2 = 9-3 = 6
//		6+1 = 7 (4+2+1), 2+1 = 3
//		3+3 = 6 
//		6+3 = 9 (2+1+3+3) 7
//		
//		
//		
//		count =1, 2 
		
		int[] nums = {1,4,2,1,3,3};
		int k = 6;
		int count = 0;
		int start = 0;
		int sum = nums[start];
		int i = start+1;
		while(start<nums.length) {
			if(i<nums.length) {
				sum = sum+nums[i];
			}else {
				if(i == nums.length) {
					
					if(start>=nums.length) {
						break;
					}
					if(sum == k) {
//						removeFirstElement(start,i,sum,nums);
						sum = sum - nums[start];
						start = start+1;
						count++;
						
					}else if(sum>k) {
//						removeFirstElement(start,i,sum,nums);
						sum = sum - nums[start];
						start = start+1;
					}else {
						
						start+=1;
					}
				}
			}
			if(sum == k) {
//				removeFirstElement(start,i,sum,nums);
				sum = sum - nums[start];
				start = start+1;
				count++;
				
			}else if(sum>k) {
//				removeFirstElement(start,i,sum,nums);
				sum = sum - nums[start];
				start = start+1;
			}
			if(i<nums.length) {
				i++;
			}
		} 
		
		System.out.println("total count : "+count);
		
		
		findTheValue();

	}

	private static void findTheValue() {
		Map< String, String> mp = new HashMap<String, String>();
//		mp.put(key, value);
		
	}

	private static void removeFirstElement(int start, int i, int sum, int[] nums) {
		
	
		
	}

}

class SingletonExp {
	
	private static SingletonExp singletonExp;
	
//	private final static Object obj = new Object(); 
	
	
	private SingletonExp() {}
	
	public static SingletonExp getInstance() {
		if(singletonExp == null) {
			synchronized (SingletonExp.class) {
//				if(singletonExp == null) {
					singletonExp = new SingletonExp();
//				}
				
			}
		}
		
		return singletonExp;
	}
}




//Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
//An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
// 
//Example 1:
//Input: grid = [
//  ["1","1","1","1","0"],
//  ["1","1","0","1","0"],
//  ["1","1","0","0","0"],
//  ["0","0","0","0","0"]
//]
//Output: 1
//Example 2:
//Input: grid = [
//  ["1","1","0","0","0"],
//  ["1","1","0","0","0"],
//  ["0","0","1","0","0"],
//  ["0","0","0","1","1"]
//]
//Output: 3


