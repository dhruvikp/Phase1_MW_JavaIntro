package com.simplilearn.multithreading;



class X implements Runnable {

	
	// INside run method - define logic to be executed (in thread)
	@Override
	public void run() {
		System.out.println("My thread execution started");
		try {
			
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("My Thread execution stopped");
	}
}

public class CreateThreadRuunableInterfaceExample {

	public static void main(String[] args) throws InterruptedException {
		
		X xRunnable = new X();
		
		// Thread in NEW Status
		Thread t1 = new Thread(xRunnable);
		
		// Put thread t1 into runnable status.
		t1.start();
		
		// Will put Current Thread to be placed in blocked status for specified time
		//Thread.sleep(10000);
		
		System.out.println("Main Thread is rnning");
	}

}
