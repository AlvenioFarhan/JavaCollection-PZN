package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Alvenio");
        collection.add("Farhan");
        collection.add("Prayogo");
        collection.addAll(List.of("Programmer", "Zaman", "Now"));

        for (String value : collection){
            System.out.println(value);
        }

        System.out.println("==========Remove==========");

        collection.remove("Alvenio");
        collection.removeAll(List.of("Programmer", "Zaman"));

        for (String value : collection){
            System.out.println(value);
        }

        //Cek data
        System.out.println(collection.contains("Farhan"));

        System.out.println(collection.containsAll(List.of("Prayogo", "Now")));

        System.out.println(collection.size());

    }
}
