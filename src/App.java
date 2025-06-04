import controllers.Cola;
import controllers.ColaG;
import controllers.Stack;
import controllers.StackG;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
        System.out.println("Tam ="  + stack.size());
        stack.printStack();
        stack.pop();
        stack.peek();
        System.out.println("Tam ="  + stack.size());
        stack.printStack();

        // stack generica
        StackG<String> stackGString = new StackG<String>();
        stackGString.push("Uno");
        stackGString.push("Cuatro");
        stackGString.printStack();

        StackG<Integer> stackGInt = new StackG<Integer>();
        stackGInt.push(1);
        stackGInt.push(4);
        stackGInt.printStack();

        Cola cola = new Cola();
        cola.add(5);
        cola.add(7);
        cola.add(10);
        System.out.println("tam =" + cola.size);
        cola.printCola();
        cola.remove();
        System.out.println("tam =" + cola.size);
        cola.printCola();

        Persona p1 = new Persona("Pablo");
        Persona p2 = new Persona("Juan");
        Persona p3 = new Persona("Maria");
        ColaG<Persona> colaPersonas = new ColaG<Persona>();

        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);

        System.out.println(colaPersonas.size);
        System.out.println();
        System.out.println("Atiende a la persona => " + colaPersonas.remove());
        System.out.println(colaPersonas.size);
        colaPersonas.printCola();
    }
}
