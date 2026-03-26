public interface MyArrayListTAD {
        void addLst(int newItem);
        void addFirst(int newInt);
        void insertAt(int i, int newInt);

        int removeLast();
        int removeFirst();
        int remove(int item);
        void removeAt();

        int find(int item);
        int get(int i);
        void set(int i);
}
