import java.util.*;

public class LinkedStack<T> implements StackInterface<T>
{
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

    public ResizableArrayStack<T> operatorStack;
    public String postFix;

    public String nextCharacter;

    char topOperator;

    static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public String convertToPostfix() {
        while (!) {
            switch (nextCharacter = ) {
                case variable:
                    break;
                case '^':
                    operatorStack.push(nextCharacter);
                    break;
                case '+' : case '-' : case '*' : case '/' :
                    while (operatorStack.isEmpty()==false && precedence(operatorStack.peek())>=precedence(c)) {
                        operatorStack.pop();
                    }
                    operatorStack.push(nextCharacter);
                    break;
                case '(':
                    operatorStack.push(nextCharacter);
                    break;
                case ')':
                    topOperator = operatorStack.pop();
                    while(topOperator!='(') {
                        postfix += x;
                        topOperator = operatorStack.pop();
                    }
                    break;
                default: 
                    break;
        
        }
        while (!operatorStack.isEmpty()) {
            topOperator = operatorStack.pop();

        }
        return postfix;
    }

   return null;
}

}
