package com.generic.wildcard;

public class Wildcard<T extends Number> {
	
	T[] nums;
	
	Wildcard(T[] nums){
		this.nums= nums;
	}
	
	double average(){
		double sums=0.0;
		for(int i=0; i< nums.length; i++){
			sums+=nums[i].doubleValue(); // should be of type number to access double value function
		}
		return sums;
	}
	
	boolean sameAvg(Wildcard<T> ob){
		if(average()== ob.average()){
			return true;
		} 
		return false;
		
	}
	
	boolean sameAvgWildcard(Wildcard<?> ob){
		if(average()== ob.average()){
			return true;
		} 
		return false;
		
	}
	
	
}
