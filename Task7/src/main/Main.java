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

        int sizeOfArray = scanner.nextInt();
        int[] arrayOfInt = new int[sizeOfArray];

        for(int i=0;i<sizeOfArray;i++)
            arrayOfInt[i] = scanner.nextInt();

        handler.DoSortShell(arrayOfInt);
    }
}
