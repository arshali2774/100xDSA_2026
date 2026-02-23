#include <bits/stdc++.h>
using namespace std;

int main()
{
    string str;
    char remove_char;
    cin >> str >> remove_char;
    // remove the character from the string
    // str.erase(remove(str.begin(), str.end(), remove_char), str.end());
    // remove the character from the string using a loop
    string result;
    for (char c : str)
    {
        if (c != remove_char)
        {
            result += c;
        }
    }
    cout << result << endl;
    return 0;
}