import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task6 {
    public static void countSameSymb(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                Integer integer = hashMap.get(c);
                integer++;
                hashMap.put(c, integer);
            }
        }
        System.out.println(
                hashMap.entrySet()
                        .stream()
                        .filter((Map.Entry<Character, Integer> item) -> {
                            return item.getValue() > 1;
                        }).collect(Collectors.toList())

        );
    }
}