package main;

import handler.Handler;

import java.util.Scanner;

/**
 * Created by Сергей on 03.10.2016.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Handler handler = new Handler();

        int sizeSequence = scanner.nextInt();
        int[] firstSequence = new int[sizeSequence];
        int[] secondSequence;

        sizeSequence = scanner.nextInt();
        secondSequence = new int[sizeSequence];

        System.out.print("Input values for first increasing sequence:");
        for(int i=0;i<firstSequence.length;i++)
            firstSequence[i] = scanner.nextInt();

        System.out.print("Input values for second increasing sequence:");
        for(int i=0;i<secondSequence.length;i++)
            secondSequence[i] = scanner.nextInt();

        int[] outputArray = handler.CreateIncreasingSequence(firstSequence,secondSequence);

        System.out.print("One increasing sequence from two increasing sequence: ");
        for(int i =0;i<outputArray.length;i++)
            System.out.print(outputArray[i] + " ");
    }
}
