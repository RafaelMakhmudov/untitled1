package lesson13;
// Это вариант внешнего сравнвателя.
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest {
    public static void main(String[] args) {
        Coin coin1 = new Coin(50, 1999, "Serebro", 2.5);
        Coin coin2 = new Coin(10, 1989, "Gold", 2.5);
        Coin coin3 = new Coin(40, 1994, "Serebro", 2);
        Coin coin4 = new Coin(450, 1997, "Platinum", 20);
        Coin coin5 = new Coin(1, 1984, "Gold", 0.2);
        Coin coin6 = new Coin(4, 2000, "Cuper", 2.5);

        Set<Coin> coinSet = new TreeSet<>(new SortByDiameterComparator());
        coinSet.add(coin1);
        coinSet.add(coin2);
        coinSet.add(coin3);
        coinSet.add(coin4);
        coinSet.add(coin5);
        coinSet.add(coin6);


        Set<Coin> coinSet2 = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                //сортируем по металлу от Z до A
                if (!o1.getMetalName().equals(o2.getMetalName())){
                return o2.getMetalName().compareTo(o1.getMetalName());
            }
                // по наминалу от большего к меньшему
                if (o1.getNominal() != o2.getNominal()){
                return o2.getNominal() - o1.getNominal();
                }
                // сортировать по диаметру от меньшего к большему
                if (o1.getDiameter() != o2.getDiameter()){
                }
                return 0;
            }
        });
        coinSet2.add(coin1);
        coinSet2.add(coin2);
        coinSet2.add(coin3);
        coinSet2.add(coin4);
        coinSet2.add(coin5);
        coinSet2.add(coin6);

        for (Coin coin : coinSet2) {
            System.out.println(coin);
        }
        System.out.println("---------");
        for (Coin coin : coinSet2) {
            System.out.println(coin);
        }

    }

}


