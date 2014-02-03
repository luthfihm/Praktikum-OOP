/* Nama File    : 4.cpp */
/* Nim - Nama   : 135100 - Luthfi Hamid Masykuri */

#include <iostream>

using namespace std;

int main()
{
    int i,N,B,Sum;
    cin >> N;
    Sum = 0;
    for (i=1;i<=N;i++)
    {
        cin >> B;
        Sum += B;
    }
    cout << Sum << endl;
    return 0;
}
