package Practice;

public class ThisExample {
	private String name;
	private int age;
	ThisExample(String name,int age){
		this.setName(name);//��this���õ�ǰ����
		this.setAge(age);
		this.print();
	}
	
	public void setName(String name) {
		this.name = name;//thisָ����ֵ�����Ϊ���õ�ǰ����ĳ�Ա����,�������
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void print() {
		System.out.println("Name = "+name+"  age = "+age);
		//�ڴ����в�����Ҫ��this,��Ϊ���ᵼ�»���
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisExample dt = new ThisExample("Kevin",22);
	}

}
