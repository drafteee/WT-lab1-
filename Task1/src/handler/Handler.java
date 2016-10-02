package handler;

/**
 * Created by Сергей on 29.09.2016.
 */
public class Handler {
    public static int Sum(int a ,int b){
        return a+b;
    }

    public double Task1(double x,double y){
        double numerator = 1 + Math.pow(Math.sin(x+y),2);
        double denominator = 2 + Math.abs(x - (2*x/(1 + x*x*y*y)));
        return (numerator/denominator + x);
    }
}
