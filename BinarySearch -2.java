package BitPractice;

public class BinarySearch {
	
	public static int bin1(int[] a,int value) {
		//查找的范围是[left,right)
		int left = 0;
		int right = a.length;
		//只要区间[left,right)内还有数,就进行查找
		while(left < right) {
			int mid = (left + right) / 2;
			if(value == a[mid]){
				return mid;
			}else if(value < a[mid]) {
				right = mid;
			}else if(value > a[mid]) {
				left = mid + 1;
			}
		}
		return -1;
	}
	
	public static int bin2(int[] a,int value){
		//value 先和中间的值比较
		//查找的范围是[left,right]
		int left = 0;
		int right = a.length-1;
		//只要[left,right]区间内还有数,就继续进行查找
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
		System.out.println(bin1(a,7));
		System.out.println(bin2(a,7));
	}

}
