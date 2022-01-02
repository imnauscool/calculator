package com.company;

import java.util.Scanner;

public class Main {
    public static double answer;
    public static Scanner in = new Scanner(System.in);
    public static boolean done = false;

    public static void main(String[] args) {

        System.out.println("Enter your expression:");
        System.out.println("Num: ");
        double firstNum = in.nextDouble();
        in.nextLine();

        while (!done) {
            System.out.println("Operator: ");
            String operand = in.nextLine();

            if (operand.equals("=")) {
                break;
            }
            System.out.println("Num: ");
            double secondNum = in.nextDouble();
            in.nextLine();

            calculate(firstNum, operand, secondNum);
            firstNum = answer;
        }
        System.out.println("Answer: " + answer);
    }

    public static void calculate(double num1, String equ, Double num2) {

        switch (equ) {

            case ("+"):
                answer = (num1 + num2);
                break;

            case ("-"):
                answer = (num1 - num2);
                break;

            case ("*"):
                answer = (num1 * num2);
                break;

            case ("/"):
                answer = (num1 / num2);
                break;
        }
    }
}