#include<iostream>
using namespace std;
void insertion_sort(int arr[],int n){
    for (int i = 0; i < n; i++)
    {
        for(int j=i;j>0;j--){
            if(arr[j-1]>arr[j]){swap(arr[j-1],arr[j]);}
        }
    }
    

}
int main(){
    int n;
    cin>>n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    insertion_sort(arr,n);
    cout<<"sorted array"<<endl;
    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
    
}
