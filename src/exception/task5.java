package exception;

public class task5 {
    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("ключ null в getDetails");
        }
        System.out.println("Данные для ключа: " + key);
    }

    public static void main(String[] args) {
        task5 demo = new task5();
        try {
            demo.getDetails(null);
        } catch (NullPointerException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }
    }
}
