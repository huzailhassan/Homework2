import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayStackTest {
    
    static final String GIVEN_INFIX_EXPRESSION = "2 3 * 4 2 - / 5 6 * +";
    static final double EXPECTED_GIVEN = 33.0;

    static final String GIVEN_INFIX_EXPRESSION_2 = "5 7 * 2 5 - / 9 3 * + ";
    static final double EXPECTED_GIVEN_2 = 15.333333333333334;

    static final String GIVEN_INFIX_EXPRESSION_3 = "4 2 * 1 4 - / 2 7 * +";
    static final double EXPECTED_GIVEN_3 = 11.333333333333334;

    public static void main(String[] args) {

    }

    @Test
    public void evaluatePosfix_Given() {
        assertEquals(EXPECTED_GIVEN, Postfix.evaluatePosfix(GIVEN_INFIX_EXPRESSION));
    }

    @Test
    public void evaluatePosfix_Given_2() {
        assertEquals(EXPECTED_GIVEN_2, Postfix.evaluatePosfix(GIVEN_INFIX_EXPRESSION_2));
    }

    @Test
    public void evaluatePosfix_Given_3() {
        assertEquals(EXPECTED_GIVEN_3, Postfix.evaluatePosfix(GIVEN_INFIX_EXPRESSION_3));
    }
}
