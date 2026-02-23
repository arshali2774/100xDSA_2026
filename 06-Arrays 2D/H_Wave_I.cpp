#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, m;
    cin >> n >> m;
    int arr[n][m];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cin >> arr[i][j];
        }
    }
    for (int i = 0; i < n; i++)
    {
        if (i % 2 != 0)
        {
            int j = m - 1;
            while (j >= 0)
            {
                cout << arr[i][j] << " ";
                j--;
            }
        }
        else
        {
            int j = 0;
            while (j < m)
            {
                cout << arr[i][j] << " ";
                j++;
            }
        }
    }
    return 0;
}