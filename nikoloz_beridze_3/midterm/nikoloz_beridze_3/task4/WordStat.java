package midterm.nikoloz_beridze_3.task4;

import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        // Create a set of unique words
        Set<String> uniqueWords = new HashSet<>(fantasyFormatData);

        // Print the set of unique words
        System.out.println("Set of unique words:");
        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }
        System.out.println();

        // Create a map with word lengths as keys and counts as values
        Map<Integer, Integer> wordLengthMap = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            wordLengthMap.put(length, wordLengthMap.getOrDefault(length, 0) + 1);
        }

        // Print the map of word lengths and counts
        System.out.println("\nMap of word lengths and counts:");
        for (Map.Entry<Integer, Integer> entry : wordLengthMap.entrySet()) {
            System.out.println("Length: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        // Write the output to the "task4.txt" file
        try (FileWriter writer = new FileWriter("task4.txt")) {
            writer.write("Set of unique words:\n");
            for (String word : uniqueWords) {
                writer.write(word + " ");
            }
            writer.write("\n\n");
            writer.write("Map of word lengths and counts:\n");
            for (Map.Entry<Integer, Integer> entry : wordLengthMap.entrySet()) {
                writer.write("Length: " + entry.getKey() + ", Count: " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}