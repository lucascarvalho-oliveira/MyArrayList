package service;

public class MyArrayList implements MyArrayListTAD {
    private int[] dados;
    private int size = 0;

    public MyArrayList(int capacidade) {
        this.dados = new int[capacidade];
    }

    @Override
    public void addFirst(int newItem) {
        for (int i = size; i > 0; i--) {
            dados[i] = dados[i - 1];
        }
        dados[0] = newItem;
        size++;
    }

    @Override
    public void addLast(int newItem) {
        dados[size] = newItem;
        size++;
    }

    @Override
    public void insertAt(int index, int newInt) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        for (int i = size; i > index; i--) {
            dados[i] = dados[i - 1];
        }
        dados[index] = newInt;
        size++;
    }

    @Override
    public int removeFirst() {
        int remove = dados[0];

        for (int i = 0; i < size - 1; i++) {
            dados[i] = dados[i + 1];
        }
        size--;

        return remove;
    }

    @Override
    public int removeLast() {
        int remove = dados[size - 1];
        size--;

        return remove;
    }

    @Override
    public int removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice inválido: " + index);
        }

        int remove = dados[index];

        for (int i = index; i < size - 1; i++) {
            dados[i] = dados[i + 1];
        }
        size--;

        return remove;
    }

    @Override
    public boolean remove(int element) {
        int index = find(element);

        if (index == -1) {
            return false;
        }

        removeAt(index);
        return true;
    }

    @Override
    public int find(int index){
        for (int i = 0; i < size; i++) {
            if (dados[i] == index) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int get(int index) {
        return dados[index];
    }

    @Override
    public void set(int index, int novoValor) {
        dados[index] = novoValor;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean isFull() {
        return this.size == dados.length;
    }

    @Override
    public int count() {
        return this.size;
    }

    @Override
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(dados[i] + " ");
        }
    }

    @Override
    public void addSorted(int element) {
        int i = 0;

        while (i < size && dados[i] < element) {
            i++;
        }

        insertAt(i, element);
    }
}