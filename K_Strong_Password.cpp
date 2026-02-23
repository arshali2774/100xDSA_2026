#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    cin >> s;
    // a strong password exactly 10 characters, atleast 1 lowercase, atleast 1 uppercase, atleast 1 digit and atleast 1 special character
    if (s.length() != 10)
    {
        cout << "Weak" << endl;
        return 0;
    }
    bool hasLower = false, hasUpper = false, hasDigit = false, hasSpecial = false;
    // any character that is not a lowercase letter, uppercase letter or digit is considered a special character
    for (char c : s)
    {
        if (islower(c))
            hasLower = true;
        else if (isupper(c))
            hasUpper = true;
        else if (isdigit(c))
            hasDigit = true;
        else
            hasSpecial = true; // assuming any non-alphanumeric character is a special character
    }
    if (hasLower && hasUpper && hasDigit && hasSpecial)
    {
        cout << "Strong" << endl;
    }
    else
    {
        cout << "Weak" << endl;
    }
}