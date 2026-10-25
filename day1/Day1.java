package day1;

public class Day1 {

    //Learning about methods
    //public is the access modifier which how you can access a methods throgh
    // the program;
    // static is optional but without static keywords you will call it by
    // making objects using new keywords we do with Scanners and by using
    // static you can the methods by its name.
    // int or void etc are the return type of the methods which what
    // this method will return on its calling.
    //Name of the methods anythings could be but dont  use the same name of  methods.
    // Them, there will be methods over-loading(We will study it in OOPs).
    // Parameters or arguments that are often use interachangabily.
    // [Parameters]-> When you pass the values on calling time then it will be
    // parameters
    // [Arguments] -> these parameters you accept in the function's
    // paranthesis (arguments). Then, it will be arguments.
    // But, it can be used inter-changabily.

    /*The below line till the arguments is called
    * 1. Argument signature.
    * 2. Argument prototype.
    * 3. Argument declaration*/
    public  static  int  sum(int a , int b /*Arguments*/){
        int sum = a + b;
        return sum;
    }
    public  static  void print(){
        System.out.println("hello.");
    }
    public static void main(String[] args){
        print();
        System.out.println(sum(2,3)/*Parameters*/);
    }
}



