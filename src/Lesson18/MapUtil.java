package Lesson18;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapUtil {
    private MapUtil(){

    }
    public static void swapPlacesKeysAndValues(){
        List<Cars> list = Arrays.asList(new Cars("Toyota ","red"),
                new Cars("Mersedes, ","grey"));
        Map<String, String> map = list.stream().peek(p ->
                System.out.println("Mark: " + p.mark + " Color " +
                        p.color)).collect(Collectors.toMap(p -> p.mark, p -> p.color));
        map.entrySet().stream().forEach(p -> System.out.println("Key: " + p.getKey() + "\nValue: " + p.getValue()));
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
