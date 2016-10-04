package tests;

import handler.Handler;
import org.junit.Test;

/**
 * Created by Сергей on 02.10.2016.
 */
public class TestTask6 {
    Handler handler = new Handler();

    @Test
    public void TestNegativeValues(){
        handler.CreateMatrix(new int[]{-5,-2,-6,-3,-7});
    }

    @Test
    public void TestDifferentValues(){
        handler.CreateMatrix(new int[]{-5,2,6,-3,-7});
    }
}
