package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Eko", "Eko");
        map.put("Budi", "Budi");
        map.put("Joko", "Joko");

        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("==========");

        System.out.println(map.lowerKey("Eko"));
        System.out.println(map.higherKey("Eko"));
        System.out.println("==========");

        System.out.println(map.floorKey("Eko"));
        System.out.println(map.ceilingKey("Eko"));
        System.out.println("==========");

        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (String key : mapDesc.keySet()) {
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

//        immutable.put("Siti", "Siti"); // Error

    }
}