//9*9乘法表
package Demo40;

public class text16_1 {
    public static void main(String[] args) {
        //i控制行,j控制列
        int i = 0;
        int j = 0;
        for(i = 1;i < 10;i++){
            for(j = 1;j < 10;j++){
                System.out.print(i + "*" + j + "=" + i * j +"\t");
            }
            System.out.println();
        }
    }


}
