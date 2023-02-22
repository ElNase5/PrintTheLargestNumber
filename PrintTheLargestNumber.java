import javax.swing.*;
import java.util.Scanner;
class PrintTheLargestNumber {
    public static void main(String[] args){
        System.out.print("Enter the first number:");
        int a= new Scanner(System.in).nextInt();
        System.out.print("Enter the second number:");
        int b= new Scanner(System.in).nextInt();
        System.out.print("Enter the third number:");
        int c= new Scanner(System.in).nextInt();
        if (a>b){
            if (a>c)
                System.out.println(a);
            else
                System.out.println(c);
        }
        else {
            if (b>c)
                System.out.println(b);
            else
                System.out.println(c);
        }
    }
}

