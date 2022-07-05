package org.example;

import java.io.Console;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       /*
       exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6(in);
        exercise7(in);
        exercise8();
        exercise9();
        exercise10();
        exercise11(in);
        exercise12(in);
        exercise13();
        exercise14();
        exercise15();
        exercise16();

        exercise17(in);


        exercise31();


        exercise32(in);


        exercise33(in);


        exercise37(in);


        exercise38(in);


        exercise39();

        exercise40(in);

        */
        exercise42();
    }

    public static void exercise1() {
        System.out.println("Hello\nJarne Staal");
    }

    public static void exercise2() {
        System.out.println(sum(74, 36));
    }

    public static void exercise3() {
        System.out.println(divide(53, 3));
    }

    public static void exercise4() {
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    public static void exercise5() {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int firstnum = in.nextInt();
        System.out.print("Input second number: ");
        int secondnum = in.nextInt();
        System.out.println(multiply(firstnum, secondnum));
    }

    public static void exercise6(Scanner in) {
        System.out.print("Input number: ");
        int number = in.nextInt();
        System.out.print("Input another number: ");
        int number2 = in.nextInt();
        System.out.println(sum(number, number2));


        System.out.print("Input number: ");
        int number3 = in.nextInt();
        System.out.print("Input another number: ");
        int number4 = in.nextInt();
        System.out.println(minus(number3, number4));


        System.out.print("Input number: ");
        int number5 = in.nextInt();
        System.out.print("Input another number: ");
        int number6 = in.nextInt();
        System.out.println(multiply(number5, number6));


        System.out.print("Input number: ");
        int number7 = in.nextInt();
        System.out.print("Input another number: ");
        int number8 = in.nextInt();
        System.out.println(divide(number7, number8));


        System.out.print("Input number: ");
        int number9 = in.nextInt();
        System.out.print("Input another number: ");
        int number10 = in.nextInt();
        System.out.println(mod(number9, number10));

    }

    public static void exercise7(Scanner in) {
        System.out.print("Input number: ");
        int number = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + multiply(number, i));
        }
    }

    public static void exercise8() {
        System.out.println("   J    a   v     v  a                                                  \n" +
                "   J   a a   v   v  a a                                                 \n" +
                "J  J  aaaaa   V V  aaaaa                                                \n" +
                " JJ  a     a   V  a     a");
    }

    public static void exercise9() {
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }

    public static void exercise10() {
        System.out.println(4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
    }

    public static void exercise11(Scanner in) {
        //print area and perimeter of a circle
        System.out.print("Input radius: ");
        double radius = in.nextDouble();
        System.out.println("Perimeter: " + perimeterOfCircle(radius));
        System.out.println("Area: " + areaOfCircle(radius));
    }

    public static void exercise12(Scanner in) {
        System.out.print("Input number: ");
        double number = in.nextInt();
        System.out.print("Input number: ");
        double number2 = in.nextInt();
        System.out.print("Input number: ");
        double number3 = in.nextInt();
        System.out.print("Average is " + average(number, number2, number3));
    }

    public static void exercise13() {
        //print area and perimeter of a rectangle
        double width = 5.5;
        double height = 8.5;
        System.out.println("Perimeter: " + perimeterOfRectange(width, height));
        System.out.println("Area: " + areaOfRectangle(width, height));
    }

    public static void exercise14() {
        System.out.println("* * * * * * ==================================                                                                \n" +
                " * * * * *  ==================================                                                                \n" +
                "* * * * * * ==================================                                                                \n" +
                " * * * * *  ==================================                                                                \n" +
                "* * * * * * ==================================                                                                \n" +
                " * * * * *  ==================================                                                                \n" +
                "* * * * * * ==================================                                                                \n" +
                " * * * * *  ==================================                                                                \n" +
                "* * * * * * ==================================                                                                \n" +
                "==============================================                                                                \n" +
                "==============================================                                                                \n" +
                "==============================================                                                                \n" +
                "==============================================                                                                \n" +
                "==============================================                                                                \n" +
                "==============================================");
    }

    public static void exercise15() {
        int a, b, temp;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = " + a + ", " + +b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = " + a + ", " + +b);
    }

    public static void exercise16() {
        System.out.println(" +\"\"\"\"\"+                                                 \n" +
                "[| o o |]                                                \n" +
                " |  ^  |                                                 \n" +
                " | '-' |                                                 \n" +
                " +-----+");
    }

    public static void exercise17(Scanner in) {
        System.out.println("Input first binary number: ");
        String first = in.nextLine();
        System.out.println("Input second binary number: ");
        String second = in.nextLine();
        System.out.println("Sum of binary numbers: " + addBinary(first, second));

    }

//    public static void exercise18(Scanner in){
//        System.out.println("Input first binary number: ");
//        String first = in.nextLine();
//        System.out.println("Input second binary number: ");
//        String second = in.nextLine();
//        System.out.println("Multiplication of binary numbers: " + multiplyBinary(first, second));
//    }

    public static void exercise31() {
        System.out.println("\nJava Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");
    }

    public static void exercise32(Scanner in) {
        System.out.println("Input number: ");
        int number1 = in.nextInt();
        System.out.println("Input number: ");
        int number2 = in.nextInt();


        //check in switch if number is not equals to number2
        if (number1 == number2)
            System.out.printf("%d == %d\n", number1, number2);
        if (number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);
    }

    public static void exercise33(Scanner in) {
        //compute the sum of the digits of a number
        System.out.println("Input number: ");
        int number = in.nextInt();
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits: " + sum);

    }

    public static void exercise37(Scanner in){
        System.out.println("Input string: ");
        String input = in.nextLine();
        StringBuilder str2 = new StringBuilder();
        for (int i = input.length()-1; i >= 0; i--) {
            str2.append(input.charAt(i));
        }
        System.out.println(str2);
    }

    public static void exercise38(Scanner in){
        System.out.println("Input a string: ");
        String input = in.nextLine();

        //get amount of letters of input
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others =  0;

        for (int i = 0; i <= input.length()-1; i++) {
            if(Character.isLetter(input.charAt(i)))
                letters++;
            else if(Character.isSpaceChar(input.charAt(i)))
                spaces++;
            else if(Character.isDigit(input.charAt(i)))
                numbers++;
            else
                others++;
        }
        System.out.println("The string is : "+input);
        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Others: " + others);
    }

    public static void exercise39(){
        int[] numbers = {1, 2, 3, 4};
        int combinations = 0;
        //create unique three-digit numbers using numbers array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = 0; k < numbers.length; k++) {
                    if (i != j && i != k && j != k) {
                        System.out.println(numbers[i] + "" + numbers[j] + "" + numbers[k]);
                        combinations++;
                    }
                }
            }
        }

        System.out.println("There are " + combinations + " combinations");

    }

    public static void exercise40(Scanner in){
        System.out.print("Input a char: ");
        String input = in.nextLine();
        int chr = input.charAt(0);
        System.out.println("The ASCII value of Z is : "+chr);
    }

    public static void exercise42(){

        Console cnsl
                = System.console();

        if (cnsl == null) {
            System.out.println(
                    "No console available");
            return;
        }

        // Read line
        String str = cnsl.readLine(
                "Enter username : ");

        // Print username
        System.out.println(
                "Username : " + str);

        // Read password
        // into character array
        char[] ch = cnsl.readPassword(
                "Enter password : ");

        // Print password
        System.out.println(
                "Password : " + ch);

//            Scanner in = new Scanner(System.in);
//            String password = in.nextLine();
//
//            System.out.println("Your password is: " + new String(password));


    }

    //method that adds two binary numbers
    public static String addBinary(String first, String second) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = first.length() - 1;
        int j = second.length() - 1;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += first.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += second.charAt(j) - '0';
            }
            result.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        if (carry != 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static double perimeterOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double areaOfRectangle(double width, double height) {
        return width * height;
    }

    public static double perimeterOfRectange(double width, double height) {
        return 2 * (width + height);
    }


    //sum of two numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    //divide two numbers
    public static int divide(int a, int b) {
        return a / b;
    }

    //multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    //minus two numbers
    public static int minus(int a, int b) {
        return a - b;
    }

    //modulo of two numbers
    public static int mod(int a, int b) {
        return a % b;
    }

}