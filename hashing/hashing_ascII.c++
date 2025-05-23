#include<iostream>
using namespace std;
int hash1(string s,char in){
    int newarr[256];
    for (int i = 0; i < s.length(); i++)
    {
        newarr[s[i]]=newarr[s[i]]+1;
    }
    return newarr[in];
}
int main(){
    string s;
    cin>>s;
    char in;
    cin>>in;
    cout<<hash1(s,in);
}
