package com.pb.gavryliuk.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;

        System.out.println("Введите 1-ое целое число: ");
        operand1 = in.nextInt();
        System.out.println("Введите 2-ое целое число: ");
        operand2 = in.nextInt();
        System.out.println("Введите математичсекий знак (+, -, *, /): ");
        sign = in.next();

        switch (sign) {
            case "+":
                System.out.println("Значение = " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Значение = " + (operand1 - operand2));
                break;
            case "*":
                System.out.println("Значение = " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Деление на 0 запрещено!");
                } else {
                    System.out.println("Значение = " + (operand1 / operand2));
                }
                break;
            default:
                System.out.println("Вы ввели неверный знак");
                break;

        }


    }
}