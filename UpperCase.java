//向上转型:父类的一个引用指向一个子类的实例
//子类对象转换成父类对象
//发生时机:直接赋值;方法传参;方法返回
package B11_25;

public class UpperCase {

    public static void main(String[] args) {
        Animal p1 = new Dog("ljx");
        Animal p2 = new Pig();
        Animal p3 = new Human();

        p1.scream();
        p2.scream();
        p3.scream();

        Animal.sleep();
        Dog.sleep();
        Human.sleep();

        //向下转型:父类对象转换成子类对象
        ((Human)p3).scream("fdc");
    }
}
