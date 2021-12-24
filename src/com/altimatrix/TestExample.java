package com.altimatrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = {4,2,1,3,6,5};
		Set<String> listNum = new HashSet<String>();
		//sum -10
		
		for(int i=0; i<num.length/2; i++) {
			findTheSumFromStart(i,num, listNum);
			findTheSumFormEnd(num.length-1-i,num,listNum);
		}
		
		System.out.println("num which sum are 10 : "+listNum);
		
	}

	private static void findTheSumFromStart(int i, int[] num, Set<String> listNum) {
		
		int n = i;
		List<Integer> oldNumIndex = new ArrayList<Integer>();
		for(int j=0; j<num.length; j++) {
			if(n != j) {
				if(num[n]+num[j] == 10) {
					listNum.add(num[j]+" "+num[n]);
				}else {
					oldNumIndex.add(j);
				}
				
				int sum = num[n];
				String str = ""+sum;
				for(int k=0; k<oldNumIndex.size(); k++) {
					sum = sum+num[oldNumIndex.get(k)];
					str = str+" "+num[oldNumIndex.get(k)];
				}
				
				if(sum==10) {
					listNum.add(str);
				}
			}
		}
		
	}

	private static void findTheSumFormEnd(int i, int[] num, Set<String> listNum) {
		int n = i;
		List<Integer> oldNumIndex = new ArrayList<Integer>();
		for (int j = num.length - 1; j >= 0; j--) {
			if (n != j) {

				if (num[n] + num[j] == 10) {
					listNum.add(num[j] + " " + num[n]);
				} else {
					oldNumIndex.add(j);
				}

				int sum = num[n];
				String str = ""+sum;
				for (int k = 0; k < oldNumIndex.size(); k++) {
					sum = sum+num[oldNumIndex.get(k)];
					str = str+" "+num[oldNumIndex.get(k)];
				}

				if (sum == 10) {

					listNum.add(str);
				}
			}
		}
		
	}

}
