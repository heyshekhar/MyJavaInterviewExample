package com.netwest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lock lock = new ReentrantLock();
		try {
			System.out.println("lock 1");
			lock.lock();
			System.out.println("critical section 1");
			System.out.println("lock 2");
			lock.lock();
			System.out.println("critical section 2");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			lock.unlock();
			System.out.println("unlock 2");
			lock.unlock();
			System.out.println("unlock 1");
		}
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
