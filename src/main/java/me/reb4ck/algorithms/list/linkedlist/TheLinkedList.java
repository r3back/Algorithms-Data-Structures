package me.reb4ck.algorithms.list.linkedlist;

import me.reb4ck.algorithms.list.TheList;
import me.reb4ck.algorithms.list.exception.ListIndexException;

public final class TheLinkedList <T> implements TheList<T> {
    private ListNode<T> head = null;


    public void setFirst(T object) {
        ListNode<T> node = new ListNode<>(object);

        node.next = head;

        head = node;
    }

    @Override
    public void add(T object) {
        final ListNode<T> node = new ListNode<>(object);

        if(this.head == null) {
            this.head = node;
        } else {
            ListNode<T> pointer = head;

            while (pointer.next != null) {
                pointer = pointer.next;
            }

            pointer.next = node;
        }


    }

    @Override
    public void remove(T object) {

    }

    @Override
    public void add(int index, T object) {
        final ListNode<T> node = new ListNode<>(object);

        if(this.head == null) {
            this.head = node;
        } else {
            ListNode<T> pointer = head;
            int count = 0;
            while (count < index && pointer.next != null) {
                pointer = pointer.next;
                count++;
            }

            node.next = pointer.next;
            pointer.next = node;
        }
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public T get(int index) {
        if (head == null) {
            throw new ListIndexException("List is empty!");
        }

        ListNode<T> pointer = head;
        int count = 0;

        while (count < index && pointer.next != null) {
            pointer = pointer.next;
            count++;
        }

        if (count != index) {
            throw new ListIndexException("Index exceeds list capacity!");
        }

        return pointer.object;
    }

    @Override
    public boolean contains(T object) {
        return false;
    }

    @Override
    public void showValues() {
        ListNode<T> pointer = head;

        int count = 0;

        while (pointer.next != null) {
            System.out.println("Object: " + pointer.object + " | Index: " + count);

            pointer = pointer.next;

            count++;
        }

    }

    @Override
    public int size() {
        return 0;
    }

    private static class ListNode<H> {
        H object;
        ListNode<H> next = null;

        public ListNode(H object) {
            this.object = object;
        }
    }
}
