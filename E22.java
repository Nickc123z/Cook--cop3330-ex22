/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Nick Cook
 */




import java.util.Scanner;


public class E22 {
    public static void main(String[] args) {

        int num = 0;
        int num1 = 0;
        int num2 = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num = scan.nextInt();
        System.out.print("Enter the second number: ");
        num1 = scan.nextInt();
        System.out.print("Enter the third number: ");
        num2 = scan.nextInt();

        if (num > num1 && num > num2) {
            System.out.print("The largest number is " + num);
        }
        if (num1 > num && num1 > num2) {
            System.out.print("The largest number is " + num1);
        }
        if (num2 > num && num2 > num1) {
            System.out.print("The largest number is " + num2);
        }
    }
}
