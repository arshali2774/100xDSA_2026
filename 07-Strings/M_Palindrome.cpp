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
    if (s == reversedString)
    {
        cout << "YES" << endl;
    }
    else
    {
        cout << "NO" << endl;
    }
    return 0;
}