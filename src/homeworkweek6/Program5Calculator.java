package homeworkweek6;

import java.util.Scanner;

public class Program5Calculator {

    public static void main(String[] args) {
        char Number;
        double num1, num2;
        Scanner cal = new Scanner(System.in);

        System.out.println("Select the Task (+, -, *, /)");
        Number = cal.next().charAt(0);

        System.out.println("Enter two numbers");
        num1 = cal.nextDouble();
        num2 = cal.nextDouble();

        cal.close();
        switch (Number) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 + num2));
                break;

            case '-':
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 - num2));
                break;
            case '*':
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 * num2));
                break;
            case '/':
                if (num2 != 0)
                    System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 / num2));
                else
                    System.out.println("Divide by Zero Situation");
                break;

            default:
                System.out.printf("%c is an invalid operator", cal);


        }
    }
}
