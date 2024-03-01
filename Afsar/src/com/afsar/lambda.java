package com.afsar;

@FunctionalInterface
interface A{
	void show();
}

class B implements A{
	public void show() {
		System.out.println("Welcome");
	}
}

public class lambda {
	public static void main(String[] args) {
		A obj = new A() {
			public void show() {
				System.out.println("Hi");
			}
		};
		obj.show();
		
//		A a = () -> System.out.println("Hi, Afsar is present in every Programming battle ground");
//		a.show();
	}

}
