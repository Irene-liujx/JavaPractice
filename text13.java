//找出一个整数,它加上100后是一个完全平方数,加上168后又是一个完全平方数
package Demo40;

public class text13 {
    public static void main(String[] args) {
        int k = 0;
        for(k = 1;k < 1000;k++){
            if(Math.floor(Math.sqrt(k + 100)) == Math.sqrt(k + 100)
                    && Math.floor(Math.sqrt(k + 168)) == Math.sqrt(k + 168)){
                System.out.println(k);
            }
        }
    }
}
