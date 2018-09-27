package com.neuedu.suanfa;

import java.util.Scanner;

public class BigDivisor {
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input1 = scanner.nextInt();
		
		int input2 = scanner.nextInt();
		
		int min = input1*input2;
		
		int temp = 1;
		if(input2>input1) {
			temp = input1;
			input1 = input2;
			input2 = temp;
		}
		
		//利用辗转相除求最大公约数
		//while是当里面的条件不成立的时候执行下面的语句
		do{
			temp = input1%input2;
			input1 = input2;
			input2 = temp;
		}while(temp!=0);
		
		System.out.println(input1);
		
		
		//最小公倍数
		
		int gongbei = min/input1;
		
	}

}
