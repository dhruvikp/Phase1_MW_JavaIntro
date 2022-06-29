package com.simplilearn.objects.accessModifiers;

import com.simplilearn.objects.abstraction.ProtectedB;





public class ProtectedAccessSpecifierExample extends ProtectedB {
	public void test() {
		msg();
	}
	
	public static void main(String[] args) {
		
		ProtectedA a = new ProtectedA();
		a.msg();
		
		ProtectedB b = new ProtectedB();
		//b.msg();
	}

}
