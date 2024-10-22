package lesson4;

public class Main4 {
    public static void main(String[] args) {
//         задача по объединению двух массивов
        char[] abcd = {'a', 'b', 'c', 'd',};
        char[] gwer = {'g', 'w', 'e', 'r',};
        char[] abcdgwer = new char[abcd.length + gwer.length];

//        abcdgwer[0] = abcd[0]; // переложили a
//        abcdgwer[1] = abcd[1]; // переложили b
//        abcdgwer[2] = gwer[2]; // переложили c
//        abcdgwer[3] = gwer[3]; // переложили d
//
//        abcdgwer[4] = gwer[0]; // i - 4 = 0
//        abcdgwer[5] = gwer[1]; // i - 4 = 1
//        abcdgwer[6] = gwer[2]; // i - 4 = 2
//        abcdgwer[7] = gwer[3]; // i - 4 = 3

        for (int i = 0; i < abcdgwer.length; i++) {
            if (i< abcd.length){ // перекладываем с первого массива
                abcdgwer[i] = abcd[i];

            }else { // перекладываем со второго массива
                abcdgwer[i] = gwer[i - abcd.length];


            }
            System.out.println(abcdgwer[i]);
        }



    }


}
