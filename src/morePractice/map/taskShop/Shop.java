package morePractice.map.taskShop;

import java.util.HashMap;
import java.util.Map;

public class Shop {
    public static void main(String[] args) {
        HashMap<String, Integer> sales1 = new HashMap<>();
        sales1.put("Товар A", 10);
        sales1.put("Товар B", 5);
        sales1.put("Товар C", 8);

        HashMap<String, Integer> sales2 = new HashMap<>();
        sales2.put("Товар B", 3);
        sales2.put("Товар D", 7);
        sales2.put("Товар E", 2);

        HashMap<String, Integer> mergedMap = merge(sales1, sales2);

        for (Map.Entry<String, Integer> entry : mergedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static HashMap<String, Integer> merge(HashMap<String, Integer> sales1, HashMap<String, Integer> sales2) {
        HashMap<String, Integer> mergedMap = new HashMap<>(sales1);

        for (Map.Entry<String, Integer> entry : sales2.entrySet()) {
            String product = entry.getKey();
            Integer quantity = entry.getValue();

            if (mergedMap.containsKey(product)) {
                mergedMap.put(product, mergedMap.get(product) + quantity);
            } else {
                mergedMap.put(product, quantity);
            }
        }
        return mergedMap;
    }
}