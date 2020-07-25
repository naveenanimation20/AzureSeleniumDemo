package com.google.demo;

public class GoogleRunner {
	
	public static void main(String[] args) {

//		Thread t1 = new GoogleSearchMultiThread("Thread Firefox", "firefox");
//		Thread t2 = new GoogleSearchMultiThread("Thread Chrome", "chrome");
//		System.out.println("Starting MyThreads");
//		t1.start();
//		t2.start();
//		System.out.println("Thread has been started");
		
		//
		System.out.println(System.getProperty("chrome"));
		System.out.println(System.getProperty("firefox"));

		int chromeCount = Integer.parseInt(System.getProperty("chrome"));
		int firefoxCount = Integer.parseInt(System.getProperty("firefox"));

		for(int i=0,j=0; i<chromeCount || j<firefoxCount; i++,j++){
			System.out.println("Starting MyThreads");
			new GoogleSearchMultiThread("Thread Firefox", "firefox").start();
			new GoogleSearchMultiThread("Thread Chrome", "chrome").start();
			System.out.println("Thread has been started");

		}
	}

}
