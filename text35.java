//输入数组,最大的与第一个元素交换;最小的与最后一个元素交换;输出数组
package Demo40;

import java.util.Scanner;

public class text35 {
    public static void main(String[] args) {
        int i,min,max,n,temp1,temp2;
        int a[];

        //输入数组
        System.out.println("输入数组的长度:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for(i = 0;i < n;i++){
            System.out.println("输入第" + (i + 1) + "个数据");
            a[i] = sc.nextInt();
        }

        max = 0;
        min = 0;
        //设置两个标志,开始都指向第一个数
        for(i = 1;i < n;i++){
            if(a[i] > a[max]){
                max = i; //遍历数组,如果大于a[max],就把它的数组下标赋给max
            }
            if(a[i] < a[min]){
                min = i; //遍历数组,如果小于a[min],就把它的数组下标赋给min
            }
        }

        temp1 = a[0];
        temp2 = a[min];
        a[0] = a[max];
        if(min != 0){
            a[min] = a[n - 1];
            a[n - 1]= temp2;
        }else{
            a[max] = a[n - 1];
            a[n - 1] = temp1;
        }

        //输出数组
        for(i = 0;i < n;i++){
            System.out.println(a[i] + " ");
        }
    }
}
