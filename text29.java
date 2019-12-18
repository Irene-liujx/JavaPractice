//求3*3矩阵对角线元素之和
package Demo40;

public class text29 {
    public static void main(String[] args) {
        double sum = 0;
        int array[][] = {{1,2,3},{4,5,6},{7,7,8}};
        //利用双重for循环 控制输入二维数组
        //再将a[i][i]累加后输出
        for(int i = 0;i < 3; i++){
            for(int j = 0;j < 3;j++){
                if(i == j){
                    sum += array[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
