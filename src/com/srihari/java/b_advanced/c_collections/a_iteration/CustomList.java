package com.srihari.java.b_advanced.c_collections.a_iteration;

import java.util.Iterator;

public class CustomList<T> implements Iterable<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator(this);
    }

    // If "items" data structure or implementaton changes, then only this class changes
    private class CustomIterator implements Iterator<T> {
        private CustomList<T> list;
        private int index;

        public CustomIterator(CustomList<T> list){
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
