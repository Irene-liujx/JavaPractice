package Practice;

import java.util.Scanner;

public class text6_1 {

	//求最大公约数
	public static int gys(int m,int n) {
		while(true) {
			if((m = m % n) == 0) {
				return n;
			}
			if((n = n % m) == 0) {
				return m;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = gys(i,j);
		System.out.println("最小公倍数为: "+ i * j / k 
				+"\n最大公约数为: " + k);
	}
}
