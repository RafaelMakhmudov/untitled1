package lesson9.Homework9;

public class HenFactoru {
    public Hen getHen(String country) {
        switch (country.toLowerCase()) {
            case "россия":
                return new RussianHen();
            case "украина":
                return new UkrainianHen();
            case "молдова":
                return new MoldovanHen();
            case "беларусь":
                return new BelarusianHen();
            default:
                return null;
        }
    }
}
