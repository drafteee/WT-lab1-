package main;

import handler.Handler;

import java.util.Scanner;

/**
 * Created by Сергей on 29.09.2016.
 */
public class Main {
    public static void main(String[] args){
        Handler handler = new Handler();
        Scanner scanner = new Scanner(System.in);
        System.out.print(handler.Task1(scanner.nextDouble(),scanner.nextDouble()));
    }
}
