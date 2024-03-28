package programmer.zaman.now.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {

        //di buat sesuai urutan data masukannya
        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "Alvenio");
        map.put("last", "Prayogo");
        map.put("middle", "Farhan");

        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(key);
        }

    }
}
