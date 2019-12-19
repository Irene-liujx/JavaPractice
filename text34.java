//利用指针方法,将输入数据按大小顺序输出
package Demo40;

public class text34 {
    public static void main(String[] args) {
        int[] arrays = {800,50,600};
        for(int i = arrays.length - 1;i >= 0;i--){
            for(int j = 0;j < i;j++){
                if(arrays[j] > arrays[j + 1]){
                    int temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                }
            }
        }
        for(int n = 0;n < arrays.length;n++){
            System.out.println(arrays[n]);
        }
    }
}
