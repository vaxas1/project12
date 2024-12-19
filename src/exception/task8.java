package exception;

import java.util.Scanner;

public class task8 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите ключ: ");
                String key = myScanner.nextLine();
                if (key.isEmpty()) {
                    throw new Exception("Ключ установлен как пустая строка");
                }
                System.out.println("Данные для " + key);
                break;
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Попробуйте снова.");
            }
        }
        myScanner.close();
    }

    public static void main(String[] args) {
        task8 demo = new task8();
        demo.getKey();
    }
}

