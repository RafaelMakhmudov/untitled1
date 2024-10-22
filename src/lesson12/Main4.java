package lesson12;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main4 {
    public static void main(String[] args) {

        Set<Integer> hashSet = new TreeSet<>();
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(7);
        hashSet.add(4);
        hashSet.add(7);
        hashSet.add(3);

        System.out.println(hashSet);

    }
}
