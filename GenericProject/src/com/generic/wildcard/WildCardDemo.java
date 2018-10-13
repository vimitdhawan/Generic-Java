package com.generic.wildcard;

import com.generic.wildcard.Wildcard;

public class WildCardDemo {

	public static void main(String[] args) {
		Integer a[] = {2,3,4};
		Wildcard<Integer> wildInteger = new Wildcard<Integer>(a);
		
		Double b[] = {2.0,3.0,4.0};
		System.out.println(wildInteger.average());
		Wildcard<Double> wildDouble = new Wildcard<Double>(b);
		
		boolean res = wildInteger.sameAvgWildcard(wildDouble); // it is working because wild card means unknown type
		System.out.println(res);
		
		
		//	wildInteger.sameAvg(wildDouble); expect sameAvg function with same kind of parameter type

	}

}
