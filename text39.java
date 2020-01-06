//字符串排序
package Demo40;
import java.util.*;

public class text39 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("010102");
        list.add("010101");
        list.add("010103");
        Collections.sort(list);
        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
