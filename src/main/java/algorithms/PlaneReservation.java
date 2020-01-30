package algorithms;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class PlaneReservation {

    public static void main(String[] args) {
        System.out.println(solution(2, "2A"));
    }

    static int solution(int num, String str) {
        int availableFamilies = 3 * num;
        if (str.isEmpty()) {
            return availableFamilies;
        }
        String[] reservationsString = str.split(" ");
        Map<Integer, Set<String>> reservations = Arrays.stream(reservationsString)
                .collect(Collectors.groupingBy(r -> Character.digit(r.charAt(0), 10), Collectors.toSet()));
        while (num > 0) {
            Set<String> reservationsRow = reservations.get(num);
            if (reservationsRow != null) {
                if (reservationsRow.contains(num + "A") || reservationsRow.contains(num + "B")
                        || reservationsRow.contains(num + "C")) {
                    availableFamilies -= 1;
                }
                if (reservationsRow.contains(num + "E") || reservationsRow.contains(num + "F")
                        || (reservationsRow.contains(num + "D") && reservationsRow.contains(num + "G"))) {
                    availableFamilies -= 1;
                }
                if (reservationsRow.contains(num + "H") || reservationsRow.contains(num + "J")
                        || reservationsRow.contains(num + "K")) {
                    availableFamilies -= 1;
                }
            }
            num--;
        }
        return availableFamilies;
    }
}
