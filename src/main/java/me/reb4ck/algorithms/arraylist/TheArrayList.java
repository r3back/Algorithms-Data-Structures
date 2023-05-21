package me.reb4ck.algorithms.arraylist;

@SuppressWarnings("unchecked")
public final class TheArrayList<T> {
    private T[] objects;

    public TheArrayList() {
        this.objects = (T[]) new Object[]{};
    }

    public void add(final T object) {
        this.objects = refactorList(object);
    }


    public void remove(final T object) {
        int index = getIndex(object);

        this.objects = refactorList(index);
    }

    public boolean contains(final T object) {
        return getIndex(object) != -1;
    }


    public void showValues() {
        for(int i = 0; i < size(); i++) {
            System.out.println("Object: " + objects[0] + " | Index: " + i);
        }
    }

    private T[] refactorList(final T object, int indexToRemove) {
        final T[] newList = createNewArray(indexToRemove);

        for(int i = 0; i < newList.length; i++) {

            if(indexToRemove == -1) {
                if(size() <= i) {
                    newList[i] = object;
                } else {
                    final T objectIterated = this.objects[i];
                    newList[i] = objectIterated;
                }
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
        return refactorList(null, indexToRemove);
    }

    private T[] refactorList(T object) {
        return refactorList(object, -1);
    }

    private T[] createNewArray(final int indexToRemove) {
        if (indexToRemove == -1) {
            return (T[]) new Object[size() + 1];
        } else {
            return (T[]) new Object[size() - 1];
        }

    }

    private int getIndex(final T object) {
        for(int i = 0; i < objects.length; i++) {
            if (objects[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return objects.length;
    }
}
