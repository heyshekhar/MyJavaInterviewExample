package com.oracle;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//@ComponentScan("package.class")
public class TestExample {
	
//	@Value(${value.id:10})
	private int id;

//	package
//		class
//		class
//		ClassExample

	
//	@Bean
//	public ClassExmaple getClassExample() {
//		return new ClassExample();
//	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Thread details : "+Thread.currentThread().getName());
		
		SumExample example = new SumExample();
		ThreadExp t1 = new ThreadExp(10, 15,example);
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		executorService.execute(t1);
//		t1.start();
		
		
//		person = name;
//		dob
//		
//		List<Name>
//		
//		List<String> node = new ArrayList<String>();
//		Flux<ResponseDetails> result = webClient
//		.post()
//		.url(url);
//		.header()
//		.body(Flux/Mono)
//		.retrieve()
//		.bodyToFlux(ResponseDetails.class);
//		
//		result.doOnNext()
//		.doOnComplete(
//				);
//		.doOnError()
//		.subscribe();
	}
	
//	ResponseDetails

	

}

class ThreadExp implements Runnable{
	int a;
	int b;
	SumExample example;
	
	public ThreadExp(int a, int b, SumExample example) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
		this.example =example;
	}
	
	public void run() {
		int sum = example.addNumber(a,b);
		System.out.println("sum : "+sum);
	}
	
}

class SumExample {
	int addNumber(int a, int b) {

		System.out.println("execute add number wtih thread : " + Thread.currentThread().getName());
		return a + b;

	}
}



class SingletonExample{
	
	private static SingletonExample singletonExample;
	
	private SingletonExample() {}
	
	public static SingletonExample getInstance() {
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