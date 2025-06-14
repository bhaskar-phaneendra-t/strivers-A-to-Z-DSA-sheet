#include <vector>
#include <iostream>

using namespace std;

void dutch_national_flag(vector<int>&array){
    int low=0;
    int mid=0;
    int high=array.size()-1;
    while (mid<=high)
    {
        if(array[mid]==0){
        swap(array[low],array[mid]);
        mid++;
        low++;
        }
        else if(array[mid]==1){
            mid++;
        }
        else{
            swap(array[mid],array[high]);
            high--;
        }

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
    dutch_national_flag(array);
    for(int i=0;i<array.size();i++){
    cout<<array[i]<<"   " ;
    }
    return 0;
}