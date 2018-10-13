package com.generic.gen.twoparam;

public class GenTwoParam<T, V> {
	
	T ob1;
	V ob2;
	
	GenTwoParam(T ob1, V ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	
	public T getOb1(){
		return ob1;
	}
	
	public V getOb2(){
		return ob2;
	}
	
	void showType() {
		System.out.println(ob1.getClass().getName());
		System.out.println(ob2.getClass().getName());
	}

}
