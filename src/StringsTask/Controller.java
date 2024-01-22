package StringsTask;

import java.util.Scanner;

public class Controller {
    public void handleTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть завдання (1, 2, 3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            case 3:
                task3();
                break;
            default:
                System.out.println("Неправильний вибір.");
        }
    }

    private void task1() {
        String[] words = {"brange", "plum", "tomato", "onibn", "grape"};
        Model stringsModel = null;
        words = stringsModel.fixWords(words);
        StringsView.printWordsInColumn(words);
    }

    private void task2() {
        String[] words = {"orange", "plum", "tomato", "onion", "grape", "onion"};
        Model stringsModel = null;
        words = stringsModel.removeOnion(words);
        StringsView.printWordsInColumn(words);
    }

    private void task3() {
        String[] names = {"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};
        String searchName = StringsInputView.getInputName();
        Model stringsModel = null;
        int count = stringsModel.countOccurrences(names, searchName);
        StringsView.printSearchResult(searchName, count);
    }
}
