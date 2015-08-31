package de.keineantwort.test.inherit;

public class Test {

	/**
	 * Ergebnis:
	 * <pre>
calling A
Hi, I'm from A 
done!


calling B
Hi, I'm from B!
After calling a()
done!
	 * </pre>
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("calling A");
		A a = new A();
		a.a();
		System.out.println("done!");
		
		System.out.println("\n\ncalling B");
		
		B b = new B();
		b.a();

		System.out.println("done!");
	}

}
