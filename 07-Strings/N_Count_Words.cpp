#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    getline(cin, s);
    int wordCount = 0;
    // we can count the number of words by counting the number of spaces and adding 1
    for (char c : s)
    {
        if (c == ' ')
        {
            wordCount++;
        }
    }
    // if the string is not empty, we add 1 to the word count to account for the last word
    if (!s.empty())
    {
        wordCount++;
    }
    cout << wordCount << endl;
    return 0;
}