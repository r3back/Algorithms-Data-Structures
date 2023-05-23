package me.reb4ck.algorithms.tree;

/**
 * Tree Data Structure interface
 *
 * @param <T> Generic Type
 */
public interface TheTree<T extends Number> {
    /**
     * Add node
     *
     * @param value Value to be added it should be a number type
     * @return created node
     */
    public TheTree<T> addNode(final T value);

    /**
     * Search a node
     *
     * @param value Value to be searched
     * @return Found value or null
     */
    public TheTree<T> search(final T value);
}
