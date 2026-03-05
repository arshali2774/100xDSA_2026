#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    getline(cin, s);
    int i = 0, j = 0;
    int maxLength = 0;
    while (j < s.size())
    {
        if (s[j] != ' ')
        {
            j++;
        }
        else
        {
            int length = j - i;
            maxLength = max(maxLength, length);
            j++;
            i = j;
        }
    }
    // Check last word (no space at end)
    int length = j - i;
    maxLength = max(maxLength, length);

    cout << maxLength << endl;
    return 0;
}