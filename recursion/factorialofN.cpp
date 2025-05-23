#include<iostream>
using namespace std;
int factorialofN(int n){
    int factorial;
    if (n==0){return 1;}
    else{return factorial=n*factorialofN(n-1);}
}
int main(){
    cout<<factorialofN(5);
}
