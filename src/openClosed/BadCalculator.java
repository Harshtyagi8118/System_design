package openClosed;

/**
 * This is a bad calculator as if we want to add new operation
 * like div and mult then we have to modify our code
 * which will violate the principle , it should be close for modification
 * we can only extend  the class
 */
public class BadCalculator {
    public int calculateNumbrer(int number1, int number2, String operation){
        int result=0;
        switch(operation){
            case "sum":
                result = number1+number2;
            case "sub":
                result = number1-number2;
        }
        return result;
    }
}
