package homework;

public class HomeworkTask5 {
    public static void main(String[] args) {
        int month = 0;
        int monthlyPayment = 9500;
        int accumulate=200000;

        for (int money = 0; money < accumulate ; money += monthlyPayment) {
            month++;
        }

        System.out.println("Накопить:" + month / 12 + "год, и " + month % 12 + "месяцев");


    }
}

