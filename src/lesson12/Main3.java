package lesson12;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new LinkedHashSet<>();
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(7);
        hashSet.add(4);
        hashSet.add(7);

        System.out.println(hashSet);

    }
}



