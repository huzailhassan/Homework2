import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedStackTest {

    static final String GIVEN_INFIX_EXPRESSION = "a * b / (c - a) + d * e";
    static final String EXPECTED_POSTFIX = "ab*ca-/de*+";
    
    public static void main(String[] args) {
    
    }
    
    @Test
    public void convertToPostfix_Given() {
        assertEquals(EXPECTED_POSTFIX, Converter.convertToPostfix(GIVEN_INFIX_EXPRESSION.toCharArray()));
    }
}
