package lesson10and11blackjack.homework11;
// Класс Aspirant, который наследует класс Student
class Aspirant extends Student {
    private String researchWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String researchWork) {
        super(firstName, lastName, group, averageMark);
        this.researchWork = researchWork;
    }

    // Переопределение метода getScholarship
    @Override
    public double getScholarship() {
        if (super.averageMark == 5) {
            return 2500;
        } else {
            return 2200;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", научная работа: " + researchWork;
    }
}