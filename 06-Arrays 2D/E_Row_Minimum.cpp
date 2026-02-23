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

    for (int i = 0; i < n; i++)
    {
        int minElement = arr[i][0];
        for (int j = 0; j < m; j++)
        {
            if (arr[i][j] < minElement)
            {
                minElement = arr[i][j]; // Update minElement if a smaller element is found
            }
        }
        cout << minElement << " ";
    }
    return 0;
}