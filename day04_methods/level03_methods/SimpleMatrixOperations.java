import java.util.Scanner;

public class SimpleMatrixOperations {

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        // Create a 2D matrix
        int[][] matrix = new int[rows][cols];
        // Iterating through loop to generate and save random numbers to matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // Random value between 0 and 9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        // Finding the size of the matrices
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        // Create a new matrix with the same size as the input matrices
        int[][] result = new int[rows][cols];
        // Iterating through loop to add elements of the matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        // Finding the size of the matrices
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        // Create a new matrix with the same size as the input matrices
        int[][] result = new int[rows][cols];
        // Iterating through loop to subtract elements of the matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        // Finding the size of the matrices
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        // Create a new matrix with the same size as the input matrices
        int[][] result = new int[rows1][cols2];
        // Iterating through loop to multiply elements of the matrices
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        // Finding the size of the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;
        // Create a new matrix with the same size as the input matrix
        int[][] result = new int[cols][rows];
        // Iterating through loop to find the transpose of the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        // Calculating the determinant of the 2x2 matrix and return
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        // Calculating the determinant of the 3x3 matrix
        int det = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        return det;
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        // Calculating the determinant of the 2x2 matrix
        int det = determinant2x2(matrix);
        // checking if the determinant is zero
        if (det == 0) {
            throw new IllegalArgumentException("Matrix is singular and cannot be inverted.");
        }
        // Create an inverse array
        double[][] inverse = new double[2][2];
        // Calculating the inverse of the 2x2 matrix
        inverse[0][0] = matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] = matrix[0][0] / (double) det;
        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        // Calculating the determinant of the 3x3 matrix
        int det = determinant3x3(matrix);
        // checking if the determinant is zero
        if (det == 0) {
            throw new IllegalArgumentException("Matrix is singular and cannot be inverted.");
        }
        // Create an inverse array
        double[][] inverse = new double[3][3];
        // Calculating the inverse of the 3x3 matrix
        inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / (double) det;
        inverse[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / (double) det;
        inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / (double) det;
        inverse[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / (double) det;
        inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / (double) det;
        inverse[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / (double) det;
        inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / (double) det;
        inverse[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / (double) det;
        inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / (double) det;
        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        // Iterating through loop to display matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            // To start from a new row
            System.out.println();
        }
    }

    // Method to display a double matrix
    public static void displayDoubleMatrix(double[][] matrix) {
        // Iterating through loop to display matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            // To start from a new row
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take input for the size of matrices
        System.out.print("Enter the number of rows for the matrices: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns for the matrices: ");
        int cols = input.nextInt();

        // Generate two random matrices
        int[][] matrix1 = createRandomMatrix(rows, cols);
        int[][] matrix2 = createRandomMatrix(rows, cols);

        // Perform and display matrix operations
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        // Addition
        System.out.println("Addition of Matrix 1 and Matrix 2:");
        displayMatrix(addMatrices(matrix1, matrix2));

        // Subtraction
        System.out.println("Subtraction of Matrix 1 and Matrix 2:");
        displayMatrix(subtractMatrices(matrix1, matrix2));

        // Multiplication (if applicable)
        if (cols == matrix2.length) {
            System.out.println("Multiplication of Matrix 1 and Matrix 2:");
            displayMatrix(multiplyMatrices(matrix1, matrix2));
        } else {
            System.out.println("Multiplication not possible due to incompatible matrix dimensions.");
        }

        // Transpose
        System.out.println("Transpose of Matrix 1:");
        displayMatrix(transposeMatrix(matrix1));

        if (rows == 2 && cols == 2) {
            // Determinant and inverse for 2x2 matrix
            System.out.println("Determinant of Matrix 1:");
            System.out.println(determinant2x2(matrix1));
            System.out.println("Inverse of Matrix 1:");
            displayDoubleMatrix(inverse2x2(matrix1));
        } else if (rows == 3 && cols == 3) {
            // Determinant and inverse for 3x3 matrix
            System.out.println("Determinant of Matrix 1:");
            System.out.println(determinant3x3(matrix1));
            System.out.println("Inverse of Matrix 1:");
            displayDoubleMatrix(inverse3x3(matrix1));
        } else {
            System.out.println("Determinant and inverse not supported for this matrix size.");
        }

        // Close the Scanner object
        input.close();
    }
}
