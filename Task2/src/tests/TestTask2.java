package tests;

import handler.Handler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Сергей on 30.09.2016.
 */
public class TestTask2 {
    @Test
    public void TestBorderValues(){
        Assert.assertTrue(Handler.IsInputArea(4,0));
    }

    @Test
    public void TestAngleArea(){
        Assert.assertTrue(Handler.IsInputArea(4,5));
    }
}
