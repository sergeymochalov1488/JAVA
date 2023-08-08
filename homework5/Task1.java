package homework5;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String income = "Россия идет вперед всей планеты. Планета — это не Россия.";
        Map<String, Integer> word = parseStringToHashMap(income);
        for (Map.Entry<String, Integer> sample : word.entrySet()) {
            System.out.printf("Слово  '%s' встерчается - %d раз(а) \n", sample.getKey(), sample.getValue());
        }
    }

    /**
     * @param income входящая строка
     * @return
     * @apiNote запись строки по словам в HashMap
     */
    private static Map<String, Integer> parseStringToHashMap(String income) {
        String[] words = income.toLowerCase().split("\\PL+");
        Map<String, Integer> word = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            word.putIfAbsent(words[i], 0);
            word.put(words[i], word.get(words[i]) + 1);
        }
        return word;
    }
}