import java.util.Arrays;

public class ArrayIsReferene{
	//交换不成功,形参的改变影响不了实参
	public static void swap1(int a,int b){
		int t = a;
		a = b;
		b = a;
	}
	//交换成功,数组是引用类型
	public static void swap2(int[] a,int i,int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static void main(String[] args){
		int x = 4;
		int y = 8;
		swap1(x,y);
		System.out.println("交换后: x ="+ x +"y = "+ y);
		int[] arr = {4,8};
		swap2(arr,0,1);
		System.out.println(Arrays.toString(arr));
	}
}