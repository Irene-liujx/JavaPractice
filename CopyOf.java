package Practice;

import java.util.Arrays;

/**
 * 进行数组的复制，返回一个新的数组，数组长度是 newLength
 * 如果 newLength <= 原数组长度的，进行截取
 * 如果 newLength > 原数组长度, 其余位置用 0 填充
 */
public class CopyOf {
	
	public static int[] copyOf(int[] a,int newLength) {
		int[] dest = new int[newLength];  //dest为全0;
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
