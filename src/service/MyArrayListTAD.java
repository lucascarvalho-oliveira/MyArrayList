package service;

public interface MyArrayListTAD {
        void addFirst(int newInt);
        void addLast(int newItem);
        void insertAt(int index, int newInt);

        int removeFirst();
        int removeLast();
        int removeAt(int index);
        boolean remove(int element);

        int find(int item);
        int get(int i);
        void set(int index, int novoValor);

        boolean isEmpty();
        boolean isFull();
        int count();
        void display();
        void addSorted(int element);
}
