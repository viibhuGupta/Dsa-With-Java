#include <iostream>
#include <cstring>

class MyString {
public:
    MyString() : data(nullptr) {
        std::cout << "Default Constructor called" << std::endl;
    }

    MyString(const char* initialData) : data(nullptr) {
        std::cout << "Parameterized Constructor called" << std::endl;
        setData(initialData);
    }

    MyString(const MyString& other) : data(nullptr) {
        std::cout << "Copy Constructor called" << std::endl;
        setData(other.data);
    }

    ~MyString() {
        std::cout << "Destructor called for data: " << data << std::endl;
        delete[] data;
    }

    void display() const {
        std::cout << "Data: " << data << std::endl;
    }

private:
    char* data;

    // Helper function to set data
    void setData(const char* newData) {
        if (newData != nullptr) {
            data = new char[std::strlen(newData) + 1];
            std::strcpy(data, newData);
        } else {
            data = nullptr;
        }
    }
};

int main() {
    MyString str1("Hello");
    str1.display();

    MyString str2 = str1;
    str2.display();

    return 0;
}




// Parameterized Constructor called
// Data: Hello
// Copy Constructor called
// Data: Hello
// Destructor called for data: Hello
// Destructor called for data: Hello
