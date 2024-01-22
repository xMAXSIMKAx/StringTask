package StringsTask;

import java.util.Scanner;

public class StringsInputView {
    static String[] getInputWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть слова через кому: ");
        String input = scanner.nextLine();
        return input.split(", ");
    }

    static String getInputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ім'я для пошуку: ");
        return scanner.nextLine();
    }
}
