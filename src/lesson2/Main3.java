package lesson2;

public class Main3 {
    public static void main(String[] args) {
        // У нас есть некая оценка ученика(1 2 3 4 5 )
        // напечатать на консоль наш ответ как родителя
        int mark = 9;
        switch (mark) {
            case 1:
                System.out.println("Плохо иди учись!");
                break;
            case 2:
                System.out.println("Ничего страшного, в следующий раз получится!");
                break;
            case 3:
                System.out.println("Нормально!");
                break;
            case 4:
                System.out.println("Хорошо!");
                break;
            case 5:
                System.out.println("Отлично!");
                break;
            default:
                System.out.println("Это что за оценка??");
        }
    }


}
