#include <iostream>
using namespace std;

// operator overloading
class Complex{
    public: 
    double image;
    double real;

    public : Complex (double i, double r){
        image = i;
        real = r;
        
    }

    // operator overloading 
    Complex operator+(const Complex & other) const {
        return Complex(real + other.real , image + other.image);
    };


    //  overloading to print comples
  friend ostream & operator<<(ostream& os , const Complex& c ){ 
    // ostream is the return type of the operator overloading
    // << this is output stream
    os << c.real << " + " << c.image <<"i";
    return os;
  }

};


// operator overriding
class DerivedComplex : public Complex{
    public:
    
    DerivedComplex(double r , double i) : Complex(r, i){}

    // override + operator
    DerivedComplex operator+(const Complex& other) const{
        return DerivedComplex(
            real - other.real,
            image - other.image

        );
    }
};


int main (){

    Complex c1(2.0, 3.5);
    Complex c2(1.0, 4.0);
    Complex sum = c1 + c2;
    cout<<"sum : "<<sum<< " "<<endl;

    DerivedComplex d1(2.0, 3.5);
    DerivedComplex d2(1.0, 4.0);
    DerivedComplex sumDerived = d1 + d2;
    cout << "subtract Derived: " << sumDerived << " " << endl;

}
