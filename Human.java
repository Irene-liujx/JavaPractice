//父类为Animal的Human子类
package B11_25;

public class Human extends Animal{

    @Override
    public void scream(){
        System.out.println("呵呵");
    }

    public void scream(String target){
        System.out.println("呵呵 to " + target);
    }

    public static void sleep(){
        System.out.println("我是Human的睡觉");
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.scream();
        human.scream("fdc");
    }

}
