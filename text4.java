package Practice;

public class text4 {
	
	public void fenjie(int n) {
		for(int i = 2;i <= n/2;i++) {
			if(n % i == 0) {
				System.out.print(i + "*");
				fenjie(n / i);
			}	
		}
		System.out.print(n);
		System.exit(0);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " ";
		text4 t = new text4();
		str = javax.swing.JOptionPane.showInputDialog("������N��ֵ(����exit�˳�) : ");
		int N;
		N = 0;
		try {
			N = Integer.parseInt(str);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.print(N + "�ֽ�������: " + N +"=");
		t.fenjie(N);
	}
}
