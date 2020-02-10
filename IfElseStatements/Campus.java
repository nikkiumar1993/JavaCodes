package IfElseStatements;
import  java.util.Scanner;

public class Campus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int num = input.nextInt();
//         if ( num >= 8 && num <= 23) {
//             System.out.println("Open");
//         }else if (num > 24) {
//             System.out.println("Closed");
//         }else {
//             System.out.println("Invalid Time");
//         }
//        int number = 30;
//        if (number >= 0 && number <= 50) {
//            if(number >= 10 && number <=40){
//                if (number >=20 && number <= 30) {
//                    System.out.println("Your number is good");
//                }else {
//                    System.out.println("Not in the 20 - 30 range");
//                }
//            }
//        }else {
//            System.out.println("not in the range");
//        }

//        System.out.println("Enter your weight and height");

//        double weight = input.nextDouble();
//        double height = input.nextDouble();
//        double bmi = (weight/(height* height));
//        if(bmi < 18.5) {
//            System.out.println("Underweight");}
//
//        if (bmi >= 18.5 && bmi <=25) {
//            System.out.println("Normal weight");
//        }
//        if ( bmi >= 25 && bmi <30) {
//            System.out.println("Overweight");
//        }else{
//            if (bmi >= 30) {
//                System.out.println("Obese");
//            }
//        }
//
//    }
//
//        System.out.println("Enter number of babies");
//        int numberOfBabies = input.nextInt();
//
//        switch (numberOfBabies) {
//            case 0:
//                System.out.println("Sorry");
//                break;
//            case 1:
//                System.out.println("Good for you");
//                break;
//            case 2:
//                System.out.println("Wow. Twins");
//                break;
//            case 3:
//                System.out.println("Wow. Triplets!");
//                break;
//            case 4:
//            case 5:
//
//            case 6:
//                System.out.println("Unbelievable: " + numberOfBabies + " babies");
//            break;
//            default:
//                System.out.println("I don't believe you!");
//
//
//        }
//           String fruit = "apple";
//           switch (fruit){
//               case "oranges":
//                   System.out.println("Oranges are sweet");
//                   break;
//               case "banana":
//               case "apple":
//                   System.out.println("My favorite");
//                   break;
//               default:
//                   System.out.println("Not a fruit");
//           }

//        System.out.println("What is your letter grade?");

//        char c = input.nextLine().charAt(0);
//
//        switch (c) {
//            case 'a':
//            case 'A':
//
//                System.out.println("Excellent");
//                break;
//            case 'b':
//            case 'B':
//                System.out.println("Great");
//                break;
//            case 'c':
//            case 'C':
//                System.out.println("Okay");
//                break;
//            case 'd':
//            case 'D':
//                System.out.println("You can do better");
//                break;
//            case 'f':
//            case 'F':
//                System.out.println("Something needs to change");
//                break;
//            default:
//                System.out.println("Not a valid grade");

        System.out.println("Enter a number from 1 to 9");

        int num = input.nextInt();
        String word = "";

        switch (num) {
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "seven";
                break;
            case 8:
                word = "eight";
                break;
            case 9:
                word = "nine";
                break;
            default:
                word = "Invalid number";
        }
        System.out.println(word);


    }
}

