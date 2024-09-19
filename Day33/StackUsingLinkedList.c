#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int data;
    struct Node *next;
} Node;

Node *createNode(int data) {
    Node *newNode = (Node *)malloc(sizeof(Node));
    if (newNode == NULL) {
        fprintf(stderr, "Memory allocation failed\n");
        exit(1);
    }
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}


Node *push(Node *top, int data) {
    Node *newNode = createNode(data);
    newNode->next = top;
    return newNode; 
}

Node *pop(Node *top) {
    if (top == NULL) {
        printf("Stack is empty, cannot pop\n");
        return NULL;
    }

    Node *newTop = top->next; 
    free(top); 
    return newTop;
}

int peek(Node *top) {
    if (top == NULL) {
        printf("Stack is empty, nothing to peek\n");
        return -1; 
    }
    return top->data;
}


int isEmpty(Node *top) {
    return top == NULL;
}

void printStack(Node *top) {
    Node *current = top;
    while (current != NULL) {
        printf("%d -> ", current->data);
        current = current->next;
    }
    printf("NULL\n");
}



int main() {
    Node *stack = NULL; 

    stack = push(stack, 10);
    stack = push(stack, 20);
    stack = push(stack, 30);

    printStack(stack);


    printf("Top element: %d\n", peek(stack));

    stack = pop(stack);

    printStack(stack);

    return 0;
}
