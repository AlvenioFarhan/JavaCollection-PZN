package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Alvenio", "Farhan", "Prayogo", "Programmer", "Zaman", "Now"));

        NavigableSet<String> nameReserve = names.descendingSet(); // dari abjad terakhir atau desending
        NavigableSet<String> farhan = names.headSet("Farhan", true); //Dari data awal hingga yg dipilih
        NavigableSet<String> farhan2 = names.tailSet("Farhan", true); //Dari data terpilih hingga belakang

        for (String name : names) {
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        immutable.add("Ups Error");

    }
}
