#include<iostream>
#include<vector>
#include <algorithm> // for reverse algorithm
using namespace std;

void rotate_by_n_places(vector<int>& array, int n) {  
    n = n % array.size();
    reverse(array.begin(), array.begin() + n);
    reverse(array.begin() + n, array.end());
    reverse(array.begin(), array.end());
}

int main() {
    vector<int> array;
    int n;
    int z;
    int rot;
    
    cout << "enter the size of an array" << endl;
    cin >> n;
    
    for(int i = 0; i < n; i++) {
        cout << "enter the element " << i << endl;
        cin >> z;
        array.push_back(z);
    }
    
    cout << "enter by how many places it should be rotated" << endl;
    cin >> rot;
    
    rotate_by_n_places(array, rot);
    
    cout << "rotated array" << endl;
    for(int i = 0; i < n; i++) {
        cout << array[i] << " ";
    }
    
    return 0;
}