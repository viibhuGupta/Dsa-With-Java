#include <iostream>
using namespace std ;
int main (){
    int a ; 
    cout<<"Enter the No";
    cin>>a;

    if (a%1 == 0 && a % a == 0)
    {
        cout<<"Prime No";
    }else
    {
        cout<<"Not Prime No";
    }
    
    
}


#include <iostream>
using namespace std;

int main() {
    int a;
    cout << "Enter the number: ";
    cin >> a;

    if (a <= 1) {
        cout << "Not Prime No";
        return 0;
    }

    for (int i = 2; i <= a / 2; ++i) {
        if (a % i == 0) {
            cout << "Not Prime No";
            return 0;
        }
    }

    cout << "Prime No";
    return 0;
}
