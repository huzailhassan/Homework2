import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedStackTest {

    static final String GIVEN_INFIX_EXPRESSION = "a * b / (c - a) + d * e";
    static final String EXPECTED_GIVEN = "ab*ca-/de*+";
    
    static final String INFIX_TRAILING = GIVEN_INFIX_EXPRESSION + "\t\r\n  \t\r\n     \t\r\n";
    
    static final String INFIX_LEADING = "\t\r\n  \t\r\n     \t\r\n" + GIVEN_INFIX_EXPRESSION;
    
    public static void main(String[] args) {
    
    }
    
    @Test
    public void convertToPostfix_Given() {
        assertEquals(EXPECTED_GIVEN, Postfix.convertToPostfix(GIVEN_INFIX_EXPRESSION.toCharArray()));
    }
    
    @Test
    public void convertToPostfix_TrailingWhitespace() {
        assertEquals(EXPECTED_GIVEN, Postfix.convertToPostfix(INFIX_TRAILING.toCharArray()));
    }
    
    @Test
    public void convertToPostfix_LeadingWhitespace() {
        assertEquals(EXPECTED_GIVEN, Postfix.convertToPostfix(INFIX_LEADING.toCharArray()));
    }
    
}
