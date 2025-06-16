#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
void next_permutaion(vector<int>&array){
    int ind=-1;
    int size=array.size();
    for (int i = size - 2; i >= 0; i--)
    {
        if (array[i]<array[i+1])
        {
            ind=i;
            break;
        }
        
    }
    for (int i = size-1; i >= ind; i--)
    {
        if(array[i]>array[ind]){
            swap(array[i],array[ind]);
            break;
        }
    }
    if(ind==-1){
        reverse(array.begin(),array.end());
    }
    
    
}

int main() {
    vector<int> array;
    int size, z;
    cin >> size;
    for(int i = 0; i < size; i++) {
        cin >> z;
        array.push_back(z);
    }
    next_permutaion(array);
    for(auto it: array){
    cout<<it<<"  " ;
    }
    return 0;
}