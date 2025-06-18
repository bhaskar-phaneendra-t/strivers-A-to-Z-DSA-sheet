#include<iostream>
#include <vector>
using namespace std;
int functionRcC(int row,int column){
    int result=1;
    for (int i = 0; i < column; i++)
    {
        result=result*(row-i)/(i+1);
    }
    return result;
}
vector<int> rowdisplay(int row){
    vector<int>array;
    int result=1;
    array.push_back(result);
    for (int i = 0; i < row; i++)
    {
        result=result*(row-i)/(i+1);
        array.push_back(result);
    }
    return array;
    
}



int main() {
    int row,column,preference;
    cout<<"enter the following number "<<endl<<"1 -- for the particular element in the pascal triangle by entering the row and column"<<endl;
    cout<<"2 -- for the particular row printing"<<endl<<"3 -- for the full pascal triangle "<<endl;
    cin>>preference;
    if(preference==1){
        cout<<"enter the row and column that you want"<<endl;
        cin>>row>>column;
        cout<<functionRcC(row,column)<<endl;
    }
    else if(preference==2){
        cin>>row;
        for(auto it: rowdisplay(row)){
        cout<<it<<"   " ;
        }
    }
    
    else if(preference==3){
        int pascal;
        cout<<endl<<"enter the how much pascal triangle you want"<<endl;
        cin>>pascal;
        for (int i = 0; i <= pascal; i++)
        {   cout<<endl;
            for(auto it:rowdisplay(i)){
                cout<<it<<"  ";
            }
            cout<<endl;
        }

    }
    else{
        cout<<"wrong entry";
    }
    

    
    
    return 0;
}