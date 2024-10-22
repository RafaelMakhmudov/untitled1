package lesson10and11blackjack.homework11;

// Главный класс для тестирования
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("Иван", "Иванов", "A1", 4.5);
        students[1] = new Student("Петр", "Петров", "A2", 5.0);
        students[2] = new Aspirant("Анастасия", "Сидорова", "A3", 4.8, "Научная работа 1");
        students[3] = new Aspirant("Дмитрий", "Кузнецов", "A4", 5.0, "Научная работа 2");
        students[4] = new Student("Елена", "Лебедева", "A5", 3.9);

        for (Student student : students) {
            System.out.println(student);
            System.out.println("Стипендия: " + student.getScholarship() + " руб");
        }
    }
}
