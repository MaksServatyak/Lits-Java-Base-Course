package Homework16;

import java.util.Map;
import java.util.TreeMap;

public final class MapUtils {

    public static TreeMap<String, String> change(TreeMap<String,String> map){
        var map2=new TreeMap<String,String>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();

            map2.put(v,k);
        }
        System.out.println(map2);
        return map2;
    }

}
