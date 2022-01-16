package day05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringStatistics {

    private Map<Character, Integer> statistics = new HashMap<>();

    public void generateStatistics(String string) {

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (statistics.get(c) == null){
                statistics.put(c, 1);
            } else {
                statistics.put(c, statistics.get(c)+1);
            }
        }
    }

    public int numberOfDifferentLetters (String string){
        Set<Character> result = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            result.add(string.charAt(i));
        }
        return result.size();
    }

    public Map<Character, Integer> getStatistics() {
        return new HashMap<>(statistics);
    }
}
