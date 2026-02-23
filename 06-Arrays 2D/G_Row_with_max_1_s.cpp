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

    int indexOfRowWithMaxOnes = -1; // Initialize index of row with maximum 1's to -1
    int maxOnes = 0;                // Initialize maximum count of 1's to 0
    for (int i = 0; i < n; i++)
    {
        int countOnes = 0; // Initialize count of 1's to 0
        for (int j = 0; j < m; j++)
        {
            if (arr[i][j] == 1)
            {
                countOnes++; // Increment count if the element is 1
            }
        }
        if (countOnes > maxOnes)
        {
            maxOnes = countOnes;       // Update maximum count of 1's if current count is greater
            indexOfRowWithMaxOnes = i; // Update index of row with maximum 1's
        }
    }
    cout << indexOfRowWithMaxOnes; // Output the index of the row with the maximum number of 1's
    return 0;
}