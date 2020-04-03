1//统计回文
import java.util.*;
public class Main{
  public static boolean isSymmetry(String s){
      StringBuilder sb = new StringBuilder();
            sb.append(s);
        return s.equals(sb.reverse().toString());
      }
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
         int count = 0;
      while(sc.hasNextLine()){
         String a = sc.nextLine();
         String b = sc.nextLine();
      for(int i = 0; i <= a.length();i++){
       StringBuilder sb = new StringBuilder(a);
            sb.insert(i,b);//在i位置上插入b
         if(isSymmetry(sb.toString())){
                 count++;
           }
      }
          System.out.println(count);
    }
  }
}

//寻找第K大
import java.util.*;

public class Finder {
  public int findKth(int[] a, int n, int K) {
      // write code here
      quickSort(a,0,n - 1);
        return a[n - K];
    }
  public static void swap(int[] a,int i,int j){
        int t;
		t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public static int getMid(int[] a,int left,int right){
		int mid = (left + right) / 2;
		if(a[mid] > a[left]){
			if(a[mid] < a[right]){
				return mid;
				}else{
			if(a[left] > a[right]){
				return left;
			}else{
				return right;
				}
			}
		}else{
		if(a[mid] > a[right]){
			return mid;
		}else{
		if(a[left] < a[right]){
			return left;
		}else{
			return right;
		}

		}
	}
}
	public static int partion(int[] a, int left, int right) {
		int mid = getMid(a,left,right);
		swap(a,left,mid);
		int key = a[left];
		int cur = left+1; //下一个小于key的值
		int prev = left; //最后一个小于key的值
		while(cur <= right){
			if(a[cur] < key && prev++ != cur)
					swap(a, prev, cur);
				cur++;
			}
			swap(a,left,prev);
			return prev;
	}
	public static void quickSort(int[] a,int left,int right){
		if(left < right) {
			int mid = partion(a,left,right);
			quickSort(a,left, mid - 1);
			quickSort(a, mid + 1, right);
		}
	}
}

2//汽水瓶问题
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            System.out.println(countGlass(n));
        }
    }
    public static int countGlass(int n){
        int count = 0;
        while(n >= 3){
            int temp = n / 3;
        count += temp;
        int h = n % 3;
        n = temp + h;
        }
    if(n == 2){
        count += 1;
    }
    return count;
    }
}

//数组中的逆序对
import java.util.*;

public class AntiOrder {
    public int count(int[] A, int n) {
        // write code here
        int m = 0;
        for(int i = 1;i < n;i++){
            for(int j = 0;j < i;j++){
                if(A[j] > A[i]){
                    m += 1;
                }
            }
        }
        return m;
    }
}

