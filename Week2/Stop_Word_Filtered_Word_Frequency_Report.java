import java.util.*;

public class Stop_Word_Filtered_Word_Frequency_Report {

    static void printFilteredWordFrequency(String feedback) {
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};

        String cleaned = feedback.toLowerCase()
                .replace(".", "")
                .replace(",", "");

        String[] words = cleaned.split("\\s+");
        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            boolean stop = false;

            for (String stopWord : stopWords) {
                if (word.equals(stopWord)) {
                    stop = true;
                    break;
                }
            }

            if (!stop && !word.isEmpty())
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> entries =
                new ArrayList<>(frequency.entrySet());

        entries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<String, Integer> entry : entries)
            System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    public static void main(String[] args) {
        printFilteredWordFrequency(
                "The mentor was great, the session was great and clear.");
    }
}
