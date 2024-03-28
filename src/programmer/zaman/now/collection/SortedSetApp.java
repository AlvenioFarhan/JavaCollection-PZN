package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;
import programmer.zaman.now.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

        SortedSet<Person> personSortedSet = new TreeSet<>(new PersonComparator());

        personSortedSet.add(new Person("Alvenio"));
        personSortedSet.add(new Person("Eko"));
        personSortedSet.add(new Person("Zidan"));
        personSortedSet.add(new Person("Koko"));

        for (Person person : personSortedSet){
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(personSortedSet);
//        sortedSet.add(new Person("Kurniawan")); //Error


    }
}
