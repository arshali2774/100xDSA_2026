#include <bits/stdc++.h>
using namespace std;

int main()
{
    char c;
    cin >> c;
    // add 32 to convert uppercase to lowercase
    if (c >= 'A' && c <= 'Z')
    {
        c = c + 32;
    }
    cout << c << endl;
    return 0;
}