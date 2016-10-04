package tests;

import handler.Handler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Сергей on 03.10.2016.
 */
public class TestTask7 {

    Handler handler = new Handler();

    @Test
    public void TestNegativeValues(){
        int[] array = handler.DoSortShell(new int[]{-3,-5,-1,-2,-7});
        Assert.assertArrayEquals(new int[]{-7,-5,-3,-2,-1},array);
    }

    @Test
    public void TestArrayOfZero(){
        int[] array = handler.DoSortShell(new int[]{0,0,1,0,0});
        Assert.assertArrayEquals(new int[]{0,0,0,0,1},array);
    }
}
