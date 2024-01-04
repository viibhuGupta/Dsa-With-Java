#include<iostream>
#include<fstream>

using namespace std;

int main(){


    // string st = "Harry bhai";
    // // Opening files using constructor and writing it
    // ofstream out("add.txt"); // Write operation
    // out<<st;

    // Create a new String 
    string st2 ;

        // Opening files using constructor and Reading it
        ifstream in("add.txt");
        getline(in , st2);
        cout << st2;


    return 0;
}