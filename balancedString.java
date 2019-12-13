package B12_05;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int balancedStringSplit(String s) {
        int count = 0;
        List<Character> list = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(list.isEmpty()){
                list.add(c);
            }else if(c == list.get(list.size()-1)){
                list.add(c);
            }else{
                list.remove(list.size()-1);
                if(list.isEmpty()){
                    count++;
                }
            }
        }
        return count;
    }
}

public class balancedString {
    public static void main(String[] args) {
      int i1 =Solution.balancedStringSplit("rrrlll");
      int i2 = Solution.balancedStringSplit("rlrrllrl");
        System.out.println(i1);
        System.out.println(i2);
    }
}
