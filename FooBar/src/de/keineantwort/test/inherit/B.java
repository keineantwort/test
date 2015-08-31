package de.keineantwort.test.inherit;

public class B extends A {
	@Override
	public void a() {
		super.a();
		System.out.println("After calling a()");
	}
	
	@Override
	public void aq() {
		System.out.println("Hi, I'm from B!");
	}

}
