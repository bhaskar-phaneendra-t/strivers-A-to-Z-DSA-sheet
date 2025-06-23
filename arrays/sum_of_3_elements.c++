#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

vector<vector<int>> three_elements_sum(vector<int> array, int target) {
    vector<vector<int>> ans;
    sort(array.begin(), array.end());
    int n = array.size();

    for (int i = 0; i < n - 2; i++) {

        if (i > 0 && array[i] == array[i - 1]) continue;

        int j = i + 1;
        int k = n - 1;

        while (j < k) {
            int sum = array[i] + array[j] + array[k];
            if (sum == target) {
                ans.push_back({array[i], array[j], array[k]});

                j++;
                k--;

                while (j < k && array[j] == array[j - 1]) j++;
                while (j < k && array[k] == array[k + 1]) k--;
            }
            else if (sum < target) {
                j++;
            }
            else {
                k--;
            }
        }
    }

    return ans;
}

int main() {
    vector<int> array;
    int size, z, target;
    cin >> size;
    for (int i = 0; i < size; i++) {
        cin >> z;
        array.push_back(z);
    }
    cin >> target;

    vector<vector<int>> result = three_elements_sum(array, target);
    for (auto &triplet : result) {
        for (int num : triplet) {
            cout << num << " ";
        }
        cout << endl;
    }

    return 0;
}
