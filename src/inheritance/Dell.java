package inheritance;

public class Dell extends Laptop {
    public static void main(String[] args) {
        Dell dell = new Dell();
        dell.color = "Red";


    }
    public int[] reverse3(int[] nums) {
        int[]rev = new int[nums.length];
        for(int i = nums.length; i>0; i--){
            rev[i]+=nums[i];
        }
        return rev;
    }
}
