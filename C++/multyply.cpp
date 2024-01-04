#include <iostream>

using namespace std;

// Function to multiply two matrices
void multiplyMatrices(int matrix1[][100], int matrix2[][100], int result[][100], int rows1, int cols1, int rows2, int cols2) {
    // Check if matrices can be multiplied
    if (cols1 != rows2) {
        cerr << "Matrices cannot be multiplied. Columns of the first matrix must be equal to rows of the second matrix." << endl;
        return;
    }

    // Perform matrix multiplication
    for (int i = 0; i < rows1; ++i) {
        for (int j = 0; j < cols2; ++j) {
            result[i][j] = 0;
            for (int k = 0; k < cols1; ++k) {
                result[i][j] += matrix1[i][k] * matrix2[k][j];
            }
        }
    }
}

// Function to display a matrix
void displayMatrix(int matrix[][100], int rows, int cols) {
    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            cout << matrix[i][j] << " ";
        }
        cout << endl;
    }
}

int main() {
    // Get dimensions of the first matrix
    int rows1, cols1;
    cout << "Enter the number of rows for the first matrix: ";
    cin >> rows1;
    cout << "Enter the number of columns for the first matrix: ";
    cin >> cols1;

    // Get dimensions of the second matrix
    int rows2, cols2;
    cout << "Enter the number of rows for the second matrix: ";
    cin >> rows2;
    cout << "Enter the number of columns for the second matrix: ";
    cin >> cols2;

    // Check if matrices can be multiplied
    if (cols1 != rows2) {
        cerr << "Matrices cannot be multiplied. Columns of the first matrix must be equal to rows of the second matrix." << endl;
        return 1;
    }

    // Initialize matrices
    int matrix1[100][100], matrix2[100][100], result[100][100];

    // Get elements for the first matrix
    cout << "Enter elements for the first matrix:" << endl;
    for (int i = 0; i < rows1; ++i) {
        for (int j = 0; j < cols1; ++j) {
            cout << "Enter element at position [" << (i + 1) << "][" << (j + 1) << "]: ";
            cin >> matrix1[i][j];
        }
    }

    // Get elements for the second matrix
    cout << "Enter elements for the second matrix:" << endl;
    for (int i = 0; i < rows2; ++i) {
        for (int j = 0; j < cols2; ++j) {
            cout << "Enter element at position [" << (i + 1) << "][" << (j + 1) << "]: ";
            cin >> matrix2[i][j];
        }
    }

    // Perform matrix multiplication
    multiplyMatrices(matrix1, matrix2, result, rows1, cols1, rows2, cols2);

    // Display the result matrix
    cout << "Resultant Matrix:" << endl;
    displayMatrix(result, rows1, cols2);

    return 0;
}
