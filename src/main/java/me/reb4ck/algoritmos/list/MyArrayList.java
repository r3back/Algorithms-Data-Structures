package me.reb4ck.algoritmos.list;

public final class MyArrayList <T> {
    private T[] objects;

    public MyArrayList() {
        this.objects = (T[]) new Object[]{};
    }

    public void add(T object) {
        this.objects = refactorList(object);
    }


    public void remove(T object) {
        int index = getIndex(object);

        this.objects = refactorList(index);
    }

    public boolean contains(T object) {
        return getIndex(object) != -1;
    }


    public void showValues() {
        int i = 0;
        for (T object : this.objects) {
            System.out.println("Object: " + object + " | Index: " + i);
            i++;
        }
    }

    private T[] refactorList(T object, int indexToRemove) {
        T[] newList = createNewArray(indexToRemove);

        for(int i = 0; i < newList.length; i++) {
            System.out.println(i);

            if(indexToRemove == -1) {
                if(size() <= i) {
                    newList[i] = object;
                } else {
                    T objectIterated = this.objects[i];
                    newList[i] = objectIterated;
                }
            } else {

                T objectIterated;

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

    private T[] refactorList(int indexToRemove) {
        return refactorList(null, indexToRemove);
    }

    private T[] refactorList(T object) {
        return refactorList(object, -1);
    }

    private T[] createNewArray(int indexToRemove) {
        if (indexToRemove == -1) {
            return (T[]) new Object[size() + 1];
        } else {
            return (T[]) new Object[size() - 1];
        }

    }

    private int getIndex(T object) {
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
