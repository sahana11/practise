package com.test.project;

public class Factorial {

	public static void main(String[] args) {
		int n = 5;
		int fact =n;
		
		for(int i=n; i>1; i--) {
			fact = fact * (i-1);
			//4*3=12
			//12*2=24
			//24*1=24
		}
		
		System.out.println(fact);
	}

}
