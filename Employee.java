//静态数据成员(类成员)示例
package BookDemo;

public class Employee {
    private String name;
    private double salary;
    private int id;
    //静态数据成员nextId属于Employee类,而不属于类的某个对象
    private static int nextId = 1;

    public Employee(String n,double s){
        name = n;
        salary = s;
        id = 0;
        setId();
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public void setId(){
        id = nextId;        //为下一次员工设置可用的id
        nextId++;
    }

    public static int getNextId(){
        return nextId;      //返回static
    }

    public static void main(String[] args){
        Employee e1 = new Employee("Harry",30000);
        System.out.println(e1.getName() + "\t" + e1.getSalary() + "\t" + e1.id
                 + "\t" + e1.nextId);
        Employee e2 = new Employee("Tom",40000);
        System.out.println(e2.getName() + "\t" + e2.getSalary() + "\t" + e2.id
                + "\t" + e2.nextId);
        Employee e3 = new Employee("Kidd",50000);
        System.out.println(e3.getName() + "\t" + e3.getSalary() + "\t" + e3.id
                + "\t" + e3.nextId);
    }
}
