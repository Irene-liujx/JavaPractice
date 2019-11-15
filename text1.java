package Practice;



class math{
	public int f(int x) {
		if(x == 1 || x == 2)
			return 1;
		else
			return f(x - 1) + f(x - 2);
	}
}
public class text1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		math mymath = new math();
		for(i =1;i <= 20; i++) {
				System.out.println(mymath.f(i));
		}
	}
}
