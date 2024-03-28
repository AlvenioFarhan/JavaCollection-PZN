package programmer.zaman.now.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

//        Set<String> names = new HashSet<>(); // tidak berurut, data double akan di jadikan 1
        Set<String> names = new LinkedHashSet<>(); // data berurut
        names.add("Alvenio");
        names.add("Farhan");
        names.add("Prayogo");
        names.add("Alvenio");
        names.add("Farhan");
        names.add("Prayogo");

        for (String name : names) {
            System.out.println(name);
        }

    }
}
