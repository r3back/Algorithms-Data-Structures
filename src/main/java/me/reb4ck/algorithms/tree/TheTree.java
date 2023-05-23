package me.reb4ck.algorithms.tree;

import java.util.Optional;

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
     * @return Optional of {@link TheTree<T>}
     */
    public Optional<TheTree<T>> search(final T value);

    /**
     * Returns Left Child
     * @return {@link TheTree<T>}
     */
    public TheTree<T> getLeftChild();

    /**
     * Returns right child
     *
     * @return {@link TheTree<T>}
     */
    public TheTree<T> getRightChild();

    /**
     * Returns node data
     *
     * @return Node data
     */
    public T getData();
}
