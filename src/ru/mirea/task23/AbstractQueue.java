package ru.mirea.task23;

public class AbstractQueue implements Queue{

    @Override
    public void enqueue(Object element) {

    }

    @Override
    public Object element() {
        return null;
    }

    @Override
    public Object dequeue() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }
}
