package com.thread;

import java.util.ArrayList;
import java.util.List;


public class ThreadExample2 {

	/**
	 * @param args
	 */
	
	private static Object obj = new Object();
	public static void main(String[] args) {
//	PrintEven p1 = new PrintEven(obj);
//	PrintOdd p2 = new PrintOdd(obj);
		
	PrintNumber pn = new PrintNumber(obj);
	
	Thread t1 = new Thread(pn);
	Thread t2 = new Thread(pn);

	t1.setName("1");
	t2.setName("2");
	t1.start();
	t2.start();
	
	List<String> str = new ArrayList<String>();
	
	}

}


class PrintNumber implements Runnable{

	private String id;
	volatile int num = 1;
	Object obj;
	public PrintNumber(Object obj){
		this.obj = obj;
	}
	@Override
	public void run() {
		
		while(num<=100){
			synchronized (obj) {
				if(Thread.currentThread().getName().equalsIgnoreCase("1")){
					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					System.out.println("number : "+num+" Thread id"+Thread.currentThread().getName());
					num++;
					obj.notifyAll();
				}
			}
		}
		
		
//			synchronized (obj) {
//				for(int i =1; i<=100; i++){
//					if(i%2 != 0){
//						try{
//							System.out.println("number : "+i+" Thread id"+Thread.currentThread().getName());
//							obj.wait();
//						}catch(Exception ex){
//							ex.printStackTrace();
//						}
//					}
//					obj.notifyAll();
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
		}
		
	}

//class PrintEven implements Runnable{
//
//	private String id;
//	int num = 1;
//	Object obj;
//	public PrintEven(Object obj){
//		this.obj = obj;
//	}
//	@Override
//	public void run() {
//			synchronized (obj) {
//				for(int i =1; i<=100; i++){
//					if(i%2 != 0){
//						try{
//							System.out.println("number : "+i+" Thread id"+Thread.currentThread().getName());
//							obj.wait();
//						}catch(Exception ex){
//							ex.printStackTrace();
//						}
//					}
//					obj.notifyAll();
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//		}
//		
//	}
//	
//	class PrintOdd implements Runnable{
//
//		private String id;
//		int num = 1;
//		Object obj;
//		public PrintOdd(Object obj){
//			this.obj = obj;
//		}
//		@Override
//		public void run() {
//			
//				synchronized (obj) {
//					for(int i =1; i<=100; i++){
//						if(i%2 == 0){
//							try{
//								System.out.println("number : "+i+" Thread id"+Thread.currentThread().getName());
//								obj.wait();
//							}catch(Exception ex){
//								ex.printStackTrace();
//							}
//						}
//						obj.notifyAll();
//						try {
//							Thread.sleep(100);
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}
//			}
//			
//		}
//	
//	}

