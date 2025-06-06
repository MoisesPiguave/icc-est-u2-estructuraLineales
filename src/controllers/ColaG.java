package controllers;

import java.util.EmptyStackException;
import models.NodeGeneric;

public class ColaG<T> {
    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo;
    public int size;

    public ColaG() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public void add(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if (isEmpty()) {
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }

    public T remove() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = primero.getValue();
        primero = primero.getNext();
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return primero.getValue();
    }

    public void printCola() {
        NodeGeneric<T> actual = primero;
        while (actual != null) {
            System.out.println(actual.getValue());
            actual = actual.getNext();
        }
        System.out.println();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public int findByName(String name) {
        int posicion = 0;
        NodeGeneric<T> node = primero;
        while (node != null) {
            if (node.getValue().toString().equals(name)) {
                return posicion;
            }
            node = node.getNext();
            posicion++;
        }
        return -1;
    }
    public void removeByName(String name) {
        if (isEmpty())
            throw new EmptyStackException();
        if (primero.getValue().toString().equals(name)) {
            primero = primero.getNext();
            if (primero == null) {
                ultimo = null;
            }
            size--;
            return;
        }
        NodeGeneric<T> actual = primero;
        NodeGeneric<T> anterior = null;
        while (actual != null && !actual.getValue().toString().equals(name)) {
            anterior = actual;
            actual = actual.getNext();
        }
        if (actual != null) {
            anterior.setNext(actual.getNext());
            if (actual == ultimo) {
                ultimo = anterior;
            }
            size--;
        }    
    }
}

