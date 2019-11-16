package Practice;

class math2{
	public boolean isPrime(int x) {
		for(int i = 2;i <= x/2;i++) {
			if(x % i == 0) {
				return false;
			}
		}
		return true;
	}
}

public class text2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		math2 mymath = new math2();
		for(i = 101;i <= 200;i++) {
			if(mymath.isPrime(i) == true) {
				System.out.println(i);
			}
		}
	}

}
