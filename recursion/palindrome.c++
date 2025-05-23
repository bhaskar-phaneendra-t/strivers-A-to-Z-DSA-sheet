#include<iostream>
#include<string>
using namespace std;
bool pali(int i,string &s){
    if(i>=s.size()/2){return true;}
    if(s[i]!=s[s.size()-i-1]){return false;}
    return pali(i+1,s);
    string str=s;
}
int main(){
    string s="ma     am";
    string cleaned;
    for (int i = 0; i < s.size(); i++)
    {   if(s[i]!='\0'){
            cleaned+=tolower(s[i]);
    }      
    }
    cout<<pali(0,cleaned);
    
}