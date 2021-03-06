public class Convertor {
    
    private static int precedence(Character t) {
        switch (t) {
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
    
    public static String convertToPostfix(char[] infix) {
    
        LinkedStack<Character> operatorStack = new LinkedStack<Character>();
        String postFix = "";
        // These will be char because we are reading in a string
        char nextCharacter;
        char topOperator;
    
        int i = 0;
        
        while (infix[i] <= infix.length) {
            nextCharacter = infix[i];
            switch (nextCharacter) {
                case '^':
                    operatorStack.push(nextCharacter);
                    i++;
                    break;
                case '+':
                case '-':
                    while (operatorStack.isEmpty() == false && 1 <= precedence(operatorStack.peek())) {
                        operatorStack.pop();
                    }
                    operatorStack.push(nextCharacter);
                    i++;
                    break;
                case '*':
                case '/':
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
                    topOperator = operatorStack.pop();
                    while (topOperator != '(') {
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
