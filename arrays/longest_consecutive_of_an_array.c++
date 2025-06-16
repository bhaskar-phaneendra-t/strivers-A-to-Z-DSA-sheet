#include <vector>
#include <iostream>
#include <set>
using namespace std;

int longest(vector<int> array) {
    int longest = 0;

    set<int> newset;
    for (auto it : array) {
        newset.insert(it);
    }

    for (auto it : newset) {
        if (newset.find(it - 1) == newset.end()) { 
            int num = it;
            int count = 1;

            while (newset.find(num + 1) != newset.end()) {
                num++;
                count++;
            }

            longest = max(longest, count);
        }
    }

    return longest;
}

int main() {
    vector<int> array;
    int size, z;
    cin >> size;
    for (int i = 0; i < size; i++) {
        cin >> z;
        array.push_back(z);
    }
    cout << longest(array);
    return 0;
}
