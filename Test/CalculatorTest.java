import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;
import com.Calculator.Calculator;
import org.junit.jupiter.api.Test;


class CalculatorTest {
    @Test
    @DisplayName("Testing addition")
     void testCalculateAdd() {
        int num1 = 1;
        int num2 = 1;
        char calculate = '+';
        int expected = 2;

        int result = Calculator.calculate(num1, num2, calculate);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculateSub() {
        int num1 = 2;
        int num2 = 1;
        char calculate = '-';
        int expected = 1;

        int result = Calculator.calculate(num1, num2, calculate);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        int num1 = 2;
        int num2 = 2;
        char calculate = '*';
        int expected = 4;

        int result = Calculator.calculate(num1, num2, calculate);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        int num1 = 6;
        int num2 = 3;
        char calculate = '/';
        int expected = 2;

        int result = Calculator.calculate(num1, num2, calculate);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero() {
        int num1 = 2;
        int num2 = 0;
        char calculate = '/';

        assertThrows(RuntimeException.class,()-> {Calculator.calculate(num1, num2, calculate);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int num1 = 2;
        int num2 = 0;
        char calculate = '=';

        assertThrows(RuntimeException.class,()-> {Calculator.calculate(num1, num2, calculate);});
    }
}
