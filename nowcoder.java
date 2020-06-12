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

//找出n个数中最小的K个
 import java.util.Scanner; 
 public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String[] str = sc.nextLine().split(" ");
            int k = Integer.parseInt(str[str.length-1]);//保存k的值
            int[] array = new int[str.length - 1];
            for(int i = 0; i < str.length-1; i++){		//把string[] 变为int[]，只遍历前n个数加入数组，n+1为k
                array[i] = Integer.parseInt(str[i]);
            }
            Arrays.sort(array); 
            for(int i = 0; i < k; i++){
                System.out.print(array[i]);		//先输出数字，后面跟着空格
                if(i != k-1){
                    System.out.print(" ");		//需要每个输出之间带空格，但是最后一个输出后不应该有空格
                }
            }
        }
    }
}


9//末尾0的个数
 import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int count = 0;
            for(int i = 5;i <= n;i *= 5){
                count += n/i;
            }
            System.out.println(count);
        }
    }
}




//数字颠倒
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            for(int i = s.length() - 1; i >= 0;i--){
                System.out.print(s.charAt(i));
            }
        }
    }
}


10//fibonacci数列

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0,b = 1;
        while(b <= n){
            int temp = b + a;
            a = b;
            b = temp;
		}
        System.out.print((b-n)>(n-a)?n-a:b-n);
    }
}

//机器人走方格I
import java.util.*;

public class Robot {
    public int countWays(int x, int y) {
        // write code here
		int[][] dp = new int[13][13];
        for (int i = 1; i < y; i++)
            dp[0][i] = 1;
         
        for (int i = 1; i < x; i++)
            dp[i][0] = 1;
         
        for (int i = 1; i < x; i++)
            for (int j = 1; j < y; j++)
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
         
        return dp[x-1][y-1];
    }
}

11//个位数统计
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        String n = in.next();
        for(int i = 0;i<n.length();i++)
            a[n.charAt(i)-'0']++;
        for(int i = 0;i<a.length;i++)
            if(a[i]!=0)
                System.out.println(i+":"+a[i]);
    }
}


//构建乘积数组
import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
         int length = A.length;
        int[] B = new int[length];
        if(length != 0 ){
            B[0] = 1;        //初始化B[0]
            //计算下三角连乘
            for(int i = 1; i < length; i++){
                B[i] = B[i-1] * A[i-1];
            }
            int temp = 1;
            //计算上三角
            for(int j = length-2; j >= 0; j--){
                temp *= A[j+1];
                B[j] *= temp;
            }
        }
        return B;
    }
}


12//无缓存交换
//异或:当且仅当只有一个表达式的某位上为 1 时，结果的该位才为 1,跟1异或取反,跟自己异或置0
import java.util.*;

public class Exchange {
    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[0] = AB[0] ^ AB[1];
        AB[1] = AB[0] ^ AB[1];
        AB[0] = AB[0] ^ AB[1];
        return AB;
    }
}



//生成格雷码

import java.util.*;

public class GrayCode {
    public String[] getGray(int n) {
        // write code here
         if(n == 1)
        {
            return new String[] {"0", "1"};
        }
        else
        {
            String[] preArr = getGray(n-1);	 //要算n个格雷码，先算上一个的格雷码
            String[] curArr = new String[2*preArr.length]; 		//存放现在n的格雷码，长度为上一个的二倍
            for (int i=0; i<preArr.length; i++)
            {
                curArr[i] = "0"+preArr[i]; 		//在前面一半的前面加一个零
                curArr[curArr.length-1-i] = "1"+preArr[i]; 		//在后面一半的第一个数字前加一个一
            }
            return curArr;
        }
    }
}



13//跟奥巴马一起编程
import java.util.Scanner;
 public class Main {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();	//输出的列数 
		String c=sc.next();	//输出的字符 
		for(int i=1;i<=N;i++){		//输出第一行
			System.out.print(c); 
		}
		System.out.println();	//第一行换行 
		for(int i=1;i<=Math.ceil((double)N/2)-2;i++){	//输出中间行 
			System.out.print(c);	//中间行第一个字符 
			for(int j=2;j<=N-1;j++){ 
				System.out.print(" ");	//中间行其它字符为空字符串 
			}
			System.out.println(c);	//中间行最后一个字符
		}
		for(int i=1;i<=N;i++){		//输出最后一行 
			System.out.print(c);
		} 
	 } 
 }
 
 //超长正整数相加
 import java.util.*; 
 import java.math.BigInteger;
 public class Main{
	 public static void main(String[] args){ 
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			String s1=input.next(); 
			tring s2=input.next();
			BigInteger num1=new BigInteger(s1);	//采用BigInteger可以直接进行大整数进行计算
			BigInteger num2=new BigInteger(s2); 
			System.out.println(num1.add(num2)); 
		} 
	 } 
 }
 

14//组个最小数
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) != 0) {
                sb.append(i);
                list.set(i, list.get(i) - 1);
                break;
            }
        }
 
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                for (int j = 0; j < list.get(i); j++) {
                    sb.append(i);
                }
            }
        }
 
        System.out.println(sb.toString());
    }
 
}



//尼科彻斯定理
import java.util.*;
import java.io.*;
 
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        while (sc.hasNext()) {
            int in = sc.nextInt();
            sc.nextLine();
            getString(in);
        }
        sc.close();
    }
     
    public static void getString(int in) {
        int cur = in * (in - 1) + 1; 
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < in; i++) {
            if (i == in - 1) {
                sb.append(cur);
            }
            else {
                sb.append(cur + "+");
            }
            cur += 2;
        }
        System.out.println(sb);
    }
}

15//另类加法
import java.util.*;

public class UnusualAdd {
    public int addAB(int A, int B) {
        // write code here
        int i ,j;
        while(B != 0 ){
            i = A ^ B;
            j = (A & B) << 1;
            A = i;
            B = j;
        }
        return A;
    }
}

//饥饿的小易
import java.util.*;

public class Main {
    public static final long LIMIT = 300000;//最多搜索次数
    public static final long N = 1000000007;//求余

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            System.out.println(sol(sc.nextLong()));
        }
    }

    //次数判定方法
    public static long sol(long in){
        //如果初始位置为0，则直接可行，返回0次
        if(in == 0){
            return 0L ;
        }else{//初始位置不为0，则开始搜索
            return search(in);
        }
    }

    //不为0时的搜索
    public static long search(long in){//参数：初始坐标
        long temp = in;
        //遍历，获取最小位移
        for(int i=1;i<=LIMIT;i++){
            //long temp = (in+1)*(long)Math.pow(2,i)-1;//当循环较大时，幂次太高，数字超出范围，报错
            //递推
            temp = (temp * 2 + 1 ) % N;
            if( temp % N == 0 ){
                //i是符合条件的最小偏移，然后对其进行分解
                for(int j =0;j<=(i / 2);j++){//j对应a值
                    if((i - 2*j) % 3 == 0){
                        return ((i+j)/3);
                    }
                }
            }
        }
        //超过最大次数还没匹配，则输出-1
        return -1L;
    }
}

16//洗牌
import java.util.Scanner; 

	public class Main {
		public static void main(String[] args) { 
			Scanner sc = new Scanner(System.in); 
			int groups = sc.nextInt();
			//数组组数 
			while (groups-- > 0){
				int n = sc.nextInt();
				//数字个数的一半 
				int k = sc.nextInt();
				//洗牌次数
				int[] res = new int[2*n];
				//数据总个数 
				for(int i=0;i<2*n;i++){ 
					//遍历数据数组 
					int tmp = i + 1;
					//此处修正内层循环更加temp计算位置 
					for(int j = 0; j < k;j++){ 
						if (tmp<= n){ 
							tmp = 2*tmp - 1;
						}else{ 
							tmp = 2 * (tmp - n); 
						}
					}
				res[tmp - 1]=sc.nextInt();  //数组中temp-1的位置的数据，即就是洗牌后的结果
				}
				//输出
				if(res.length> 0){ 
					System.out.print(res[0]);
				}
				for(int i = 1;i< 2*n;i++){
					System.out.print(" "+res[i]); 
				}
				System.out.println();
			}
		}
	}


//统计同成绩学生人数
import java.util.Scanner;
	public class Main { 
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			while (scan.hasNext()) {
				int N = scan.nextInt();	// 输入的人数 
				if (N == 0) {// 如果检测到输入的人数为0 则结束 
					return; 
				}
				int[] arr = new int[N];// 保存N个人的分数
				for (int i = 0; i < arr.length; i++) { 
					arr[i] = scan.nextInt();
				}
				int t = scan.nextInt();// 目标分数 输出击中目标分数的个数
				int count = 0; 
				for (int i = 0; i < arr.length; i++) {
					if (t == arr[i]) { 
						count++;
					}
				}
				System.out.println(count); 
			} 
		} 
	}



17//火车进站
import java.util.*;
 
public class Main {
    static ArrayList<String> l=new ArrayList<String>();    //储存结果
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
            while(in.hasNext()) {
                l.clear();    //静态变量，每次先清空
                int nums=in.nextInt();
                int[] id=new int[nums];
                Stack<Integer> stack=new Stack<Integer>();
                for(int i=0;i<nums;i++) {
                    id[i]=in.nextInt();
                }
                trainOut(id,0,stack,"",0);
                Collections.sort(l);    //对结果集排序
                for(String str:l) {
                    System.out.println(str);
                }
            }
            in.close();
    }
        //i为入栈次数，n为出栈次数，str存储一趟结果
    public static void trainOut(int[] id,int i,Stack<Integer> s,String str,int n) {
        if(n==id.length) {
            l.add(str);    //如果所有火车均出栈则将当前结果保存
        }
        if(!s.empty()) {       //栈非空时出栈
            int temp=s.pop();
            trainOut(id,i,s,str+temp+" ",n+1);
            s.push(temp);    //恢复现场
        }
        if(i<id.length) {    //若所有火车没有都入栈则入栈
            s.push(id[i]);   
            trainOut(id,i+1,s,str,n);
            s.pop();        //恢复现场
        }          
    }
}


//二叉树的镜像
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public void Mirror(TreeNode root) {
     if(root == null)
            return;
        if(root.left == null && root.right == null)
            return;
         
        TreeNode pTemp = root.left;
        root.left = root.right;
        root.right = pTemp;
         
        if(root.left != null)
            Mirror(root.left);
        if(root.right != null)
            Mirror(root.right);
    }
}

18//DNA序列
import java.util.*;

public class Main {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String str = input.next();
            int n = input.nextInt();
            int max = 0;
            int maxBeginIndex = 0;
            for (int i = 0; i <= str.length()-n; i++) {
                int count = 0;
                for (int j = i; j < i+n; j++) {
                    if (str.charAt(j)=='G'||str.charAt(j)=='C')
                        count++;
                }
                if (count > max){
                    maxBeginIndex = i;
                    max = count;
                }
            }
            System.out.println(str.substring(maxBeginIndex, maxBeginIndex+n));
        }
    }
}


//百万富翁问题
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        long sumRich=0;
        long sumStranger=0;
        for(int i=1;i<=30;i++){
            sumRich+=10;
            sumStranger=sumStranger+(long)Math.pow(2,i-1);
        }
        System.out.print(sumRich+" "+sumStranger);
    }
}


19//子串判断
import java.util.*;

	public class Substr {
		public boolean[] chkSubStr(String[] p, int n, String s) { 
		// 创建boolean数组
			boolean[]hasSub=new boolean[p.length];			
		//遍历数组 使用集合中特有功能 
			for (int i = 0; i < p.length; i++) {
				hasSub[i]=s.contains(p[i]); 
			}
			return hasSub;
		}
	}

//成绩排序

import java.util.ArrayList; 
import java.util.Comparator; 
import java.util.List; 
import java.util.Scanner; 

public class Main { 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) { 
		//输入人数 
			int numPeople = scanner.nextInt();
		//排序策略
			int option = scanner.nextInt(); 
		//输入人员的姓名和成绩 
			List<Student> stuList = new ArrayList<>(); 
			for (int i = 0; i < numPeople; i++) { 
				stuList.add(new Student(scanner.next(), scanner.nextInt()));
			}
			//降序 
			if (option == 0) {
				stuList.sort((o1, o2) -> o2.score - o1.score);
				} else if (option == 1){ 
					//升序 
				stuList.sort((o1, o2) -> o1.score - o2.score);
				}
			for (Student student : stuList) {
				System.out.println(student.name + " " + student.score);
			} 
		} 
	}
}
	class Student {
		public String name;
		public int score;
		public Student(String name, int score) { 
			this.name = name; 
			this.score = score; 
		} 
	}


20//微信红包
import java.util.*;

public class Gift {
    public int getValue(int[] gifts, int n) {
        // write code here
       Map<Integer,Integer> map = new TreeMap<>();
        for(int i = 0;i < n;i++){
            if(map.containsKey(gifts[i])){
                map.put(gifts[i],map.get(gifts[i])+1);
            }else{
                map.put(gifts[i],1);
            }
        }
        for(int i = 0;i < n;i++){
            if(map.get(gifts[i]) > n / 2){
                return gifts[i];
            }
        }
        return 0;
    }
}


//链表分割
import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode cur = pHead;
        ListNode sx1 = null;
        ListNode sx2 = null;
        ListNode bx1 = null;
        ListNode bx2 = null;
        while(cur != null){
            if(cur.val < x){
                if(sx1 == null){
                    sx1 = cur;
                }else{
                    sx2.next = cur;
                }
                sx2 = cur;
            }else{
                if(bx1 == null){
                    bx1 = cur;
                }else{
                    bx2.next = cur;
                }
                bx2 = cur;
            }
            cur = cur.next;
        }
        if(sx1 == null){
            return bx1;
        }else{
            sx2.next = bx1;
            if(bx2 != null){
                bx2.next = null;
            }
            
        }
        return sx1;
    }
}


21//统计每个月的兔子总数

import java.util.*;

 public class Main{ 
	public static void main(String[] args){ 
		Scanner sc=new Scanner(System.in); 
		while(sc.hasNext()){ 
			int n=sc.nextInt(); 
			System.out.println(rabbit(n)); 
		}
			sc.close(); 
	}
	//递归三要素 1.必须要写一个方法 2.要有出口条件 3.必须有一定的规律 
	public static int rabbit(int n){ 
		if(n<=2)
	//月份小于等于2只有一个兔子 
		return 1; 
		else{
			return rabbit(n-1)+rabbit(n-2); 
			} 
	}
}


//最难的问题

import java.util.Scanner;
	public class Main {
		public static void main(String[] args) { 
			Scanner sc = new Scanner(System.in); 
			while (sc.hasNext()) { 
				String value = sc.nextLine();
				char[] chars = value.toCharArray();
				for (int i = 0; i < chars.length; i++) { 
					char c = chars[i]; 
					if ('A' <= c) { 
		//密码字母：A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
		//原文字母：V W X Y Z A B C D E F G H I J K L M N O P Q R S T U 
		//比如: F -> A => F - 5 
		//比如：B -> W => B + 21 
					c = (char) ('E' < c ? (c - 5) : (c + 21));
					chars[i] = c; 
					} 
				}
		System.out.println(new String(chars));
			} 
	   }
	}



22//到底买不买

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry;
 import java.util.Scanner; 
 public class Main { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); //商人输入 
		String have = sc.nextLine(); //用户输入 
		String need = sc.nextLine(); //商人手上每个珠子的数量统计
		Map<Character, Integer> h = new HashMap<>();
		for (char c : have.toCharArray()) { 
			if (h.containsKey(c)) { 
				h.put(c, h.get(c) + 1); 
				} else {
					h.put(c, 1);
					} 
				}
		//用户手上每个珠子的数量统计
		Map<Character, Integer> n = new HashMap<>();
		for (char c : need.toCharArray()) {
			if (n.containsKey(c)) { 
				n.put(c, n.get(c) + 1); 
				} else {
					n.put(c, 1); 
					} 
				}
				//计算差值，以用户为参考
			boolean weatherBy = true; 
			int lack = 0;
			for (Entry<Character, Integer> en : n.entrySet()) { 
				char k = en.getKey(); 
				int v = en.getValue(); 
				if (h.containsKey(k) && h.get(k) < v) {
					//商人的珠子包含用户的珠子但是不够
					weatherBy = false; lack += v - h.get(k); 
					} else if (!h.containsKey(k)) {
						//商人的珠子不包含用户的珠子
						weatherBy = false; lack += v;
						} 
			}
					if (weatherBy) { 
						System.out.println("Yes " + (have.length() - need.length())); 
						} else { 
						System.out.println("No " + lack);
						}					
					}
			}


//链式A+B

public class Plus { 
	public ListNode plusAB(ListNode a, ListNode b) { 
	//讲链表转换为整数
		int aValue = listNodeConvertIntValue(a); 
		int bValue = listNodeConvertIntValue(b); 
		//计算求和
		int sumValue = aValue + bValue; 
		//将整数转换为链表 
		return intValueConvertListNode(sumValue);
	}
	private int listNodeConvertIntValue(ListNode node) {
		StringBuilder sb = new StringBuilder(); 
		ListNode curr = node; 
			while (curr != null) { 
				sb.append(curr.val); 
				curr = curr.next; 
			}
			return Integer.parseInt(sb.reverse().toString()); 
	}
	private ListNode intValueConvertListNode(int value) { 
		char[] charArray = String.valueOf(value).toCharArray();
		ListNode node = new ListNode(Integer.parseInt(String.valueOf(charArray[charArray.length - 1]))); 
		ListNode cur = node; 
		//整数反转存储到链表中 
			for (int i = charArray.length - 2; i >= 0; i--) { 
				ListNode newNode = new ListNode(Integer.parseInt(String.valueOf(charArray[i]))); 
				cur.next = newNode; 
				cur = newNode; 
			}
			return node;
		} 
	}
	class ListNode {
		int val; ListNode next = null; 
		ListNode(int val) {
			this.val = val;
		}			
	}




23//二叉树平衡检查
//递归求解
import java.util.*;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class Balance {
    public boolean isBalance(TreeNode root) {
        // write code here
         if(root==null){
            return true;
        }
        int left = getTreeHeight(root.left);
        int right = getTreeHeight(root.right);
        return Math.abs(left - right) <= 1;
    }

    public static int getTreeHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(getTreeHeight(root.left),getTreeHeight(root.right))+1;
    }
}



//数字分类

import java.util.*;

public class Main{
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int num[]=new int[N];
        int A1=0,A2=0,A3=0,A4=0,A5=0,flag=1,count=0;
        for(int i=0;i<N;i++){
            num[i]=in.nextInt();
            if(num[i]%5==0){
                if(num[i]%2==0)
                    A1+=num[i];
            }
            if(num[i]%5==1){
                A2+=flag*num[i];
                flag=-flag;
            }
            if(num[i]%5==2){
                A3++;
            }
            if(num[i]%5==3){
                A4+=num[i];
                count++;
            }
            if(num[i]%5==4){
                if(num[i]>A5)
                    A5=num[i];
            }
        }
        if(A1!=0){
            System.out.print(A1+" ");
        } else{
            System.out.print('N'+" ");
        }
        if(A2!=0){
            System.out.print(A2+" ");
        } else{
            System.out.print('N'+" ");
        }
        if(A3!=0){
            System.out.print(A3+" ");
        } else{
            System.out.print('N'+" ");
        }
        if(A4!=0){
            System.out.print(A4/count+"."+(int)((A4%count*100/count+5)/10)+" ");
        } else{
            System.out.print("N"+" ");
        }
        if(A5!=0){
            System.out.print(A5);
        } else{
            System.out.print("N");
        }
    }
}




24//小易的升级之路

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        //先构造对应的输入输出格式
        Scanner scanner=new Scanner(System.in);
        //获取输入判断
        while(scanner.hasNext())
        {
            int n=scanner.nextInt();
            int init=scanner.nextInt();
            int[] monster=new int [n];
            for(int i=0;i<n;i++)
            {
                //获取对应的数值
                monster[i]=scanner.nextInt();
                if(init>monster[i])
                {
                    init+=monster[i];
                }
                else
                {
                    init+=GetGYS(init,monster[i]);
                }
            }
            System.out.println(""+init);
        } 
        scanner.close();
    }
     
    //获取对应最大公约数
    public static int GetGYS(int n,int m)
    {
        if(m%n==0)
            return n;
        else
        {
            return GetGYS(m%n,n);
        }
         
    }
}


//最高分是多少

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();//学生数量
            int m = sc.nextInt();//老师可操作的次数
            int[] stu = new int[n];//学生成绩
            for(int i = 0; i < n; i++) {
                stu[i] = sc.nextInt();
            }
            for(int i = 0; i < m; i++) {
                String c = sc.next();
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(c.equals("Q")) {
                    int s = Math.min(a, b);//开始下标
                    int e = Math.max(a, b);//结束下标
                    //id从1开始的，而数组下标是从0开始的
                    //而且还要包括A和B，所以下标范围是[s-1, e)
                    int max = stu[s-1];
                    for(int j = s; j < e; j++) {
                        max = Math.max(max, stu[j]);
                    }
                    System.out.println(max);
                }
                if(c.equals("U")) {
                    stu[a-1] = b;
                }
            }
        }
    }
}




25//学分绩点
import java.util.Scanner; 

public class Main{
	public static void main(String[] args){ 
		Scanner in = new Scanner(System.in); 
		int n = in.nextInt(); 
		int gradePoint[] = new int[n];	//每门课学分 
		int coursePoint[] = new int[n];	//每门课分数
		for(int i = 0;i < n;i++){ 
			gradePoint[i] = in.nextInt();
		}
		for(int i = 0;i < n;i++){ 
			coursePoint[i] = in.nextInt();
		}
		in.close(); 
		System.out.printf("%.2f",gradePointAverage(gradePoint,coursePoint));	//格式输出 
	}
	
		//根据实际成绩判断学分方法 
	public static double pointOfEachCourse(int grade){ 
		double point = 0.0; 
		if(grade >= 90 && grade <= 100){
			point = 4.0; 
		}else if(grade >= 85 && grade <= 89){
			point = 3.7; 
		}else if(grade >= 82 && grade <= 84){ 
			point = 3.3; 
		}else if(grade >= 78 && grade <= 81){
			point = 3.0; 
		}else if(grade >= 75 && grade <= 77){
			point = 2.7; 
		}else if(grade >= 72 && grade <= 74){
			point = 2.3; 
		}else if(grade >= 68 && grade <= 71){
			point = 2.0; 
		}else if(grade >= 64 && grade <= 67){
			point = 1.5;
		}else if(grade >= 60 && grade <= 63){ 
			point = 1.0; 
		}else if(grade < 60){ 
			point = 0.0;
		}
		return (double)point;
	}
	
		//计算平均绩点的方法
	public static double gradePointAverage(int[] gradePoint,int[] coursePoint){
		double gradePointTotal = 0;
		double gradeOfEachCourseTotal = 0;
		for(int i = 0;i < gradePoint.length;i++){
			gradePointTotal += pointOfEachCourse(coursePoint[i]) * gradePoint[i];
			gradeOfEachCourseTotal += gradePoint[i];
		}
		return (double)gradePointTotal / gradeOfEachCourseTotal;
	} 
}
	
	
	
//人民币转换
import java.util.Scanner;

public class Main{ 

 //阿拉伯数字0-9对应的中文
	static String[] map = {"壹","贰","叁","肆","伍","陆","柒","捌","玖"};
	
	public static void main(String[] args){ 
		Scanner scan = new Scanner(System.in); 
		while(scan.hasNext()){ 
			String number = scan.next();
			resolve(number); 
		}
		scan.close(); 
	}
	
	public static void resolve(String str){
		String[] strArr = str.split("\\."); 
		//整数部分 
		int number = Integer.valueOf(str.split("\\.")[0]);
		
		StringBuffer res = new StringBuffer("人民币");
		int yi = (int)(number / 100000000);
		if(yi != 0){ 
			res.append(resolveQian(yi)).append("亿");
			number = number - yi * 100000000; 
		}
		
		int wan = (int)(number / 10000); 
		if(wan != 0){ 
			res.append(resolveQian(wan)).append("万");
			number = number - wan * 10000; 
		}
		
		//处理千百十个位
		String beforePointString = resolveQian(number);
		if(beforePointString.length() > 1){
			res.append(beforePointString).append("元");
		}
		
		//若有小数点，处理小数点后面位数 
		//小数部分处理
		if(strArr.length > 1){ 
			String afterPointStr = strArr[1]; 
			res.append(handleNumberAfterPoint(afterPointStr));
		}
		
		//在resolveQian() 方法里可能会返回 零xxx 
		//但在最高为不能有"零" 
		String resString = res.toString(); 
		if(resString.length() > 4 && resString.charAt(3) == '零' && resString.charAt(4) != '元'){ 
		//最高位的零去掉
			resString = resString.substring(0,3) + resString.substring(4); 
		}
		System.out.println(resString); 
	}
	
	 //处理4位数 千百十个位
	public static String resolveQian(double temp){
		 StringBuffer resBuffer = new StringBuffer(); 
		 
		 //千位 
		int qian = (int)(temp / 1000); 
		if(qian ! =0){ 
			resBuffer.append(map[qian - 1]).append("仟");
			temp = temp - qian * 1000;
		}

		//百位
		int bai = (int)(temp / 100); 
		if(bai != 0){ 
			resBuffer.append(map[bai - 1]).append("佰"); 
			temp = temp - bai * 100; 
		}
		//注意:零 只会添加在 百位和十位
		if(qian != 0 && bai == 0){
			resBuffer.append("零");
		}
		
		//十位 
		int shi = (int)(temp / 10); 
		if(shi != 0){
			if(shi != 1){ 
				resBuffer.append(map[shi - 1]);
			}
			resBuffer.append("拾");
			temp = temp - shi * 10;
		}
		
		 //注意：0 
		if(bai != 0 && shi == 0){ 
			resBuffer.append("零");
		}
		
		//个位 
		int ge = (int)(temp % 10); 
		if(ge != 0){ 
			//5,0001 这种情况，千百十位均为0 
			if(qian == 0 && bai == 0 && shi == 0){ 
				resBuffer.append("零"); 
			}
			resBuffer.append(map[ge - 1]);
		}
		String res = resBuffer.toString(); 
		return res; 
	}
	
	
	//处理小数点后面的数 
	public static String handleNumberAfterPoint(String str){ 
		String res = "";
		if(str.equals("00") ||str.equals("0")){
			res = "整";
		}else{
			if(str.charAt(0) != '0'){ 
				res += map[Integer.valueOf(str.charAt(0) + "") - 1] + "角";
			 }
			 
			if(str.length() > 1 && str.charAt(1) != '0'){
				res += map[Integer.valueOf(str.charAt(1) + "") - 1] + "分";
			} 
		}
		return res; 
	} 
}



26//数字之和
import java.util.Scanner; 

public class Main{ 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		int a = sc.nextInt(); 	//输入的数字 
		int b = a * a;	 //平方 
		System.out.print(add(a)); 	//a的各位数字之和 
		System.out.print(" " + add(b)); //b的各位数字之和（a的平方） 	
	}
	
	public static int add(int a){ 
		int sum = 0;
		for(;a != 0;){ 
			sum = sum + a % 10; //取模计算出各位数字，相加计算各位数字之后 
			a = a / 10;
		}	
		return sum; 
	} 
}



//记票统计
import java.util.Scanner;
import java.util.HashMap; 
import java.util.Set; 

public class Main{ 
	public static void main(String args[]){ 
		Scanner in = new Scanner(System.in); 	//控制台输入数据
		
		while (in.hasNext()){ 
			int n = in.nextInt(); //候选人人数 
			String[] s = new String[n]; 
			 //记录候选人 
			HashMap<String,Integer> hs = new HashMap<String,Integer>(); 
			for(int i=0;i<n;i++){ 
				String temp = in.next(); 
				hs.put(temp,0); 
				s[i] = temp; 
			}
			
			//投票人数 
			int m = in.nextInt(); 
			Set<String> keys = hs.keySet(); 
			int cnt = 0; 
			for(int i=0;i<m;i++){ 
				//投票 
				String tick = in.next(); 
				if(keys.contains(tick)){ 
					hs.put(tick, hs.get(tick)+1); 
				}else{
					cnt++; 
				} 
			}
			
			  //输出结果 
			for(String k:s){ 
				System.out.println(k+" : "+hs.get(k)); 
			}
			System.out.println("Invalid : "+cnt); 
		}
		in.close(); 
	} 
}


27//找x
import java.util.Arrays; 
import java.util.Scanner; 

public class Main { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		String n = sc.nextLine(); //输入第一个数 表示数字个数 n 
		String[] nums = sc.nextLine().split(" "); //输入n个数字，空格分割 
		String x = sc.nextLine(); //输入要找的数字 
		System.out.println(Arrays.asList(nums).indexOf(x)); 
	} 
}	


//整数与IP地址间的转换
import java.util.*;

public class Main{
	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in); 
		while(sc.hasNext()){
			String ip = sc.nextLine();  //输入IP地址字符串 
			String ip10 = sc.nextLine(); //输入10进制表示的IP地址字符串 
			System.out.println(convertIp10(ip)); //IP地址转10进制字符串 
			System.out.println(convertIp(ip10)); //10进制IP地址转IP地址
		} 
	}
	
	private static long convertIp10(String ip){ 
		String[] ips = ip.split("\\.");  //使用.分割 
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i < ips.length;i++){ 
			sb.append(binaryString(ips[i])); //10进制数转二进制字符串 
		}
		return Long.parseLong(sb.toString(),2); 
	}
	
	 //十进制转换为8位二进制 
	private static String binaryString(String s){
		
		StringBuffer sb = new StringBuffer(); 
		int num = Integer.parseInt(s); 
		int k = 1<<7; 
		for(int i = 0;i < 8;i++){ 
			int flag = (num & k) == 0 ? 0 : 1;
			sb.append(flag); 
			num = num << 1; 
		}
		return sb.toString();
	}
	
	private static String convertIp(String ip10){ 
		StringBuffer sb = new StringBuffer(); 
		String ip2 = Long.toBinaryString(Long.parseLong(ip10));	//长整型转二进制字符串（JDK Long的 静态方法）
		String as = ""; 
		
		if(ip2.length() < 32){   //不足32位前面补0 
			for(int i = 0;i < 32 - ip2.length();i++){
				as += "0";
			}
		}
		ip2 = as + ip2; 
		 //IP地址每一段进行拼接
		String[] ips = new String[4]; 
		ips[0] = ip2.substring(0,8); 
		ips[1] = ip2.substring(8,16); 
		ips[2] = ip2.substring(16,24); 
		ips[3] = ip2.substring(24); 
		for(int i = 0;i < 4;i++){ 
			sb.append(Integer.parseInt(ips[i],2));
			if(i != 3){
				sb.append(".");
			} 
		}
		 return sb.toString();
	} 
}		


28//守形数
import java.util.Scanner; 

public class Main { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in); 
		while (scanner.hasNext()) { 
			isShouXingShu(scanner.nextInt()); 
		}
	}
 
	public static void isShouXingShu(int x) { 
		int x2 = x * x;
		String s1 = String.valueOf(x);		//原数字转String
		String s2 = String.valueOf(x2);	//原数字平方转String 
		//平方数从低位截取，相当于字符串从末尾截取
		String s = s2.substring(s2.length() - s1.length(), s2.length()); 
		if (s.equals(s1)) 
			System.out.println("Yes!"); 
		else
			System.out.println("No!"); 
	} 
}


//密码验证合格程序
import java.util.*; 

public class Main { 
	// 1.长度超过8位
	public static boolean checkLength(String password){ 
		if (password==null || password.length()<=8)
			return false; 
		return true; 
	}
	
	// 2.包括大小写字母.数字.其它符号,以上四种至少三种 
	public static boolean checkCharKinds(String password){ 
		int Digit=0 , lowercase=0,uppercase=0,others=0; 
		char[] ch = password.toCharArray(); 
		for (int i = 0; i < ch.length; i++) { 
			if (ch[i]>='0'&&ch[i]<='9') { 
				Digit=1; 
				continue; 
			}
			else if (ch[i]>='a'&&ch[i]<='z') {
				lowercase=1; 
				continue; 
			}
			else if (ch[i]>='A'&&ch[i]<='Z') { 
				uppercase=1; 
				continue;
			}else { 
				others=1; 
				continue; 
			} 
		}
		int total = Digit+lowercase+uppercase+others; 
		return total>=3 ? true : false; 
	}
	
	// 3.不能有相同长度超2的子串重复 
	public static boolean checkCharRepeat(String password){
		for(int i=0 ;i<password.length()-2 ;i++){ 
			//子串校验 
			//a.从下标i开始，每次截取2个字符的字符串 
			//b.从下标i+1开始截取剩余字符构成字符串，判断是否包含a中截取的字符串 
			//包含说明出现重复，不包含说明没有重复 
			String substr1 =password.substring(i, i+3); 
			if (password.substring(i+1).contains(substr1)) 
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) { 
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) { 
			String psw = cin.nextLine(); 
			if (checkLength(psw)&&checkCharKinds(psw)&&checkCharRepeat(psw)) 
				System.out.println("OK"); 
			else
				System.out.println("NG");
		} 
	} 
	
}




29//年会抽奖

import java.util.*;

public class Main { 
	public static void main(String[] args) { 
		// 输入 
		Scanner scan = new Scanner(System.in); 
		while(scan.hasNext()){ 
			int n = scan.nextInt(); 	// 代表测试数据的组数 
			float sum1 = factorial(n); 
			float sum2 = count(n); 
			//将得到的分子分母进行相除，就可以得到概率了。 
			float result1 = (sum2/sum1)*100; 
			System.out.println(String.format("%.2f", result1) + "%");
		} 
	}
	
	/**
	 * 错排算法 
	 * @param n
	 * @return 
	 */ 	 
	public static float count(int n) { 
		if(n==1){ 
			return 0; 
		}else if(n==2){ 
			return 1; 
		}else{
			return (n-1)*(count(n-1)+count(n-2)); 
		} 
	}
	
	/**
	 * n的阶乘 
	 * @param num 
	 * @return 
	 */	 
	public static float factorial(int num) { 
		float result = 1; 
		if(num==0){ 
			return 1; 
		}else if (num > 0) { 
			result = num * factorial(num - 1); 
		}
		return result; 
	} 
	
}


//数字和为sum的方法数
import java.util.Scanner;

public class Main { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();   // 数组长度为n表示n个数字 
		int sum = scanner.nextInt();   // 部分元素求和sum 
		int[] value = new int[n];   //初始化数组 
		long[] dp = new long[sum + 1];    //动态规划数组 
		dp[0] = 1;  //index=0的初始化值 
		for (int i = 0; i < n; i++) { 
			value[i] = scanner.nextInt(); 
			for (int j = sum; j >= 0; j--) { 
				if (j >= value[i]) { 
					dp[j] += dp[j - value[i]]; 
				}
			} 
		}
		System.out.println(dp[sum]); 
	} 
}



30//奇偶校验
import java.util.Scanner; 

public class Main{ 
	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in); 
		while(in.hasNext()){ 
			String str = in.nextLine(); 
			jiQiaoYan(str.toCharArray());   //将输入的字符串统一转换为字符数组 
		} 
	}
	
	public static void jiQiaoYan(char[] s){ 
		int[] result = new int[8]; 
		for(int i = 0; i < s.length; i++){ 
			int n = 0x01; 
			int j = 7; 
			int sum = 0; 
			while(j > 0){ 	//需要进行7次与运算，得出1的个数 及 二进制形式 
				result[j] = (s[i] & n) == 0 ? 0 : 1; 	//与运算 
				if(result[j] == 1) sum++; 	//个数 
				n = n << 1; j--; 
			}
			
			if((sum & 1) == 0) result[0] = 1;  //进行校验 
			for(int k = 0; k < result.length; k++){ 
				System.out.print(result[k]); 
			}
			result[0] = 0; 
			System.out.println();
		}
	}
}


//大整数排序
import java.util.*; 
import java.math.*; 

public class Main{
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in); 
		while(s.hasNext()){ 
			int n = s.nextInt(); 
			BigInteger[] bg = new BigInteger[n]; 
			for(int i=0; i<n; i++) 
				bg[i] = s.nextBigInteger(); 
		Arrays.sort(bg);	//Java中Arrays的排序静态方法调用即可完成 
		for(int i=0; i<n; i++) 
			System.out.println(bg[i]); 
		} 
	} 
}




31//说反话
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

public class Main { 
	public static void main(String[] args) throws IOException { 
		BufferedReader reader = new BufferedReader( 
			new InputStreamReader(System.in) 
		);
		String line = reader.readLine(); 
		String[] words = line.split(" "); 
		for (int i = 0; i < words.length - 1; i++) { 
			System.out.format("%s ", words[words.length - 1 - i]); 
		}
		System.out.println(words[0]); 
	} 
}


//简单错误记录

import java.util.Collections; 
import java.util.Comparator; 
import java.util.LinkedHashMap; 
import java.util.LinkedList; 
import java.util.List; 
import java.util.Map; 
import java.util.Map.Entry; 
import java.util.Scanner;

public class Main { 
	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in); 
		// 这里必须用，LinkedHashMap，按插入顺序排序。随后之后会按照出错次数再排序，但如果出错次数一样，还 是要按照插入的顺序来
		// 所以这里必须用 LInkedHashMap 
		Map<String, Integer> map = new LinkedHashMap<String, Integer>(); 
		while(in.hasNext()){ 
			String path = in.next(); 
			int id = path.lastIndexOf('\\'); 
			String filename = id == -1 ? path : path.substring(id + 1); 
			int line = in.nextInt();
			//统计频率 
			String key = filename + " " + line; 
			if(map.containsKey(key)){ 
				map.put(key, map.get(key) + 1); 
			}else{
				map.put(key, 1); 
			} 
		}
		
		// 对记录进行排序，这里有个前提，就是 java 中的排序用的是归并排序，是稳定排序
		// 这样，如果出错次数一样多，仍然保持插入顺序 
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>> (map.entrySet()); 
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){ 
			@Override 
			public int compare(Entry<String, Integer> a, Entry<String, Integer> b) { 
				return b.getValue() - a.getValue(); 
			} 
		}); 
		
		//只输出前8条 
		int m = 0; 
		for(Map.Entry<String, Integer> mapping : list){ 
			if (m >= 8) { 
				break; 
			}
			
			String[] str = mapping.getKey().split(" "); 
			String filename = str[0]; 
			if (filename.length() > 16) { 
				filename = filename.substring(filename.length() - 16); 
			}
			String n = str[1]; 
			Integer count = mapping.getValue(); 
			System.out.printf("%s %s %d%n", filename, n, count); 
			m++; 
		} 
	} 
}





32//在霍格沃茨找零钱
//可以看成特殊进制的数，统一转换为最小单位纳特后再计算即可
import java.io.IOException; 
import java.util.Scanner; 

public class Main { 
	private static long toKnut(long galleon, long sickle, long knut) { 
		return galleon * 17 * 29 + sickle * 29 + knut; 
	}
	
	public static void main(String[] args) throws IOException { 
		Scanner scanner = new Scanner(System.in); 
		String[] strP = scanner.next().split("\\."); 
		String[] strA = scanner.next().split("\\."); 
		
		// 将字符串转换为数值类型，考虑到可能过大，用 long 类型 
		long[] longP = { 
			Long.parseLong(strP[0]), 
			Long.parseLong(strP[1]), 
			Long.parseLong(strP[2]), 
		};
		long[] longA = { 
			Long.parseLong(strA[0]), 
			Long.parseLong(strA[1]), 
			Long.parseLong(strA[2]), 
		};
		
		// 将单位全部转换为 纳特(Knut) 
		long pInKnut = toKnut(longP[0], longP[1], longP[2]); 
		long aInKnut = toKnut(longA[0], longA[1], longA[2]); 
		long changeInKnut = aInKnut - pInKnut; 
		if (changeInKnut < 0) { 
			System.out.print("-"); 
			changeInKnut = -changeInKnut; 
		}
		
		// 打印时，将单位还原回去 
		System.out.format("%d.%d.%d\n", 
				changeInKnut / (17 * 29), 
				(changeInKnut % (17 * 29)) / 29, 
				((changeInKnut % (17 * 29)) % 29)); 
	}

}



//2的个数

//每十位数里会出现一个 2。但 2x 是个例外，会多出现 10 个 2 也就是每百位数里会出现 20 个 2。（2、12、22、32...92 + 20、21、22...29）
//但 2xx 是个例外，会多出现 100 个 2 ,依次类推即可根据 n 的值直接得出 2 的个数。
import java.util.*; 

public class Count2 { 
	public int countNumberOf2s(int n) { 
		int count = 0; 		// 最终 2 的个数 
		int factor = 1;		 // 从低位到高位计算 2 的个数 
		int low = 0; 		// 屏蔽掉低位 
		int current = 0; 		// 当前计算位数的值 
		int high = 0; 		// 计算高位 
		while(n / factor != 0) { 
			low = n - (n / factor) * factor; 
			current = (n / factor) % 10; 
			high = n / (factor * 10);

			// 根据当前的 
			switch(current){ 
				case 0:
				case 1: 
					count += high * factor; 
					break; 
				case 2: 
					count += high * factor + low + 1; 
					break; 
				default: 
					count += (high + 1) * factor; 
					break; 
			}
			factor *= 10; 
		}
		return count; 
	} 
}



33//锤子剪刀布
import java.util.HashMap; 
import java.util.Scanner; 
import java.util.TreeMap; 

public class Main { 
	private static class Record { 
		public int win; 
		public int tie;
		public int lose; 
		TreeMap<String, Integer> winCount; 
		
		Record() { 
			this.win = 0; 
			this.tie = 0; 
			this.lose = 0;
			this.winCount = new TreeMap<>(); 
			this.winCount.put("B", 0); 
			this.winCount.put("C", 0); 
			this.winCount.put("J", 0); 
		} 
	}
	
	private static void win(Record[] records, int win, String gesture) { 
		int lose = 1 - win; 
		records[win].win++; 
		records[lose].lose++; 
		int winCount = records[win].winCount.get(gesture); 
		records[win].winCount.put(gesture, winCount + 1); 
	}
	
	private static void judge(String a, String b, Record[] records) { 
		if (a.equals("B")) { 
			if (b.equals("B")) { 
				records[0].tie++; 
				records[1].tie++; 
			}else if (b.equals("C")) { 
				win(records, 0, "B"); 
			} else { 
				win(records, 1, "J"); 
			} 
		} else if (a.equals("C")) {
			if (b.equals("B")) { 
				win(records, 1, "B"); 
			} else if (b.equals("C")) { 
				records[0].tie++; 
				records[1].tie++; 
			} else { 
				win(records, 0, "C"); 
			} 
		} else { 
			if (b.equals("B")) { 
				win(records, 0, "J"); 
			} else if (b.equals("C")) { 
				win(records, 1, "C"); 
			} else { 
				records[0].tie++; 
				records[1].tie++; 
			} 
		} 
	}
	
	private static String mostWinGesture(TreeMap<String, Integer> winCount) { 
		if (winCount.get("C") >= winCount.get("J")) { 
			if (winCount.get("B") >= winCount.get("C")) { 
				return "B"; 
			} else { 
				return "C"; 
			} 
		} else { 
			if (winCount.get("B") >= winCount.get("J")) { 
				return "B"; 
			} else { 
				return "J"; 
			} 
		} 
	}
	
	public static void main(String[] args) { 
		Record[] records = new Record[2]; 
		records[0] = new Record(); 
		records[1] = new Record(); 
		Scanner scanner = new Scanner(System.in); 
		int n = scanner.nextInt(); 
		for (int i = 0; i < n; i++) { 
			String a = scanner.next(); 
			String b = scanner.next(); 
			judge(a, b, records); 
		}
		System.out.format("%d %d %d\n", 
							records[0].win, records[0].tie, records[0].lose); 
		System.out.format("%d %d %d\n",
							records[1].win, records[1].tie, records[1].lose); 
		System.out.format( 
			mostWinGesture(records[0].winCount) 
			+ " " 
			+ mostWinGesture(records[1].winCount)); 
	} 
}


//上楼梯
import java.util.*; 

public class GoUpstairs { 
	public int countWays(int n) { 
		//动态规划	
		// 第一阶有一种方法 
		// 第二阶有两种方法，一步一步 or 一次两步 
		// 第三阶有四种方法，1+1+1 or 1 + 2 or 2 + 1 or 3 
		long[] pre = {1, 2, 4}; 
		if(n<=0) return 0; 
		else if(n<=3) return (int)pre[n-1]; 
		else{
			for(int i=4; i<=n; i++){ 
				long tmp = (pre[0] + pre[1] + pre[2]) % 1000000007; 
				pre[0] = pre[1]; 
				pre[1] = pre[2]; 
				pre[2] = tmp; 
			} 
		}
		return (int)pre[2]; 
	} 
}



34//Broken Keyboard
import java.util.ArrayList; 
import java.util.Scanner; 

public class Main { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in); 
		String originalString = scanner.next(); 
		String typedOutString = scanner.next(); 
		ArrayList<Character> wornOutKeys = new ArrayList<>(); 
		int size = originalString.length(); 
		int iOriginal = 0; 
		int iTypedOut = 0; 
		while (iOriginal < size) { 
			boolean wornOut = false; 	// 假设没有损坏 
			char originalCh = originalString.charAt(iOriginal); 
			char originalUpper = Character.toUpperCase(originalCh);   // 全部大写 
			if (iTypedOut >= typedOutString.length()) { 
				// 输出的字符串已经结束了 
				wornOut = true; 
			} else { 
				char typedOutCh = typedOutString.charAt(iTypedOut); 
				char typedOutUpper = Character.toUpperCase(typedOutCh); 
				if (originalUpper != typedOutUpper) { 
					// 应该看到输出的字符没有输出 
					wornOut = true; 
				} 
			}
			
			if (wornOut) { 
				if (!wornOutKeys.contains(originalUpper)) { 
					wornOutKeys.add(originalUpper); 
				}
				iOriginal++;
			} else { 
				iOriginal++; 
				iTypedOut++; 
			} 
		}
		
		for (int i = 0; i < wornOutKeys.size(); i++) { 
			System.out.print(wornOutKeys.get(i)); 
		}
		System.out.println(); 
	} 
	
}


//球的半径和体积
import java.util.Scanner; 

public class Main { 
	private static class Point { 
		public double x; 
		public double y; 
		public double z; 
		Point(double x, double y, double z) { 
			this.x = x; 
			this.y = y; 
			this.z = z; 
		} 
	}
	
	private static final double PI = Math.acos(-1); 
	
	private static double distanceOfTwoPoint(Point a, Point b) { 
		double x = Math.pow(a.x - b.x, 2); 
		double y = Math.pow(a.y - b.y, 2); 
		double z = Math.pow(a.z - b.z, 2); 
		return Math.sqrt(x + y + z); 
	}
	
	private static double volumeOfSphere(double r) { 
		return (4.0 / 3) * PI * Math.pow(r, 3); 
	}
	
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) { 
			double x0 = scanner.nextDouble(); 
			double y0 = scanner.nextDouble(); 
			double z0 = scanner.nextDouble(); 
			Point a = new Point(x0, y0, z0); 
			
			double x1 = scanner.nextDouble(); 
			double y1 = scanner.nextDouble(); 
			double z1 = scanner.nextDouble(); 
			Point b = new Point(x1, y1, z1); 
			
			double r = distanceOfTwoPoint(a, b); 
			double volume = volumeOfSphere(r); 
			
			System.out.format("%.3f %.3f\n", r, volume); 
		} 
	} 
}



35//下厨房
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<String>();
        while(sc.hasNext()){
            String s = sc.next();
            set.add(s);
        }
        System.out.println(set.size());
    }
}



//百万富翁问题
import java.lang.Math; 

public class Main{ 
	public static void main(String[] args){ 
		long sumRich = 30 * 10; 
		long sumStranger = (1L << 30) - 1; 
		System.out.print(sumRich + " " + sumStranger); 
	} 
}


//风口的猪-中国牛市

public class Solution { 
	public static int calculateMax(int[] prices) { 
		int firstBuy = Integer.MAX_VALUE;    // 第一次买入最好的价格，越低越好 
		int firstSell = 0;                   // 第一次卖出后的最高收益，越高越好 
		int secondBuy = Integer.MIN_VALUE;   // 第二次买入时还剩余的最高收益，越高越好 
		int secondSell = 0;                  // 第二次卖出时总的最高收益，越高越好 
		for (int price : prices) { 
			// 当前价格下第一次买入的价格 
			firstBuy = Math.min(firstBuy, price); 
			// 当前价格 - 买入价格 就是当前价格下第一次买卖的收益 
			firstSell = Math.max(firstSell, price - firstBuy); 
			// 第一次卖出的收益 - 当前价格，即当前价格下，第二次买入后还剩余收益 
			secondBuy = Math.max(secondBuy, firstSell - price); 
			// 剩余收益 + 当前价格，即当前价格下，第二次买卖的收益
			secondSell = Math.max(secondSell, secondBuy + price); 
		}
		return secondSell; 
	} 
}



36//字母统计
import java.util.*; 

public class Main { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in); 
		while (scanner.hasNextLine()) { 
			String line = scanner.nextLine(); 
			int[] count = new int[26]; 	// 因为只有 26 个英文字母，所以只需要 26 长度 
			for (int i = 0; i < line.length(); i++) { 
				char ch = line.charAt(i); 
				if (ch >= 'A' && ch <= 'Z') { 
					// 哈希中的直接定址法 
					count[ch - 'A']++; 
				} 
			}
			for (int i = 0; i < 26; i++) { 
				System.out.printf("%c:%d%n", ('A' + i), count[i]); 
			} 
		} 
	} 
}


//进制转换
import java.util.Scanner; 

public class Main { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) { 
			String line = scanner.nextLine(); 
			long num = 0; 
			for (int i = 2; i < line.length(); i++) { 
				num *= 16; 
				char ch = line.charAt(i); 
				int n = 0; 
				if (ch >= 'A' && ch <= 'F') { 
					n = ch - 'A' + 10; 
				} else if (ch >= 'a' && ch <= 'f') { 
					n = ch - 'a' + 10; 
				} else { 
					n = ch - '0'; 
				}
				num += n; 
			}
			System.out.println(num); 
		} 
	} 
}



37//木棒拼图
import java.util.ArrayList;
import java.util.Scanner; 

public class Main { 
	public static void main(String[] args) { 
		// TODO Auto-generated method stub 
		Scanner scanner = new Scanner(System.in); 
		while (scanner.hasNext()) { 
			int n = scanner.nextInt(); 
			int[][] op = new int[n][2]; 
			for (int i = 0; i < n; i++) { 
				op[i][0] = scanner.nextInt(); 
				op[i][1] = scanner.nextInt(); 
			}
			stickPuzzle(n, op); 
		} 
	}
	
	public static void stickPuzzle(int n, int[][] op) { 
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		for (int i = 0; i < n; i++) { 
			if (op[i][0] == 1) { 
				list.add(op[i][1]); 
			} else { 
				//不等于1移除 
				list.remove(new Integer(op[i][1])); 
			}
			if (canFormPoly(list)) { 
				System.out.println("Yes"); 
			} else { 
				System.out.println("No"); 
			} 
		} 
	}
	
	//判断能否构成多边形 
	//list：各边长 
	public static boolean canFormPoly(ArrayList<Integer> list) { 
		int len = list.size(); 
		for (int i = 0; i < len; i++) { 
			int temp = list.remove(i); 
			int sum = 0; 
			for (int j = 0; j < len - 1; j++) { 
				sum += list.get(j); 
			}
			if (sum <= temp) { 
				//判断是否任意len-1条边之和大于剩余一条边 
				list.add(i, temp);
				return false; 
			}
			list.add(i, temp); 
		}
		return true; 
	}
}


//地下迷宫
import java.util.Iterator; 
import java.util.LinkedList; 
import java.util.Scanner; 

public class Main { 
	static int n, m, maxRemainEnergy = 0; 
	static int[][] map; 
	static boolean flag = false;
	static String path = ""; 
	static LinkedList<String> linkedlist = new LinkedList<>(); 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);   //输入 
		n = sc.nextInt(); 
		m = sc.nextInt(); 
		int P = sc.nextInt(); 
		map = new int[n][m]; 
		for (int i = 0; i < n; i++) { 
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt(); 
			} 
		}
		
		//处理 
		runMap(0, 0, P); 
		
		//输出 
		if (!flag) 
			System.out.println("Can not escape!"); 
		else
			System.out.println(path); 
	}
	
	public static void runMap(int x, int y, int energy) { 
		if (energy < 0 || x<0 || y<0 || x>=n || y>= m || map[x][y] != 1) return; 
		else {
			linkedlist.offer("[" + x + "," + y + "]"); 
			map[x][y] = 0; 
			if (x == 0 && y == m - 1) { 
				if (energy >= maxRemainEnergy) { 
					maxRemainEnergy = energy; updatePath(); 
				}
				map[x][y] = 1; 
				linkedlist.removeLast(); 
				flag = true; return; 
			}
			runMap(x, y+1, energy-1); 
			runMap(x+1, y, energy); 
			runMap(x-1, y, energy-3); 
			runMap(x, y-1, energy-1); 
			map[x][y] = 1;linkedlist.removeLast(); 
		} 
	}
	
	public static void updatePath() { 
		StringBuilder sb = new StringBuilder(); 
		Iterator<String> iterator = linkedlist.iterator(); 
		while (iterator.hasNext())
			sb.append(iterator.next() + ","); 
		if (sb.length() > 0)
			sb.deleteCharAt(sb.length() - 1); 
		path = sb.toString(); 
	}
	
}



38//删数
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


//空格替换
import java.util.*; 

public class Replacement { 
	public String replaceSpace(String iniString, int length) { 
		// 如果允许分配额外空间 
		
		if (iniString == null || iniString.length() <= 0)
			return iniString; 
		
		StringBuffer sb = new StringBuffer(); 
		for (int i = 0; i < length; i++) { 
			char c = iniString.charAt(i); 
			if (c == ' ') 
				sb.append("%20"); 
			else
				sb.append(c); 
		}
		return sb.toString(); 
	} 
}





39//二维数组打印
import java.util.*;

public class Printer {
	public int[] arrayPrint(int[][] arr, int n) {
		
		// 创建数组,行数数和列数分别条件判断
		int[] result = new int[n * n];
		int row = 0, col = n - 1, index = 0;
		while(row < n) {
			while(row < n && col < n) {
				result[index++] = arr[row][col];
				row++;
				col++;
			}
			if(row < col) {
				col -= row + 1;
				row = 0; 
			} else {
				row -= col - 1;
				col = 0;
			}
		}
		return result;
	}
}


//学英语
import java.util.*;

public class Main {
	public static String[] num1 = { "zero", "one", "two", "three", "four",
							"five", "six", "seven", "eight", "nine" };
	public static String[] num2 = { "ten", "eleven", "twelve", "thirteen", "fourteen", 
							"fifteen", "sixteen","seventeen", "eighteen", "nineteen" };
	public static String[] num3 = { "twenty", "thirty", "forty", "fifty", 
							"sixty", "seventy", "eighty","ninety" };
							
	public static String parse(long num){
		if(num < 0){
			return "error";
		}
		StringBuilder sb = new StringBuilder();
		long billion = num / 1000000000; //十亿部分
		if(billion != 0){
			sb.append(trans(billion) + " billion ");
		}
		num %= 1000000000;
		long million = num / 1000000; //百万部分
		if(million != 0){
			sb.append(trans(million) + " million ");
		}
		num %= 1000000; 
		long thousand = num / 1000; //千部分
		if(thousand != 0){
			sb.append(trans(thousand) + " thousand ");
		}
		num %= 1000;
 
		if(num != 0){
			sb.append(trans(num));
		}
		return sb.toString().trim(); //最后去除字符串后面的空格
	}
	
	public static String trans(long num){
		StringBuilder sb = new StringBuilder();
		long h = num / 100; //百位处理
		if(h != 0){
			sb.append(num1[(int) h] + " hundred");
		}
		num %= 100;
		long k = num / 10; //十位处理
		if(k != 0){
			if(h != 0){ //若有百位，则加上“and”
				sb.append(" and ");
			}
			if(k == 1){ //如果十位为1，那么十位与个位一起翻译，如：113
				sb.append(num2[(int)(num % 10)]);
			}else{ //否则，十位和个位分别单独翻译，如：123
				sb.append(num3[(int) (k - 2)] + " ");
				if(num % 10 != 0){
					sb.append(num1[(int) (num % 10)]);
				}
			}
		}else if (num % 10 != 0) { //如果没有十位的部分，则直接翻译个位部分，比如：102
			if(h != 0){
				sb.append(" and ");
			}
			sb.append(num1[(int) (num % 10 )]);
		}
		return sb.toString().trim();
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			long num = in.nextLong();
			System.out.println(parse(num));
		}
		in.close();
	}
}


40//删除公共字符
import java.util.Scanner; 

public class Main { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		while (sc.hasNext()) { 
			String s1 = sc.nextLine(); 
			String s2 = sc.nextLine(); 
			String pattern = "[" + s2 + "]"; 
			String result = s1.replaceAll(pattern, ""); 
			System.out.println(result); 
		} 
	} 
}



//句子逆序
import java.util.*; 

public class Main { 
	public static void main(String[] args) { 
		Scanner cin = new Scanner(System.in); 
		while (cin.hasNextLine()) { 
			String str = cin.nextLine(); 
			System.out.println(reverse(str)); 
		} 
	}
	
	public static String reverse(String s ){ 
		String str = "" ,result = ""; 
		// 从后往前扫描，遇到空格就处理一个单词。 
		for(int i=s.length()-1;i>=0; i--){ 
			if(s.charAt(i)!=' ') 
				str+=s.charAt(i);
			else{
				for(int j=str.length()-1 ; j>=0 ;j--) 
					result+=str.charAt(j); 
				result+=" "; 
				str=""; 
			} 
		}
		//再把最后一个单词追加到结果串上。 
		for(int j=str.length()-1 ; j>=0 ;j--) 
			result+=str.charAt(j); 
		return result; 
	} 
}



41//连续最大和
import java.util.*; 

public class Main { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		int n = 0; 
		while(sc.hasNext()){ 
			n = sc.nextInt(); 
			int[] num = new int[n]; 
			for(int i=0;i<n;i++){ 
				num[i] = sc.nextInt(); 
			}
			int result = maxArry(num,n); 
			System.out.println(result); 
		} 
	}
	
	public static int maxArry(int[] array,int len) { 
		if(array == null || len <= 0) {
			return -1; 
		}
		//假设最大值为这个数字，这里有一个几千，这个数字正好是整形的最小值。
		int maxnum = 0x80000000; 
		int sum = 0; 
		for(int i = 0;i < len;i++) { 
			if(sum <= 0) {
				sum = array[i]; 
			}else{
				sum += array[i]; 
			}
			if(sum > maxnum) { 
				maxnum = sum; 
			} 
		}
		return maxnum; 
	} 
}




//坐标移动
import java.util.*; 

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		//判断是否有下一个录入的元素 
		while(sc.hasNext()){
			String str=sc.nextLine(); 
			//使用;切割录入的字符串数据,返回字符串数组
			String[] A=str.split(";");
			int x=0,y=0;
			for(String string:A){
				//遍历字符串数组获取每一个部分内容,分别判断0索引对应的元素的内容 
				//判断从1号位置开始是否有连续的1到2位的数字。(数字是0-9) 
				
				if(string.charAt(0)=='D' && string.substring(1).matches("[0-9]{1,2}"))
					//将字符串的字符转换为整形数字
					x+=Integer.parseInt(string.substring(1));
					
				if(string.charAt(0)=='W' && string.substring(1).matches("[0-9]{1,2}"))
					y+=Integer.parseInt(string.substring(1));
				
				if(string.charAt(0)=='S' && string.substring(1).matches("[0-9]{1,2}"))
					y-=Integer.parseInt(string.substring(1)); 
				
				if(string.charAt(0)=='A' && string.substring(1).matches("[0-9]{1,2}"))
					x-=Integer.parseInt(string.substring(1)); 
			}
			System.out.println(x+","+y); 
		}
		sc.close(); 
	} 
}




42//计算日期到天数转换
//分别录入年月日,和日期中的天 
import java.util.Scanner; 

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		while(sc.hasNext()){
			int year = sc.nextInt(); 
			int month = sc.nextInt(); 
			int day = sc.nextInt(); 
			int Day = outDay(year, month, day); 
			System.out.println(Day); 
		}
		sc.close();
		
	}
	
	private static int outDay(int year, int month, int day) { 
		//定义数组 
		int [] Day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ; 
		//对年进行添加判断以及求余 
		if(year <= 0 ||month <= 0 || month > 12 || day<= 0 || day > Day[month - 1])
			return -1;
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			Day[1] = 29 ; 
		}
		
		int sum = 0 ; 
		for(int i = 0 ; i < month - 1 ; i ++){
			sum += Day[i] ;
		}
		return sum + day; 
	} 
	
}


//字符串加解密
import java.util.*;

public class Main { 
	//定义判断字符的方法,其实可以使用Character中的判断功能来判断字符
	public static char encryption(char c){
		if(c >= 'a' && c < 'z')
			return (char)(c + 1 - 32);
		else if(c == 'z')
			return 'A';
		else if(c >= 'A' && c < 'Z')
			return (char)(c + 1 + 32);
		else if(c == 'Z')
			return 'a'; 
		else if(c >= '0' && c < '9')
			return (char)(c + 1);
		else if(c == '9')
			return '0';
		else
			return c; 
	}
		
	public static char decryption(char c){
		if(c > 'a' && c <= 'z')
			return (char)(c - 1 - 32);
		else if(c == 'a')
			return 'Z'; 
		else if(c > 'A' && c <= 'Z')
			return (char)(c - 1 + 32);
		else if(c == 'A')
			return 'z';
		else if(c > '0' && c <= '9')
			return (char)(c - 1);
		else if(c == '0')
			return '9'; 
		else
			return c; 
	}
		
	public static String enCryption(String s){
		char[] cs = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < cs.length; i++){
			sb.append(encryption(cs[i]));
		}
		return sb.toString();
	}
		
	public static String deCryption(String s){
		char[] cs = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < cs.length; i++){
			sb.append(decryption(cs[i]));
		}
		return sb.toString(); 
	}
		
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s1 = sc.nextLine();
			String s2 = sc.nextLine(); 
			System.out.println(enCryption(s1));
			System.out.println(deCryption(s2));
		}
		sc.close(); 
	}
	
}




43//电话号码
// 借助字符串当成一个表, 完成字母和数字之间的转换即可. 注意处理大小写的情况
import java.util.*;

public class Main{
	public static void main(String[] args){
		// symbol 和 number 对应下标的字符是有对应关系的. 
		String symbol="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; 
		String number="222333444555666777788899991234567890";
		Scanner scanner=new Scanner(System.in);
		
		while(scanner.hasNext()){ 
			int n=scanner.nextInt(); 
			ArrayList<String> arrayList=new ArrayList<String>();
			
			for(int i=0;i<n;i++){
				String str=scanner.next(); 
				str=str.replace("-",""); 
				String result=""; 
				for(int j=0;j<7;j++){
					result+=number.charAt(symbol.indexOf(str.charAt(j)+""));
				}
				result=result.substring(0,3)+"-"+result.substring(3,7); 
				if(!arrayList.contains(result))
					arrayList.add(result); 
			}
			
			Collections.sort(arrayList);
			for(int j=0;j<arrayList.size();j++){
				System.out.println(arrayList.get(j)); 
			}
			
			System.out.println();
		}
		
	}
}
	



//求和
import java.util.ArrayList;
import java.util.Scanner; 

public class Main{ 
	// res 用于保存最终结果 
	static ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>(); 
	static ArrayList<Integer> list = new ArrayList<>(); 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, m; 
		while(sc.hasNext()) {
			n = sc.nextInt();
			m = sc.nextInt(); 	// 核心逻辑在此. 注意理解 m, n 的含义. 
			// 题目要求是求 1...n 中取若干个数, 和为 m 
			dfs(1, m, n); 
			// 打印结果集合
			for(ArrayList<Integer> l : res) {
				int i = 0;
				for(; i < l.size() - 1; i++) {
					System.out.print(l.get(i) + " "); 
				}
				System.out.println(l.get(i)); 
			} 
		} 
	}
	
	public static void dfs(int index, int count, int n) {
		if(count == 0) {
			res.add(new ArrayList<>(list));
		}else {
			for(int i = index; i <= count && i <= n; i++) {
				list.add(i);
				// 此处进行了递归, 对问题进行拆解. 
				// 求 1...n 中取若干个数字和为 m, 能把问题拆解为求 2...n 中取若干给数字, 和为 m - 1 
				dfs(i + 1, count - i, n); 
				list.remove(list.size() - 1); 
			} 
		} 
	}
	
}






44//骆驼命名法
// 首先一个字符一个字符的读取内容 
// 1. 遇到 _ 就直接跳过 
// 2. 如果上一个字符是 _ 则下一个字符转为大写字母 

import java.util.*; 

public class Main{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext()){
			String str=scanner.nextLine();
			// 先将字符串按 _ 切分
			String[] words=str.split("_");
			String result=words[0]; 
			for(int i=1;i<words.length;i++){
				// 将首字母转为大写即可.
				result+=(char)(words[i].charAt(0)-'a'+'A');
				for(int j=1;j<words[i].length();j++){ 
					result+=words[i].charAt(j); 
				} 
			}
			
			System.out.println(result); 
		} 
	}
}




//单词倒排
import java.util.*; 

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			String str=sc.nextLine(); 
			// 使用正则表达式作为分割符.
			String []strArray=str.split("[^a-zA-Z]+");     //使用 split 进行切分
			
			for(int i=strArray.length-1;i>=2;i--){
				System.out.print(strArray[i]+' '); 
			}
			
			//如果字符串数组的第一个元素是空串，那么下标为1的元素就是最后一个 要输出的元素，末尾不要再加空格
			if(strArray[0].length()==0)		
				System.out.println(strArray[1]); 
			else
				System.out.println(strArray[1]+' '+strArray[0]); 
		}
		
	}
}
