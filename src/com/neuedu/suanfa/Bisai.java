package com.neuedu.suanfa;

public class Bisai {
	
	
	/*	������ƹ����ӽ��б������������ˡ��׶�Ϊa,b,c���ˣ�
	 *  �Ҷ�Ϊx,y,z���ˡ��ѳ�ǩ��������������
		�������Ա����������������a˵������x�ȣ�
		c˵������x,z�ȣ��������ҳ��������ֵ�������*/
	
	/**
	 * ���� i j k���� a b c
	 * 
	 * ͨ����������ʽ���еĴ���
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
								System.out.println("a��ս"+i+"b��ս"+j+"c��ս"+k+"");
							}
						}
					}
				}
			}
		}
		
	}

}
