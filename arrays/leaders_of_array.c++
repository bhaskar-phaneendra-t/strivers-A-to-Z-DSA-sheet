#include <vector>
#include <iostream>

using namespace std;

int maxfunction(vector<int>array,int k,int j){
    int max1=INT32_MIN;
    for (int i = k; i <= j; i++)
    {
        max1=max(max1,array[i]);
    }
    return max1;
    
}

vector<int> leaders(vector<int>&array){
    vector<int>newarray;
    int max2=INT32_MIN;
    for (int i = 0; i < array.size(); i++)
    {   max2=maxfunction(array,i+1,array.size()-1);
        if(array[i]>max2){
            newarray.push_back(array[i]);
        }
    }
    
    return newarray;
}

int main() {
    vector<int> array;
    int size, z;
    cin >> size;
    for(int i = 0; i < size; i++) {
        cin >> z;
        array.push_back(z);
    }
    for( auto it :leaders(array)){
        cout<<it<<"  ";
    }
    
    return 0;
}