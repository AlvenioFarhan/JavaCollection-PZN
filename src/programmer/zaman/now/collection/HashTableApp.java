package programmer.zaman.now.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {

        Map<String, String> map = new Hashtable<>();

        map.put("Alvenio", "Alvenio");
        map.put("Joko", "Joko");
        map.put("Budi", "Budi");

        for (String key : map.keySet()) {
            System.out.println(key);
        }

    }
}
