//定义接口InterA
interface InterA{
	void fun();
}

//实现接口 InterA的类BB
class BB implements InterA{
	public void fun() {
			System.out.println("This is B");
	}
}

//定义接口InterA的类C
class C implements InterA{
	public void fun() {
		System.out.println("This is C");
	}
}

class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterA a;
		a = new BB();
		a.fun();
		a = new C();
		a.fun();
	}

}
