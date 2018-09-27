package com.neuedu.suanfa;

public class Bisai {
	
	
	/*	：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，
	 *  乙队为x,y,z三人。已抽签决定比赛名单。
		有人向队员打听比赛的名单。a说他不和x比，
		c说他不和x,z比，请编程序找出三队赛手的名单。*/
	
	/**
	 * 利用 i j k代表 a b c
	 * 
	 * 通过遍历的形式进行的处理
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		for(char i ='x';i<='z';++i) {
			for(char j='x';j<='z';++j) {
				if(i!=j) {
					for(char k='x';k<='z';++k) {
						if(i!=k&&j!=k) {
							if(i!='x'&&k!='x'&&k!='z') {
								System.out.println("a对战"+i+"b对战"+j+"c对战"+k+"");
							}
						}
					}
				}
			}
		}
		
	}

}
