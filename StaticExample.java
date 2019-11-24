//实例成员与类成员(静态成员)示例
package BookDemo;

class subClass{
    static int classPar;        //类成员(static关键字来修饰)
    int instancePar;            //实例成员
    static void setclassPar(int i){
        classPar = i;
    }
    void setinstancePar(int i){
        instancePar = i;
    }
    static int getclassPar(){
        return classPar;
    }
    int getinstancePar(){
        return instancePar;
    }
}

public class StaticExample {
    public static void main(String[] args){
        subClass obj1,obj2;
        obj1 = new subClass();
        obj2 = new subClass();
        obj1.setclassPar(5);
        obj2.setclassPar(7);
        obj1.setinstancePar(3);
        obj2.setinstancePar(6);
        System.out.println("obj1.classPar: " + obj1.getclassPar());
        System.out.println("obj2.classPar: " + obj2.getclassPar());
        System.out.println("obj1.instancePar: " + obj1.getinstancePar());
        System.out.println("obj2.instancePar: " + obj2.getinstancePar());
    }
}
