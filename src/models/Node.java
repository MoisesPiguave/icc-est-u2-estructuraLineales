package models;
public class Node{

    public int value;
    public Node next;

    public Node (int value){
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node [values=" + value + ", next=" + next + "]";
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
    


}