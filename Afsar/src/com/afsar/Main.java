package com.afsar;

public class Main {

	protected Main() {
		System.out.println("Constuctor call");
	}
	
	public static Main sahil() {
		return new Main();
	}
	
	public static void main(String[] args) {
		Main main = new Main();
	}
	
}
