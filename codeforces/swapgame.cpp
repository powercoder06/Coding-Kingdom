#include<bits/stdc++.h>
using namespace std;
int main() {
    int t;
    cin>>t;
    while(t--) 
    {
        long long x;
        cin>>x;
        cout<<(x+1)/2<<endl;
        for(int i=0;i<(x+1)/2;i++)
        {
            cout<<(i*3)+1<<" "<<x*3 -(i*3+1)+1<<endl;
        }
        
    }
}