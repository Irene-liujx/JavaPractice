//求100以内的素数
package Demo40;

public class text27 {
    public static void main(String[] args) {
        int sum,i;
        for( sum =2; sum <= 100;sum++){
            for(i = 2;i <= sum / 2;i++){
                if(sum % i == 0){
                    break;
                }
            }if(i > sum / 2){
                System.out.println(sum + "是素数 ");
            }
        }
    }
}
