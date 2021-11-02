package com.pb.gavryliuk.hw4;
import java.util.Scanner;

public class CapitalLetter {
    static String bigLetter() {
       return "Новая строка: ";
    }
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            StringBuilder Str1 = new StringBuilder(bigLetter());
            System.out.println("Напишите фразу: ");
            String str = scanner.nextLine();
            Str1.append(str.substring(0, 1).toUpperCase());

            for (int i = 1; i < str.length(); ++i) {
                if (" ".equals(str.substring(i - 1, i))) {
                    Str1.append(str.substring(i, i + 1).toUpperCase());
                } else {
                    Str1.append(str.charAt(i));
                }
            }
        System.out.println(Str1);
    }
}
