#include <iostream>
#include <string.h>

using namespace std;

char stackArr[50] , infixArr[18] , postfix[50];
int stackTOS = -1;
int postTOS = -1;

void push(char a , char arr[] , int &TOS);
char pop();
void showArr(char arr[]);
void getInfix(int num);
int getValue(char op);

int main(){
    strcpy(infixArr , "(a+b*c)/(d*e-f)/g");
    for(int i=0 ; infixArr[i]!='\0' ; i++){
        if(isalnum(infixArr[i])){
            push(infixArr[i] , postfix , postTOS);
        }else if(infixArr[i] == '('){
            push(infixArr[i] , stackArr , stackTOS);
        }else if(infixArr[i] == ')'){
            char check = pop();
            while(check != '('){
                push(check , postfix , postTOS);
                check = pop();
            }
        }else{
            if(getValue(stackArr[stackTOS]) >= getValue(infixArr[i])){
                char hold = pop();
                push(hold , postfix , postTOS);
                push(infixArr[i] , stackArr , stackTOS);
            }else{
                push(infixArr[i] , stackArr , stackTOS);
            }
        }
    }

    while(stackTOS != -1){
        char hold = pop();
        push(hold , postfix , postTOS);
    }
    cout<<"Postfix Array : "<<endl;
    showArr(postfix);
    return 0;
}

void getInfix(int num){
    cout<<"Enter prefix data?"<<endl;
    for(int i=0 ; i<num ; i++){
        cin>>infixArr[i];
    }
}

void showArr(char arr[]){
    cout<<"The elements in the array are : "<<endl;
    for(int i=0 ; arr[i]!='\0' ; i++){
        cout<<arr[i]<<endl;
    }
}

void push(char a , char arr[] , int &TOS){
    TOS++;
    arr[TOS] = a;
}

int getValue(char op){
    if(op == '+' || op == '-'){
        return 1;
    }else if(op == '*' || op == '/'){
        return 2;
    }else if(op == '^'){
        return 3;
    }else{
        return 0;
    }
}

char pop(){
    return stackArr[stackTOS--];
}

