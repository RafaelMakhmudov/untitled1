package lesson6;

public class Main3 {
    public static void main(String[] args) {
        // У нас есть путь к картинке
        // Нам нужно проверить это реально ли это картинка или нет

        String pathToImg = "C://hwgjwgfgw//hwd//q.jpeg";
        // this - ссылка на объект pathToImg внутри метода endsWith
        if (pathToImg.endsWith(".jpg") || pathToImg.endsWith(".png")) {
            System.out.println("Это картинка !!!");

        }else{
            System.out.println("Это не картинка!");
        }


    }
}
