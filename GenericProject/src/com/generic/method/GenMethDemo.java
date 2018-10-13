package com.generic.method;

public class GenMethDemo {
	
	static<T, V extends T> boolean isIn(T a, V[] b){
		for(int i=0; i<b.length; i++){
			if(b[i].equals(a)){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isIn(2, new Integer[]{1,2,3}));
	}

}
