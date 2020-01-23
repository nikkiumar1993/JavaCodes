package Replit;

public class BadProducts {
    public static boolean badP(int[] products,int limit)
    {
        int count = 0;
        for(int i = 0; i < products.length; i++){
            if(products[i]==0){
                count++;
            }
        }
        System.out.println(count);
        if(count>limit){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        int[] p = {1,2,1,0,4,6,0};
        int limit = 3;
        System.out.println(badP(p, 2));

    }
}
