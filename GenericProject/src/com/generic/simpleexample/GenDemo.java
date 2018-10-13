package com.generic.simpleexample;

public class GenDemo {

	public static void main(String[] args) {
		Gen<Integer> gn = new Gen<Integer>(4);
		System.out.println(gn.getOb());
		gn.showType();
		
		Gen<String> sgn = new Gen<String>("generic");
		System.out.println(sgn.getOb());
		sgn.showType();
		
		Gen rawType = new Gen(5); // Raw type to provide back up support to legacy code.
		int res= (int)rawType.getOb();
		System.out.println(res);
		
		
	}

}
