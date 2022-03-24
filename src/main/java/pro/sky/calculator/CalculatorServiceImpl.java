package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    private int number1;
    private int number2;

    @Override
    public String getCalculateAddition(int number1, int number2) {
        int value = number1 + number2;
        return number1 + " + " + number2 + " = " + value;
    }

    @Override
    public String getCalculateSubtraction(int number1, int number2) {
        int value = number1 - number2;
        return number1 + " - " + number2 + " = " + value;
    }

    @Override
    public String getCalculateMultiplication(int number1, int number2) {
        int value = number1 * number2;
        return number1 + " * " + number2 + " = " + value;
    }

    @Override
    public String getCalculateDivision(int number1, int number2) {
        if (number2 == 0) {
            return "Деление на ноль недопустимо";
        }
        int value = number1 / number2;
        return number1 + " / " + number2 + " = " + value;
    }
}
