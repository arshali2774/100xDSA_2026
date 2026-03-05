#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n;
    cin >> n;

    if (n == 0) // empty array
    {
        int d;
        cin >> d;
        return;
    }

    vector<long long> a(n);
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    int d;
    cin >> d;
    d = d % n; // handle d >= n

    if (d == 0) // no rotation needed
    {
        for (int i = 0; i < n; i++)
            cout << a[i] << " ";
        return;
    }

    // reverse from 0 to d-1
    int left = 0, right = d - 1;
    while (left < right)
    {
        swap(a[left], a[right]);
        left++;
        right--;
    }
    // reverse from d to n-1
    left = d;
    right = n - 1;
    while (left < right)
    {
        swap(a[left], a[right]);
        left++;
        right--;
    }
    // reverse from 0 to n-1
    left = 0;
    right = n - 1;
    while (left < right)
    {
        swap(a[left], a[right]);
        left++;
        right--;
    }
    for (int i = 0; i < n; i++)
    {
        cout << a[i] << " ";
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
}