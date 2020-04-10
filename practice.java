package 每日一题;

import java.util.Scanner;

public class practice {
/*

//输出21
    public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
                System.out.print("2");
            }
        });
        t.start();
        t.join();
        System.out.print("1");
    }

*/

/*

//输出0
    public static void main(String[] args) {
        int x,y;
        x = 5 >> 2;
        y = x >>> 2;
        System.out.println(y);
    }

 */

/*

//输出AB.B
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operate(a,b);
        System.out.println(a + "." + b);
    }
         static void operate(StringBuffer x,StringBuffer y){
            x.append(y);
            y = x;
         }

*/

/*
//编译出错: 实参列表和形参列表长度不同

    public static void main(String[] args) {
        Employee e = new Employee("123");
        System.out.println(e.empID);
    }
}
class Person{
    String name = "No name";
    public Person(String nm){
        name = nm;
    }
}
class Employee extends Person{
    String empID = "0000";
    public Employee(String id){
        empID = id ;
    }
}
 */

/*
//运行正常,输出testMethod
public static void testMethod(){
        System.out.println("testMethod");
    }

    public static void main(String[] args) {
        ((practice)null).testMethod();
    }
    */

/*
//b3 = b1 + b2;语句编译出错
    public static void main(String[] args) {
        byte b1 = 1,b2 = 2,b3,b6;
        final byte b4 = 4,b5 = 6;
        b6 = b4 + b5;
        b3 = b1 + b2;
        System.out.println(b3 + b6);
    }
*/

/*
//输出12
    public static void main(String[] args) {
        try{
            int i = 100 / 0;
            System.out.print(i);
        }catch(Exception e){
            System.out.print(1);
            throw new RuntimeException();
        }finally{
            System.out.print(2);
        }
        System.out.print(3);
    }
*/

/*
//输出:finally语句块
//      和是43
public int add(int a,int b){
    try{
        return a + b;
    }
    catch(Exception e){
        System.out.println("catch语句块");
    }
    finally {
        System.out.println("finally语句块");
    }
    return 0;
}

    public static void main(String[] args) {
        practice p = new practice();
        System.out.println("和是" + p.add(9,34));
    }
*/

/*
//输出:true
    public static void main(String[] args) {
        Object o = new Object(){
            public boolean equals(Object obj){
                return true;
            }
        };
        System.out.println(o.equals("Fred"));
    }
    */

/*
//输出:AB,B
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operator(a,b);
        System.out.println(a + "," + b);
    }
public static void operator(StringBuffer x,StringBuffer y){
        x.append(y);
        y = x;
}
*/

}
