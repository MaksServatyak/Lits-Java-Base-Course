package Homework16;

import java.util.NoSuchElementException;

public class LinkedListNew<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public LinkedListNew() {
        this.first = this.last = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public void add(T data) {
        Node<T> node = new Node(data);
        if (this.first == null) {
            this.first = this.last = node;
        }else{
            this.last.setNext(node);
            this.last = node;
        }
        this.size++;
    }

    public void addAll(T[] array) {
        for (T data : array) {
            add(data);
        }
    }

    public void remove(T data) {
        if (this.first == null) {
            throw new NoSuchElementException();
        } else if (this.first.getData().equals(data)) {
            this.first = this.first.getNext();
            this.size--;
            return;
        }

        Node<T> current = this.first;
        Node<T> next = current.getNext();
        while (next != null) {
            if (next.getData().equals(data)) {
                current.setNext(next.getNext());
                if (current.getNext() == null) {
                    this.last = current;
                }
                this.size--;
                return;
            }
            current = next;
            next = current.getNext();
        }

        throw new NoSuchElementException();
    }

    public boolean contains(T data) {
        Node<T> current = this.first;

        while (current != null) {
            if (current.getData().equals(data)) {
                return true;
            }
            current = current.getNext();
        }
        return false;

    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("{");

        Node<T> current = this.first;
        while (current != null) {
            buffer.append(current.getData());

            if (current.getNext() != null) {
                buffer.append(", ");
            }

            current = current.getNext();
        }

        buffer.append("}");

        return buffer.toString();
    }

    private class Node<T> {

        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public void setData(T data) {
            this.data = data;
        }

        public T getData() {
            return this.data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return this.next;
        }
    }
}
