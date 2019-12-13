 package Practice;

 import java.util.Scanner;

public class text6 {
	
	//公约数--辗转相除法
	 public static int commonDivisor(int m,int n) {
		if(n < 0 || m < 0) {
			System.out.println("ERROR!!");
			return -1;
		}
		if(n == 0) {
			System.out.println("the biggest common divisor is : " + m);
			return m;
		}
		return commonDivisor(n,m%n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		commonDivisor(i,j);
		
	}

}
