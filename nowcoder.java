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



5//神奇的口袋

import java.util.Scanner;

public class Main{
    static int[] weight;
    static int n;
    static int count = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            n = sc.nextInt();
            weight = new int[n + 1];
            for(int i = 1;i <= n;i++){
                weight[i] = sc.nextInt();
            }
            count(40,n);
            System.out.println(count);
        }
    }
    //递归  s:物品剩余重量   n:可选择物品个数
    public static void count(int s,int n){
         //刚好装满
        if(s == 0){
            count++;
            return;
        }
         //如果s<0或者n<1 表示不成立
        if(s < 0 || (s >0 && n < 1)){
          return;
        }
        //装入当前物品,减去当前的物品的重量，用剩下的s进行递归
        count(s - weight[n],n - 1);
        //当前物品无解时,则跳过当前物品，从n - 1个开始递归
        count(s,n - 1);
    }
}


//用两个栈实现队列(push和pop操作)

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
       stack1.push(node);
    }
    //队列:先进先出
    public int pop() {
        if(!stack2.isEmpty()){
            return stack2.pop();
        }
        while( !stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}



6//计算糖果
//判断三元一次方程组是否有解及求解。 把题目条件用方程式表示： A-B=Y1; B-C=Y2;A+B=Y3; B+C=Y4;
//用消元法求解： A=(Y1+Y3)/2; B=(Y3-Y1)/2=(Y2+Y4)/2; C=(Y4-Y2)/2; 由于题目给出的是整数，要求解也是整数.
 import java.util.Scanner; 
 public class Main {
	 public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
		int y1, y2, y3, y4; 
		float a, b, c;
		while (in.hasNextInt()) {
			y1 = in.nextInt(); 
			y2 = in.nextInt(); 
			y3 = in.nextInt(); 
			y4 = in.nextInt(); 
			a = (y1 + y3) / 2f; 
			b = (y3 - y1) / 2f;
			c = (y4 - y2) / 2f; 
		 if ((a - ((y1 + y3) / 2)) != 0) { 
				System.out.print("No");
					return; 
		 }
		 if ((b - ((y3 - y1) / 2) != 0) || (b != ((y2 + y4) / 2))) {
			   System.out.print("No");
					return;
		}
	     if ((c - ((y4 - y2) / 2)) != 0) {
				System.out.print("No"); 
					return; 
	    }//满足所有的约束条件，输出解。

	System.out.print((int) a + " " + (int) b + " " + (int) c);
		}
	}
 }
 
 
 
//n个数里出现次数大于等于n/2的数
//str.split(" "):按照空格切分字符串    Integer.valueOf(str):将数字字符串转为int
 import java.util.*;
 public class Main {
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 while (in.hasNext()) { 
		 String str = in.nextLine(); 
		 String[] strs = str.split(" "); 
		 int[] arr = new int[strs.length]; 
		 for (int i = 0; i < arr.length; i++) { 
			arr[i] = Integer.valueOf(strs[i]); 
		 }
		 int num = arr[0]; 
		 int count = 0;
		 for (int j = 1; j < arr.length; j++) { 
			if (arr[j] == num) { 
			count++; 
		 } else if (count > 0) { 
			count--; 
		} else { 
			num = arr[j];
			} 
		}
		System.out.println(num);
		}
	} 
 }



7//不要二
//每个4行中， i或i＋1行的蛋糕数为 (n / 4) * 2 + (n % 4 < 2 ? n % 4 : 2) i＋2或i+3行的蛋糕数为((n - 2) / 4) * 2 + ((n - 2) % 4 < 2 ? (n - 2) % 4 : 2) 然后算清楚一共有多少个完整的4行
//共有m / 4个。 需要注意的就是处理行数除4有余数的情况，把最后可能剩余的1～3 行加进去即可。

import java.util.*; 
public class Main{ 
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	int m = sc.nextInt(), n = sc.nextInt(); 
	int evenICount = (n / 4) * 2 + (n % 4 < 2 ? n % 4 : 2); 
	int oddICount = ((n - 2) / 4) * 2 + ((n - 2) % 4 < 2 ? (n - 2) % 4 : 2); 
	int ans = m / 4 * (evenICount + oddICount) * 2; 
	if(m % 4 > 0) ans += evenICount; 
	if(m % 4 > 1) ans += evenICount;
	if(m % 4 > 2) ans += oddICount; 
	System.out.println(ans); 
	} 
}

//求最小公倍数
//两个数a,b的最小公倍数是a*b/gcd(a,b)。由于两个数的乘积等于这两个数的最大公约数与最小公倍数的积，即（a，b）× [a，b] = a × b
//求最大公约数： 1. a/b，令r为所得余数（0≤r<b） 若r=0，算法结束，a即为答案     2. 互换：置 a←b，b←r，并返回第一步
import java.util.Scanner; 
public class Main {
	public static int lcm(int m, int n) { 
		return (m * n) / gcd(m, n); 
	}
private static int gcd(int a, int b) {
	if (b == 0) return a; return gcd(b, a % b); 
	}
public static void main(String[] args) { 
	Scanner in = new Scanner(System.in);
	int a = in.nextInt(); 
	int b = in.nextInt(); 
	System.out.println(lcm(a, b));
	}
 }

8//删数

import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 1000) {
                n = 999;
            }
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int i = 0;
            while (list.size() > 1) {
                i = (i + 2) % list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}
