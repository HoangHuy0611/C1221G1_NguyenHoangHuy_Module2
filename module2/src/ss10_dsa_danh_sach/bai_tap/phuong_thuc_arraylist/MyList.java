package ss10_dsa_danh_sach.bai_tap.phuong_thuc_arraylist;

import java.util.Arrays;

public class MyList<E> {

    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) elements[i + 1] = elements[i];
        elements[index] = element;
        size++;
    }

    public void ensureCapacity() {
        if (size >= elements.length) {
            E[] newElement = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(elements, 0, newElement, 0, size);
            elements = newElement;
        }
    }

    public E remove(int index) {
        int i = 0;
        for (i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return (E) elements[index];
    }

    public int getSize() {
        return size;
    }

    public MyList<E> clone() {
        MyList<E> newElements = new MyList<>();
        newElements.elements = Arrays.copyOf(elements, size);
        newElements.size = this.size;
        return newElements;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++)
            if (o.equals(elements[i]))
                return true;
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++)
            if (o.equals(elements[i]))
                return i;
        return -1;
    }

    private void ensureCapacity(int minCapacity) {
        int newSize = elements.length + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int index) {
        return (E) elements[index];
    }
}

