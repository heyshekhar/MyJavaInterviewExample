package com.hcl;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestExample {

	public static void main(String[] args) {
		
//		Employee e1 = new Employee(1, "shekhar");
//		Employee e2 = new Employee(2, "shekhar2");
//		Employee e3 = new Employee(3, "rathore");
//		
////		Set<Employee> st = new HashSet<Employee>();
//		Set<Employee> st = new TreeSet<Employee>();
//
//		st.add(e1);
//		st.add(e3);
//		st.add(e2);
//		
//		System.out.println(st);
		
		threadExample();
	}

	private static void threadExample() {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for(int i=0; i<5; i++) {
			Future<String> tName = executorService.submit(new ThreadExample());
			try {
				System.out.println(tName.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}


class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
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

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
////		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		System.out.println("hash code :"+name);
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		
//		Employee other = (Employee) obj;
//		System.out.println("equals :"+name);
//		return id == other.id;
////		if (id != other.id)
////			return false;
////		if (name == null) {
////			if (other.name != null)
////				return false;
////		} else if (!name.equals(other.name))
////			return false;
////		return true;
//	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(id>o.id) {
		 return 1;	
		}else if(id<o.id) {
		 return -1; 
		}else {
			return 0;
		}
	}
	
	
	
	
}


class ThreadExample implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(500);
		return "Thread name : "+Thread.currentThread().getName();
	}
	
}