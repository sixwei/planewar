package com.neuedu.suanfa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Baoshu {
	
	
	/**
	 * 有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），
	 * 凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
	 * 
	 * 思路：怎样进行移除，利用boolean数组进行数据判断是否在圈内
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int n= 10;
		boolean[] isline =new boolean[n];
		for(int j=0;j<n;++j) {
			isline[j]= true;
		}
		
		int intcount = n;//标记的总人数
		int jishu =0;
	
		
		/**
		 * 利用while和for循环进行循环遍历数组中的各个值
		 */
		while(intcount>1) {
			for(int i=0;i<n;++i) {
				if(isline[i]) {
					jishu++;
					if(jishu==3) {
						isline[i]=false;
						System.out.println("删除的是"+i+"");
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
