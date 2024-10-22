package lesson9.Homework9;
public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 28; // Пример: Украинская курица несет 28 яиц в месяц
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - Украина. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}