package lesson12.homework;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {


    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException();
        }
        Collection<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }
    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException();
        }
        Collection<Integer> result = new ArrayList<>();
        for (Integer i : a) {
            if (b.contains(i)) {
                result.add(i);
            }
        }
        for (Integer i : b) {
            if (a.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException();
        }
        Set<Integer> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }
    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException();
        }
        Set<Integer> result = new HashSet<>();
        for (Integer i : a) {
            if (b.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException();
        }
        Collection<Integer> result1 = new HashSet<>(a);
        result1.removeAll(b);

        Collection<Integer> result2 = new HashSet<>(b);
        result2.removeAll(a);
        Collection<Integer> result = new HashSet<>();
        result.addAll(result1);
        result.addAll(result2);
        return result;

    }
}
