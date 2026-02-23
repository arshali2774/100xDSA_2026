#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    cin >> s;
    for (char &c : s)
    {
        if (islower(c))
        {
            c = toupper(c); // Convert to uppercase
        }
        else if (isupper(c))
        {
            c = tolower(c); // Convert to lowercase
        }
    }
    cout << s << endl;
    return 0;
}