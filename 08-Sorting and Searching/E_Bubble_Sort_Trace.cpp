#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    // bubble sort
    for (int i = 0; i < n - 1; i++)
    {
        int swaps = 0;
        // why n-1-i? because after each pass, the largest element is in its correct position, so we can ignore it in the next pass
        for (int j = 0; j < n - 1 - i; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                swap(arr[j], arr[j + 1]);
                swaps++;
            }
        }

        cout << "Pass " << i + 1 << ": ";
        for (int k = 0; k < n; k++)
        {
            cout << arr[k] << " ";
        }
        cout << ", swaps = " << swaps << endl;
        if (swaps == 0) // if no swaps were made, the array is already sorted
        {
            break;
        }
    }
    return 0;
}