package BitPractice;

class Person{
	//����
	String name;
	int age;
	String sex;
	
	//����
	public void Hello(String n){
		System.out.println(n + " Say����̫��  to  "+ name + age + sex);
	}
}

public class Main{
	public static void main(String[] args) {
	Person p = new Person();
	p.name = "fdc";
	p.age = 24;
	
	p.sex = "Ů";
    p.Hello("ljx");
    }
}