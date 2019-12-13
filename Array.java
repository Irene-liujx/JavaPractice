package Practice;

import java.util.Arrays;

public class Array {

	//�������е����ֵ
	public static int max(int[] a){
		int m = a[0];
		for (int i = 1;i < a.length;i++){
			if(a[i] > m){
				m = a[i];
			}
		}
		return m;
	}
	
	//�������ƽ��ֵ
	public static double average(int[] a){
			int sum = a[0];
		for (int i = 0;i < a.length;i++){
			sum += a[i];
		}
			double aver = 1.0*sum / a.length;
			return aver;
	}
	
	//���������һ������ֵ�����ظ�ֵ�������е�һ�γ��ֵ��±�indexOf
		public static int indexOf(int[] a,int n){
			for(int i = 0;i < a.length;i++){
				if(a[i] == n){
					return i;
				}
			}
				return -1;
		}
		
		//���ظ�ֵ�����������һ�γ��ֵ��±�lastIndexOf
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
