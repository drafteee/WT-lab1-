package handler;

import java.util.Vector;

/**
 * Created by Сергей on 02.10.2016.
 */
public class Handler {

    public boolean IsIncreasingSequence() {
        return isIncreasingSequence;
    }

    private boolean isIncreasingSequence;

    public void MakeIncreasingSequence(int[] arrayOfInt){

        int[] d = new int[arrayOfInt.length];
        int[] p = new int[arrayOfInt.length];

        for (int i = 0; i < arrayOfInt.length; ++i) {
            d[i] = 1;
            p[i] = -1;
            for (int j = 0; j < i; ++j) {
                if (arrayOfInt[j] < arrayOfInt[i]) {
                    if (1 + d[j] > d[i]) {
                        d[i] = 1 + d[j];
                        p[i] = j;
                    }
                }
            }
        }

        int ans = d[0], pos = 0;
        for (int i = 0; i < arrayOfInt.length; ++i) {
            if (d[i] > ans) {
                ans = d[i];
                pos = i;
            }
        }
        System.out.printf("Length new sequence = %d.\n",ans);

        if(ans == arrayOfInt.length)
            isIncreasingSequence = true;
        else
            isIncreasingSequence = false;

        Vector<Integer> path = new Vector<Integer>();
        while (pos != -1) {
            path.addElement(pos);
            pos = p[pos];
        }

        System.out.printf("Remaining values on positions = %s.\nNew sequence: ",path);

        for (int i = path.size() - 1; i >= 0 ; i--) {
            System.out.print(arrayOfInt[path.get(i)] + " ");
        }
    }
}
