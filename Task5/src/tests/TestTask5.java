package tests;

import handler.Handler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Сергей on 02.10.2016.
 */
public class TestTask5 {

    Handler handler = new Handler();

    @Test
    public void TestOnlyIncreasingSequence(){
        handler.MakeIncreasingSequence(new int[]{1,2,3,4,5});
        Assert.assertTrue(handler.IsIncreasingSequence());
    }

    @Test
    public void TestOnlyDecreasingSequence(){
        handler.MakeIncreasingSequence(new int[]{5,4,3,2,1});
        Assert.assertFalse(handler.IsIncreasingSequence());
    }
}
