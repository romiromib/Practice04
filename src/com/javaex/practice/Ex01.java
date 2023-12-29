package com.javaex.practice;

public class Ex01 {
	/*
	아래의 코드를 실행하면 출력결과에 오류가 발생한다. 
	오류 수정 후 출력결과를 예상하고 코드로확인해 보세요.
	 */
	
	public static void main(String[] args) {

		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		intArray[3] = 7;  //변수 추가
		intArray[4] = 12; //변수 추가
		
		
		int result = 0;
		
		for (int i =0; i < intArray.length; i++) { //i<= intArray.length이면 6번수행함
			result = result + intArray[i];
		}
		System.out.println(result);
	}

}
