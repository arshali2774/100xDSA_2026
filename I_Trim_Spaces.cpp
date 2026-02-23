#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    // we use getline to read the whole line including spaces and not cin which stops at the first space
    getline(cin, s);
    // we use the erase-remove idiom to remove all spaces from the string
    // s.erase(remove(s.begin(), s.end(), ' '), s.end());
    // brute force approach to remove spaces
    string result;
    for (char c : s)
    {
        if (c != ' ')
        {
            result += c; // Append non-space characters to the result
        }
    }
    cout << result << endl;
    return 0;
}