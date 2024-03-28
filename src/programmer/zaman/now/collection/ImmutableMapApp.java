package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {

        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "Alvenio");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("nama", "Alvenio");

        Map<String, String> immutable = Collections.unmodifiableMap(mutable);
//        immutable.put("a","A"); //Error

        Map<String, String> map = Map.of(
                "first", "Alvenio",
                "middle", "Farhan",
                "last", "Prayogo"
        );
//        map.put("a","A"); //Error
    }
}
