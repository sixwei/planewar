package com.neuedu.suanfa;

import java.util.Scanner;

public class ZhiShu {

	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int zhi = scanner.nextInt();
		System.out.println(zhi+"=");
		
		for(int i =2;i<zhi+1;++i) {
			
			while(zhi%i==0&&zhi!=i) {
				zhi = zhi/i;
				System.out.print(i+"*");
			}
			
			//把最后一位给输出出来
			if(zhi==i) {
				System.out.print(i);
				break;
			}
		}
		
		
	}
}
