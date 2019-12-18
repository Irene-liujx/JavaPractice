//取一整数a从右端开始的4~7位
package Demo40;

//先使a右移4位;设置一个低四位为1,其余全为0的数
//将上面二者进行&运算
public class text32 {
    public static void main(String[] args) {
        int a = 0;
        long b = 178736284;
        a = (int) Math.floor(b % Math.pow(10,7) / Math.pow(10,3));
        System.out.println(a);
    }
}
