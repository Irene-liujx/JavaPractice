package Practice;

import java.util.Scanner;

public class text6_2 {
	
	//求公约数
	public static int gys(int m,int n) {
		while(m % n != 0) {
			int temp = m % n;
			m = n;
			n = temp;
		}
		return n;
	}
	
	//求公倍数
	public static int gbs(int m, int n) {
		return m * n / gys(m,n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("最大公约数为: "+ gys(a,b)
					+ "\n最小公倍数为: "+gbs(a,b));
	}

}
