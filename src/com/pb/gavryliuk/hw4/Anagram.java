package com.pb.gavryliuk.hw4;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s, s1;
        System.out.println("Напишите 2 фразы: "); // Предлагаем пользователю ввести 2 фразы
        s = scanner.nextLine();   // Выводим  1-ую фразу
        s1 = scanner.nextLine();   // Выводим 2-ую фразу

        s = s.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ]", "");
        s1 = s1.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ]", "");

        s = s.toLowerCase();
        s1 = s1.toLowerCase();

        char[] str = s.toCharArray();
        Arrays.sort(str);
        char[] str1 = s1.toCharArray();
        Arrays.sort(str1);
        if (Arrays.equals(str, str1)) {
            System.out.println("Вы ввели анаграмму");
        } else {
            System.out.println("Вы ввели не анаграмму");
        }
    }
}

