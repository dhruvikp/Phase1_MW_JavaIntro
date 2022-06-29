package com.simplilearn.innerclass;

public class MemberInnerClassExample {
	
	private String msg = "Simplilearn";
	
	class MemberInnerClass {
		void hello() {
			System.out.println(msg);
		}
	}
	

	public static void main(String[] args) {
		MemberInnerClassExample outer = new MemberInnerClassExample();
		MemberInnerClass inner = outer.new MemberInnerClass();
		inner.hello();
	}

}
