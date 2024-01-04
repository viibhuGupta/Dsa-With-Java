#include <iostream>

double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
}

int main() {
    // Get temperature in Fahrenheit from the user
    double fahrenheitTemperature;
    std::cout << "Enter temperature in Fahrenheit: ";
    std::cin >> fahrenheitTemperature;

    // Convert Fahrenheit to Celsius
    double celsiusTemperature = fahrenheitToCelsius(fahrenheitTemperature);

   
    std::cout << fahrenheitTemperature << " degrees Fahrenheit is equal to " << celsiusTemperature << " degrees Celsius." << std::endl;

    return 0;
}
