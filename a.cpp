#include <iostream>
using namespace std;
int add(int a, int b)
{
    return a + b;
}

int main()
{
    int a;
    int b;
    cout << "Enter first number" << endl;
    cin >> a;

    cout << "Enter second number" << endl;
    cin >> b;

    cout << "The sum of first and second numbers is " << add(a, b) << endl;

    return 0;
}