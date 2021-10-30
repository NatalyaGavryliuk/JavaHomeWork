package com.pb.gavryliuk.hw3;
        import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = (int) Math.round(Math.random() * 100);
        System.out.println("Приветствуем Вас в игре Bingo. По правилам игры Вам необходимо угадать число от 0 до 100.");
        System.out.println("Для выхода из программы введите любое число вне диапазона [0 - 100].");
        int counter = 0;
        final int Max_counter=100;

        System.out.println("Введите целое число: ");

        while (counter<Max_counter) {
            counter++;
            int x;
            x = scanner.nextInt();

            if (x>100 || x<0) {
                break;
            }
            if (x > y) {
                System.out.println("Задуманное число меньше, чем Вы ввели.");
            }
            if (x < y) {
                System.out.println("Задуманное число больше, чем Вы ввели.");
            }
            if (x == y) {
                System.out.println("Поздравляем! Вы угадали с попытки № " + counter + ". Задуманное число = " + y + " :)");
                break;
            }
        }
        System.out.println("Игра окончена, спасибо за игру!");
    }
}
