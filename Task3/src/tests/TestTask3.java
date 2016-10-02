package tests;

import handler.Handler;
import org.junit.Test;

/**
 * Created by Сергей on 30.09.2016.
 */
public class TestTask3 {
    @Test
    public void TestEqualPositions(){
        Handler handler =new Handler();
        handler.OutputFunction(3,3,1);
    }

    @Test
    public void TestStartMoreFinish(){
        Handler handler =new Handler();
        handler.OutputFunction(5,3,1);
    }

    @Test
    public void TestStepEqualZero(){
        Handler handler =new Handler();
        handler.OutputFunction(1,5,0);
    }
}
