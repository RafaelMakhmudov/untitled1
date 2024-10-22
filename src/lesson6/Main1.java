package lesson6;

public class Main1 {
    public static void main(String[] args) {
        // Есть текст(задаем его сами)
        // напечатать на консоль через символ

        String text = " Я учусь на разработчика java";
        char[] simbols = text.toCharArray(); // ['Я','','y']
        for (int i = 0; i < simbols.length; i=i+2) {
            System.out.println(simbols[i]);
        }
    }
}
