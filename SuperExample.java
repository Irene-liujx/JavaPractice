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
			super.print(); //ֱ�ӵ��ø���ĳ�Ա����
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperExample ds = new SuperExample();
		ds.setName("Kevin");
		ds.setAge(22);
		ds.print();   //���ø��Ǻ�ķ���
	}

}
