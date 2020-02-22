package adt;

public interface ListADT<E> {
    boolean add(E item);

    E remove();

    int search(E data);

    void sort();

}
