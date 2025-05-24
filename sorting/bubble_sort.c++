#include<iostream>
using namespace std;
void bubble_sort(int arr[],int n){
    int count=0;
    for(int i=n-1;i>=1;i--){//here we can also give the logic of there should be of n-1 comparisons so 
        for (int j = 0; j<i; j++)
        {
            if(arr[j]>arr[j+1]){swap(arr[j],arr[j+1]);
            count++;}
        }
        
    }
    cout<<"these many times the array was compared and swaped:"<<count<<endl;
}
int main(){
    int n;
    cin>>n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    bubble_sort(arr,n);
    cout<<"sorted array"<<endl;
    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
    
}
