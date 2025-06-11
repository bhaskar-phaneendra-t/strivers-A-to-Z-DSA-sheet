#include<iostream>
#include <vector>
#include <set>
using namespace std;
//by using the set 
set<int> uni(vector<int>array1,vector<int> array2){
    set<int> myset;
    int i=0;
    int j=0;
    while(i<array1.size() || j<array2.size()){
        if (i<array1.size())
        {
            myset.insert(array1[i]);
            i++;
        }
        
        else if (j<array2.size())
        {
            myset.insert(array2[j]);
            j++;
        }
        
        
    }
    return myset;

}


int main(){
    vector<int> array1;
    vector<int> array2;
    set<int> newset;
    int n1,n2;
    int z;
    cout << "enter the size of an array of the first array" << endl;
    cin >> n1;
    for(int i = 0; i < n1; i++) {
        cout << "enter the element of the 1st array" << i << endl;
        cin >> z;
        array1.push_back(z);
    }
    cout << "enter the size of an array of the second array" << endl;
    cin >> n2;
    for(int i = 0; i < n2; i++) {
        cout << "enter the element of the second array" << i << endl;
        cin >> z;
        array2.push_back(z);
    }
    newset=uni(array1,array2);
    for(int num:newset){
        cout<<num<<" ";
    }
}
