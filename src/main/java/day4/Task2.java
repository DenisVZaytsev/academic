package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rands = new Random();
        int[] randomNumbers = new int[100];
        int max = 0;
        int min = 0;
        int countZero = 0;
        int sumZero = 0;

        for (int i : randomNumbers) {
            randomNumbers[i] = rands.nextInt(10000);

            if (max < randomNumbers[i]) max = randomNumbers[i];

            if (min > randomNumbers[i]) min = randomNumbers[i];

            if (randomNumbers[i] % 10 == 0) {
                countZero++;
                sumZero = sumZero + randomNumbers[i];
            }

        }
        System.out.println("наибольший элемент массива " + max);
        System.out.println("наименьший элемент массива " + min);
        System.out.println("количество элементов массива, оканчивающихся на " + countZero);
        System.out.println("сумму элементов массива, оканчивающихся на " + sumZero);

    }
}
