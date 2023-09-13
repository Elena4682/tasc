package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(" Пример 1");
        String sentence = " Разделить строку на части";
        String [] words;
        String separator = "  "; // Разделитель
        words = sentence.split(separator); // Разделение строки sentence с помощью метода split()
        // Вывод результата на экран
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);
        }
        System.out.println();
        System.out.println(" Пример 2");
        String sentence1= " Разделить.строку.на.части";
        String [] words1;
        String separator1 = " \\. ";// Разделитель
        words1 = sentence1.split(separator1);
        // Вывод результата на экран
        for (int i = 0; i < words1.length; i++) {
            System.out.print(words1[i]);
        }
        System.out.println();
        System.out.println(" Пример 3");
        String sentence2= " Разделить:::строку:::на:::части";
        String [] words2;
        String separator2 = (" : ");// Разделитель
        words2 = sentence2.split(separator2);
        // Вывод результата на экран
        for (int i = 0; i < words2.length; i++) {
            System.out.print(words2[i]);
        }
    }
}