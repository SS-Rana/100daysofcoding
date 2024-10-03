#include<stdio.h>
#define size 5
int Queue[size];
int front = -1;
int back = -1;

void Enqueu(int value){
    if(back+1 % size == front){
        printf("Queue is full");
        return;
    }
    
    if(front == -1){
        front = 0;
        back = 0;
        Queue[back] = value;
        }
    else{
        back = (back+1) % size;
        Queue[back] = value;
        }
    
}

void Dequeu(){
    if(front == -1){
        printf("Queue is empty");
        return;
    }
    if(front == back){
        front = -1;
        back = -1;
    }
    else{
        front = (front+1) % size;
    }
}

void display(){
    if(front == -1){
        printf("Queue is empty");
        return;
    }
    printf("The queue: ");
    for(int i=front; i<=back; i++){ 
        printf("%d ",Queue[i]);
    }
    printf("\n");
}
int main(){
    Enqueu(1);
    Enqueu(2);
    Enqueu(3);
    Enqueu(4);
    Enqueu(5);
    display();
    Dequeu();
    Dequeu();
    display();
    return 0;
}