package com.nokia;

import java.util.ArrayList;
import java.util.List;

public class TestExample2 {

	public static void main(String[] args) {
		/**

		Input:
		A[] = {100,180,260,310,40,535,695}
		n = 7
		Output:
		(0 3) (4 6)

		**/
		int A[] = {100,180,260,310,40,535,695};
		int n = 7;
		
		
		
		
//		List<String> bs = stockMarket(A, n);
		
		problemSecond();
		
	}

	
	


	


	private static void problemSecond() {
		/**

		Input:
		a[] = {1, 2, 5, -7, 2, 3}
		n = 6
		Output: 1, 2, 5

		**/
		
		int a[] = {1, 2, 5, -7, 2, 3};
		int n = 6;
		
		
		int sIndex = 0;
		int eIndex = 0;
		
		int oSum = a[0]; // 1
		int nSum = 0;
		int j=0;
		for(int i=1; i<a.length; i++) {
			
			while(j<=i) {
				nSum = nSum + a[j]; //1, 1+2 = 3, 3+5 = 8 , 1
				j++;
			}
//			for(; j<=i; j++) {
//				nSum = nSum + a[j]; //1, 1+2 = 3, 3+5 = 8 , 1
//			}
			
			if(oSum < nSum) {
				oSum = nSum; //3, 8
				eIndex = i; // 1, 2
				j = i+1;
			}
		}
		
		
	}








	private static List<String> stockMarket(int A[], int n) {
		
		int maxIndex = 0;
		int startIndex = 0;
		List<String> bs = new ArrayList<String>();
		
		for(int i = 1; i<A.length; i++) {
			if(A[startIndex] > A[i]) {
				startIndex = i;
			}else {
				maxIndex = findTheMaxValue(i, A, maxIndex);
				bs.add(startIndex+" "+maxIndex);
				startIndex = maxIndex+1;
				i = startIndex+1;
			}
		}
		
		return bs;
		
	}

	private static int findTheMaxValue(int i, int[] a, int maxIndex) {
		
//		{100,180,260,310,40,535,695};
		maxIndex = i;
		for(int j=i+1; j<a.length; j++) {
			if(a[i]<a[j]) {
				maxIndex = j;
			}else {
				break;
			}
		}
		return maxIndex;
	}

}

