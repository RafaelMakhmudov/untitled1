package lesson9.Homework9;
public class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 27; // Пример: Белорусская курица несет 27 яиц в месяц
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - Беларусь. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

