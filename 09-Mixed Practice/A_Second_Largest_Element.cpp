#include <bits/stdc++.h>
using namespace std;

int main()
{
    int ans = -1;
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    int max = a[0];
    for (int i = 1; i < n; i++)
    {
        if (a[i] > max)
        {
            ans = max;
            max = a[i];
        }
        else if (a[i] > ans && a[i] < max)
        {
            ans = a[i];
        }
    }
    cout << ans << endl;
    return 0;
}