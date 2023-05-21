package me.reb4ck.algorithms.list;

/**
 * List interface
 * @param <T> Generic Type
 */
public interface TheList<T> {
    /**
     * Adds an element to the list
     *
     * @param object Object
     */
    public void add(final T object);

    /**
     * Removes a specific Object
     *
     * @param object Object
     */
    public void remove(final T object);

    /**
     * Adds an object in a specific index
     *
     * @param index index
     */
    public void add(final int index, final T object);

    /**
     * Removes an object from specific index
     *
     * @param index index
     */
    public void remove(final int index);

    /**
     * Gets element from specific index
     *
     * @param index index
     */
    public T get(final int index);

    /**
     * Check if an element is in a list
     *
     * @param object Object
     * @return True if element exists
     */
    public boolean contains(final T object);

    /**
     * Show all list values
     */
    public void showValues();

    /**
     * Returns list size
     *
     * @return List size
     */
    public int size();
}
