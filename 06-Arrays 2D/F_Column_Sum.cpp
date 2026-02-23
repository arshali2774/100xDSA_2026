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
        int columnSum = 0; // Initialize column sum to 0
        for (int j = 0; j < n; j++)
        {
            columnSum += arr[j][i]; // Add the element to the column sum
        }
        cout << columnSum << " "; // Output the sum of the current column
    }
    return 0;
}