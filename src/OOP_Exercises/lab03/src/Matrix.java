package OOP_Exercises.lab03.src;

import java.util.Scanner;

public class Matrix {

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (100 * Math.random());
            }
        }
        return matrix;
    }

    public static double[][] createRandomMatrix(int[][] matrix) {
        double[][] doubleMat = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                doubleMat[i][j] = (30 * Math.random());
            }
        }
        return doubleMat;
    }

    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            return true;
        }
        return false;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            return true;
        }
        return false;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col < matrix1[0].length; col++) {
                    resultMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
        }
        return resultMatrix;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] resultMatrix = new double[matrix1.length][matrix1[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col < matrix1[0].length; col++) {
                    resultMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
        }
        return resultMatrix;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col < matrix1[0].length; col++) {
                    resultMatrix[row][col] = matrix1[row][col] - matrix2[row][col];
                }
            }
        }
        return resultMatrix;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] resultMatrix = new double[matrix1.length][matrix1[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col < matrix1[0].length; col++) {
                    resultMatrix[row][col] = matrix1[row][col] - matrix2[row][col];
                }
            }
        }
        return resultMatrix;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] res = new int[matrix1.length][matrix2[0].length];

        if (matrix1[0].length == matrix2.length) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    res[i][j] = 0;
                    for (int k = 0; k < matrix1[0].length; k++) {
                        res[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        }
        return res;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double[][] res = new double[matrix1.length][matrix2[0].length];

        if (matrix1[0].length == matrix2.length) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    res[i][j] = 0;
                    for (int k = 0; k < matrix1[0].length; k++) {
                        res[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.close();

        int[][] intMatrix1 = createRandomMatrix(rows, cols);
        System.out.println("Matrix 1: ");
        print(intMatrix1);
        int[][] intMatrix2 = createRandomMatrix(cols, rows);
        System.out.println("Matrix 2: ");
        print(intMatrix2);

        //double[][] doubleMatrix = createRandomMatrix(intMatrix1);
        //print(doubleMatrix);

        System.out.println("Sum of 2 matrix: ");
        for (int i = 0; i < intMatrix1.length; i++) {
            for (int j = 0; j < intMatrix1[0].length; j++) {
                System.out.print(add(intMatrix1, intMatrix2)[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Subtract 2 matrix:");
        for (int i = 0; i < intMatrix1.length; i++) {
            for (int j = 0; j < intMatrix1[0].length; j++) {
                System.out.print(subtract(intMatrix1, intMatrix2)[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Multiply 2 matrix: ");
        print(multiply(intMatrix1, intMatrix2));
    }
}
