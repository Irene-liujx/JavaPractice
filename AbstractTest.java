abstract class PrintMechine{         
	//���������PrintMechine
	abstract public void print(int x);
	//������󷽷�print(),�޷�����
}

public class AbstractTest extends PrintMechine{
	int a;
	public AbstractTest(int a) {
		this.a = a;
	}
	public void print(int a) {
		//���ǵ�����ĳ��󷽷�,���߽�ʵ�ָ���ĳ��󷽷�
		System.out.println(a*2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintMechine p1 = new AbstractTest(3);
		//����ʱ��̬,д��PrintMechine��ᱨ��p1 = new PrintMechine()
		p1.print(3);
	}
}

	
