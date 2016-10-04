package main;

import handler.Handler;

import java.util.Scanner;

/**
 * Created by Сергей on 02.10.2016.
 */
public class Main {
    public static void main(String[] args) {

        Handler handler = new Handler();
        Scanner scanner = new Scanner(System.in);

        int sizeOfArray = scanner.nextInt();
        int[] arrayOfInt = new int[sizeOfArray];

        for(int i=0;i<sizeOfArray;i++)
            arrayOfInt[i] = scanner.nextInt();

        handler.CreateMatrix(arrayOfInt);

    }
}