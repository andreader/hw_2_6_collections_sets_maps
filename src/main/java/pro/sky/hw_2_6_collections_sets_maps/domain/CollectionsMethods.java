package pro.sky.hw_2_6_collections_sets_maps.domain;

import java.util.*;

public class CollectionsMethods {
    public static void printOddNumbersList(List<Integer> nums) {
        if (nums.size() == 0) {
            System.out.println("добавьте числа!");
        }
        for (Integer number : nums) {
            if (number % 2 != 0) { // проверка на нечетность
                System.out.print(number);
            }
        }
        System.out.println();
    }

    public static void printEvenNumbersList(List<Integer> nums) {
        if (nums.size() == 0) {
            System.out.println("добавьте числа!");
        }
        Set<Integer> numsTreeSet = new TreeSet<>(nums);
        for (Integer number : numsTreeSet) {
            if (number % 2 == 0) { // проверка на четность
                System.out.print(number);
            }
        }
        System.out.println();
    }

    public static void printUniqueWordList(List<String> words) {
        Set<String> wordsHashSet = new HashSet<>(words);
        for (String word : wordsHashSet) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    private static Map<String, Integer> countKeysDuplicates(List<String> strings) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String string : strings) {
            if (wordCountMap.containsKey(string)) {
                wordCountMap.put(string, wordCountMap.get(string) + 1);
            } else {
                wordCountMap.put(string, 1);
            }
        }

        return wordCountMap;
    }

    public static void countDuplicates(List<String> strings) {
        Map<String, Integer> wordCountMap = countKeysDuplicates(strings);

        for (String word : wordCountMap.keySet()) {
            int count = wordCountMap.get(word);
            System.out.println(word + ": " + count);
        }
    }
}
