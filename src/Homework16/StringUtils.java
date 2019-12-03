package Homework16;

import java.util.Map;
import java.util.TreeMap;

public final class StringUtils {
    private StringUtils() {
    }


    public static void numberChars(String text) {

        if (text != null) {
            var treeMap = new TreeMap<String, Integer>();
            char[] chars = text.toUpperCase().toCharArray();

            for (char aChar : chars) {
                String key = String.valueOf(aChar);
                if (treeMap.containsKey(key)) {
                    treeMap.put(key, treeMap.get(key) + 1);
                } else {
                    treeMap.put(key, 1);
                }
            }

            for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
                System.out.println("Char : " + entry.getKey() + " Count : " + entry.getValue());
            }

        } else {
            System.out.println("Text cannot be null");
        }
    }
}



