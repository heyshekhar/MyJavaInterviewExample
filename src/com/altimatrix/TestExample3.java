package com.altimatrix;

import java.util.ArrayList;
import java.util.List;

public class TestExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int count;
//		count = ExampleClass.countInformation();
//		count = ExampleClass.countInformation();
//		count = ExampleClass.countInformation();
//		System.out.println("count detail : " + count);
		
		
//		Student st = new Student(1, "Shekhar", 65);
//		Student st1 = new Student(1, "Anil", 70);
//		Student st2 = new Student(1, "Mukesh", 85);
//		Student st3 = new Student(1, "Deepam", 40);
//		Student st4 = new Student(1, "Ravi", 20);
//
//		List<Student> stList = new ArrayList<Student>();
//		stList.add(st);
//		stList.add(st1);
//		stList.add(st2);
//		stList.add(st3);
//		stList.add(st4);
//		
//		stList.stream().filter(stu -> stu.getMark()>60).collect(Collectors.toList());
		
		
		
		
//	    int Input[] = {​16, 17, 4, 3, 5, 2}​;

//	    Output = { 17, 5, 2 };
		List<Integer>  leader = findTheLeader();
		System.out.println("leader : "+leader);
	}

	private static List<Integer>  findTheLeader() {
		int input[] = {16,17,4,3,5,2};
//		boolean isLeader = false;
		List<Integer> leader = new ArrayList<Integer>();
		for(int i=0; i<input.length; i++) {
			boolean isLeader = true;
			for(int j=i+1; j<input.length; j++) {
				if(input[i]<input[j]) {
					isLeader = false;
					break;
				}
			}
			
			if(isLeader) {
				leader.add(input[i]);
			}
		}
		
		return leader;
		
		
	}
}

//class ExampleClass {
//	
//	static int count = 0;
//	public static int countInformation() {
//		return count++;
//	}
//}
//
//class Student{
//	private int id;
//	private String name;
//	private int mark;
//	
//	public Student(int id, String name, int mark) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.mark = mark;
//	}
//	
//	
//	public int getId() {
//		return id;
//	}
//
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//
//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public int getMark() {
//		return mark;
//	}
//
//
//	public void setMark(int mark) {
//		this.mark = mark;
//	}
//
//
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Student [id=");
//		builder.append(id);
//		builder.append(", name=");
//		builder.append(name);
//		builder.append(", mark=");
//		builder.append(mark);
//		builder.append("]");
//		return builder.toString();
//	}
//	
//	
//}
