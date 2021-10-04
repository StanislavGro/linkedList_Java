package lab.singleList.interfaces;

public interface Linked<E>{

    void addFirst(E elem);
    void addLast(E elem);
    void add(E elem, int index);
    void delete(int index);

    int getSize();

    boolean isEmpty();

    void sort(int low, int high);

    E getElemByIndex(int index);
    void setElemByIndex(E elem, int index);
}
