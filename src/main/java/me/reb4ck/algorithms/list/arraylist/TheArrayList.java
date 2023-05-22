package me.reb4ck.algorithms.list.arraylist;

import me.reb4ck.algorithms.list.TheList;
import me.reb4ck.algorithms.list.exception.ListIndexException;

@SuppressWarnings("unchecked")
public final class TheArrayList<T> implements TheList<T> {
    private T[] objects;

    public TheArrayList() {
        this.objects = (T[]) new Object[]{};
    }

    @Override
    public void add(final T object) {
        this.objects = refactorList(object, lastIndex());
    }

    @Override
    public void remove(final T object) {
        int index = getIndex(object);

        this.objects = refactorList(index);
    }

    @Override
    public void add(final int index, final T object) {
        /*if (index >= size()) {
            throw new ListIndexException("Index exceeds list capacity!");
        }*/

        this.objects = refactorList(object, index);
    }

    @Override
    public void remove(final int index) {
        if (index >= size()) {
            throw new ListIndexException("Index exceeds list capacity!");
        }

        this.objects = refactorList(index);
    }

    @Override
    public T get(int index) {
        if (index >= size()) {
            throw new ListIndexException("Index exceeds list capacity!");
        }

        return this.objects[index];
    }

    @Override
    public boolean contains(final T object) {
        return getIndex(object) != -1;
    }

    @Override
    public void showValues() {
        for(int i = 0; i < size(); i++) {
            System.out.println("Object: " + objects[i] + " | Index: " + i);
        }
    }

    @Override
    public int size() {
        return objects.length;
    }

    private T[] refactorList(final T object, final int indexToRemove, final int indexToAdd) {
        final T[] newList = createNewArray(indexToRemove);

        for(int i = 0; i < newList.length; i++) {

            if (indexToRemove == -1) {

                final T objectIterated;

                if (i < indexToAdd) {
                    objectIterated = this.objects[i];
                } else if(i == indexToAdd) {
                    objectIterated = object;
                } else {
                    objectIterated = this.objects[i - 1];
                }

                newList[i] = objectIterated;

            } else {

                final T objectIterated;

                if (i < indexToRemove) {
                    objectIterated = this.objects[i];
                } else {
                    objectIterated = this.objects[i + 1];
                }

                newList[i] = objectIterated;
            }

        }

        return newList;
    }

    private T[] refactorList(final int indexToRemove) {
        return refactorList(null, indexToRemove, -1);
    }

    private T[] refactorList(final T object) {
        return refactorList(object, -1, -1);
    }

    private T[] refactorList(final T object, final int indexToAdd) {
        return refactorList(object, -1, indexToAdd);
    }

    private T[] createNewArray(final int indexToRemove) {
        if (indexToRemove == -1) {
            return (T[]) new Object[size() + 1];
        } else {
            return (T[]) new Object[size() - 1];
        }

    }

    private int lastIndex() {
        return objects.length;
    }

    private int getIndex(final T object) {
        for(int i = 0; i < objects.length; i++) {
            if (objects[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

}
