package com.generic.boundedtype;

public class BoundedDemo {

	public static void main(String[] args) {
		Integer a[] = {2,3,4};
		Bounded<Integer> bounded = new Bounded<Integer>(a);
		System.out.println(bounded.average());
		
		// String b[] = {"vimit","dhawan"};
		// Bounded<String> stringBounded = new Bounded<String>(b); // type string is not valid

	}

}
