package com.neuedu.suanfa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Baoshu {
	
	
	/**
	 * ��n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ��������1��3��������
	 * ������3�����˳�Ȧ�ӣ���������µ���ԭ���ڼ��ŵ���λ��
	 * 
	 * ˼·�����������Ƴ�������boolean������������ж��Ƿ���Ȧ��
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int n= 10;
		boolean[] isline =new boolean[n];
		for(int j=0;j<n;++j) {
			isline[j]= true;
		}
		
		int intcount = n;//��ǵ�������
		int jishu =0;
	
		
		/**
		 * ����while��forѭ������ѭ�����������еĸ���ֵ
		 */
		while(intcount>1) {
			for(int i=0;i<n;++i) {
				if(isline[i]) {
					jishu++;
					if(jishu==3) {
						isline[i]=false;
						System.out.println("ɾ������"+i+"");
						intcount--;
						jishu=0;
					}
				}
			}
		}
		
		
		for(int i=0;i<n;++i) {
			if(isline[i])
				System.out.println(i);
		}
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
