package tests;

import handler.Handler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Сергей on 03.10.2016.
 */
public class TestTask8 {

    Handler handler = new Handler();

    @Test
    public void TestOnlySameValues(){
        int[] array = handler.CreateIncreasingSequence(new int[]{1,1,1,1,1},new int[]{1,1,1,1,1,1});
        Assert.assertArrayEquals(new int[]{1,1,1,1,1,1,1,1,1,1,1},array);
    }

    @Test
    public void TestAlternation(){
        int[] array = handler.CreateIncreasingSequence(new int[]{0,2,4,6},new int[]{1,3,5,7});
        Assert.assertArrayEquals(new int[]{0,1,2,3,4,5,6,7},array);
    }
}
