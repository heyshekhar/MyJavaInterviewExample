package com.ciena;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class TestExample {
	
	static List<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		stackOverFlowError("stack");
		
		Random num = new Random();
		while(true) {
			list.add(num.nextInt());
		}
	}

	private static void stackOverFlowError(String string) {
		// TODO Auto-generated method stub
		System.out.println("stack : "+string);
		stackOverFlowError(string);
	}
}

final class ImmutableExample {
	private int number;
	private Address address;
	private List<Address> addList;
	private Map<Integer, Address> mp;
	public ImmutableExample(int number, Address address, List<Address> addList) {
		this.number = number;
		this.address = address;
		this.addList = addList;
	}

	public int getNumber() {
		return number;
	}

	public Address getAddress() {
		return new Address(address);
	}

	public List<Address> getAddList() {
		List<Address> newAddList = new ArrayList<Address>();
		for(Address list : addList) {
			newAddList.add(new Address(address));
		}
//		addList.forEach( list -> {
//			newAddList.add(new Address(address));
//		});
		return newAddList;
	}

	public Map<Integer, Address> getMp() {

		Map<Integer, Address> newMp = new HashMap<Integer, Address>();
		for (Map.Entry<Integer, Address> m : mp.entrySet()) {
			newMp.put(m.getKey(), new Address(m.getValue()));
		}
		return newMp;
	}
	
}

class Address{
	private String city;
	
	public Address(String city) {
		this.city = city;
	}
	
	public Address(Address address) {
		this(address.city);
	}
	
}

class SingletonExample{
	private SingletonExample singletonExample;
	
	private SingletonExample() {}
	
	public SingletonExample getInstance() {
		if(singletonExample == null) {
			synchronized (SingletonExample.class) {
				if(singletonExample == null) {
					singletonExample = new SingletonExample();	
				}
			}
		}
		
		return singletonExample;
	}
}


class MainClass{
	
}

class subClass1 extends MainClass{
	
}

class subClass2 extends MainClass{
	
}

class subClass3 extends MainClass{
	
}


class FactoryImpl{
	
	public MainClass getInstance(String str) {
		if(str.equals("sub1")) {
			return new subClass1();
		}else if(str.equals("sub2")) {
			return new subClass1();
		}else if(str.equals("sub3")) {
			return new subClass1();
		}else {
			return null;
		}
	}
}

