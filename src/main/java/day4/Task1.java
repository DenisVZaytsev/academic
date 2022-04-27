package day4;

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rands = new Random();
        Scanner scanner = new Scanner(System.in);
        int overEigth = 0;
        int equalToOne = 0;
        int evenCount = 0;
        int oddCount = 0;
        int sum = 0;

        int size = scanner.nextInt();
        int[] randomNumbers = new int[size];
        for (int i : randomNumbers) {
            randomNumbers[i] = rands.nextInt(11);

            if (randomNumbers[i] > 8) {
                overEigth++;
            }

            if (randomNumbers[i] == 1) {
                equalToOne++;
            }

            if (randomNumbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            sum = sum + randomNumbers[i];
        }
        System.out.println("Длина массива: " + size);
        System.out.println("Количество чисел больше 8: " + overEigth);
        System.out.println("Количество чисел равных 1: " + equalToOne);
        System.out.println("Количество четных чисел: " + evenCount);
        System.out.println("Количество нечетных чисел: " + oddCount);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}
