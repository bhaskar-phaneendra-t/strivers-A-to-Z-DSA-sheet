#include<iostream>
#include <vector>
using namespace std;
int main(){
    vector<int> array1;
    vector<int> array2;
    int n1,n2;
    int z;
    int xor1=0;
    int xor2=0;
    cout << "enter the size of an array of the first array" << endl;
    cin >> n1;
    for(int i = 0; i < n1; i++) {
        cout << "enter the element of the 1st array" << i << endl;
        cin >> z;
        array1.push_back(z);
        xor1=xor1^array1[i];
    }
    cout << "enter the size of an array of the second array" << endl;
    cin >> n2;
    for(int i = 0; i < n2; i++) {
        cout << "enter the element of the second array" << i << endl;
        cin >> z;
        array2.push_back(z);
        xor2=xor2^array2[i];
    }
    cout<<"number of commont elements"<<endl;
    cout<<(xor1^xor2);

}
