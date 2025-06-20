import java.io.FilterOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();

        fruitPrices.put("사과", 17980);
        fruitPrices.put("배", 10320);
        fruitPrices.put("수박", 15920);
        fruitPrices.put("멜론", 10630);

        System.out.println(fruitPrices.containsKey("사과"));
        System.out.println(fruitPrices.containsKey("포도"));
        System.out.println(fruitPrices.containsValue(17980));
        System.out.println(fruitPrices.containsValue(9999));
        System.out.println(fruitPrices.getOrDefault("사과", 500));
        System.out.println(fruitPrices.getOrDefault("포도", 500));

        fruitPrices.replace("사과", 10000);
        fruitPrices.remove("멜론");

        for(Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }

        for(String key: fruitPrices.keySet()) {
            System.out.println(key);
        }
    }
}