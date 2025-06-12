#include <vector>
#include <iostream>
#include <map>
using namespace std;

int main() {
    vector<int> array;
    int size, z;
    cin >> size;
    for(int i = 0; i < size; i++) {
        cin >> z;
        array.push_back(z);
    }
    map<long,int>mpp;
    for (int i = 0; i < array.size(); i++)
    {
        mpp[array[i]]++;
    }
    for (auto it :mpp)
    {
        cout<<it.first<<" repeated "<<it.second<<endl;
    }
    
    
    return 0;
}