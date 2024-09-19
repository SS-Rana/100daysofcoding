#include<stdio.h>
#include<stdlib.h>
typedef struct Node{
    int data;
    struct Node *next;

}Node;

Node *createNode(int data){
    Node *newNode = (Node*) malloc(sizeof(Node));
    newNode->data = data;
    newNode->next = NULL;
}

Node *addFirst(Node *root, int data){
    Node *newNode = createNode(data);
    newNode->next = root;
    return newNode;
}

Node *addLast(Node *root, int data){
    if(root == NULL){
        return createNode(data);
    }

    root->next = addLast(root->next, data);
    return root;
}

void display(Node *root){
    Node *t = root;
    while(t != NULL){
        printf("%d ",t->data);
        t = t->next;
    }
    printf("\n");
}

Node *deleteLast(Node *root){
    if(root == NULL){
        printf("The List is empty\n");
        return NULL;

    }
    if(root->next){
        free(root);
        return NULL;
    }
   root->next = deleteLast(root->next);
   return root;
}

Node *deleteFirst(Node *root){
    if(root == NULL){
        printf("The List is empty\n");
        return NULL;
    }
    else if(root->next == NULL){
        free((root));
        return NULL;
    }
    Node *t = root->next;
    free(root);
    return t;
        
}
int main(){
       Node *head = NULL;

    head = addFirst(head, 10);
    head = addLast(head, 20);
    head = addLast(head, 30);

    printf("Linked list: ");
    display(head);

    head = deleteFirst(head);
    printf("After deleting the first node: ");
    display(head);


    head = deleteLast(head);
    printf("After deleting the last node: ");
    display(head);

    head = deleteLast(head);
    printf("After deleting the last node: ");
    display(head);

    head = deleteLast(head);
    printf("After deleting the last node: ");
    display(head);
    return 0;
}