package Practice;
import java.util.Scanner;

public class Prime {

	//判断一个数是否为素数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数: ");
		int n = scanner.nextInt();
		int i;
		for(i = 2;i < n;i++) {
			int t = n % i;
			if(t == 0) {
				System.out.printf("%d 是素数",n);
				break;
			}else {
				System.out.printf("%d 不是素数", n);
				break;
			}
		}
	}
}


