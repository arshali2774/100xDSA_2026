#include <bits/stdc++.h>
using namespace std;

void solve()
{
    string s;
    cin >> s;
    for (int i = 0; i < s.size(); i++)
    {
        int count = 1;
        int j = i + 1;
        while (j < s.size() && s[i] == s[j])
        {
            count++;
            j++;
            i++;
        }
        if (count > 1)
        {
            cout << s[i] << count;
        }
        else
        {
            cout << s[i];
        }
    }
}
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        solve();
        cout << endl;
    }
    return 0;
}