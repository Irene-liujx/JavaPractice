//父类
package B11_25;

public class Animal {
    int color;
    int numberOfLegs;

    Animal(int color,int numberOfLegs){
        this.color = color;
        this.numberOfLegs = numberOfLegs;
    }

    Animal(){
        this(0,4);
    }

    public int getColor(){
        return color;
    }

    public int getNumberOfLegs(){
        return numberOfLegs;
    }

    public void scream(){
        System.out.println("吱吱");
    }

    public static void sleep(){
        System.out.println("我是Animal的睡觉");
    }
}
