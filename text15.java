//输入三个整数x,y,z把这三个数由小到大输出
package Demo40;

import java.util.Scanner;

public class text15 {
    public static void main(String[] args) {
        System.out.print("请输入三个数:\n");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();
        int x = 0;
        if(i > j){
            x = i;
            i = j;
            j = x;
        }
        if(i > k){
            x = i;
            i = k;
            k = x;
        }
        if(j > k){
            x = j;
            j = k;
            k = x;
        }
        System.out.println(i + " , " + j + " , " + k);
    }
}
