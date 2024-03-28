package programmer.zaman.now.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {

//        Queue<String> queue = new ArrayDeque<>();
//        Queue<String> queue = new PriorityQueue<>(); //Berurut
        Queue<String> queue = new LinkedList<>();


//        for (int index = 0; index < 10; index++) {
//            queue.add(String.valueOf(index));
//        }

        queue.add("Alvenio");
        queue.add("Farhan");
        queue.add("Prayogo");

        //poll untuk mengambil lalu menghapus data
        for (String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }

        System.out.println(queue.size());


    }
}
