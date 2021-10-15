package com.pb.gavryliuk.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.println("Введите целое число от 0 до 100: ");
        x = in.nextInt();

        if (x >= 0 && x <= 14) {
            System.out.println("Диапазон [0-14]");
        }
        else if (x >= 15 && x <= 35) {
            System.out.println("Диапазон [15-35]");
        }
        else if (x >= 36 && x <= 50) {
            System.out.println("Диапазон [36-50]");
        }
        else if (x >= 51 && x <= 100) {
            System.out.println("Диапазон [51-100]");
        }
        else {
            System.out.println("Вы ввели неверное число, оно находится вне диапазонов");
        }
    }
}