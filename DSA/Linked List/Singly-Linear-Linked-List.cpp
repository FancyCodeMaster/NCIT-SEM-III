#include <iostream>

using namespace std;

struct singlylLnear{
    int data;
    struct singlyLinear *next;
};

int main(){
    typedef struct singlyLinear;
    singlyLinear sl;
    sl *headptr = NULL , *p , *temp;
    temp = (sl *)malloc(sizeof(sl));
    return 0;
}
