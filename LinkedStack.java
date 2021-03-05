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



    public int precedence(Character t) {
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

    ResizableArrayStack <Character> operatorStack = new ResizableArrayStack<Character>();
    String postFix;
   //These will be char because we are reading in a string
    char nextCharacter;
    char topOperator;

    int i = 0;
    public String convertToPostfix(char infix[]) {
        while (infix[i] <= infix.length) {
            nextCharacter =  infix[i];
            switch (nextCharacter) {
                case '^':
                    operatorStack.push(nextCharacter);
                    i++;
                    break;
                case '+' : case '-': 
                    while (operatorStack.isEmpty() == false && 1 <= precedence(operatorStack.peek())) {
                        operatorStack.pop();
                    }
                    operatorStack.push(nextCharacter);
                    i++;
                    break;
                case '*' : case '/': 
                    while (operatorStack.isEmpty() == false && 2 <= precedence(operatorStack.peek())) {
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
                    topOperator =  operatorStack.pop();
                    while(topOperator!='(') {
                        postFix += topOperator;
                        topOperator = operatorStack.pop();
                    }
                    i++;
                    break;
                //For any other characters. 
                default:
                    operatorStack.push(nextCharacter);
                    i++;
                    break;
            }
            while (!operatorStack.isEmpty()) {
                topOperator = (char) operatorStack.pop();
                postFix += topOperator;
            }
            return postFix;
    }

   return null;
}

}
