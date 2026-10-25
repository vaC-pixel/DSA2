package day1;

public class PrimeNumbersUsingMethods {

    //Check whether a number is prime or not using methods??
    public  static int prime(int a , int cnt){
        for (int i = 1; i <= a; i++){
            if(i == 1){
                continue;
            } else {
                if (a%i == 0) cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        int n = 6, count = 0;
        System.out.println(prime(n,count) == 1 ? "Prime": " Not Pirme");
    }
}
