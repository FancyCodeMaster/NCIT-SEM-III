#include <iostream>
#include <string.h>
#include <math.h>

#define MAX 50

using namespace std;

int TOS = -1;
char item[MAX] = "123*+456^/-";
int arr[MAX];

void push(int n);
void pop(char op);
int result(int a , int b , char op);

int main(){
    int i=0;
    while(item[i]!='\0'){
        switch(item[i]){
        case '+':
            pop('+');
            break;
        case '-':
            pop('-');
            break;
        case '*':
            pop('*');
            break;
        case '/':
            pop('/');
            break;
        case '^':
            pop('^');
            break;
        default:
            push((int)item[i]);
        }
        i++;
    }

    //cout<<"The final stack is : "<<endl;
    //cout<<arr[0];

    return 0;
}

int result(int a , int b , char op){
    switch(op){
    case '+':
        return a+b;
    case '-':
        return a-b;
    case '*':
        return a*b;
    case '/':
        return a/b;
    case '^':
        return pow(a,b);
    default:
        return NULL;
    }
}

void push(int n){
    TOS++;
    arr[TOS] = n;
}

void pop(char op){
    int a = (int)arr[TOS];
    int b = (int)arr[TOS-1];
    //cout<<a<<endl<<b<<endl;
    //cout<<op<<endl;
    TOS = TOS-2;
    //cout<<result(a,b,op);
    push(result(a,b,op));
}
