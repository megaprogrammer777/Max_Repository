package org.example.homework_5;

import java.util.Arrays;

public class HomeworkNr6 {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        for (int i = 0; i < 100; i++) {
            numbers[i] = 100 - i;
        }


        for (int number : numbers) {
            System.out.print(number + " ");
        }


        for (int i = 0; i < 100; i++) {
            numbers[i] = 100 - i;
        }
// Сумма четных элементов
        int sumOfEven = 0;
        //Произведение нечетных элементов
        long productOfOdd = 1;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sumOfEven += number;
            } else {
                productOfOdd *= number;
            }
        }
        System.out.println("Сумма четных чисел" + sumOfEven);
        System.out.println("Произведение нечетных чисел" + productOfOdd);

        int u;


        int[] copyNumbers = {1, 2, 3, 4, 5, 6};
        int[] destinationArray = Arrays.copyOf(copyNumbers, numbers.length);
        for (int i = 0; i < 100; i++) {

            System.out.println("Четные числа"+i );
            int a;


        }
    }
}
