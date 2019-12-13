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
		super(); //调用父类构造方法
		prt("A chinese."); //直接使用从父类继承过来的方法
	}
	MoreExample(String name){
		super(name); //调用父类具有相同形参的构造方法
		prt("his name is: "+name);
	}
	MoreExample(String name,int age){
		this(name);   //调用当前具有相同形参的构造方法
		prt("his age is: "+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoreExample cn= new MoreExample();
		cn = new MoreExample("kevin");
		cn = new MoreExample("kevin",22);
	}
}
