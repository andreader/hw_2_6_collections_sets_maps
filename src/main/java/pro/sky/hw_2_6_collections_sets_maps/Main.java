package pro.sky.hw_2_6_collections_sets_maps;

import pro.sky.hw_2_6_collections_sets_maps.domain.CollectionsMethods;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(4, 5, 5, 6, 1, 1, 2, 3, 4, 7));
        List<String> words = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        CollectionsMethods.printOddNumbersList(nums);
        CollectionsMethods.printEvenNumbersList(nums);
        CollectionsMethods.printUniqueWordList(words);
        CollectionsMethods.countDuplicates(words);
    }
}
