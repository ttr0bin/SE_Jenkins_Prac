package calculator;

import main.calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    // Calculator 인스턴스화
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddIntInt() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-2, 2));
    }

    @Test
    void testAddStringString() {
        assertEquals("hello world", calculator.add("hello ", "world"));
        assertEquals("abc", calculator.add("a", "bc"));
    }

    // 아직 테스트 작성하지 않은 경우 함수 내용
    // fail("Not yet implemented");
}