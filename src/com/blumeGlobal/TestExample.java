package com.blumeGlobal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// arr1 = 8, 9, 10, 
		// arr2 = 8.30, 10.30 11
		
		Float arr1[] = {8f, 9f, 10f, 10.45f};
		Float arr2[] = {8.30f, 10.30f, 11f, 11f};
		
		Set<Float> lt = new HashSet<Float>();
		int pSlot = 1;
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr2[j]>arr1[i]) {
//					System.out.println("add : "+arr2[j]);
					lt.add(arr2[j]);
					pSlot +=1;
				}else {
//					System.out.println(lt);
					for(Float l:lt) {
						if(l<arr1[i]) {
							lt.remove(l);
							pSlot -=1;
						}
					}
				}
			}
		}
		
		System.out.println("parking slot requried : "+pSlot);
	}
}
