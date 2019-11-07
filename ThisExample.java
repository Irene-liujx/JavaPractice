package Practice;

public class ThisExample {
	private String name;
	private int age;
	ThisExample(String name,int age){
		this.setName(name);//用this引用当前对象
		this.setAge(age);
		this.print();
	}
	
	public void setName(String name) {
		this.name = name;//this指明赋值号左边为引用当前对象的成员变量,以免混淆
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void print() {
		System.out.println("Name = "+name+"  age = "+age);
		//在此行中并不需要用this,因为不会导致混淆
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisExample dt = new ThisExample("Kevin",22);
	}

}
