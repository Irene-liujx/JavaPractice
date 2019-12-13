package B11_30_DS;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        map.put("作者","ljx");
        map.put("标题","哈哈哈");
        map.put("发表时间","2029");
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("标题"));
        System.out.println(map.containsValue("啊啊啊"));
        System.out.println("**********************");
        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
        System.out.println("**********************");
        map.put("发表时间","2039");    //修改
        map.put("出版社","大V出版社");    //插入
        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
        System.out.println("**********************");
        System.out.println(map.get("作者"));
        System.out.println(map.getOrDefault("编辑","fff"));
        map.remove("出版社");
        System.out.println(map.remove("出版社","大V出版社"));   //判断是否有这个值
        System.out.println(map.remove("作者","ljx"));
        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }
}
