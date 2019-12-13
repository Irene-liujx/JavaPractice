//求1000以内的完数:一个数恰好等于他的因子之和 6 = 1+2+3
public class text9 {
    public static void main(String[] args) {
        int s;
        for(int i = 1;i < 1000;i++) {
            s = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    s += j;
                }
            }
            if (s == i) {
                System.out.println(i + "");
            }
        }
        System.out.println ( );
    }
}
