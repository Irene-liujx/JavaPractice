package Practice;

import java.util.Arrays;

public class Array {

	//求数组中的最大值
	public static int max(int[] a){
		int m = a[0];
		for (int i = 1;i < a.length;i++){
			if(a[i] > m){
				m = a[i];
			}
		}
		return m;
	}
	
	//求数组的平均值
	public static double average(int[] a){
			int sum = a[0];
		for (int i = 0;i < a.length;i++){
			sum += a[i];
		}
			double aver = 1.0*sum / a.length;
			return aver;
	}
	
	//给定数组和一个具体值，返回该值在数组中第一次出现的下标indexOf
		public static int indexOf(int[] a,int n){
			for(int i = 0;i < a.length;i++){
				if(a[i] == n){
					return i;
				}
			}
				return -1;
		}
		
		//返回该值在数组中最后一次出现的下标lastIndexOf
		public static int lastIndexOf(int[] a,int n){
			for (int i = a.length-1;i >= 0;i--){
				if(a[i] == n){
					return i;
				}
			}
				return -1;
		}
	public static void main(String[] args){
		int[] a = {2,4,7,1,5};
		System.out.println(max(a));
		System.out.println(average(a));
		int[] b= {3,4,1,6,3,7,3,4};
		System.out.println(indexOf(b,4));
		System.out.println(lastIndexOf(b,4));
	}
}
