#include <vector>
#include <iostream>
using namespace std;

vector<int> spiral(vector<vector<int>> matrix, int no_row, int no_col) {
    int top = 0;
    int bottom = no_row - 1;
    int left = 0;
    int right = no_col - 1;
    vector<int> array;

    while (top <= bottom && left <= right) {
        // Left to right
        for (int i = left; i <= right; i++) {
            array.push_back(matrix[top][i]);
        }
        top++;

        // Top to bottom
        for (int i = top; i <= bottom; i++) {
            array.push_back(matrix[i][right]);
        }
        right--;

        // Right to left
        if (top <= bottom) {
            for (int i = right; i >= left; i--) {
                array.push_back(matrix[bottom][i]);
            }
            bottom--;
        }

        // Bottom to top
        if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                array.push_back(matrix[i][left]);
            }
            left++;
        }
    }

    return array;
}

int main() {
    vector<vector<int>> array;
    int z, no_row, no_col;
    cout << "Enter the matrix size: ";
    cin >> no_row >> no_col;

    array.resize(no_row);

    cout << "Enter the matrix elements:\n";
    for (int i = 0; i < no_row; i++) {
        for (int j = 0; j < no_col; j++) {
            cin >> z;
            array[i].push_back(z);
        }
    }

    cout << "Spiral Order: ";
    for (auto it : spiral(array, no_row, no_col)) {
        cout << it << "  ";
    }

    return 0;
}
