package Practice;
import java.util.Arrays;
public class BubbleSort {
	public static void bubb(int[] a){
		for(int i = 0;i < a.length;i++){
			for(int j = 0;j < a.length - i -1;j++){
				if(a[j]>a[j + 1]){
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,2,8,5,3};
		bubb(a);
		System.out.println(Arrays.toString(a));
	}

}
