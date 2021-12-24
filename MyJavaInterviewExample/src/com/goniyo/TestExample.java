package com.goniyo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		The task is to complete the function Anagrams() that takes a list of strings as input 
//		and returns a list of groups such that each group consists of all the strings that are anagrams.
//		Input:
//		N = 5
//		words[] = {act,god,cat,dog,tac}
//		Output: 
//		god dog
//		act tac cat
//
//		Input:
//		N = 3
//		words[] = {no,on,is}
//		Output: 
//		no on
		
		String words[] = {"act","god","cat","dog","tac"};
		findAnagrams(words);
		
		Map<String, Integer> count = new HashMap<String, Integer>();
		Map<Map<String, Integer>, Integer> mp = new HashMap<Map<String,Integer>, Integer>();
		
//		IS it a valid lamda expression?
//		(int a,int b)-> {a+b};
	}

	private static void findAnagrams(String[] words) {
		
		List<String> lt = new ArrayList<String>();
		for(int i=0; i<words.length; i++) {
			if(lt.isEmpty()) {
				lt.add(words[i]);
			}else {
				StringBuffer sb = new StringBuffer(words[i]);
				sb.reverse();
				if(lt.contains(words[i]) || lt.contains(sb.toString())) {
					System.out.println("anagram : "+words[i]);
				}else {
					lt.add(words[i]);
				}
			}
		}
	}

}
