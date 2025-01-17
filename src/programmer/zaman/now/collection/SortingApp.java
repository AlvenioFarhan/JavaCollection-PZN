package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(List.of("Alvenio", "Farhan", "Prayogo", "Programmer", "Zaman", "Now"));

        Collections.sort(list);

        for (String value : list) {
            System.out.println(value);
        }
        System.out.println("=====================");

        Comparator<String> reverse = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(list, reverse);

        for (String value : list) {
            System.out.println(value);
        }


    }
}
