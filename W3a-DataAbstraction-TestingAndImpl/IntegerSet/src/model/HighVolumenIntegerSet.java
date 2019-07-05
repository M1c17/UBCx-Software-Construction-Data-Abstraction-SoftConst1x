package model;

import java.util.Collection;
import java.util.HashSet;

public class HighVolumenIntegerSet implements IntegerSet {

    Collection<Integer> data;

    public HighVolumenIntegerSet() {
        data = new HashSet<>();
    }

    @Override
    public void insert(Integer num) {
        data.add(num);

    }

    @Override
    public void remove(Integer num) {
        data.remove(num);

    }

    @Override
    public boolean contains(Integer num) {
        return data.contains(num);
    }

    @Override
    public int size() {
        return data.size();
    }
}
