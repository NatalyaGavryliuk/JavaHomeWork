package com.pb.gavryliuk.hw3;
import java.util.Arrays;
import java.util.Scanner;


public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + " элемент массива: ");
            array[i] = in.nextInt();
        }

        // Вывод на экран массива
        System.out.print("Введенный Вами массив: ");
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }

        // Подсчет суммы всех элементов
        int sum = 0;
        for (int num: array) {
            sum = sum + num;
        }
        System.out.print("\nСумма всех элементов массива равна = " + sum);

        // Подсчет и вывод кол-ва положительных элементов
        int counter = 0;
        for (int j : array) {
            if (j > 0) {
                counter++;
            }
        }
            System.out.print("\nКоличество положительных элементов массива = " + counter);

        // Метод пузырьков
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.print("\nСортировка массива = " + Arrays.toString(array));

    }

}