package Part_3;

public class Task1 {
    public static void printCustomMatrix(int size) {
        int[][] xMatrix = new int[size][size],
                plusMatrix = new int[size][size],
                squareMatrix = new int[size][size],
                rhombMatrix = new int[size][size]
        ;
        StringBuilder xOut = new StringBuilder(),
                plusOut = new StringBuilder(),
                squareOut = new StringBuilder(),
                rhombOut = new StringBuilder();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                if (i ==  j || (i + j  == size - 1)) {
                    xMatrix[i][j] = 1;
                }

                if (i == size / 2
                        || j == size / 2) {
                    plusMatrix[i][j] = 1;
                }

                if ( i == 0 || i == size-1
                        || j == 0 || j == size-1) {
                    squareMatrix[i][j] = 1;
                }

                if (i + size/2 ==  j  || i ==  j + size/2
                        || (i + j  == size/2) || (i+j-size/2  == size - 1)) {
                    rhombMatrix[i][j] = 1;
                }

                plusOut.append(plusMatrix[i][j]).append(" ");
                xOut.append(xMatrix[i][j]).append(" ");
                squareOut.append(squareMatrix[i][j]).append(" ");
                rhombOut.append(rhombMatrix[i][j]).append(" ");
            }
            xOut.append("\n");
            plusOut.append("\n");
            squareOut.append("\n");
            rhombOut.append("\n");
        }

        System.out.println(
                xOut.append("\n")
                    .append(plusOut).append("\n")
                    .append(squareOut).append("\n")
                    .append(rhombOut).append("\n")
        );

    }
}
