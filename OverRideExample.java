class A1{
	public void GetVal() {
		System.out.println("Parent");
	}
}

class B1 extends A1{
	public void GetVal() {
		System.out.println("Child");
	}
}

public class OverRideExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b = new B1();
		A1 a = (A1)b; //把b强制转成A的类型;
		//上面两句等价于A a = new B();
	    a.GetVal();	
	}
}
