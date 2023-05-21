package me.reb4ck.algoritmos.list;

public class Main {
    public static void main(final String[] args) {
        final MyArrayList<String> lista = new MyArrayList<>();

        lista.add("a");
        lista.add("b");
        lista.add("c");

        lista.remove("b");
        lista.remove("c");
        lista.remove("a");

        lista.add("a");

        lista.showValues();
    }
}
