package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Alvenio");

        Set<String> mutable = new HashSet<>();
        mutable.add("Alvenio");
        mutable.add("Farhan");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Alvenio", "Farhan");

//        set.add("Prayogo"); //ERROR
//        set.remove("Alvenio"); //ERROR

    }
}
