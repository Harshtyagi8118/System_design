package dependencyInversion.good;

public class Calculator {
    public int calculate(int num1, int num2, CalculatorOperation operation){
        return operation.calculate(num1,num2);
    }
}
