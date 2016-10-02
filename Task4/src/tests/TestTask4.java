package tests;

import handler.Handler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Сергей on 02.10.2016.
 */
public class TestTask4 {

    Handler handler = new Handler();

    @Test
    public void TestOnlyUncompoundedValues(){
        handler.CheckPrimes(new int[]{1,2,3,5,7,11,13,17});
        Assert.assertTrue(handler.IsAllArray());
    }

    @Test
    public void TestOnlyCompoundedValues(){
        handler.CheckPrimes(new int[]{4,6,8,9,10,12,14,15});
        Assert.assertFalse(handler.IsAllArray());
    }
}
