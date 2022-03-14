package homeworkweek6;

import java.util.Scanner;

public class Program18SumOFNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value");
        int num1 = sc.nextInt();
        System.out.println("Enter Second value");
        int num2 = sc.nextInt();

        int addition,subbtraction,multiplication,divide,mod;
        addition = num1+num2;
        subbtraction = num1-num2;
        multiplication = num1 * num2;
        divide = num1/num2;
        mod = num1 % num2;

        System.out.println(num1 + " + " +  num2 + " = " + addition);
        System.out.println(num1 + " - " +  num2 + " = " + subbtraction);
        System.out.println(num1 + " * " +  num2 + " = " + multiplication);
        System.out.println(num1 + " / " +  num2 + " = " + divide);
        System.out.println(num1 + " mod " +  num2 + " = " + mod);

    }

}
