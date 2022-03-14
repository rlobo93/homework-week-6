package homeworkweek6;

import java.util.Scanner;

public class Program10Multiplication {
    public static void main(String[] args) {
        //Multiplication
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int num = sc.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(num + "X" + i + "=" + (num*i));
        }
    }
}
