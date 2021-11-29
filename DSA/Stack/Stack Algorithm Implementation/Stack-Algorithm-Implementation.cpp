#include <iostream>

#define max 3

using namespace std;

int TOS = -1 , arr[max] , val , quit = 0;

void push();
void pop();
bool isEmpty();
bool isFull();
void showStack();

int main(){
    int gameChoice;
    while(quit != 1){
        cout<<endl<<"Following are your choices : "<<endl;
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

void showStack(){
    if(TOS == -1){
        cout<<endl<<"No elements in the stack to show!!!"<<endl;
    }else{
        cout<<endl<<"The elements are : "<<endl;
        for(int i=TOS ; i>=0 ; i--){
            cout<<arr[i]<<endl;
        }
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
        cout<<endl<<"Stack is full , can't push further."<<endl;
    }else{
        cout<<"Enter value to add?"<<endl;
        cin>>val;
        TOS++;
        arr[TOS] = val;
        showStack();
    }
}

void pop(){
    if(isEmpty()){
        cout<<endl<<"Stack is empty!!! , can't pop any."<<endl;
    }else{
        TOS--;
        showStack();
    }
}
