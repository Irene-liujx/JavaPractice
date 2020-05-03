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

