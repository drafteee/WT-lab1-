package main;

import handler.Handler;

import java.util.Scanner;

/**
 * Created by Сергей on 03.10.2016.
 */
public class Main {
    public static  void main(String[] args){
        Handler handler = new Handler();
        Scanner scanner = new Scanner(System.in);

        int countBalls = scanner.nextInt();
        handler.FindBlueBalls(countBalls);
    }
}
