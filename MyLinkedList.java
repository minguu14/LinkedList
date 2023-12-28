package LinkedList;
import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    private static class Node<T> {
        private final T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T get(int index) {
        return nodeAtIndex(index).data;
    }

    public void delete(int index) {
        if (index == 0) {
            Node<T> tempNode = head;
            head = head.next;
            tempNode = null;
            size--;
        } else {
            Node<T> temp = nodeAtIndex(index - 1);
            Node<T> deletedNode = temp.next;
            temp.next = temp.next.next;
            if (deletedNode == tail) {
                tail = temp;
            }
            deletedNode = null;
            size--;
        }
    }

    private Node<T> nodeAtIndex(int index) {
        Node<T> data = head;
        for (int i = 0; i < index; i++) {
            data = data.next;
        }
        return data;
    }

    public String toString() {
        if (head == null) {
            return "[]";
        }
        Node<T> temp = head;
        StringBuilder str = new StringBuilder("[");

        while (temp.next != null) {
            str.append(temp.data).append(", ");
            temp = temp.next;
        }

        str.append(temp.data);
        return str + "]";
    }

    @Override
    public Iterator<T> iterator() {
        return new MyLinkedListIterator();
    }

    private class MyLinkedListIterator implements Iterator<T> {
        private Node<T> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T data = current.data;
            current = current.next;
            return data;
        }
    }
    public void push(T data) {
        add(data);
    }

    public T pop() {
        T data = tail.data;
        delete(size - 1);
        return data;
    }

    // Queue methods

    public void enqueue(T data) {
        add(data);
    }

    public T dequeue() {
        T data = head.data;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            delete(0);
        }
        return data;
    }
}

