package Practice;
import java.util.Scanner;

public class Mutil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数: ");
		int n = sc.nextInt();
		int i,j;
		for(i = 1;i <= n;i++) {
			for(j = 1;j <= i;j++) {
				//int mul = i * j;
			System.out.printf("%d * %d = %d \t",j,i,j*i);
			}
			System.out.printf("\n");
		}
	}

}
