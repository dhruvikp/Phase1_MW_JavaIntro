package com.simplilearn.objects.polymorphism;


class Laptop {
	
	private String cpu;
	private String keyboard;
	
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	public String getCpu() {
		return this.cpu;
	}
}


public class EncapsulationExample {

	public static void main(String[] args) {
		Laptop l  = new Laptop();
		l.setCpu("Intel");
		
		System.out.println(l.getCpu());

	}

}
