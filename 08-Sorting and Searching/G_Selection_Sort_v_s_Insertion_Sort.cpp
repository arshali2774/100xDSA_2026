#include <bits/stdc++.h>
using namespace std;
int selection_sort(long long int arr[], int n)
{
    int swaps = 0;
    for (int i = 0; i < n - 1; i++)
    {
        int min_index = i;
        for (int j = i + 1; j < n; j++)
        {
            if (arr[j] < arr[min_index])
            {
                min_index = j;
            }
        }
        if (min_index != i)
        {
            swaps++;
        }
        swap(arr[i], arr[min_index]);
    }
    return swaps;
}

int insertion_sort(long long int arr[], int n)
{
    int shifts = 0;
    for (int i = 1; i < n; i++)
    {
        long long key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j--;
            shifts++;
        }
        arr[j + 1] = key;
    }
    return shifts;
}
void solve()
{
    int n;
    cin >> n;
    long long int arr[n];
    vector<long long> original(n);
    for (int i = 0; i < n; i++)
    {
        cin >> original[i];
    }

    vector<long long> a = original; // for insertion sort
    vector<long long> b = original; // for selection sort

    int shifts = insertion_sort(a.data(), n);
    int swaps = selection_sort(b.data(), n);

    if (shifts < swaps)
    {
        cout << "Insertion Sort" << endl;
    }
    else if (shifts > swaps)
    {
        cout << "Selection Sort" << endl;
    }
    else
    {
        cout << "Tie" << endl;
    }
}

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        solve();
    }
    return 0;
}
