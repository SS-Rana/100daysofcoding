#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
    int data;
    struct Node *next;
    struct Node *prev;
}Node;

Node *createNode(int data){
    Node *newNode = (Node *)malloc(sizeof(Node));
    newNode->data = data;
    newNode->next = NULL;
    newNode->prev = NULL;
    return newNode;
}

void Enqueue(Node **head, Node **tail, int data){
    if(*head == NULL && *tail == NULL){
        *head = *tail = createNode(data);
        return;
    }

    Node *newNode = createNode(data);
    newNode->prev = *tail;
    (*tail)->next = newNode;
    *tail = newNode;

}

void Dequeue(Node **head, Node **tail){
      if (*head == NULL) {
        printf("The list is empty\n");
        return;
    }

    Node *temp = *head;
    *head = (*head)->next;
    
    if (*head == NULL) { 
        *tail = NULL;
    } else {
        (*head)->prev = NULL;
    }
    
    free(temp);
}

void display(Node *head){
    Node *temp = head;
    while(temp != NULL){
        printf("%d ",temp->data);
        temp = temp->next;
    }
    printf("\n");
}
int main(){

    Node *head = NULL;
    Node *tail = NULL;

    Enqueue(&head, &tail, 10);
    Enqueue(&head, &tail, 20);
    Enqueue(&head, &tail, 30);
    
    printf("Queue: ");
    display(head);
    
    Dequeue(&head, &tail);
    printf("After Dequeue: ");
    display(head);
    
    Dequeue(&head, &tail);
    printf("After Dequeue: ");
    display(head);
    
    Dequeue(&head, &tail);
    printf("After Dequeue: ");
    display(head);
    
    Dequeue(&head, &tail);
    return 0;
}