package Practice;

import java.util.Scanner;

public class text6_1 {

	//�����Լ��
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
		System.out.println("��С������Ϊ: "+ i * j / k 
				+"\n���Լ��Ϊ: " + k);
	}
}
