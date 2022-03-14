package homeworkweek6;

import java.util.Scanner;

public class Program17DecimalNumberToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Number: ");
        int d=sc.nextInt();
        System.out.println("Binary number is: " + Integer.toBinaryString(d));
    }
}
