package com.cammscope;

public class TestExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="abc";
		String b="xyz";
		
		a = a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(a.length()-b.length());
		
		System.out.println("a :"+a+" b : "+b);
	}

}
