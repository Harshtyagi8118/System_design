package openClosed;

/**
 * No modification in our calculator functionality
 * we can keep adding extensions be creating new operations
 */
public class Calculator {
    public int calculateNumber(int number1, int number2, Operation operation){
        return operation.perform(number1,number2);
    }
}
