package com.accolite;

import java.util.Date;

public class TestExample2 {
	static Object obj = new Object();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		EvenClass evc = new EvenClass(obj);
//		OddClass odc = new OddClass(obj);
//		
//		evc.start();
//		odc.start();
		
//		
//		ClassA obj = null;
//		obj.m1();
		
//		System.out.println(display());
		
//		Date d = new Date();
//		ImmutableExample example = new ImmutableExample(1, "shekhar", d);
//		
//		System.out.println(example.getName());
//		System.out.println(example.getDate());
//		
//		d.setDate(20);
//		System.out.println(example.getName());
//		System.out.println(example.getDate());
		
		
//		String str = "T[[hi] si [s] St[ri]ng]";
		             
	}
	
	public static String display() {
		
			try{
				return "1";
			}
			catch(Exception e){
				return "2";
			}
			finally{
				return "3";
			}
	}

}

class EvenClass extends Thread{
	
	Object obj;
	
	public EvenClass(Object obj) {
		
		this.obj = obj;
	}


	public void run() {
		synchronized (obj) {
			for(int i=1; i<=50; i++) {
				if(i%2 == 0) {
					System.out.println("Even : "+i);
					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				obj.notifyAll();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

class OddClass extends Thread{
	
	Object obj;
	
	public OddClass(Object obj) {
		
		this.obj = obj;
	}
	
	public void run() {
		synchronized (obj) {
			for(int i=1; i<=50; i++) {
				if(i%2 != 0) {
					System.out.println("Odd : "+i);
					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				obj.notifyAll();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}


class ClassA {
	public static void m1(){
		System.out.println("hello");
	}
}

final class ImmutableExample{
	
	private int id;
	private String name;
	private Date date;
	
	public ImmutableExample(int id, String name, Date date) {
		this.id = id;
		this.name = name;
		this.date= date;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		Date d = (Date)date.clone();
		return d;
	}
}
