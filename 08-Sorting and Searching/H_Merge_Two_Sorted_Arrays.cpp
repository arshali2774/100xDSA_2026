#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, m;
    cin >> n >> m;
    long long int arr1[n], arr2[m];
    for (int i = 0; i < n; i++)
    {
        cin >> arr1[i];
    }
    for (int i = 0; i < m; i++)
    {
        cin >> arr2[i];
    }
    int i = 0, j = 0;
    long long int merged[n + m];
    int k = 0;
    while (i < n && j < m)
    {
        if (arr1[i] < arr2[j])
        {
            merged[k++] = arr1[i++];
        }
        else
        {
            merged[k++] = arr2[j++];
        }
    }
    while (i < n)
    {
        merged[k++] = arr1[i++];
    }
    while (j < m)
    {
        merged[k++] = arr2[j++];
    }
    for (int i = 0; i < n + m; i++)
    {
        cout << merged[i] << " ";
    }
    return 0;
}