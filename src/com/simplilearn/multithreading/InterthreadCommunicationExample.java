package com.simplilearn.multithreading;


class Account {
	int balance = 1000;
	synchronized void withdraw(int amount) throws InterruptedException {
		System.out.println("Going to withdraw...");
		
		if(amount > balance) {
			System.out.println("Less balance, waiting for someone to deposit..");
			this.wait();
		}
		
		this.balance -= amount;
		System.out.println("Withdraw completed");
	}
	
	synchronized void deposit(int amount) {
		System.out.println("Going to deposit..");
		this.balance += amount;
		this.notify();
	}
}

class WithrowRunnable implements Runnable {
	Account account;
	
	public WithrowRunnable(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		try {
			account.withdraw(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class DepositRunnable implements Runnable {
	Account account;
	public DepositRunnable(Account account) {
		this.account = account;
	}
	@Override
	public void run() {
		this.account.deposit(4000);
	}
}


public class InterthreadCommunicationExample {

	public static void main(String[] args) {

		Account account = new Account();
		
		WithrowRunnable wRunnable  = new WithrowRunnable(account);
		DepositRunnable dRunnable = new DepositRunnable(account);
		
		new Thread(wRunnable).start();
		new Thread(dRunnable).start();
	}

}
