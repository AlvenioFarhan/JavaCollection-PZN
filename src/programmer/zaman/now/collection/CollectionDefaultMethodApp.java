package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CollectionDefaultMethodApp {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int index = 1; index <= 100; index++) {
            numbers.add(index);
        }

        System.out.println(numbers);

        numbers.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 10;
            }
        });

        System.out.println(numbers);


        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        numbers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 500;
            }
        });

        System.out.println(numbers);

    }
}
