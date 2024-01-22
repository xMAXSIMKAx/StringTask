package StringsTask;

public class StringsView {
    static void printWordsInColumn(String[] words) {
        for (int i = 0; i < words.length; i++) {
            System.out.println((i + 1) + ") " + words[i]);
        }
    }

    static void printSearchResult(String searchName, int count) {
        if (count > 0) {
            System.out.println("Ім'я \"" + searchName + "\" знайдено у списку " + count + " раз(ів).");
        } else {
            System.out.println("Ім'я \"" + searchName + "\" не знайдено у списку.");
        }
    }
}
