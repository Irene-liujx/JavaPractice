//海滩上有一堆桃子,五只猴子来分,第一只猴子把这堆桃子平均分为五份,多了一个
//这个猴子把多的一个扔入海中,拿走了一份
//第二只猴子把剩下的桃子又平均分成了五份,又多了一个
//它同样把多的一个扔入海中,拿走了一份
//第三第四第五只猴子都是这样做的
//问海滩上原来最少有多少个桃子?
package Demo40;

public class text40 {
    static int t = 0;  //桃子总数
    int f = 1;   //记录分的次数
    static int h = 5;   // 猴子数量
    int tc = 5000;   //桃子数最大取值
    public int fT(int s){
        if(s == tc){
            //当桃子数到了最大的取值范围时取消递归
            System.out.println("结束!");
            return 0;
        } else{
            if((s - 1) % h == 0 && f <= h){
                if(f == h){
                    System.out.println("桃子数 = " + t + "时满足分桃条件");
                }
                f += 1;
                return fT((s - 1) / 5 * 4);    //返回猴子拿走一份后剩下的总数
            }else{
                //没满足条件
                f = 1;  //分的次数重置1
                return fT(t += 1);
            }
        }
    }

    public static void main(String[] args) {
        new text40().fT(0);
    }
}
