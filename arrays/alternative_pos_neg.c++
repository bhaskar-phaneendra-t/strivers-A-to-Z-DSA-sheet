#include <iostream>
#include <vector>
using namespace std;

void alternative(vector<int>& arr) {
    vector<int> pos, neg;

    // Separate positive and negative elements
    for (int num : arr) {
        if (num >= 0)
            pos.push_back(num);
        else
            neg.push_back(num);
    }

    vector<int> result;
    int i = 0, j = 0;
    bool turnPos = true;

    // Alternate positive and negative
    while (i < pos.size() && j < neg.size()) {
        if (turnPos)
            result.push_back(pos[i++]);
        else
            result.push_back(neg[j++]);
        turnPos = !turnPos;
    }

    // Append remaining positives
    while (i < pos.size())
        result.push_back(pos[i++]);

    // Append remaining negatives
    while (j < neg.size())
        result.push_back(neg[j++]);

    // Copy result back to arr
    arr = result;
}

int main() {
    int size;
    cin >> size;
    vector<int> arr(size);

    for (int i = 0; i < size; i++) {
        cin >> arr[i];
    }

    alternative(arr);

    for (int num : arr) {
        cout << num << "   ";
    }

    return 0;
}
