#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node *prev;
    struct Node *next;
}
struct Node *head,*temp,*t;

void Enqueue(int a){
    temp = (struct Node*)malloc(sizeof(struct Node));
    temp -> data = a;
    temp -> next = NULL;
    if(head == NULL){
        head = temp;
        head -> prev = NULL;
    }
}