#include <iostream>
using namespace std;
void kuaipai(int a[], int z, int x)
{
    if(z==x or z>x) return;
    int c=z;
    int v=x;
    int k=a[c];
    while(c < v)
    {
        while(c<v and a[v]==k or a[v]>k) v--;
        a[c]=a[v];
        while(c<v and a[c]<=k) c++;
        a[v]=a[c];    
    }
    a[c]=k;
    kuaipai(a, z, c-1);
    kuaipai(a, c+1, x);
}
int main()
{
    int a[]={57, 68, 59, 52, 72, 28, 96, 33, 24};
 for(int i=0;i<9;i++) cout<<a[i]<<" ";
    cout<<endl;
    kuaipai(a,0,8);
    for(int i=0;i<9;i++) cout<<a[i]<<" ";
    return 0;
}
