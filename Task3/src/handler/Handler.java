package handler;

/**
 * Created by Сергей on 30.09.2016.
 */
public class Handler {
    public void OutputFunction(double startPosition, double finishPosition,double step){
        if(CheckPosition(startPosition,finishPosition,step)){
            for(double i=startPosition;i<=finishPosition;i+=step){
                System.out.printf("%10.5f%10.5f\n",i,Math.tan(i));
            }
        }
    }

    private boolean CheckPosition(double startPosition, double finishPosition,double step) {
        if((step!=0)&&(startPosition<finishPosition)&&(step<finishPosition-startPosition))
            return true;
        System.out.print("Values of equal or StartPosition > FinishPosition or step=0!");
        return false;
    }
}
