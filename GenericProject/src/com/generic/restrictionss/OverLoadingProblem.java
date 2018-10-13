package com.generic.restrictionss;

public class OverLoadingProblem<T,V> {
	
	T ob1;
	V ob2;
	
	void setOb(T ob1){
		this.ob1 = ob1;
	}
	
	/*void setOb(V ob2){   // During Erasure both have same type so not possible to overload
		this.ob2 = ob2;
	}*/
}
