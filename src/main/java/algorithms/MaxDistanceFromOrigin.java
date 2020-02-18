package algorithms;

public class MaxDistanceFromOrigin {

    public static void main(String[] args) {
        String str1 = null;
        String str2 = "";
        String str3 = "?";
        String str4 = "A";
        String str5 = "AAAA?C";
        String str6 = "AAAACCCC";
        String str7 = "AAAA?CCCCCCCC";
        String str8 = "AAAA?CCCCCCCC?";
        System.out.println(maxDistance(str1, 0, 0, 0, 'U'));
        System.out.println(maxDistance(str2, 0, 0, 0, 'U'));
        System.out.println(maxDistance(str3, 0, 0, 0, 'U'));
        System.out.println(maxDistance(str4, 0, 0, 0, 'U'));
        System.out.println(maxDistance(str5, 0, 0, 0, 'U'));
        System.out.println(maxDistance(str6, 0, 0, 0, 'U'));
        System.out.println(maxDistance(str7, 0, 0, 0, 'U'));
        System.out.println(maxDistance(str8, 0, 0, 0, 'U'));
    }

    static int maxDistance(String instructions, int index, int maxDistance, int curDistance, char curDirection) {
        if (instructions == null || index >= instructions.length()) { //String is null, empty or we've reached the end
            return maxDistance;
        }
        if (instructions.charAt(index) == '?') {
            return Math.max(
                    maxDistance(instructions.replaceFirst("[?]", "A"), index, maxDistance, curDistance, curDirection),
                    maxDistance(instructions.replaceFirst("[?]", "C"), index, maxDistance, curDistance, curDirection)
            );
        }
        if (instructions.charAt(index) == curDirection || curDirection == 'U') { //Moving away from the origin
            curDistance++;
            curDirection = instructions.charAt(index);
        } else { // moving towards the origin
            curDistance--;
            if (curDistance == 0) { //have we reached the origin in the current step?
                curDirection = 'U';
            }
        }
        maxDistance = Math.max(curDistance, maxDistance);
        return maxDistance(instructions, ++index, maxDistance, curDistance, curDirection);
    }
}
