#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, m, x;
    cin >> n >> m >> x;

    int arr[n][m]; // 2D array

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cin >> arr[i][j];
        }
    }
    bool found = false; // Flag to indicate if the element is found
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            if (arr[i][j] == x)
            {
                found = true; // Set the flag to true if the element is found
                break;        // Exit the inner loop
            }
        }
        if (found)
            break; // Exit the outer loop if the element is found
    }
    if (found)
    {
        cout << "true"; // Output true if the element is found
    }
    else
    {
        cout << "false"; // Output false if the element is not found
    }
    return 0;
}