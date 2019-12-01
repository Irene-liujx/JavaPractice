package B11_30_DS;

import java.util.ArrayList;
import java.util.List;

class Student{
    private int number = 0;
    private String name = null;
    private int id = 0;
    public Student(int number,String name,int id){
        this.number = number;
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }else if(this == obj){
            return true;
        }
        Student s = (Student)obj;
        return number == s.number;
    }
}

public class ListDemo2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(01,"hhh",001));
        list.add(new Student(02,"hhh",002));
        list.add(new Student(03,"hhh",003));
        list.add(new Student(04,"hhh",004));
        list.add(new Student(05,"hhh",005));
        System.out.println(list.size());     //5
        Student stu = new Student(04,"hhh",004);
        list.remove(stu);
        System.out.println(list.size());     //4

        List<String> list2 = new ArrayList<>();
        list2.add(new String("1"));
        System.out.println(list2.size());        //1
        list2.remove(new String("1"));
        System.out.println(list2.size());         //0
    }
}
