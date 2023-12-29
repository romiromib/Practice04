package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
/*
 5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성하세요. 
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total=0;
		double avr;
		for(int i=0;i<5;i++) {
			int no = sc.nextInt();
			total=total+no;
		}
		avr=total/5;
		System.out.println("평균은 "+ avr +"입니다.");
		sc.close();
		
	}

}
