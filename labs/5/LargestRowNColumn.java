public class LargestRowNColumn {
    public static void main(String[] args) {
        int[][] matrix = randomMatrix(4, 4);
        displayMatrix(matrix);
        int[] largest = getLargest(matrix);
        System.out.println("The largest row index: " + largest[0]);
        System.out.println("The largest column index: " + largest[1]);
    }
    
    //Displaying the matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] seq : matrix) {
            for (int seq1 : seq) {
                System.out.print(seq1);
            }
            System.out.println();
        }
    }
    
    //Generating matrix and filling randomly with 0 and 1
    public static int[][] randomMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
        return matrix;
    }
    
    //To find out the max Row and Column
    public static int[] getLargest(int[][] matrix) {
        int indexCol = 0;
        int indexRow = 0;
        int maxRow= 0;
        int maxCol = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sumofrow = 0;
            int sumofcolumn = 0;
            for (int j = 0; j < matrix[i].length; j++) {
            	sumofrow = sumofrow + matrix[i][j];
            	sumofcolumn = sumofcolumn + matrix[j][i];
            }
            if (sumofrow > maxRow) {
                maxRow = sumofrow;
                indexRow = i;
            }
            if (sumofcolumn > maxCol) {
                maxCol = sumofcolumn;
                indexCol = i;
            }
        }
        int[] store = new int[2];
        store[0] = indexRow;
        store[1] = indexCol;
        return store;
    }
}