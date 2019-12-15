//给一个不多于5位的正整数,求它是几位数,逆序打印出各位数字
package Demo40;

import java.util.Scanner;

public class text24 {

    public void converse(long l){
        String s = Long.toString(l);
        char[] ch = s.toCharArray();
        for(int i = ch.length - 1;i >= 0;i--){
            System.out.print(ch[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        text24 t = new text24();
        Scanner s = new Scanner(System.in);
        long a= s.nextLong();
        if(a < 0 || a > 100000){
            System.out.println("Error Input,please run this program Again");
            System.exit(0);
        }
        if (a >= 0 && a <= 9){
            System.out.println(a + "是一位数");
            System.out.println("按逆序输出是" + '\n' + a);
        }else if(a >= 10 && a <= 99){
            System.out.println(a + "是两位数");
            System.out.println("按逆序输出是");
            t.converse(a);
        }else if(a >= 100 && a <= 999){
            System.out.println(a + "是三位数");
            System.out.println("按逆序输出是");
            t.converse(a);
        }else if(a >= 1000 && a <= 9999){
            System.out.println(a + "是四位数");
            System.out.println("按逆序输出是");
            t.converse(a);
        }else if(a >= 10000 && a <= 99999){
            System.out.println(a + "是五位数");
            System.out.println("按逆序输出是");
            t.converse(a);
        }
    }

}
