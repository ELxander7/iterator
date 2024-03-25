package ru.itis.inf304.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyList<T> {
    private Node<T> head;
    private Node<T> tail;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        } else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Iterator<T> iterator(){

        return new MyIterator();
    }

    private class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private class MyIterator implements Iterator<T> {

        private Node<T> current = head;
        private Node<T> prev;

        @Override
        public boolean hasNext(){

            return current != null;
        }

        @Override
        public T next() throws NoSuchElementException {
            if (!hasNext()) throw new NoSuchElementException();
            T data = current.data;
            prev = current;
            current = current.next;
            return data;
        }

        @Override
        public void remove(){
            if (prev == null) System.out.println("remove() can only be called after next()");
            if (prev == head) {
                head = head.next;
            } else {
                Node<T> temp = head;
                while (temp.next != prev) {
                    temp = temp.next;
                }
                temp.next = prev.next;
            }
            prev = null;

        }

    }


}

