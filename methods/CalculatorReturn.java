package methods;

import org.w3c.dom.ls.LSOutput;

//Create a calculator method that will take three arguments: an operator ( +, -, *, \, %)  and two numbers.
// Perform that operation between the two numbers and return the result
public class CalculatorReturn {
    public static void main(String[] args) {
        System.out.println(calculate("ghf", 3, 2));
    }

    public static int calculate(String operator, int num1, int num2) {
        int result = 0;
        if (operator.equals("+")) {
            return num1 + num2;
        } else if (operator.equals("-")) {
            return num1 - num2;
        } else if (operator.equals("*")) {
            return  num1 * num2;
        } else if (operator.equals("/")) {
            return num1 / num2;
        } else if (operator.equals("%")) {
            return num1 % num2;
        } else {
            System.out.println("Not an operator");
        }
       return result ;

    }
}