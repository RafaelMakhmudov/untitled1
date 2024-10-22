package lesson6;

public class Main4 {
    public static void main(String[] args) {
        // У нас есть email
        // Нужно проверить:
        // 1) Должна содержаться @ , только одна
        // 2) email не должен начинаться или заканчиваться на  .
        // 3)часть после собачки должна содержать обязательно .

        String email = "alex.gwerty@mail.com";

        // contains - проверка содержания
        // split - "разрезать  текст по...------> String[]
       String[] partsOfEmail = email.split("@");
       if (partsOfEmail.length !=2) {
           System.out.println(" В email нет собачек, или их больше чем 2");
           return;
       }

        if (email.endsWith(".") || email.startsWith(".")) {
            System.out.println("email не может начинаться, или заканчиваться на точку");
            return;

        }
        if (!partsOfEmail[1].contains(".")){

            System.out.println("Часть после @ не содержит точку!!!");

        }else{
            System.out.println("Email нам полностью подходит");


       }
    }
}