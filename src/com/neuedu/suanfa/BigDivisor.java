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
		
		//����շת��������Լ��
		//while�ǵ������������������ʱ��ִ����������
		do{
			temp = input1%input2;
			input1 = input2;
			input2 = temp;
		}while(temp!=0);
		
		System.out.println(input1);
		
		
		//��С������
		
		int gongbei = min/input1;
		
	}

}
