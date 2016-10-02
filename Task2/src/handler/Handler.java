package handler;

/**
 * Created by Сергей on 30.09.2016.
 */
public class Handler {
    public static boolean IsInputArea(int x,int y){
        if((((y>=0 && y<=5) && Math.abs(x)<=4))||((y<=0 && y>=-3)&& Math.abs(x)<=6))
            return true;
        return false;
    }
}
