package com.generic.nongen.example;

public class NonGenDemo {

	public static void main(String[] args) {
		
		NonGen ng = new NonGen(2);
		int a = (int) ng.getOb();// you have to provide type casting in non generic code
		System.out.println(a);

	}

}
