package BitPractice;

import java.util.Arrays;

public class BubbleSort {
	
	public static void swap(int[] a,int i,int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static void bubb1(int[] a){
		for(int i = 0;i < a.length;i++){
			//j:[0,a.length - i - 1)
			for(int j = 0;j < a.length - i -1;j++){
				//j和j + 1下标对比
				if(a[j]>a[j + 1]){
			   /*
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				*/
					swap(a,j,j + 1);
				}
			}
		}
	}
	
	public static void bubb2(int[] a) {
		for(int i = 0;i < a.length - 1;i++) {
			//j:[1,a.length - i)
			for(int j = 1;j < a.length - i;j++) {
				//j和j - 1下标对比
				if(a[j - 1 ] > a[j]) {
					swap(a,j - 1,j);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,2,8,5,3};
		bubb1(a);
		System.out.println(Arrays.toString(a));
		bubb2(a);
		System.out.println(Arrays.toString(a));
	}

}
