// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

package Java_HW_03_03_23;

import java.util.Scanner;

public class Task_03 {
    static int get_sum(int a, int b) {
        return a + b;
    }

    static int get_subtraction(int a, int b) {
        return a - b;
    }

    static int get_product(int a, int b) {
        return a * b;
    }

    static double get_division(int a, int b) {
        return (double) a / (double) b;
    }

    static void print_result_of_operation(int a, int b, String sign_operation) {
        switch (sign_operation) {
        case "+":
            System.out.printf("%d %s %d = %d \n", a, sign_operation, b, get_sum(a, b));
            break;
        case "-":
            System.out.printf("%d %s %d = %d \n", a, sign_operation, b, get_subtraction(a, b));
            break;
        case "*":
            System.out.printf("%d %s %d = %d \n", a, sign_operation, b, get_product(a, b));
            break;
        case "/":
            if (b != 0) {
                System.out.printf("%d %s %d = %.4333f \n", a, sign_operation, b, get_division(a, b));
            } else {
                System.out.println("ERROR: division by zero!!!");
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.printf("Enter first number: ");
        int a = 0;
        if (!scn.hasNextInt()) {
            System.out.println("You entered wrong number!!!");
        } else {
            a = scn.nextInt();
            Scanner sc = new Scanner(System.in);
            System.out.printf("Enter sign of operation from list: +, -, *, / \n");
            String sign_operation = "";
            if (sc.hasNextLine()) {
                sign_operation = sc.nextLine();
            }
            if (sign_operation.equals("+") || sign_operation.equals("-") || sign_operation.equals("*")
                    || sign_operation.equals("/")) {
                int b = 0;
                System.out.printf("Enter second number: ");
                if (!scn.hasNextInt()) {
                    System.out.println("You entered wrong number!!!");
                } else {
                    b = scn.nextInt();
                    Task_03.print_result_of_operation(a, b, sign_operation);
                }
            } else {
                System.out.println("You entered wrong operation!!!");
            }
            scn.close();
            sc.close();
        }
    }
}
