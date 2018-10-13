package com.generic.simpleexample;

public class Gen<T> {
	
	T ob;
	
	Gen(T ob){
		this.ob = ob;
	}
	
	T getOb(){
		return ob;
	}
	
	void showType(){
		System.out.println(ob.getClass().getName());
	}

}
