package lesson1;

public class Homework1 {
    public static void main(String[] args) {
        int money = 1000;
        int priceOfSnickers = 35;
        int amountOfSnickers = money / priceOfSnickers;
        System.out.println(amountOfSnickers);


        int remainder = money - priceOfSnickers * amountOfSnickers;
        double priceOfCandies = 3.5;
        double change = remainder % priceOfCandies;
        double withoutChange = remainder - change;

        double amountOfCandies = withoutChange / priceOfCandies;
        System.out.println(amountOfCandies);

        System.out.println(change);


    }
}