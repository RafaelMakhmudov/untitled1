package lesson9.Homework9;

public class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 30; // Пример: Русская курица несет 30 яиц в месяц
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - Россия. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
