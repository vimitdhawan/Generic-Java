package com.generic.boundedtype;

public class Bounded<T extends Number> {
	
	T[] nums;
	
	Bounded(T[] nums){
		this.nums= nums;
	}
	
	double average(){
		double sums=0.0;
		for(int i=0; i< nums.length; i++){
			sums+=nums[i].doubleValue(); // should be of type number to access double value function
		}
		return sums;
	}
}
