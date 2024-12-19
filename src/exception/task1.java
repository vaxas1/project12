package exception;

public class task1 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Попытка деления на ноль");
        }
    }

    public static void main(String[] args) {
        task1 example = new task1();
        example.exceptionDemo();
    }
}
