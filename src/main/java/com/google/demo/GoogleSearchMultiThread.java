package com.google.demo;
public class GoogleSearchMultiThread extends Thread {

	private String browsertype;
	GooglePage googlePage;

	public GoogleSearchMultiThread(String name, String browsertype) {
		super(name);
		this.browsertype = browsertype;
		googlePage = new GooglePage();
	}

	@Override
	public void run() {
		System.out.println("Thread- Started" + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			googlePage.setUp(this.browsertype);
			googlePage.testGoogleSearch();

		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			googlePage.tearDown();
		}
		System.out.println("Thread- END " + Thread.currentThread().getName());
	}


}
