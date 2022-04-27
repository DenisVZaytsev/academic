package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rands = new Random();
        int[] randomNumbers = new int[100];
        int sumNeighboringElements=0;
        int maxSumNeighboringElements=0;
        int indexSumNeighboringElements=0;


        for (int i=0;i<100;i++) {
            randomNumbers[i] = rands.nextInt(10000);

        }

        for(int j=0;j<=97;j++){
            sumNeighboringElements=randomNumbers[j]+randomNumbers[j+1]+randomNumbers[j+2];

            if(sumNeighboringElements>maxSumNeighboringElements) {
                maxSumNeighboringElements=sumNeighboringElements;
                indexSumNeighboringElements=j;

            }
            sumNeighboringElements=0;




        }
        System.out.println(maxSumNeighboringElements);
        System.out.println(indexSumNeighboringElements);


    }
}
