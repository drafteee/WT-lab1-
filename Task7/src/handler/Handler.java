package handler;

/**
 * Created by Сергей on 03.10.2016.
 */
public class Handler {

    public int[] DoSortShell(int[] analyzeArray) {

        int temporaryValue;

        for (int i = 0; i < analyzeArray.length - 1; i++) {
            if (analyzeArray[i] > analyzeArray[i + 1]) {
                temporaryValue = analyzeArray[i];
                analyzeArray[i] = analyzeArray[i + 1];
                analyzeArray[i + 1] = temporaryValue;
                if (i - 1 >= 0)
                    i = i - 2;
            }
        }

        System.out.print("Output sorted array = ");
        for (int i = 0; i < analyzeArray.length; i++)
            System.out.print(analyzeArray[i] + " ");

        return analyzeArray;
    }
}
