package Practice;

class Person {
	public int c;
	private String name;
	private int age;
	protected void setName(String name) {
		this.name = name;
	}
	
	protected void setAge(int age) {
		this.age = age;
	}
	
	protected void print() {
		System.out.println("Name = "+name+"  Age = "+age);
		}
	}
	
	public class SuperExample extends Person{
		public void print() {
			System.out.println("test: ");
			super.print(); //直接调用父类的成员对象
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperExample ds = new SuperExample();
		ds.setName("Kevin");
		ds.setAge(22);
		ds.print();   //调用覆盖后的方法
	}

}
