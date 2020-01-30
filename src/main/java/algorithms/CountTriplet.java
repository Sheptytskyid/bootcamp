package algorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class CountTriplet {

    public static void main(String[] args) {
        TreeSet<String> stringSet = new TreeSet<>();
        TreeMap<String, String> stringMap = new TreeMap<>();
    }

    static long countTriplets(List<Long> arr, long r) {
        Map<Long,Long> v2 = new HashMap<>();
        Map<Long,Long> v3 = new HashMap<>();
        Long count = 0L;
        for (Long k : arr) {
            count += v3.get(k) == null ? 0 : v3.get(k);
            if (v2.get(k) != null) {
                v3.merge(k * r, v2.get(k), (old, newv) -> old + v2.get(k));
            }
            v2.merge(k * r, 1L, (old, newv) -> old + 1);
        }
        return count;
    }

    static long countTriplets2(List<Long> arr, long r) {
        Map<Long,Long> v2 = new HashMap<>();
        Map<Long,Long> v3 = new HashMap<>();
        Long count = 0L;
        for (Long k : arr) {
            count += v3.get(k) == null ? 0 : v3.get(k);
            if (v2.get(k) != null) {
                v3.compute(k * r, (key, value) -> value != null ? value + v2.get(k) : v2.get(k));
            }
            v2.compute(k * r, (key, value) -> value == null ? 1 : value + 1);
        }
        return count;
    }

}
