package day1;

public class StrongNumber {
    public static void main(String[] args){

        //Check a number is strong or not ??
        int n = 40585;
        int cpy = n;
        int sum = 0;
        while (n > 0){
            int lstDgt = n%10;
            int fctrl  = 1;
            for (int i = 1; i<= lstDgt; i++){
                fctrl *= i;
            }
            sum += fctrl;
            n/=10;
        }

        System.out.println(sum == cpy ? "Strong number" :"Not a strong number");
    }
}
