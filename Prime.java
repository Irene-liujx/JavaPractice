package Practice;
import java.util.Scanner;

public class Prime {

	//�ж�һ�����Ƿ�Ϊ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����: ");
		int n = scanner.nextInt();
		int i;
		for(i = 2;i < n;i++) {
			int t = n % i;
			if(t == 0) {
				System.out.printf("%d ������",n);
				break;
			}else {
				System.out.printf("%d ��������", n);
				break;
			}
		}
	}
}


