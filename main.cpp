#include <iostream>
#include <string>
using namespace std;

class Student
{
public:
    string name;
    int roll;
};
int main()
{
    Student s;
    s.name = "Abhay";
    s.roll = 22;

    cout << "The name of the Student is " << s.name << endl;
    cout << "The id of the Student is " << s.roll << endl;
}