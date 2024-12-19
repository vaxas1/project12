package exception;

import java.util.Scanner;

public class task7 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите ключ: ");
                String key = myScanner.nextLine();
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Попробуйте снова.");
            }
        }
        myScanner.close();
    }

    public void printDetails(String key) throws Exception {
        if (key.isEmpty()) {
            throw new Exception("Ключ установлен как пустая строка");
        }
        System.out.println("Данные для " + key);
    }

    public static void main(String[] args) {
        task7 demo = new task7();
        demo.getKey();
    }
}
