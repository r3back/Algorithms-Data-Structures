package me.reb4ck.algorithms.tree;

import me.reb4ck.algorithms.list.exception.tree.TreeValueExistsException;
import me.reb4ck.algorithms.list.exception.tree.TreeValueNotExistsException;

/**
 * Binary Tree Implementation
 */
public final class BinarySearchTree implements TheTree<Integer> {
    /**
     * TODO
     * - Encapsulate variables
     * - Create TreeNode Class
     */
    public BinarySearchTree leftChild;
    public BinarySearchTree rightChild;
    public Integer data;

    public BinarySearchTree(final int data) {
        this.data = data;
    }

    public BinarySearchTree addNode(final Integer value) {
        return addNode(this, value);
    }

    public BinarySearchTree search(final Integer value) {
        return search(this, value);
    }

    public BinarySearchTree search(final BinarySearchTree root, final int value) {
        if(root == null) {
            throw new TreeValueNotExistsException("That value already exists!");
        } else if (data == value) {
            return root;
        } else if (value < data) {
            return root.leftChild.search(value);
        } else {
            return root.rightChild.search(value);
        }
    }

    private BinarySearchTree addNode(BinarySearchTree root, final int value) {
        if(root == null) {
            root = new BinarySearchTree(value);

            return root;
        } else if (data == value) {
            throw new TreeValueExistsException("That value already exists!");
        } else if (value < data) {
            root.leftChild = addNode(root.leftChild, value);
        } else {
            root.rightChild = addNode(root.rightChild, value);
        }
        return root;
    }


}
