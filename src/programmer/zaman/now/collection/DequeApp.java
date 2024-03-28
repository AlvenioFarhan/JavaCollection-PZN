package programmer.zaman.now.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>();

        //offerFirst = memasukkan data dari depan
        //offerLast = memasukkan data dari belakang
        stack.offerLast("Alvenio");
        stack.offerLast("Farhan");
        stack.offerLast("Prayogo");

//        for (String value : deque){
//            System.out.println(value);
//        }

        //pollLast = mengambil data dari belakang
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Alvenio");
        queue.offerLast("Farhan");
        queue.offerLast("Prayogo");

        //pollFirst = mengambil data dari depan
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

    }
}
