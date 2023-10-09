#include <iostream>

// Function to generate Fibonacci series
void fibonacciSeries(int n) {
    int firstTerm = 0, secondTerm = 1, nextTerm;

    std::cout << "Fibonacci Series up to " << n << " terms: ";

    for (int i = 0; i < n; ++i) {
        if (i <= 1) {
            nextTerm = i;
        } else {
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        std::cout << nextTerm << " ";
    }

    std::cout << std::endl;
}

int main() {
    // Declare a variable to store the number of terms
    int numberOfTerms;

    // Prompt the user to enter the number of terms
    std::cout << "Enter the number of terms for Fibonacci Series: ";
    std::cin >> numberOfTerms;

    // Check if the entered number of terms is non-negative
    if (numberOfTerms < 0) {
        std::cout << "Number of terms should be non-negative." << std::endl;
    } else {
        // Display the Fibonacci series
        fibonacciSeries(numberOfTerms);
    }

    return 0;
}
