package homeworkweek6;

import java.util.Scanner;

public class Program16SumOfTwoBinaryNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st Binary number: ");
        String x=sc.next();
        System.out.println("Enter 2nd Binary number: ");
        String y=sc.next();

        int n1 = Integer.parseInt(x,2);
        int n2 = Integer.parseInt(y,2);
        int n3 = n1+n2;

        System.out.println("First value :  "+ Integer.toBinaryString(n1));
        System.out.println("Second value :  "+ Integer.toBinaryString(n2));
        System.out.println("Sum of two binary numbers:  "+ Integer.toBinaryString(n3));


    }
}
