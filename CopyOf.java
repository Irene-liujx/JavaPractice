package Practice;

import java.util.Arrays;

/**
 * ��������ĸ��ƣ�����һ���µ����飬���鳤���� newLength
 * ��� newLength <= ԭ���鳤�ȵģ����н�ȡ
 * ��� newLength > ԭ���鳤��, ����λ���� 0 ���
 */
public class CopyOf {
	
	public static int[] copyOf(int[] a,int newLength) {
		int[] dest = new int[newLength];  //destΪȫ0;
		int length = Math.min(a.length,newLength);
		for(int i = 0;i < length;i++) {
			dest[i] = a[i];
		}
		return dest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {3,5,7,2,6};
		System.out.println(Arrays.toString(copyOf(x,3)));
		System.out.println(Arrays.toString(copyOf(x,5)));
		System.out.println(Arrays.toString(copyOf(x,7)));
	}

}
