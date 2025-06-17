#include <vector>
#include <iostream>
using namespace std;

void making0(vector<vector<int>>& matrix, int no_row, int no_col) {
    int columnimp = 1;  

    for (int i = 0; i < no_row; i++) {
        if (matrix[i][0] == 0) columnimp = 0;
        for (int j = 1; j < no_col; j++) {
            if (matrix[i][j] == 0) {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }
    }

    for (int i = 1; i < no_row; i++) {
        for (int j = 1; j < no_col; j++) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0;
            }
        }
    }

    if (matrix[0][0] == 0) {
        for (int j = 0; j < no_col; j++) {
            matrix[0][j] = 0;
        }
    }

    if (columnimp == 0) {
        for (int i = 0; i < no_row; i++) {
            matrix[i][0] = 0;
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

    making0(array, no_row, no_col);

    for (int i = 0; i < no_row; i++) {
        for (int j = 0; j < no_col; j++) {
            cout << array[i][j] << "  ";
        }
        cout << endl;
    }

    return 0;
}
