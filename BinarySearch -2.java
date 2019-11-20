package BitPractice;

public class BinarySearch {
	
	public static int bin1(int[] a,int value) {
		//���ҵķ�Χ��[left,right)
		int left = 0;
		int right = a.length;
		//ֻҪ����[left,right)�ڻ�����,�ͽ��в���
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
		//value �Ⱥ��м��ֵ�Ƚ�
		//���ҵķ�Χ��[left,right]
		int left = 0;
		int right = a.length-1;
		//ֻҪ[left,right]�����ڻ�����,�ͼ������в���
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
