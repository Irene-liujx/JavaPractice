//����ӿ�InterA
interface InterA{
	void fun();
}

//ʵ�ֽӿ� InterA����BB
class BB implements InterA{
	public void fun() {
			System.out.println("This is B");
	}
}

//����ӿ�InterA����C
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
