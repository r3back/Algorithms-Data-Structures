package me.reb4ck.algorithms.tree;

import lombok.Getter;
import me.reb4ck.algorithms.list.exception.tree.TreeValueExistsException;
import me.reb4ck.algorithms.list.exception.tree.TreeValueNotExistsException;

import java.util.Optional;

/**
 * Binary Tree Implementation
 */
@Getter
public final class BinarySearchTree implements TheTree<Integer> {
    /**
     * TODO Create TreeNode Class
     */
    private BinarySearchTree leftChild;
    private BinarySearchTree rightChild;
    public Integer data;

    public BinarySearchTree(final int data) {
        this.data = data;
    }

    @Override
    public BinarySearchTree addNode(final Integer value) {
        return addNode(this, value);
    }

    @Override
    public Optional<TheTree<Integer>> search(final Integer value) {
        return search(this, value);
    }

    public Optional<TheTree<Integer>> search(final TheTree<Integer> root, final int value) {
        if(root == null) {
            throw new TreeValueNotExistsException("That value already exists!");
        } else if (this.data == value) {
            return Optional.of(root);
        } else if (value < this.data) {
            return root.getLeftChild().search(value);
        } else {
            return root.getRightChild().search(value);
        }
    }

    private BinarySearchTree addNode(BinarySearchTree root, final int value) {
        if(root == null) {
            root = new BinarySearchTree(value);

            return root;
        } else if (this.data == value) {
            throw new TreeValueExistsException("That value already exists!");
        } else if (value < this.data) {
            root.leftChild = addNode(root.leftChild, value);
        } else {
            root.rightChild = addNode(root.rightChild, value);
        }
        return root;
    }


}
