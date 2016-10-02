package main;

import java.util.Scanner;

/**
 * Created by Сергей on 29.09.2016.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(handler.Handler.IsInputArea(scanner.nextInt(),scanner.nextInt()));
    }
}
