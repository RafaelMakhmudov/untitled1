package lesson1;

public class Pa {

    public static void main(String[] args) {
        int shirinaRoom = 250;
        int dlinnaRoom = 400;
        int shirinaTable = 40;
        int dlinnaTable = 50;

        int ploshadRoom = shirinaRoom * dlinnaRoom;
        int ploshadTable = shirinaTable * dlinnaTable;
        // считаем сколько столов влезет

        int countTeblestToIsertRoom = ploshadRoom/ploshadTable;

        System.out.println(countTeblestToIsertRoom);



    }

}