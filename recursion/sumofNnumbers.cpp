#include<iostream>
using namespace std;
int sumofNnumbers(int N){
    int sum;
    if (N==0){
        return 0;
    }
    else {
        sum=N+sumofNnumbers(N-1);
    }
    return sum;
}
int main(){
    cout<<(sumofNnumbers(4));
}
