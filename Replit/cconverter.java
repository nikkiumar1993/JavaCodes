package Replit;

import java.util.Scanner;

public class cconverter {
    public double [][] currency_rate;
    public  cconverter ()
    {
        currency_rate = new double [10][10];
        //dollar to euro
        currency_rate[1][2] =  0.5;
        //euro to  dollar
        currency_rate[2][1] = 2.0;


    }//end constractor

    public void yinterface()
    {
        System.out.println("welcome to Currency converter");
        System.out.println("Currency codes:");
        System.out.println("1 - US dollars");
        System.out.println("2 - Euros");

    }//end yinterface

    public void yinput()
    {
        int choice,output;
        double input;
        Scanner in = new Scanner(System.in);
        S.o("Please choose the input currency:");
        int inputCurrency = in.nextInt();
        S.o("Please choose the output currency:");
        int outputCur = in.nextInt();
        S.o("now enter the amount you want to convert");
        double amount = in.nextDouble();

        yconvert(inputCurrency, outputCur, amount);
    }//end yinput

    public void yconvert(int code1,int code2 , double amount)
    {
double result = currency_rate[code1][code2] * amount;
        S.o("the converted amount is: "+result);
    }//end yconvert

    public void use()
    {
        yinterface();
         yinput();

    }//end yuse
}
