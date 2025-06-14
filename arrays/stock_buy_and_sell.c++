#include <vector>
#include <iostream>
using namespace std;

vector<int> buy_and_sell_stocks(vector<int>array){
    int low=array[0];
    int cost=0;
    int profit=0;
    vector<int>newarray;
    for(auto it:array){
        cost=it-low;
        profit=max(cost,profit);
        low=min(it,low);
        if(profit<=cost){
            newarray.clear();
            newarray.push_back(low);
            newarray.push_back(it);
            newarray.push_back(profit);
        }
    }
    return newarray;
}

int main() {
    vector<int> array;
    int size, z;
    cin >> size;
    for(int i = 0; i < size; i++) {
        cin >> z;
        array.push_back(z);
    }
    for(auto it: buy_and_sell_stocks(array)){
    cout<<it<<"  " ;
    }
    
    return 0;
}