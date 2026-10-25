package day1;

public class StrongNumberUsingMethods {

    public  static  int fact(int n){
        int fctrl  = 1;
        for (int i = 1; i<= n; i++){
            fctrl *= i;
        }

        return fctrl;
    }

    public static void main(String[] args){

        //Check a number is strong or not ??
        int n = 145;
        int cpy = n;
        int sum = 0;
        while (n > 0){
            int lstDgt = n%10;

            sum += fact(lstDgt);// Here we actually call the methods;
            n/=10;
        }

        System.out.println(sum == cpy ? "Strong number" :"Not a strong number");
    }
}
