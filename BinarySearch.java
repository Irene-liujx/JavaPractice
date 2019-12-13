package Practice;

public class BinarySearch {
	public static int bin(int[] a,int value){
		//value 先和中间的值比较
		int left = 0;
		int right = a.length-1;
		while(left <= right){
			int mid = (left+right)/2;
			if(value < a[mid]){
				right = mid - 1;
			}else if(value > a[mid]){
				left = mid + 1;
			}else {
				return mid;
			}
		}
			return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,5,7,9,12,15,18,20};
		System.out.println(bin(a,7));
	}

}
