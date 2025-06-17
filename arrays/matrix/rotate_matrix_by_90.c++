#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

void transpose(vector<vector<int>> &matrix, int no_row, int no_col) {
    for (int i = 0; i < no_row; i++) {
        for (int j = i + 1; j < no_col; j++) {
            if(i!=j){
                swap(matrix[i][j], matrix[j][i]);
            }
        }
    }
}

int main() {
    vector<vector<int>> array;
    int z, no_row, no_col;
    cout << "Enter the matrix size: ";
    cin >> no_row >> no_col;

    array.resize(no_row);

    for (int i = 0; i < no_row; i++) {
        for (int j = 0; j < no_col; j++) {
            cin >> z;
            array[i].push_back(z);
        }
    }

    transpose(array, no_row, no_col);

    for (int i = 0; i < no_row; i++) {
        reverse(array[i].begin(), array[i].end());
    }

    for (int i = 0; i < no_row; i++) {
        for (int j = 0; j < no_col; j++) {
            cout << array[i][j] << "   ";
        }
        cout << endl;
    }

    return 0;
}
