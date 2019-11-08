class A{
	public int getVal() {
		return(5);
	}
}

class B extends A{
	public int getVal() {
		return(10);
	}
}

public class OverRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		int x = b.getVal();
		System.out.println(x);
	}

}
