//系统产生10个随机数进行排序
package Demo40;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class text28 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        //得到10个100以内的整数
        Random r = new Random();
        for(int i = 0;i < 10;i++){
            arr[i] = r.nextInt(100) + 1;
        }
        Arrays.sort(arr);
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.print("\nPlease input a int number:");
        Scanner sc = new Scanner(System.in);
        arr[9] = sc.nextInt();
        Arrays.sort(arr);
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i] + "\t");
        }
    }
}
