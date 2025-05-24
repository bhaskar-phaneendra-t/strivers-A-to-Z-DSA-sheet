#include<iostream>
#include <unordered_map>
using namespace std;

int hash1(int arr[],int n,int hash){
    unordered_map<int ,int>mpp;
    for(int i=0;i<n;i++){
        mpp[arr[i]]++;
    }
    cout<<mpp[hash];
    
}
int main(){
    
    int n;
    cin>>n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    int hash;
    cin>>hash;
    hash1(arr,n,hash);
}
