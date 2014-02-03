/* Nama File    : 6.cpp */
/* Nim - Nama   : 135100 - Luthfi Hamid Masykuri */

#include <iostream>
#include <cstdlib>

using namespace std;

int main()
{
    int N,i,sum;
    int *B;
    cin >> N;
    B = (int *) malloc (N * sizeof(int));
    for (i=0;i<N;i++)
    {
        cin >> B[i];
    }
    if (N > 1)
    {
        sum = 0;
        for (i=N-1;i>=0;i--)
        {
            if (i>0)
            {
                cout << B[i] << "+";
            }
            else
            {
                cout << B[i] << "= ";
            }
            sum += B[i];
        }
        cout << sum << endl;
    }
    else
    {
        cout << B[0] << endl;
    }
    return 0;
}
