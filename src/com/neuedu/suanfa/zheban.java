package com.neuedu.suanfa;

public class zheban<T> implements Comparable<T> {
	
	
	
	public static int findIndex(int[] array,int x) {
		
		int low=0,higt=array.length-1;
		while(low<=higt) {
			int middle = (low+higt)/2;
			
			if(x<array[middle]) {
				higt = middle-1;
			}else if(x>array[middle]){
				low = middle+1;
			}else if(x==array[middle]) {
				return middle;
			}
			
		}
		
		return -1;
	}
	
	
	public static int findIndexC(int[] array,int x){
		
		
		return -1;
	}
	
	//要求，查找某个数在数组中的位置，如果没有返回-1
	public static void main(String[] args) {
		//折半查找必须是有序的数
		int[] array = new int[]{12,45,51,52,62,75,85,91,100};
		
		
		int index = findIndex(array,52);
		System.out.println(index);
		
	}


	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		
		return 0;
	}

}
