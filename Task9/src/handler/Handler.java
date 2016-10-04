package handler;

import java.awt.*;
import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Created by Сергей on 03.10.2016.
 */
public class Handler {

    public void FindBlueBalls(int countBalls){
        Basket basket = new Basket();
        basket.setCountBalls(countBalls);

        ArrayList<Ball> listBalls = new ArrayList<Ball>();
        Color[] arrayOfColors = {Color.black,Color.green,Color.blue,Color.blue,Color.gray,Color.green,Color.blue,Color.black,Color.blue,Color.blue};

        for(int i =0;i<countBalls;i++){
            listBalls.add(new Ball());
            listBalls.get(i).setColorOfBall(arrayOfColors[i]);
        }

        basket.setListBalls(listBalls);
        int countBlueBalls = 0;

        for(Ball ball: basket.getListBalls()){
            if(ball.getColorOfBall()==Color.blue){
                countBlueBalls++;
            }
        }

        System.out.printf("Count balls in basket = %d and from this balls we have %d blue balls.",basket.getCountBalls(),countBlueBalls);
    }
}
