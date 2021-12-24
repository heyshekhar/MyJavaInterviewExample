package com.thread;


public class ThreadExample {

	/**
	 * @param args
	 */
	
	private static Object obj = new Object();
	public static void main(String[] args) {
	PrintEven p1 = new PrintEven(obj);
	PrintOdd p2 = new PrintOdd(obj);
	
	Thread t1 = new Thread(p1);
	Thread t2 = new Thread(p2);

	t1.setName("1");
	t2.setName("2");
	t1.start();
	t2.start();
	}

}

class PrintEven implements Runnable{

	private String id;
	int num = 1;
	Object obj;
	public PrintEven(Object obj){
		this.obj = obj;
	}
	@Override
	public void run() {
			synchronized (obj) {
				for(int i =1; i<=100; i++){
					if(i%2 != 0){
						try{
							System.out.println("number : "+i+" Thread id"+Thread.currentThread().getName());
							obj.wait();
						}catch(Exception ex){
							ex.printStackTrace();
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
	
	class PrintOdd implements Runnable{

		private String id;
		int num = 1;
		Object obj;
		public PrintOdd(Object obj){
			this.obj = obj;
		}
		@Override
		public void run() {
			
				synchronized (obj) {
					for(int i =1; i<=100; i++){
						if(i%2 == 0){
							try{
								System.out.println("number : "+i+" Thread id"+Thread.currentThread().getName());
								obj.wait();
							}catch(Exception ex){
								ex.printStackTrace();
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

