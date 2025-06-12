#include <vector>
#include <iostream>
using namespace std;

int pivote(vector<int>& array, int low, int high) {
    int i = low + 1;
    int j = high;
    int pivot = array[low];
    while (true) {
        while (i <= high && array[i] <= pivot) i++;
        while (j >= low && array[j] > pivot) j--;
        if (i < j) {
            swap(array[i], array[j]);
        } else {
            break;
        }
    }
    swap(array[low], array[j]);
    return j;
}

void quick_sort(vector<int>& array, int i, int j) {
    int pivote_index;
    if (i < j) {
        pivote_index = pivote(array, i, j);
        quick_sort(array, i, pivote_index - 1);
        quick_sort(array, pivote_index + 1, j);
    }
}

vector<int> sumoftwonumber(vector<int> array, int sum) {
    int i = 0;
    int j = array.size() - 1;
    vector<int> sumindex;
    while (i < j) {
        int botsum = array[i] + array[j];
        if (botsum > sum) {
            j--;
        } else if (botsum < sum) {
            i++;
        } else {
            sumindex.push_back(array[i]);
            sumindex.push_back(array[j]);
            break; 
        }
    }
    return sumindex;
}

int main() {
    vector<int> array;
    int size, z, sum;
    cout << "Enter the size of the array: ";
    cin >> size;
    for (int i = 0; i < size; i++) {
        cin >> z;
        array.push_back(z);
    }

    quick_sort(array, 0, array.size() - 1);

    cout << "Enter the sum of the two numbers that you want: ";
    cin >> sum;

    vector<int> result = sumoftwonumber(array, sum);
    if (!result.empty()) {
        cout << "The pair is: ";
        for (auto it : result) {
            cout << it << " ";
        }
    } else {
        cout << "No such pair found.";
    }

    return 0;
}
