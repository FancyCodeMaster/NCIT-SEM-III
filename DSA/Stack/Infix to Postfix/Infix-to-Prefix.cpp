#include <iostream>

using namespace std;

char stackArr[50] , infixArr[50] , postfix[50];
int stackTOS = -1;
int postTOS = -1;

void push(char a , char arr[] , int TOS);
void pop();
void showArr(char arr[]);
void getInfix(int num);

int main(){
    getInfix(10);
    showArr(infixArr);
    return 0;
}

void getInfix(int num){
    cout<<"Enter prefix data?"<<endl;
    for(int i=0 ; i<num ; i++){
        cin>>infixArr[i];
    }
}
