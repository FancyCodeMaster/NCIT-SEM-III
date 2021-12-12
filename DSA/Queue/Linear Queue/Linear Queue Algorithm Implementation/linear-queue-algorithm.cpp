#include <iostream.>

using namespace std;

#define maxi 3

int arr[15];
int Rear = -1;
int Front = -1;
int quit = 0;

void enqueue();
void dequeue();
void showQueue();

int main(){
    int choice;
    while(quit != 1){
        cout<<endl<<"Following are your choices : "<<endl;
        cout<<"1. Enqueue()"<<endl;
        cout<<"2. Dequeue()"<<endl;
        cout<<"3. Quit"<<endl;
        cin>>choice;
        switch(choice){
        case 1:
            enqueue();
            break;
        case 2:
            dequeue();
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

void enqueue(){
    if(Rear == maxi-1){
        cout<<"The queue is full"<<endl;
    }else{
        cout<<"Enter the data you want to add?"<<endl;
        int data;
        cin>>data;
        if(Rear == -1 && Front == -1){
            Rear = ++Front;
            arr[Rear] = data;
        }else{
            Rear++;
            arr[Rear] = data;
        }
    }
    showQueue();
}

void dequeue(){
    if(Front == -1){
        cout<<"The queue is empty"<<endl;
    }else{
        if(Rear == Front){
            Rear = -1;
            Front = -1;
            cout<<"no elements in the queue to show"<<endl;
        }else{
            Front++;
            showQueue();
        }
    }
}

void showQueue(){
    cout<<"The elements in the queue are : "<<endl;
    for(int i=Front ; i<=Rear ; i++){
        cout<<arr[i]<<endl;
    }
}
