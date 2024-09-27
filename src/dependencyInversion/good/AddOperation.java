package dependencyInversion.good;

public class AddOperation implements CalculatorOperation{
    @Override
    public int calculate(int number1, int number2) {
        return number1+number2;
    }
}
