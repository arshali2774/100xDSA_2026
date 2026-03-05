#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    cin >> s;
    int sum = 0;
    for (char c : s)
    {
        sum += (c - '0'); // Convert char to int and add to sum
    }
    cout << sum << endl;
    return 0;
}