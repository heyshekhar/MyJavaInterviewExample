package com.verana;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TestExample {

	public static void main(String[] args) {
		
//		sumOfString();
		
		stringProblem();

	}

	private static void stringProblem() {
		String s1 = "arvindinmotorola";
		String s2 = "veranahasarvind";
		  
		int length = 0;
		List<Integer> index = new ArrayList<Integer>();
		int j = 0;
		int count = 0;
		for(int i=0; i<s1.length(); i++) {
			if(index.size() == 0) {
				System.out.println("index 1 : "+index);
				while (j<s2.length()) {
					if(s1.charAt(i) == s2.charAt(j)) {
						index.add(j);
						System.out.println("count  1 : "+count);
					}
					j++;
				}
			}else {
				List<Integer> backIn = new ArrayList<Integer>();
				System.out.println("index 2 : "+index);
				for(Integer k:index) {
					if(k+1<s2.length()) {
						if(s2.charAt(k+1) == s1.charAt(i)) {
							System.out.println("index 3 : "+index);
							backIn.add(k);
							count++;
							System.out.println("count  2 : "+count);
						}
					}
				}
				if(backIn.size()>0) {
					index.clear();
					index = backIn;
					backIn.clear();
				}else {
					j=0;
				}
			}
			System.out.println("count 3: "+count);
			if(length<count) {
				length = count;
				count = 0;
			}
		}
		
		System.out.println("longest length : "+length);
		
	}

	private static void sumOfString() {
		String str = "1+3*5*6-5";
		List<Integer> lt = new ArrayList<Integer>();
		Stack<Character> operator = new Stack<Character>();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				lt.add(Integer.parseInt(str.charAt(i)+""));
				if(lt.size()>1) {
					lt = doSum(lt,operator);
				}
			}else {
				operator.push(str.charAt(i));
			}
		}
		
		if(lt.size()>1) {
			lt = doSum(lt, operator);
		}
		System.out.println("sum : "+lt);
		
	}

	private static List<Integer> doSum(List<Integer> lt, Stack<Character> operator) {
//		int sum = 0;
//		if(lt.size() <= 1) {
//			return lt;
//		}else {
//			sum = lt.get(0)+lt.get(1);
//			lt.clear();
//			lt.add(sum);
//		}
		
		Character ch = operator.peek();
//		System.out.println("char : "+ch);
		int sum = 0;
		if(ch == '+') {
//			System.out.println("char + : "+ch);
				sum = lt.get(0)+lt.get(1);
				lt.clear();
				lt.add(sum);
				operator.pop();
			
		} else if(ch == '-') {
//			System.out.println("char : -"+ch);
				sum = lt.get(0)-lt.get(1);
				lt.clear();
				lt.add(sum);
				operator.pop();
		} else if(ch == '/') {
//			System.out.println("char : / "+ch);
				sum = lt.get(0)/lt.get(1);
				lt.clear();
				lt.add(sum);
				operator.pop();
		} else if(ch == '*') {
//			System.out.println("char : *"+ch);
				sum = lt.get(0)*lt.get(1);
				lt.clear();
				lt.add(sum);
				operator.pop();
		}
		return lt;
	}

	private static String findTheOperator(char ch) {
		if(ch == '+') {
			return "sum";
		} else if( ch == '-') {
			return "sub";
		} else if(ch == '/') {
			return "div";
		} else if(ch == '*') {
			return "mult";
		}else {
			return "none";
		}
		
	}

}
