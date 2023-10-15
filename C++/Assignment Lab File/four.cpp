#include <iostream>

// Class definition
class Adder {
private:
    double num1;
    double num2;

public:
    void getNumbers() {
        std::cout << "Enter the first number: ";
        std::cin >> num1;
 
        std::cout << "Enter the second number: ";
        std::cin >> num2;
    }

    // Member function to add the numbers and display the result
    void addAndDisplay() {
        double sum = num1 + num2;
        std::cout << "The sum of " << num1 << " and " << num2 << " is: " << sum << std::endl;
    }
};

int main() {
    Adder adderObj;

    adderObj.getNumbers();

    adderObj.addAndDisplay();

    return 0;
}
