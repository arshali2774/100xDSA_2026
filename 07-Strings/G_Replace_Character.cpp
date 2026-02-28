#include <bits/stdc++.h>
using namespace std;

int main()
{
    string str;
    char oldChar, newChar;
    cin >> str >> oldChar >> newChar;
    for (int i = 0; i < str.length(); i++)
    {
        if (str[i] == oldChar)
        {
            str[i] = newChar;
        }
    }
    cout << str << endl;

    return 0;
}