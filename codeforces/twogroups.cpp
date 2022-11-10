#include<bits/stdc++.h>
using namespace std;
int main() {
    int t;
    cin>>t;
    while(t--) 
    {
        long long n;
        cin>>n;
        vector<long long> a;
        long long minimum = LONG_MAX;
        
        for(long long i=0;i<n;i++)
        {
            long long s;
            cin>>s;
            a.push_back(s);
            minimum=min(s,minimum);
        }
        cout<<minimum<<" "<<a[0]<<endl;
        
        (minimum == a[0])? cout<<"Bob"<<endl : cout<<"Alice"<<endl;
        
    }
}