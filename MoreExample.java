class Person1{
	public static void prt(String s) {
		System.out.println(s);
	}
	Person1(){
		prt("A Person.");
	}
	Person1(String name){
		prt("A person name is: "+name);
	}
}

public class MoreExample extends Person1{
	MoreExample(){
		super(); //���ø��๹�췽��
		prt("A chinese."); //ֱ��ʹ�ôӸ���̳й����ķ���
	}
	MoreExample(String name){
		super(name); //���ø��������ͬ�βεĹ��췽��
		prt("his name is: "+name);
	}
	MoreExample(String name,int age){
		this(name);   //���õ�ǰ������ͬ�βεĹ��췽��
		prt("his age is: "+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoreExample cn= new MoreExample();
		cn = new MoreExample("kevin");
		cn = new MoreExample("kevin",22);
	}
}
