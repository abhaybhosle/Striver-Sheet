#include<iostream>
#include<string>
using namespace std;

int main(){
    string s;
    cout<<"Enter a string "<<endl;
    cin>>s;
    bool isPalindrome = true;
    for(int i = 0; i < s.length()/2;i++){
        if(s[i] != s[s.length()-1-i]){
            isPalindrome = false;
            break;
        }
    }

    if(isPalindrome){
        cout<<"The String is a Palindrome "<<endl;
    }else{
        cout<<"The String is not a Palindrome "<<endl;
    }



}