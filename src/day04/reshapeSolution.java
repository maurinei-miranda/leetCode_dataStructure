package day04;

import java.util.Arrays;

public class reshapeSolution {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}};

        System.out.println(Arrays.deepToString(matrixReshape(arr, 1, 4)));
        System.out.println(Arrays.deepToString(matrixReshape(arr, 2, 4)));
        System.out.println(Arrays.deepToString(matrixReshape(arr, 4, 1)));

    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] arrReturn = new int[r][c];
        int rowControl = 0;
        int columnControl = 0;

        if (r * c != mat[0].length * mat.length) return mat;

        for (int[] ints : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                arrReturn[rowControl][columnControl] = ints[j];
                columnControl++;

                if (columnControl == c) {
                    columnControl = 0;
                    rowControl++;
                }
            }
        }
        return arrReturn;
    }
}
