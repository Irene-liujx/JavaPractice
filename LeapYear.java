package Practice;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		for(n = 1000;n <= 2000;n++) {
			if(n % 400 == 0) {
				System.out.printf("%d 年为闰年 %n",n);
			}else if(n % 4 == 0 && n % 100 != 0){
				System.out.printf("%d 年为闰年",n);
			}
		}
	}

}
