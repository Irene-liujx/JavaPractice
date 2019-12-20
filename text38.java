//写一个函数,求一个字符串的长度
//在main函数中输入字符串,并输出其长度
package Demo40;

import java.util.Scanner;

public class text38 {

    public static int str_len(String x){
        return x.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String mys = s.next();
        System.out.println(str_len(mys));
    }
}
