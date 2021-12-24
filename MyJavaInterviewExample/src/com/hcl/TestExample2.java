package com.hcl;

import java.util.Stack;

public class TestExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write code to implement:
//			Input
//			==========
//
//			Str = {“a”: 1,
//
//			“B”: {
//
//			“C”: 2
//
//			}
//
//			}
//
//			Output
//
//			==========
//
//			{“a”: 1,
//
//			“B.C”: 2}
		
		
		
		String str = "{a: 1,B:{C:{d:2}}}";
		
		int count = 0;
		String preStr = "";
		String temp = "";
		for(int i=0; i<str.length(); i++) {
			if(temp.length() == 0) {
				preStr = ""+str.charAt(i);
				temp = temp+str.charAt(i);
			}else if(preStr.contains(":") && str.charAt(i) == '{') {
				count = count +1;
				temp = temp+".";
				preStr = ""+str.charAt(i);
				temp = temp.substring(0,i-1)+temp.substring(i);
			}else if(str.charAt(i) == '}' || str.charAt(i) == '{'){
				if(count != 0) {
					count = count-1;
				}else {
					temp = temp+str.charAt(i);
				}
			}else {
				preStr = ""+str.charAt(i);
				temp = temp+str.charAt(i);
			}
		}
		
		System.out.println(temp);
		
	}

}
