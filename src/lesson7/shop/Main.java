package lesson7.shop;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setLevel(5);
        user.setUsername("Пришелец");
        user.setPathToImage("C://vkdb// dfd.jpg");

        Otziv otziv = new Otziv();
        otziv.setUser(user);
        otziv.setReiting(4);
        otziv.setDostoinstva("Очень тихий");
        otziv.setNedostatki("Цена не очень");
        otziv.setNedostatki("В целом, мне понравился товар");

        System.out.println(otziv);

    }
}
