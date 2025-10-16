public class Main {
    public static void main(String[] args) {

        int initialBalance = 500;
        int replenishmentAmount = 1200;
        int bonusStep = 100;
        int bonusAmount;

        if (replenishmentAmount > 1_100) {
            bonusAmount = replenishmentAmount / bonusStep;
        } else {
            bonusAmount = 0;
        }

        int finalBalance = initialBalance + replenishmentAmount + bonusAmount;

        System.out.println("Бонусные рубли: " + bonusAmount + " рублей");
        System.out.println("Итоговый счёт: " + finalBalance + " рублей");
    }
}