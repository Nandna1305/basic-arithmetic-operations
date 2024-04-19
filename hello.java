import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String args[]){
//to create a object using class scanner
        Scanner nandana = new Scanner(System.in);
//for storing values/assigning values
        int a = nandana.nextInt();
        int b = nandana.nextInt();
 //for printing the output
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
