package B12_02;

public class StringInPool {
    public static void main(String[] args) {
        String s = "ljx";
        String p = "ljx";
        String q = "ljx";
        //判断引用是否指向同一个对象
        System.out.println(s == p);
        System.out.println(q == p);
        //判断字符串是否相等
        System.out.println(s.equals(p));
        System.out.println(q.equals(p));

        String s1= "Hello";
        String p1 = new String(s1);
        String q1 = new String(s1);
        System.out.println(s1 == p1);
        System.out.println(s1 == q1);
        System.out.println(p1 == q1);

        System.out.println(s1.equals(p1));
        System.out.println(s1.equals(q1));

        String s2 = "hello" + "" + "world";
        String p2 = "hello world";
        System.out.println(s2 == p2);

        String s3 = "hello";
        String p3 = new String(s3);
        p3 = p3.intern();
        System.out.println(s3 == p3);
    }
}
