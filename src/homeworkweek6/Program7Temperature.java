package homeworkweek6;

import java.util.Scanner;

public class Program7Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f;
        double cel;

        System.out.println("Enter the temperature in Fahrenhelt: ");
        f = sc.nextFloat();
        cel = (f-32)*5/9;
        System.out.println("\nFahrenhelt is : "+f);
        System.out.println("\nCelcius is : "+cel);


    }

}
