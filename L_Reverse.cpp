#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    cin >> s;
    string reversedString;
    for (int i = s.length() - 1; i >= 0; i--)
    {
        reversedString += s[i];
    }
    cout << reversedString << endl;
    return 0;
}