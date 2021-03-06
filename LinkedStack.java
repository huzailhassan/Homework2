import java.util.*;

public class LinkedStack<T> implements StackInterface<T> {
    private Node<T> topNode;

    public LinkedStack() {
        topNode = null;
    }

    public void push(T newEntry) {
        Node<T> newNode = new Node<T>(newEntry, topNode);
        topNode = newNode;
        //topNode = new Node(newEntry, topNode); // Alternate code
    } // end push

    public T pop() {
       T top = peek();  // Might throw EmptyStackException
       // Assertion: topNode != null
       topNode = topNode.getNext();
       return top;
    
    } // end pop

    public T peek() {
       if (isEmpty())
          throw new EmptyStackException();
       else
          return topNode.getData();
    } // end peek
    
    public boolean isEmpty() {
        return topNode == null;
    } // end isEmpty

    public void clear() {
        topNode = null;
    }

}
