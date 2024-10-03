#include<stdio.h>
#include<stdlib.h>

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

void addFirst(Node **head, Node **tail, int data){
    if(*head==NULL && *tail == NULL){
        *head = *tail = createNode(data);
        return;
    }

    Node *newNode = createNode(data);
    newNode->next = *head;
    (*head)->prev = newNode;
    *head = newNode;

}

void addLast(Node **head , Node **tail, int data){
    Node *newNode = createNode(data);
    if(*head == NULL && *tail == NULL){
        *head = *tail = newNode;
        return;
    }
    newNode->prev = *tail;
    (*tail)->next = newNode;
    *tail = newNode;
}

void display(Node *head){
    Node *temp = head;
    while(temp != NULL){
        printf("%d ",temp->data);
        temp = temp->next;
    }
    printf("\n");

}

void reverseDisplay(Node *tail){
    Node *temp = tail;
    while(temp != NULL){
        printf("%d ",temp->data);
        temp = temp->prev;
    }
    printf("\n");
}

void deleteLast(Node **head, Node **tail) {
    if (*tail == NULL) {
        printf("The list is empty\n");
        return;
    }

    Node *temp = *tail;
    if ((*tail)->prev == NULL) {
        free(temp);
        *head = *tail = NULL;
    } 
    else {
        *tail = (*tail)->prev;
        (*tail)->next = NULL;
        free(temp);
    }
}

void deleteFirst(Node **head, Node **tail){
    if(*head ==NULL){
        printf("The list is empty\n");
    }
    Node *temp = *head;
    if((*head)->next == NULL){
        free(temp);
        *tail = *head = NULL;
    }
    else{
        *head = (*head)->next;
        (*head)->prev = NULL;
        free(temp);
    }
}
int main(){
     Node *head = NULL;
    Node *tail = NULL;

    addFirst(&head, &tail, 10);
    addFirst(&head, &tail, 20);
    addLast(&head, &tail, 30);
    addLast(&head, &tail, 40);

    printf("List after adding elements: ");
    display(head);

    printf("Reverse display: ");
    reverseDisplay(tail);

    deleteFirst(&head, &tail);
    printf("List after deleting the first element: ");
    display(head);

    deleteLast(&head, &tail);
    printf("List after deleting the last element: ");
    display(head);
    return 0;
}