/*
take the input that is sum of the number in the array 
so that it should return the longest array with the sum.*/
#include <vector>
#include <iostream>
using namespace std;

int sumvector(vector<int> array, int i, int j) {
    int sum = 0;
    for (int k = i; k <= j; k++) {
        sum += array[k];
    }
    return sum;
}


vector<int> vectorsum(vector<int> array, int enteredvalueofsum) {
    int len = 0;
    vector<int> indexes;

    for (int i = 0; i < array.size(); i++) {
        for (int j = i; j < array.size(); j++) {
            int sum = sumvector(array, i, j);
            if (sum == enteredvalueofsum) {
                if ((j - i + 1) > len) {
                    len = j - i + 1;
                    indexes.clear();
                    indexes.push_back(i);
                    indexes.push_back(j);
                }
            }
        }
    }

    return indexes;
}

int main() {
    vector<int> array;
    int size, z;
    cout << "enter the size" << endl;
    cin >> size;

    cout << "enter array elements" << endl;
    for (int i = 0; i < size; i++) {
        cin >> z;
        array.push_back(z);
    }

    int sumofthearray;
    cout << "enter the sum you want" << endl;
    cin >> sumofthearray;

    vector<int> index = vectorsum(array, sumofthearray);

    if (index.empty()) {
        cout << "cannot find the indexees";
    } else {
        cout << "Longest subarray with sum " << sumofthearray << ": ";
        for (int i = index[0]; i <= index[1]; i++) {
            cout << array[i] << " ";
        }
    }

    return 0;
}
