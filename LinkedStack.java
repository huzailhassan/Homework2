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
    //These will be char because we are reading in a string
    public T nextCharacter;
    char topOperator;

    public int precedence(T t) {
        switch ((char) t) {
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

    int i = 0;
    public String convertToPostfix(String infix[]) {
        while (infix[i] != null) {
            switch ((char) nextCharacter) {
                case 'd':
                    operatorStack.push(nextCharacter);
                    i++;
                    break;
                case '^':
                    operatorStack.push(nextCharacter);
                    i++;
                    break;
                case '+' : case '-' : case '*' : case '/' :
                    T c;
                    while (operatorStack.isEmpty() == false && precedence(operatorStack.peek()) >= precedence(c)) {
                        operatorStack.pop();
                    }
                    operatorStack.push(nextCharacter);
                    i++;
                    break;
                case '(':
                    operatorStack.push(nextCharacter);
                    i++;
                    break;
                case ')':
                    topOperator = (char) operatorStack.pop();
                    while(topOperator!='(') {
                        postFix += topOperator;
                        topOperator = (char) operatorStack.pop();
                    }
                    i++;
                    break;
                default:
                    break;

            }
            while (!operatorStack.isEmpty()) {
                topOperator = (char) operatorStack.pop();

            }
            return postFix;
    }

   return null;
}

}
