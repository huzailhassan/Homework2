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
        char topOperator;
        
        for (char nextCharacter : infix) {
            if (Character.isLetter(nextCharacter)) {
                postFix += nextCharacter;
                continue;   // not strictly necessary
            }
            switch (nextCharacter) {
                case '^':
                    operatorStack.push(nextCharacter);
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                    while (!operatorStack.isEmpty() && precedence(nextCharacter) <= precedence(operatorStack.peek())) {
                        postFix += operatorStack.pop();
                    }
                    operatorStack.push(nextCharacter);
                    break;
                case '(':
                    operatorStack.push(nextCharacter);
                    break;
                case ')':
                    topOperator = operatorStack.pop();
                    while (topOperator != '(') {
                        postFix += topOperator;
                        topOperator = operatorStack.pop();
                    }
                    break;
                //For any other characters. 
                default:
                    break;
            }
        }
        
        while (!operatorStack.isEmpty()) {
            topOperator = operatorStack.pop();
            postFix += topOperator;
        }
        
        return postFix;
    }
}
