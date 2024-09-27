package dependencyInversion.bad;


/**
 *This is bad because higher level module should not have dependency on lower level modules
 * As Calculator is higher level operation and we are creating the objects of lower level classes
 * that is AddOperation and SubtractOperation.
 */
public class Calculator {
    public int calculate(int number1, int number2, String operation){
        int result =0;
        switch(operation){
            case "add":
                AddOperation addOperation = new AddOperation();
                result = addOperation.add(number1,number2);
            case "sub":
                SubtractOperation subtractOperation = new SubtractOperation();
                result = subtractOperation.subtract(number1,number2);
        }
        return result;
    }
}
