public class Main {
    public static void main(String[] args) {
        float balance = 100.8F;
        float addCash = 5050.23F;
        int cashBack;

        if (addCash >= 1000) {
            cashBack = (int) (addCash / 100);
            balance = addCash + balance + cashBack;
        }
        else {
            balance = addCash + balance;
            cashBack = 0;
        }

        System.out.println("Ваш баланс: " + balance + " руб.");
        System.out.println("Начислено бонусов: " + cashBack + " руб.");
    }
}
