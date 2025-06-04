package controllers;
import java.util.EmptyStackException;

import models.Node;


public class Stack {

    private Node top;

    public Stack(){
        this.top = null;
    }

    public void push (int value){
        Node nd = new Node(value);
        nd.setNext(top);
        top = nd;
    }

    public int pop(){
        if ( isEmpty() )
            throw new EmptyStackException();
        int value = top.getValue();
        top = top.getNext();
        return value;
    }

    public int peek(){
        if ( isEmpty() )
            throw new EmptyStackException();
        return top.getValue();    
        
    
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void printStack(){
    Node actual = top;
    while (actual != null) {
        System.out.println(actual.getValue());
        actual = actual.getNext();
    }
        System.out.println();
    }

    public int size() {
    Node aux = top;
    int count = 0;
    while (aux != null) {
        System.out.print(aux.getValue() + "|"); 
        aux = aux.getNext();
        count++;
    }
    return count;
}
    }
    

