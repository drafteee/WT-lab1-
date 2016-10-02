package tests;

import handler.Handler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Сергей on 29.09.2016.
 */
public class Lab1Test {
    private Handler handler = new Handler();

    @Test
    public void TestNegativeValues(){
        Assert.assertEquals(handler.Task1(-4,-1),-3.65,0.01);
    }

    @Test
    public void TestZero(){
        Assert.assertEquals(handler.Task1(0,0),0.5,0.1);
    }

    @Test
    public void TestDouble(){
        Assert.assertEquals(handler.Task1(0.5,0.7),1.28,0.01);
    }
}
