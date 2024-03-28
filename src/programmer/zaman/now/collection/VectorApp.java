package programmer.zaman.now.collection;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {

        List<String> list = new Vector<>();

        list.add("Alvenio");
        list.add("Farhan");
        list.add("Prayogo");

        for (String value : list) {
            System.out.println(value);
        }
    }
}
