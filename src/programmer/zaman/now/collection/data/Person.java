package programmer.zaman.now.collection.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public void addHobbies(String hobby){
        hobbies.add(hobby);
    }
    //Mutable List --bisa diubah"
//    public List<String> getHobbies(){
//        return hobbies;
//    }

    //immutable List -- tidak bisa diubak"
    public List<String> getHobbies(){
        return Collections.unmodifiableList(hobbies);
    }

    public String getName() {
        return name;
    }
}
