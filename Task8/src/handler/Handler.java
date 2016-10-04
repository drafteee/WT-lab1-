package handler;

/**
 * Created by Сергей on 03.10.2016.
 */
public class Handler {

    private int[] Cycle(int[] lessOfLastValueArray, int[] biggerOfLastValueArray) {

        int[] outputArray = new int[lessOfLastValueArray.length + biggerOfLastValueArray.length];
        int j = 0;
        int k = 0;

        for (int i = 0; i < lessOfLastValueArray.length; i++) {
            if (lessOfLastValueArray[i] < biggerOfLastValueArray[j]) {
                outputArray[k++] = lessOfLastValueArray[i];
            } else if (lessOfLastValueArray[i] == biggerOfLastValueArray[j]) {
                outputArray[k++] = biggerOfLastValueArray[j++];
                outputArray[k++] = lessOfLastValueArray[i];
            } else {
                outputArray[k++] = biggerOfLastValueArray[j++];
                i--;
            }
        }

        for (int i = j; i < biggerOfLastValueArray.length; i++)
            outputArray[k++] = biggerOfLastValueArray[i];

        return outputArray;
    }

    public int[] CreateIncreasingSequence(int[] firstSequence, int[] secondSequence) {

        if (firstSequence[firstSequence.length - 1] < secondSequence[secondSequence.length - 1]) {
            return Cycle(firstSequence, secondSequence);
        }else if(firstSequence[firstSequence.length - 1] == secondSequence[secondSequence.length - 1])
            if(firstSequence.length < secondSequence.length)
                return Cycle(firstSequence, secondSequence);
            else
                return Cycle(secondSequence, firstSequence);
        else {
            return Cycle(secondSequence, firstSequence);
        }
    }
}
