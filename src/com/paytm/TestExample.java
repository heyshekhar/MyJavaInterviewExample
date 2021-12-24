package com.paytm;

import java.util.ArrayList;
import java.util.List;

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pop
		//push
		//peek 
		//min --> return the minimum value available in stack
		
		StackImpl.push(5);
		StackImpl.push(4);
		StackImpl.push(6);
		StackImpl.push(1);
		
		System.out.println("min value : "+StackImpl.min());
		StackImpl.pop();
		System.out.println("min value : "+StackImpl.min());
		
		System.out.println("peek operation : "+StackImpl.peek());
		
	}

}

class StackImpl {
	
	private static int minVal = 0;
	private static List<Integer> lt = new ArrayList<Integer>();
	
	public static void pop() {
		if(lt.size()==0) {
			minVal = 0;
			System.out.println("stack is empty");
		}else {
			if(lt.get(lt.size()-1) == minVal && lt.size()>1) {
				int tempVal = lt.get(0);
				for(int i=1; i<lt.size()/2-1; i++) { 
					if(lt.get(i) < tempVal) { 
						tempVal = lt.get(i);
					}
					if(lt.get(lt.size()-1-i) < tempVal) { 
						tempVal = lt.get(lt.size()-1-i);
					}
				}
				System.out.println("temp value 4 : "+tempVal);
				minVal = tempVal;
			}
			lt.remove(lt.size()-1);
			
		}
	}
	
	public static void push(int num) {
		if(lt.size() == 0) {
			minVal = num;
			lt.add(num);
		}else {
			if(minVal > num) {
				minVal = num;
			}
			lt.add(num);
			System.out.println("print list : "+lt);
		}
	}
	
	public static int peek() {
		return lt.get(lt.size()-1);
	}
	
	public static int min() {
		return minVal;
	}
}