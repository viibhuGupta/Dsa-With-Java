#include <iostream>

// Function with default arguments
void displayMessage(std::string message = "Hello", int repeatCount = 1) {
    for (int i = 0; i < repeatCount; ++i) {
        std::cout << message << std::endl;
    }
}

int main() {
    displayMessage("Welcome to C++!", 3);

    displayMessage("Hi");

    displayMessage();

    return 0;
}



// Welcome to C++!
// Welcome to C++!
// Welcome to C++!
// Hi
// Hello
