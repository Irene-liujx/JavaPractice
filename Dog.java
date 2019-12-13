//父类为Animal的Dog子类
package B11_25;

public class Dog extends Animal{
    String host;

    Dog(String host){
        super(1,3);
        this.host = host;
    }

    public String getHost(){
        return host;
    }

    //方法重写:使用@Override注解来显式指定
    //1.普通方法可以重写, static 修饰的静态方法不能重写
    //2.重写中子类的方法的访问权限不能低于父类的方法访问权限
    @Override
    public void scream(){
        System.out.println("汪汪");
    }

    public static void sleep(){
        System.out.println("我是Dog的睡觉");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("ljx");
        dog.scream();
        System.out.println(dog.getHost());
        System.out.println(dog.getColor());
        System.out.println(dog.getNumberOfLegs());
    }
}
