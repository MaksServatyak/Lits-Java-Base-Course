package Homework16;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //StringUtils.numberChars("AAaaffdgD");
        var map=new TreeMap<String,String>();
        map.put("key","value");
        System.out.println(map);
        MapUtils.change(map);
    }
}
