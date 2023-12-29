package com.javaex.practice;

public class Ex02 {
	
	/*
	double 형 배열 을 작성하고 1.2, 3.3, 6.7 값을 순서대로 입력하고, 
	아래와 같이 출력되도록 for문을 작성하세요.
	 */
	
	public static void main(String[] args) {
		
		double[] no = new double[3];
		no [0] = 1.2;
		no [1] = 3.3;
		no [2] = 6.7;
		
		double result = 0;
		
		for(int i=2; i>=0 ;i--) {
			
			result = no[i];
			
			System.out.println(result);
			
		}
		
	}
	
}
