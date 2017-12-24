/*
* This Class calculates the area of the triangle for the length of its sides.
* See Heron's method on the Wiki.
* The length of the sides of the triangle is set by the user.
 */
package ua.jvlab.smlnk;

import java.util.Scanner;

/**
 * @author: Sergey Melnyk.
 * @date: 24.12.2017.
 */
public class STriangle {

    /**
     * @param args the command line arguments: Declare the variables of the
     * sides of the triangle: a,b,c, p - perimeter, s - area of the triangle
     */
    double a;
    double b;
    double c;
    double p;
    double s;

    public static void main(String[] args) {

        /**
         * To enter the data of the sides of the triangle, use the class Scanner
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the first party in centimeters:");
        double a = sc.nextDouble();
        System.out.println("Enter the length of the second party in centimeters:");
        double b = sc.nextDouble();
        System.out.println("Enter the length of the third party in centimeters:");
        double c = sc.nextDouble();

        double p = (a + b + c) / 2;
        //System.out.println("Половина периметра треугольника = " + p);

        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Площадь треугольника = " + s + " cm");

    }

}
