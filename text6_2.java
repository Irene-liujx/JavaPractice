package Practice;

import java.util.Scanner;

public class text6_2 {
	
	//��Լ��
	public static int gys(int m,int n) {
		while(m % n != 0) {
			int temp = m % n;
			m = n;
			n = temp;
		}
		return n;
	}
	
	//�󹫱���
	public static int gbs(int m, int n) {
		return m * n / gys(m,n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("���Լ��Ϊ: "+ gys(a,b)
					+ "\n��С������Ϊ: "+gbs(a,b));
	}

}
