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

    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
