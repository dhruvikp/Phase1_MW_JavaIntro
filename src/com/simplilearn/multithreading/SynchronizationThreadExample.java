package com.simplilearn.multithreading;

// Inter thread commuicatin - Wait and notify()

class Table {
	 void printTable(int n) {
		synchronized (this) {
			//t1 --> finsih T1 then only will release lock
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName()+" :"+i * n);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}


class TablePrinterRunnable implements Runnable {
	Table table;
	int n;
	
	public TablePrinterRunnable(Table table, int n) {
		this.table = table;
		this.n = n;
	}
	
	@Override
	public void run() {
		this.table.printTable(n);
	}
}





public class SynchronizationThreadExample {
	public static void main(String[] args) throws InterruptedException {

		Table table = new Table();
		
		TablePrinterRunnable r1 = new TablePrinterRunnable(table, 5);
		TablePrinterRunnable r2 = new TablePrinterRunnable(table, 6);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		
	}

}
