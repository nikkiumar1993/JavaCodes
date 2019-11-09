package IfElseStatements;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter 2 double values");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        input.nextLine();
        System.out.println("Please enter an operator from -, +, *, /");

        String operators = input.nextLine();

        double subtract = num1 - num2;
        double add = num1 + num2;
        double multiply = num1 * num2;
        double divide = num1 / num2;
//
//        if (operators.equals("-")) {
//            System.out.println("Result of " + num1 + " - " + num2 + " is " + subtract);
//        }else if (operators.equals("+")) {
//            System.out.println("Result of " + num1 + " + " + num2 + " is " + add);
//        }else if (operators.equals("*")) {
//            System.out.println("Result of " + num1 + " * " + num2 + " is " + multiply);
//        }else if (operators.equals("/")) {
//            System.out.println("Result of " + num1 + " / " + num2 + " is " + divide);
//        }else {
//            System.out.println("Invalid operator entered. Please try again!");
//        }
      switch (operators) {
          case "-":
              System.out.println(num1 + " - " + num2 + " =" + subtract);
              break;
          case "+":
              System.out.println(num1 + " + " + num2 + " =" + add);
              break;
          case "*":
              System.out.println(num1 + " * " + num2 + " =" + multiply);
              break;
          case "/":
              System.out.println(num1 + " / " + num2 + " =" + divide);
              break;
          default:
              System.out.println("Invalid operator");
      }
    }
}