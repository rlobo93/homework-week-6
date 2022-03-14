package homeworkweek6;

import java.util.Scanner;

public class Program8AreaOfTriangle {
    public static void main(String[] args) {

        double base;
        double height;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the triangle base : ");
        base = sc.nextDouble();

        System.out.println("Enter the triangle height : ");
        height = sc.nextDouble();

        double Area = (base*height)/2;
        System.out.println("The Area of Triangle is :" + Area);

    }
}
