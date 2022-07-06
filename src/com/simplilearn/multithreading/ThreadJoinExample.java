package com.simplilearn.multithreading;



class TestJoinRunnable implements Runnable {
	public void run() {
		for(int i=0; i<=5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class ThreadJoinExample {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new TestJoinRunnable());
		t1.start();
 		t1.join();
		
		Thread t2 = new Thread(new TestJoinRunnable());
		t2.start();
		t2.join();
		
		Thread t3 = new Thread(new TestJoinRunnable());
		t3.start();

	}

}
