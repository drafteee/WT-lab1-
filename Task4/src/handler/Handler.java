package handler;

/**
 * Created by Сергей on 02.10.2016.
 */
public class Handler {

    private boolean isAllArray;

    public boolean IsAllArray() {
        return isAllArray;
    }

    public void SetAllArray(boolean allArray) {
        isAllArray = allArray;
    }

    public void CheckPrimes(int[] arrayInt){

        for(int i=0;i<arrayInt.length;i++){

            int randomValue = (int)Math.random()* ++arrayInt[i] + 2;
            --arrayInt[i];

            int leftSide = (int)((long)Math.pow(randomValue,arrayInt[i]) % arrayInt[i]);
            int rightSide = randomValue % arrayInt[i];

            if(((arrayInt[i]==1) || (arrayInt[i]==2))||((leftSide == rightSide) && (arrayInt[i] % 2 != 0))){
                System.out.printf("Value of index %d = %d uncompounded.\n",i+1,arrayInt[i]);
                SetAllArray(true);
            }else
                SetAllArray(false);
        }
    }
}
