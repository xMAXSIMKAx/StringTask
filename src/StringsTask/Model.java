package StringsTask;

public class Model {

    static String[] fixWords(String[] words) {
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replace("brange", "orange").replace("onibn", "onion");
        }
        return words;
    }

    static String[] removeOnion(String[] words) {
        int countOnion = 0;
        for (int i = 0; i < words.length; i++) {
            if ("onion".equals(words[i])) {
                countOnion++;
                words[i] = null;
            }
        }

        if (countOnion > 0) {
            String[] result = new String[words.length - countOnion];
            int j = 0;
            for (String word : words) {
                if (word != null) {
                    result[j++] = word;
                }
            }
            return result;
        } else {
            return words;
        }
    }

    static int countOccurrences(String[] names, String searchName) {
        int count = 0;
        for (String name : names) {
            if (searchName.equals(name)) {
                count++;
            }
        }
        return count;
    }
}

