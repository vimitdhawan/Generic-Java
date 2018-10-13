package com.generic.gen.twoparam;

public class GenTwoParamDemo {

	public static void main(String[] args) {
		GenTwoParam<String, Integer> tp = new GenTwoParam<String, Integer>("vimit", 4);
		tp.showType();
		String a = tp.getOb1(); // no need of casting
		// String b = tp.getOb2(); throw compile time error
		System.out.println(a);

	}

}
