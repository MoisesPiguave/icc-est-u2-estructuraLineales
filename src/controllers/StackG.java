package controllers;

import models.NodeGeneric;
import java.util.EmptyStackException;

public class StackG<T> {
    private NodeGeneric<T> top;
    private int size;

    public StackG() {
        this.top = null;
        this.size = 0;
    }

    public void push(T value) {
        NodeGeneric<T> node = new NodeGeneric<T>(value);
        node.setNext(top);
        top = node;
        size++;
    }

    public T pop() {
        if (isEmpty())
            throw new EmptyStackException();
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void printStack() {
        NodeGeneric<T> current = top;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
        System.out.println();
    }
}
