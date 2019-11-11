package BitPractice;

class Person{
	//属性
	String name;
	int age;
	String sex;
	
	//方法
	public void Hello(String n){
		System.out.println(n + " Say鸡你太美  to  "+ name + age + sex);
	}
}

public class Main{
	public static void main(String[] args) {
	Person p = new Person();
	p.name = "fdc";
	p.age = 24;
	
	p.sex = "女";
    p.Hello("ljx");
    }
}