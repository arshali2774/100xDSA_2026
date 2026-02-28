#include <bits/stdc++.h>
using namespace std;

int main()
{
    string word1, word2;
    cin >> word1 >> word2;
    if (word1 < word2)
        cout << "A";
    else if (word1 > word2)
        cout << "B";
    else
        cout << "Equal";
    return 0;
}