#include<iostream>
#include <vector>
using namespace std;
void zerotolast(vector<int >& array){
    int start=0;
    int end=array.size()-1;
    while (start<=end)
    {
        if(array[start]==0&&array[end]!=0){
            swap(array[start],array[end]);
            start++;
            end--;
        }   
        else if(array[start]==0&& array[end]==0){
            end--;
        }
        else{
            start++;
        }
    }
    
}
int main(){
    vector<int> array;
    int n;
    int z;
    cout << "enter the size of an array" << endl;
    cin >> n;
    
    for(int i = 0; i < n; i++) {
        cout << "enter the element " << i << endl;
        cin >> z;
        array.push_back(z);
    }
    zerotolast(array);
    for(int i = 0; i < array.size(); i++) {
        cout << array[i]<<" ";
        
    }
}
