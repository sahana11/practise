package com.test.project;

public class Factorial {

	public static void main(String[] args) {
		int n = 5;
		int fact =n;
		
		for(int i=n; i>1; i--) {
			fact = fact * (i-1);
			
		}
		
		System.out.println(fact);
	}

}
