//9*9乘法表下三角
package Demo40;

public class text16 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        for(i = 1;i < 10;i++){
            for(j = 1;j <= i;j++){
                System.out.print(i + "*" + j + "=" + i * j +"\t");
            }
            System.out.println();
        }
    }
}
