import java.util.HashMap;
import java.util.Map;

public class Main {
    static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                if (!map.containsKey(Character.toLowerCase(text.charAt(i)))) {
                    map.put(Character.toLowerCase(text.charAt(i)), 1);
                } else {
                    int value = map.get(Character.toLowerCase(text.charAt(i))) + 1;
                    map.put(Character.toLowerCase(text.charAt(i)), value);
                }
            }
        }
        int max = -1;
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> item : map.entrySet()) {
            if (item.getValue() > max) {
                max = item.getValue();
            } else if (item.getValue() < min) {
                min = item.getValue();
            }
        }
        System.out.println(map.entrySet());
        for (Map.Entry<Character, Integer> item : map.entrySet()) {
            if (item.getValue() == max || item.getValue() == min) {
                System.out.println(item);
            }
        }
    }
}