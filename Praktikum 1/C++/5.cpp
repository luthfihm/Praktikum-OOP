/* Nama File    : 5.cpp */
/* Nim - Nama   : 135100 - Luthfi Hamid Masykuri */

#include <iostream>

using namespace std;

int main()
{
    int i,N,B[100],X,SumZ;
    i = 0;
    SumZ = 0;
    do
    {
        cin >> X;
        if (X != -99)
        {
            B[i] = X;
            if (X == 0)
            {
                SumZ++;
            }
            i++;
        }
    } while (X != -99);
    if (i != 0)
    {
        N = i;
        for (i=0;i<N;i++)
        {
            if (i < (N-1))
            {
                cout << B[i] << " ";
            }
            else
            {
                cout << B[i] << endl;
            }
        }
        cout << SumZ << endl;
    }
    else
    {
        cout << "tidak ada bilangan input" << endl;
    }
    return 0;
}
