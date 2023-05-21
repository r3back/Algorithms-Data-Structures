package me.reb4ck.algorithms.arraylist;

public class Main {
    public static void main(final String[] args) {
        final TheArrayList<String> list = new TheArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");

        list.remove("b");
        list.remove("c");
        list.remove("a");

        list.add("a");

        list.showValues();
    }
}
