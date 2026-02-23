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
    int maxElement = arr[0][0]; // Initialize maxElement with the first element of the array
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            if (arr[i][j] > maxElement)
            {
                maxElement = arr[i][j]; // Update maxElement if a larger element is found
            }
        }
    }
    cout << maxElement; // Output the maximum element found in the array
    return 0;
}