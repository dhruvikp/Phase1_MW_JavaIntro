package com.simplilearn.objects.polymorphism;


class Bank {
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	int getRateOfInterest() {
		return 8;
	}
	
}

class ICICI extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}


public class OverridingExample1 {
	public static void main(String[] args) {
		
		Bank b = new SBI();
		System.out.println(b.getRateOfInterest());
		
		b = new ICICI();
		System.out.println(b.getRateOfInterest());
		
		b = new Bank();
		System.out.println(b.getRateOfInterest());
	}
}