package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("Eko");

        person.addHobbies("Game");
        person.addHobbies("Coding");

        doSomethingWithHobbies(person.getHobbies());

        for (String hobby : person.getHobbies()){
            System.out.println(hobby);
        }

    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        hobbies.add("Bukan Hobby");
    }
}