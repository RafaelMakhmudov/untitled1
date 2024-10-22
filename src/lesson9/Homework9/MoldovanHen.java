package lesson9.Homework9;
public class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 25; // Пример: Молдавская курица несет 25 яиц в месяц
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - Молдова. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}