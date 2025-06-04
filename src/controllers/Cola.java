package controllers;
import java.util.EmptyStackException;

import models.Node;

public class Cola {
    private Node primero;
    private Node ultimo;
    public int size;

    public Cola(){
        this.primero= null;
        this.ultimo= null;
    }

    public Cola(Node primero, Node ultimo) {
        this.primero = primero;
        this.ultimo = ultimo;
    }

    public void add (int value){
        Node newNode = new Node (value);
        if (isEmpty()){
            primero = newNode;
            ultimo = newNode;
        }else{
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size ++;
    }

    public int remove(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int value = primero.getValue();
        primero = primero.getNext();
        size --;
        return value;
        
    }

    public int peek(){
         if (isEmpty()){
            throw new EmptyStackException();
        }
        return primero.getValue();

    }

    public void printCola(){
    Node actual = primero;
    while (actual != null) {
        System.out.println(actual.getValue());
        actual = actual.getNext();
    }
        System.out.println();
    }

     public int size() {
        return size;
    }

    public boolean isEmpty(){
        return primero == null;

    }
    
}
