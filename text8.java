package Practice;

import java.util.Scanner;

public class text8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 0;
		int a,n;
		int t= 0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		n = sc1.nextInt();
		for(int i = 1;i <= n;i++) {
			t = t* 10 + a;
			s += t;
			System.out.println(t);
		}
		System.out.println(s);
	}

}
