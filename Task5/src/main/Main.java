package main;

import handler.Handler;
import jdk.internal.org.objectweb.asm.Handle;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Сергей on 02.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Handler handler = new Handler();

        int sizeOfArray = scanner.nextInt();
        int[] arrayInt = new int[sizeOfArray];

        for(int i=0;i<sizeOfArray;i++)
            arrayInt[i] = scanner.nextInt();

        handler.MakeIncreasingSequence(arrayInt);
    }
}
