package com.simplilearn.objects.inheritance;



class Animal {
	void eat() {
		System.out.println("Eating..");
	}
}

class Dog extends Animal {
	
	void bark() {
		System.out.println("barking..");
	}
}


class Cat extends Animal {
	void meow() {
		System.out.println("Meowing..");
	}
}

class BabyDog extends Dog {
	
	void weep() {
		System.out.println("Weeping..");
	}
}


public class AnimalExample {

	public static void main(String[] args) {
		BabyDog bd = new BabyDog();
		bd.eat();
		bd.bark();
		bd.weep();
	}
}
