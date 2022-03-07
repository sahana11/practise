package com.test.project;

public class Fibonacci {
	static int n1=0, n2 =1, n3=0;
	
	public static void main(String args[]) {
		int n=10;
		
		System.out.println(0);
		System.out.println(1);
		fibo(n); //calling recurssively
		
	}
	
	private static void fibo(int n) {
		
		
		if(n > 1) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			
			System.out.println(n3);
		
		
		fibo(n-1);	
		}
			
	}

}
