#include <iostream>
#include <string>

class MyClass {
public:
    MyClass() {
        std::cout << "Default Constructor called" << std::endl;
        data = 0;
        message = "Default Message";
    }

    MyClass(int newData, const std::string& newMessage) {
        std::cout << "Parameterized Constructor called" << std::endl;
        data = newData;
        message = newMessage;
    }

    // Destructor
    ~MyClass() {
        std::cout << "Destructor called for data: " << data << std::endl;
    }

    void display() {
        std::cout << "Data: " << data << ", Message: " << message << std::endl;
    }

private:
    int data;
    std::string message;
};

int main() {
    MyClass obj1;
    obj1.display();

    MyClass obj2(42, "Custom Message");
    obj2.display();


    return 0;
}







// Default Constructor called
// Data: 0, Message: Default Message
// Parameterized Constructor called
// Data: 42, Message: Custom Message
// Destructor called for data: 42
// Destructor called for data: 0
