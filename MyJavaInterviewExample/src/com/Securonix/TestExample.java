package com.Securonix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8,12,16,24,28,32
		//5,10,20,25,30,35
		//3,9,12,15,18

		
//		int arr[] = { 8, 12, 16, 24, 28, 32 };
//		missingNumber(arr);
//
//		int arr1[] = { 5, 10, 20, 25, 30, 35 };
//		missingNumber(arr1);
//
//		int arr2[] = { 3, 9, 12, 15, 18 };
//		missingNumber(arr2);
		
		arrayListProblem();

	}

	private static void arrayListProblem() {
		Employee emp1 = new Employee(1, "shekhar", 1000f);
		Employee emp2 = new Employee(2, "ribbon", 1500f);
		Employee emp3 = new Employee(3, "eci", 2000f);
		Employee emp4 = new Employee(4, "bittu", 500f);
		Employee emp5 = new Employee(5, "rathore", 2500f);
		
		List<Employee> ltEmp = new ArrayList<Employee>();
		ltEmp.add(emp1);ltEmp.add(emp2);ltEmp.add(emp3);ltEmp.add(emp4);ltEmp.add(emp5);
		
		Collections.sort(ltEmp);
		
//		Employee sal = ltEmp.get(ltEmp.size()-4);
		
		
		int count = 0;
		for(Employee e : ltEmp) {
			if(count<3) {
				System.out.println(e);
				count++;
			}
		}
	}

	private static void missingNumber(int[] arr) throws ArrayIndexOutOfBoundsException {
		int num1 = arr[1] - arr[0];
		int num2 = arr[arr.length-1] - arr[arr.length-2];
		int diff = num1 < num2 ? num1 :num2;
		
		System.out.println("diff : "+diff);
		for(int i=0; i<arr.length/2; i++) {
			int fNum = arr[i]+diff;
			int sNum = arr[arr.length-1-i]-diff;
			
			if(arr[i+1] != fNum) {
//				System.out.println("match number "+fNum+" -- "+arr[i+1]);
				System.out.println("missing number : "+fNum);
			}else if(arr[arr.length-2-i] != sNum) {
//				System.out.println("match number "+fNum+" -- "+arr[arr.length-2-i]);
				System.out.println("missing num : "+sNum);
			}
		}
		
	}

}

class Employee implements Comparable<Employee>{
	
	private Integer id;
	private String name;
	private Float salary;
	
	public Employee(Integer id, String name, Float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Float getSalary() {
		return salary;
	}


	public void setSalary(Float salary) {
		this.salary = salary;
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return o.getSalary().compareTo(salary);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}
}


//@restCon
//@requ(api/){
//	
//	@getMapping("getemp/{age}")
//	public ResponseEntiy<Emp> getEmp(@requestParm("age") int age) {
//		
//		return ReponseEntiy<>(emp,http.ok)
//	}
//	
//	
//	public Em validation(int age) {
//		
//	}
//}

