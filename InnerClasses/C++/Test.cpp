#include <iostream>

using namespace std;

class A
{
public:
    class B
    {
    private:
        string s = "Hello B";

    public:
        string getS()
        {
            return this->s;
        }
    };
    string getS()
    {
        return this->s;
    }
    B *getB()
    {
        return b;
    }

private:
    string s = "Hello A";
    B *b = new B();
};

int main()
{
    // int b = 3;
    // {
    //     int a = 2;
    //     b = 4;
    //     cout << a;
    //     cout << b;
    // }
    // // cout<< a;
    // // rules for inner block in C++ and Java ARE SAME
    // cout << b;

    return 0;
}
