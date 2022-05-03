package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.calculator.CalculatorService;
import pro.sky.calculator.CalculatorServiceImpl;

import static pro.sky.calculator.constants.CalculatorServiceTestConstants.*;
import static pro.sky.calculator.constants.CalculatorServiceTestConstants.divisionServiceTestResult2;

public class CalculatorServiceTest {
    private final CalculatorService mut = new CalculatorServiceImpl();

    @Test
    public void shouldReturnCorrectAdditionResult() {
        String result = mut.getCalculateAddition(number1, number1);
        Assertions.assertEquals(additionServiceTestResult1, result);
        result = mut.getCalculateAddition(number1, number2);
        Assertions.assertEquals(additionServiceTestResult2, result);
    }

    @Test
    public void shouldReturnCorrectSubtractionResult() {
        String result = mut.getCalculateSubtraction(number1, number1);
        Assertions.assertEquals(substractionServiceTestResult1, result);
        result = mut.getCalculateSubtraction(number1, number2);
        Assertions.assertEquals(substractionServiceTestResult2, result);
    }

    @Test
    public void shouldReturnCorrectMultiplicationResult() {
        String result = mut.getCalculateMultiplication(number1, number1);
        Assertions.assertEquals(multiplicationServiceTestResult1, result);
        result = mut.getCalculateMultiplication(number1, number2);
        Assertions.assertEquals(multiplicationServiceTestResult2, result);
    }

    @Test
    public void shouldReturnCorrectDivisionResult() {
        String result = mut.getCalculateDivision(number1, number1);
        Assertions.assertEquals(divisionServiceTestResult1, result);
        result = mut.getCalculateDivision(number1, number2);
        Assertions.assertEquals(divisionServiceTestResult2, result);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenDividedByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> mut.getCalculateDivision(number1, zero));
    }

}
