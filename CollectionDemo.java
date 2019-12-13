package B11_30_DS;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        System.out.println(list.size());  //0
        System.out.println(list.isEmpty());  //true
        list.add("ljx");
        list.add("jx");
        System.out.println(list.size());  //2
        System.out.println(list.isEmpty());   //false
       list.add("x");
       Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
        for(String s : list){
            System.out.println(s);
        }
        list.remove("jx");
        System.out.println(list.size());     //2
        System.out.println(list.isEmpty());   //false
        list.clear();
        System.out.println(list.size());    //0
        System.out.println(list.isEmpty());    //true
    }
}
