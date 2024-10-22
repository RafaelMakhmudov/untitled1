package lesson10and11blackjack.homework11;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    public double getScholarship() {
        if (averageMark == 5) {
            return 2000;
        } else {
            return 1900;
        }
    }
    @Override
    public String toString() {
        return "Студент: " + firstName + " " + lastName + ", группа: " + group + ", средняя оценка: " + averageMark;
    }

}
