#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, m;
    cin >> n >> m;

    int arr[n][m]; // 2D array

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cin >> arr[i][j];
        }
    }
    for (int i = 0; i < m; i++)
    {
        if (i % 2 != 0)
        {
            int j = n - 1;
            while (j >= 0)
            {
                cout << arr[j][i] << " ";
                j--;
            }
        }
        else
        {
            int j = 0;
            while (j < n)
            {
                cout << arr[j][i] << " ";
                j++;
            }
        }
    }
    return 0;
}