package com.generic.restrictionss;

public class Restrictions<T> {
	T ob;
	// static T ob;   // not allowed because T is non static type used only for object
	Restrictions(){
		// ob = new T(); // not possible because T does not exist run time
	}
}
