//父类为Animal的Pig子类
package B11_25;

public class Pig extends Animal{
    String house = "干活";

    Pig(){
        super();
    }

    public static void scream(String target){
        System.out.println("哼哼 to " + target);
    }

    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.scream("ljx");
        pig.scream();
    }
}
