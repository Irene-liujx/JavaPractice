abstract class PrintMechine{         
	//定义抽象类PrintMechine
	abstract public void print(int x);
	//定义抽象方法print(),无方法体
}

public class AbstractTest extends PrintMechine{
	int a;
	public AbstractTest(int a) {
		this.a = a;
	}
	public void print(int a) {
		//覆盖掉父类的抽象方法,或者叫实现父类的抽象方法
		System.out.println(a*2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintMechine p1 = new AbstractTest(3);
		//运行时多态,写成PrintMechine则会报错p1 = new PrintMechine()
		p1.print(3);
	}
}

	
