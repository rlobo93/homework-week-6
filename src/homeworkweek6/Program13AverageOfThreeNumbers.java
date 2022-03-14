package homeworkweek6;

import java.util.Scanner;

public class Program13AverageOfThreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number = ");
        float a = scanner.nextFloat();
        System.out.println("Enter the second number = ");
        float b = scanner.nextFloat();
        System.out.println("Enter the third number =");
        float c = scanner.nextFloat();
        float avg = (a + b + c) / 3;
        System.out.println("The Average is " + avg);

        //method 2
        //System.out.println("Enter the first number = ");
        //int a = scanner.nextInt();
        //System.out.println("Enter the second number = ");
        //int b = scanner.nextInt();
        //System.out.println("Enter the third number =");
        //int c = scanner.nextInt();
        //int avg = (a+b+c)/3;
        //System.out.println("The Average is "+avg);


    }
}
