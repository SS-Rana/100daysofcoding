
#include<stdio.h>

int top =-1;
#define size 5
int arr[size];

void push(int x){
    if(top==size-1){
        printf("stack is full\n");
        return;
    }

    else{
        arr[++top]=x;
    }
}

void pop(){
    if(top==-1){
        printf("Stack is empty\n");
        return;
    }
    else{
        top--;
    }
}

void display(){
    if(top == -1){
        printf("The stack is empty\n");
        return;
    }
    printf("The stack: ");
    for(int i=0; i<=top; i++){
        printf("%d ",arr[i]);
    }
}
int main(){
    int choice, value;

    do {
        printf("\nMenu:\n");
        printf("1. Push\n");
        printf("2. Pop\n");
        printf("3. Display\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter a value to push: ");
                scanf("%d", &value);
                push(value);
                break;
            case 2:
                pop();
                break;
            case 3:
                display();
                break;
            case 4:
                printf("Exiting...\n");
                break;
            default:
                printf("Invalid choice! Please try again.\n");
        }
    } while (choice != 4);

    return 0;
}