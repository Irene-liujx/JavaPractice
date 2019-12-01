package B11_30_DS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("ljx");
        list1.add("fff");
        list1.add("ddd");
        list1.add("ccc");
        System.out.println(list1);
        System.out.println(list1.get(1));
        list1.set(1,"hhh");
        System.out.println(list1);
        List<String> sublist1 = list1.subList(1,3);

        System.out.println(sublist1);
        List<String> list2 = new ArrayList<>(list1);
        System.out.println(list2);
        List<String> list3 = new LinkedList<>(list1);
        System.out.println(list3);
    }
}
