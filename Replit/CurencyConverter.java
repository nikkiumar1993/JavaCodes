package Replit;

public class CurencyConverter {
    public static double convertC(String[][] money,String[][] convertionRate)
    {
        double  result = 0;


            for (int i = 0; i < money.length; i++) {
                double a = Double.parseDouble(money [i][1] );
                double b = Double.parseDouble(convertionRate [i] [1]);

                result+= (a*b);
            }



        return result;


    }





    public static void main(String[] args)
    {
        String[][] test_money =
                {
                        {"mark","5"},
                        {"shekel","30.5"},
                };

        String[][] test_convert=
                {
                        {"mark","1"},
                        {"shekel","0.5"},
                };

        double res = convertC(test_money,test_convert);
        System.out.print(res);

    }
}
