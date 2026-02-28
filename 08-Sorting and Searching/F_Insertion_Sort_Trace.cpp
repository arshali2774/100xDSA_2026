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
    // Insertion sort
    for (int i = 1; i < n; i++)
    {
        int key = arr[i];
        int j = i - 1;
        int shifts = 0;
        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j--;
            shifts++;
        }
        arr[j + 1] = key;
        cout << "Pass " << i << ": ";
        for (int k = 0; k < n; k++)
        {
            cout << arr[k] << " ";
        }
        cout << ", ";
        for (int k = 0; k < n; k++)
        {
            if (k == i)
            {
                cout << arr[k] << " | ";
            }
            else
            {
                cout << arr[k] << " ";
            }
        }
        cout << ", shifts = " << shifts << endl;
    }
    return 0;
}