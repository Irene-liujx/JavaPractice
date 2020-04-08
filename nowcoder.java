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



3//合法括号序列判断
import java.util.*;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        LinkedList<Character> st = new LinkedList<Character>();
        for(int i = 0;i < n;i++){
            if(A.charAt(i) != '(' && A.charAt(i) != ')'){
                return false;
            }
            if(A.charAt(i) == '('){
                st.add('(');
            }
            if(A.charAt(i) == ')'){
                if(st.isEmpty()){
                    return false;
                }else{
                     st.removeLast();
                }
            }
            }
        if(st.isEmpty()){
                return true;
            }else{
                return false;
        }
    }
}

//字符串找出连续最长的数字串
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(theNums(sc.nextLine()));
    }
    public static String theNums(String s){
        int max = 0;//最长数字串
        int length = 0;//数字串长度
        int end = 0;//数字串最后一个数的下标
        char[] sc = s.toCharArray();
        for(int i = 0;i < sc.length;i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                length++;
                if(length > max){
                    max = length;
                    end = i;
                }
            }else{
                length = 0;
            }
        }
        return s.substring(end - max + 1,end + 1);
    }
}


4//买苹果
(1)
import java.util.Scanner;

public class Main{
    public static int buyApple(int n){
        if(n < 6 || n % 2 == 1){
            return -1;
        }
        int i = n / 8; 
        int m = 8 * (i + 1);
        int a = m - n;
        if(n % 8 == 0){
            return i;
        }
        else if(a / 2 <= i + 1 && a % 2 == 0){
            return i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Main.buyApple(n));
    }
}

(2)
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(buyApple(n));
    }
    public static int buyApple(int n){
       // int k = 0;
        if(n % 2 != 0){
            return -1;
        }
        if(n % 8 == 0){
            return n / 8;
        }
        for(int i = n / 8;i >= 0;i--){
            for(int j = 1; j <= n / 6;j++){
                if(i * 8 + j * 6 == n){
                  return i +j;
                }
            }
        }
        return -1;
    }
}

//删除公共字符
(1)
import java.util.Scanner;
 
public class Main {
	
	
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "";
        String str2 = "";
        ArrayList<Character> list = new ArrayList<>();
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        for (int i = 0; i < str1.length(); i++) {
            if (!(str2.contains(str1.charAt(i) + ""))) {
                list.add(str1.charAt(i));
            }
        }
        for (int k = 0; k < list.size(); k++) {
            System.out.print(list.get(k) + "");
        }
    }

(2)
 //使用正则表达式解题

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext())
        {
            String s1 = s.nextLine();
            String s2 = s.nextLine();
            String del = "["+s2+"]"; // 字符串类型的正则表达式
            System.out.println(s1.replaceAll(del, ""));
        }
    }
}



