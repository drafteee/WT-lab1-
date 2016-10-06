package main;

import handler.Handler;

import java.util.Scanner;

/**
 * Created by Сергей on 30.09.2016.
 */
public class Main {
    public static void main(String[] args){
        Handler handler = new Handler();
        Scanner scanner = new Scanner(System.in);

        double startPosition = scanner.nextDouble();
        double finishPosition = scanner.nextDouble();
        double step = scanner.nextDouble();

        handler.OutputFunction(startPosition,finishPosition,step);
    }
}
