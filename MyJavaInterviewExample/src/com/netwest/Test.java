package com.netwest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test instance = new Test();
		Person person = instance.new Person();
		person.setStr("insideMainBlock");
		System.out.println(person.getStr());
		instance.populateName(person);
		System.out.println(person.getStr());
	}

	private void populateName(Person person) {
		person = new Person();
		person.setStr("insidePopulate");
	}
	class Person{
		String str;

		public String getStr() {
			return str;
		}

		public void setStr(String str) {
			this.str = str;
		}
		
		
	}
}
