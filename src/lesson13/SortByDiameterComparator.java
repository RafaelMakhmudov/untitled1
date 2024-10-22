package lesson13;
import java.util.Comparator;

public class SortByDiameterComparator implements Comparator<Coin> {

    @Override
    public int compare(Coin o1, Coin o2) {
        // Сначало сортируем по диаметру от большего к меньшему
        if (o1.getDiameter() != o2.getDiameter()) {
            return Double.compare(o2.getDiameter(), o1.getDiameter());
        }
        // Потом сортируем по номиналу от A до Z
        if (o1.getMetalName().equals(o2.getMetalName())) {
            return o2.getMetalName().compareTo(o2.getMetalName());
        }
        //Потом о наминалу от меньшего к большему
        if (o1.getNominal() != o2.getNominal()) {
            return o1.getNominal() - o2.getNominal();
        }
        return 0;


    }
}
