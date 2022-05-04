package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.CalculatorService;
import pro.sky.calculator.CalculatorServiceImpl;

import java.util.stream.Stream;

import static pro.sky.calculator.constants.CalculatorServiceTestConstants.*;
import static pro.sky.calculator.constants.CalculatorServiceTestConstants.number1;

public class CalculatorServiceParameterizedTest {
    private final CalculatorService mut = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("paramsForCalculateAdditionResultTest")
    public void shouldReturnCorrectCalculationAdditionResult(int number1, int number2, String expectedResult) {
        String result = mut.getCalculateAddition(number1, number2);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @MethodSource("paramsForCalculateSubtractionResultTest")
    public void shouldReturnCorrectCalculationSubstractionResult(int number1, int number2, String expectedResult) {
        String result = mut.getCalculateSubtraction(number1, number2);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @MethodSource("paramsForCalculateMultiplicationResultTest")
    public void shouldReturnCorrectCalculationMultiplicationResult(int number1, int number2, String expectedResult) {
        String result = mut.getCalculateMultiplication(number1, number2);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @MethodSource("paramsForCalculateDivisionResultTest")
    public void shouldReturnCorrectCalculationDivisionResult(int number1, int number2, String expectedResult) {
        String result = mut.getCalculateDivision(number1, number2);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> paramsForCalculateAdditionResultTest() {
        return Stream.of(
                Arguments.of(number1, number1, additionServiceTestResult1),
                Arguments.of(number1, number2, additionServiceTestResult2)
        );
    }

    public static Stream<Arguments> paramsForCalculateSubtractionResultTest() {
        return Stream.of(
                Arguments.of(number1, number1, substractionServiceTestResult1),
                Arguments.of(number1, number2, substractionServiceTestResult2)
        );
    }

    public static Stream<Arguments> paramsForCalculateMultiplicationResultTest() {
        return Stream.of(
                Arguments.of(number1, number1, multiplicationServiceTestResult1),
                Arguments.of(number1, number2, multiplicationServiceTestResult2)
        );
    }

    public static Stream<Arguments> paramsForCalculateDivisionResultTest() {
        return Stream.of(
                Arguments.of(number1, number1, divisionServiceTestResult1),
                Arguments.of(number1, number2, divisionServiceTestResult2)
        );
    }
}
