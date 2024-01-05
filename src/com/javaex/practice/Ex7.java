package com.javaex.practice;

import java.util.Scanner;

public class Ex7 {
/*
키보드에서 정수로 된 돈의 액수를 입력받아 
50000원권, 10000원권, 5000원권, 1000원권, 500원동전, 100원동전, 50원동전, 1원
동전 각 몇 개로 변환 되는지 작성 하세요. (아래의 배열을 사용하여 코딩하세요.) 

int[] wonArray = new int[10];
wonArray[0] = 50000;
wonArray[1] = 10000;
wonArray[2] = 5000;
wonArray[3] = 1000;
wonArray[4] = 500;
wonArray[5] = 100;
wonArray[6] = 50;
wonArray[7] = 10;
wonArray[8] = 5;
wonArray[9] = 1; 
 */		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액: ");
		int cash = sc.nextInt();
		
		int[] wonArray = new int[10];
				wonArray[0] = 50000;
				wonArray[1] = 10000;
				wonArray[2] = 5000;
				wonArray[3] = 1000;
				wonArray[4] = 500;
				wonArray[5] = 100;
				wonArray[6] = 50;
				wonArray[7] = 10;
				wonArray[8] = 5;
				wonArray[9] = 1; 
		
				int money;
				int j = 1;
				//int count=0 ;
				for(int i=0;i<wonArray.length;i++){
					money = wonArray[i];
					
					
						if(0<cash-money*j) {
							cash= cash-(money*j);
							System.out.println(money+"원:"+j+"개");
					
						}
						
						/*switch(i) {
						case 0,1,2,3,4,5,6,7,8,9 :
						cash= cash-money;
						count=count+1;
						System.out.println(count);
							break;
							}*/	
				//System.out.println(i);
					
				}
		
		
		sc.close();
		

	}

}
