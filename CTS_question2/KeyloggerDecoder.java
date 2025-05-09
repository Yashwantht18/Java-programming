import java.util.*;

public class KeyloggerDecoder {

    static List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        decode(input, 0, "");
        Collections.sort(result);
        for (String s : result) {
            System.out.println(s);
        }
    }

    static void decode(String input, int index, String current) {
        if (index == input.length()) {
            result.add(current);
            return;
        }

        int oneDigit = input.charAt(index) - '0';
        if (oneDigit >= 1 && oneDigit <= 9) {
            decode(input, index + 1, current + (char) ('a' + oneDigit - 1));
        }

        if (index + 1 < input.length()) {
            int twoDigits = Integer.parseInt(input.substring(index, index + 2));
            if (twoDigits >= 10 && twoDigits <= 26) {
                decode(input, index + 2, current + (char) ('a' + twoDigits - 1));
            }
        }
    }
}