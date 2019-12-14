//五个人求岁数问题--递归
package Demo40;

public class text23 {
    public static int getAge(int n){
        if(n == 1){
            return 10;
        }
        return 2 + getAge(n  -1);
    }

    public static void main(String[] args) {
        System.out.println("第五个的年龄为:" + getAge(5));
    }
}
