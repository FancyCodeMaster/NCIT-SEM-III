#include <iostream.h>

#define max 10

using namespace std;

int TOS = -1 , arr[max] , val , quit = 0;

void push();
void pop();
bool isEmpty();
bool isFull();
void showStack(int arr[] , int TOS);

int main(){
    int gameChoice;
    while(quit != 1){
        cout<<"Following are your choices : "<<endl;
        cout<<"1. Push element"<<endl;
        cout<<"2. Pop elements"<<endl;
        cout<<"3. Quit the game"<<endl;

        cout<<endl<<"Enter your choice?"<<endl;
        cin>>gameChoice;

        switch(gameChoice){
        case 1:
            push();
            break;
        case 2:
            pop();
            break;
        case 3:
            quit = 1;
            break;
        default:
            cout<<"Enter appropriate choice"<<endl;
        }
    }
    return 0;
}

void showStack(int arr[] , int TOS){
    cout<<"The elements are : "<<endl;
    for(int i=0 ; i<=TOS ; i++){
        cout<<arr[i]<<endl;
    }
}

bool isEmpty(){
    if(TOS == -1){
        return true;
    }else{
        return false;
    }
}

bool isFull(){
    if(TOS == max-1){
        return true;
    }else{
        return false;
    }
}

void push(){
    if(isFull()){
        cout<<"Stack is full"<<endl;
    }else{
        cout<<"Enter value to add?"<<endl;
        cin>>val;
        TOS++;
        arr[TOS] = val;
        showStack(arr , TOS);
    }
}

void pop(){
    if(isEmpty()){
        cout<<"Stack is empty!!!"<<endl;
    }else{
        TOS--;
        showStack(arr , TOS);
    }
}
