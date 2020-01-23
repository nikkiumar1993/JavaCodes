package enumEx;

public class OperatorsTest {
    public static void main(String[] args) {

        System.out.println(getResult(5, 2, Operators.MODULES));
    }

    public static double getResult(double num1, double num2, Operators opr) {
        double result=0;
        switch (opr) {
            case ADDITION:
                result = num1 + num2;
                break;
            case SUBTRACTION:
                result = num1 - num2;
                break;
            case DIVISION:
                result = num1 / num2;
                break;
            case MULTIPLICATION:
                result = num1 * num2;
                break;
            case MODULES:
                if(num2==0){
                    System.out.println("Invalid remainder operation");
                    return 0;
                }
                result = num1 % num2;

        }
        return result;
    }
}
