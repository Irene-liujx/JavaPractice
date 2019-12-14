//利用递归求阶乘
package Demo40;

import java.util.Scanner;

public class text22 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        text22 t = new text22();
        System.out.println(t.recursion(n));
    }

    public long recursion(int n){
        long value = 0;
        if(n == 1 || n == 0){
            value = 1;
        }else if(n > 1){
            value = n * recursion(n - 1);
        }
        return value;
    }
}
