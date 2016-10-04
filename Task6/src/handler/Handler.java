package handler;

/**
 * Created by Сергей on 02.10.2016.
 */
public class Handler {
    public void CreateMatrix(int[] arrayOfInt){
        int[][] matrix = new int[arrayOfInt.length][arrayOfInt.length];

        for(int i=0;i<arrayOfInt.length;i++){
            for(int j=0;j<arrayOfInt.length;j++){
                matrix[i][j] = arrayOfInt[(j+i) % arrayOfInt.length];
            }
        }

        System.out.print("Output matrix: \n");
        for(int i=0;i<arrayOfInt.length;i++) {
            for (int j = 0; j < arrayOfInt.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
