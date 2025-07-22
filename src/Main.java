public class Main {
    public static void main(String[] args) {

        int remains = 200;// начальный счета
        int accrual = 1750; // суммы пополнения
        int balance = remains + accrual;

        int bonus;
        if (balance > 1000) {
            bonus = balance / 100; // расчет бонусных рублей
        } else {
            bonus = 0;
        }
        System.out.println("Бонусных рублей: " + bonus);
        System.out.println("Итоговый счет: " + balance + " рублей");
    }
}
