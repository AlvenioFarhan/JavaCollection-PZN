package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        List<String> strings2 = new LinkedList<>();

        strings.add("Alvenio");
        strings.add("Farhan");
        strings.add("Prayogo");

        strings.set(0, "Budi");

        strings.remove(2);

        System.out.println(strings.get(0));

        for (String value : strings){
            System.out.println(value);
        }
    }
}
