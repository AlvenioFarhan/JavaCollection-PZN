package programmer.zaman.now.collection;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapApp {
    public static void main(String[] args) {

        //Data bisa terhapus, lebih baik untuk penyimpanan sementara
        Map<Integer, Integer> map = new WeakHashMap<>();

        for (int index = 0; index < 1_000_000; index++) {
            map.put(index, index);
        }

        System.gc();

        System.out.println(map.size());

    }
}
