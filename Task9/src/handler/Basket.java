package handler;

import java.util.ArrayList;

/**
 * Created by Сергей on 03.10.2016.
 */
public class Basket {
    public int getCountBalls() {
        return countBalls;
    }

    public void setCountBalls(int countBalls) {
        this.countBalls = countBalls;
    }

    private int countBalls;

    public ArrayList<Ball> getListBalls() {
        return listBalls;
    }

    public void setListBalls(ArrayList<Ball> listBalls) {
        this.listBalls = listBalls;
    }

    private ArrayList<Ball> listBalls = new ArrayList<Ball>();
}
