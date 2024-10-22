//package lesson16StreamApi;
//
//import lesson13.Coin;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        Coin coin1 = new Coin(50, 1999, "Serebro", 2.5);
//        Coin coin2 = new Coin(10, 1989, "Serebro", 2.5);
//        Coin coin3 = new Coin(40, 1994, "Serebro", 2);
//        Coin coin4 = new Coin(450, 1997, "Platinum", 20);
//        Coin coin5 = new Coin(1, 1984, "Gold", 0.2);
//        Coin coin6 = new Coin(4, 2000, "Cuper", 2.5);
//
//        List<Coin> coinsList = new ArrayList<>();
//        coinsList.add(coin1);
//        coinsList.add(coin2);
//        coinsList.add(coin3);
//        coinsList.add(coin4);
//        coinsList.add(coin5);
//        coinsList.add(coin6);
//
//        // printMapExample(coinsList);
//        //printFilterExample(coinsList);
//        printDistinctAndSortExample(coinsList);
//    }
//
//    private static void printDistinctAndSortExample(List<Coin> coinsList) {
//        List<Coin> coins =coinsList
//                .stream()
//                .distinct()
//                .sorted(new Comparator<Coin>() {
//            @Override
//            public int compare(Coin o1, Coin o2) {
//                return o1.compareTo(o2);
//            }
//        })
//                .toList();
//        for (Coin coin : coins) {
//            System.out.println(coin);
//        }
//
//    }
//
//    private static void printFilterExample(List<Coin> coins) {
//        coins
//                .stream()
//                .filter(coin -> coin.getYear() > 2000)
//                .filter(coin -> coin.getMetalName().equals("Serebro"))
//                .peek(coin -> System.out.println(coin))
//                .toList();
////    }
////
////    private static void printMapExample(List<Coin> coins) {
////        coins
////                .stream()
////                .peek(coin -> System.out.println(coin))
////                .map(coin -> {
////        }
////    })
////
////}
////
////private static String translateInRussian(String metalName) {
////    if (metalName.equals("Silver")) {
////        return "Серебро";
////    }
////    return null;
////}
