package definition;

import adt.ListADT;

public class List<E> implements ListADT<E> {

    @Override
    public boolean add(E item) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public int search(E data) {
        return 0;
    }

    @Override
    public void sort() {

    }


}
