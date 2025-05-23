#include<iostream>
using namespace std;

int hash1(int arr[],int n,int hash){
    int newarr[1000]={0};
    for(int i=0;i<n;i++){
        newarr[arr[i]]=newarr[arr[i]]+1;
    }
    cout<<newarr[hash];
    
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
