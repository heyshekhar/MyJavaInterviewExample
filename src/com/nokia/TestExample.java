package com.nokia;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestExample {

	public static void main(String[] args) {
		
		Employee emp = new Employee(1, "shekhar");
		
//		System.out.println("before clone...." +emp.toString());
//		
//		try {
//			Employee cloneEmp = (Employee) emp.clone(2);
//			System.out.println("after clone....."+cloneEmp.toString());
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		LinkedHashSet<String> st = new LinkedHashSet();
//		
//		st.add("rathoreshekhar");
//		st.add("shekhar");
//		st.add("rathore");
//		
//		System.out.println(st);
//		
//		
//		
//		Thread t1 =new Thread();
//		Thread t2 =new Thread();
//		Thread t3 =new Thread();
//		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		t2.start();
//		try {
//			t2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		t3.start();
		
		
		String str = "dabcecba";

		
//		StringBuilder sb = new StringBuilder(str);
//		sb.reverse();
		
//		System.out.println(sb);
		
		boolean isPailndrom  =findPailndrom(str);
		
		
		
		if(isPailndrom) {
			System.out.println("string is pailndrom..");
		}else {
			System.out.println("string is not pailndrom..");
		}
		
		
		
	}

	private static boolean findPailndrom(String str) {
		boolean isPailndrom = true;
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
//				isPailndrom = false;
//				break;
//			}
//		}
		
		String pailndromSub = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				
			}
		}
		return isPailndrom;
				
	}

}

class Employee implements Cloneable {
	private int id;
	private String name;
	
	
	public Object clone(int id) throws CloneNotSupportedException {
		this.id=id;
		return super.clone();
		
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	
}
