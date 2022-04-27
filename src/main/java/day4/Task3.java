package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rands = new Random();
        int[][] randomNumbers = new int[8][12];
        int summLine=0;
        int maxSummLine=0;
        int maxSummIndex=0;

        for(int i=0;i<randomNumbers.length;i++){
            for(int j=0;j<randomNumbers[i].length;j++){
                randomNumbers[i][j] = rands.nextInt(50);
                System.out.print(randomNumbers[i][j]+" ");
                summLine=summLine+randomNumbers[i][j];

            }
            System.out.println();
            if(maxSummLine<=summLine){
                maxSummIndex=i;
                maxSummLine=summLine;
            }
            summLine=0;



        }
        System.out.println("Ответ: "+ maxSummIndex+" (индекс строки, сумма чисел в которой максимальна)");

    }
}
