package programmer.zaman.now.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Joko", "Joko Value");
        map.put("Alvenio", "Alvenio Value");
        map.put("Jihan", "Jihan Value");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
