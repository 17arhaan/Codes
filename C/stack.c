#include <stdio.h>
#include <stdlib.h>
#define MAX_SIZE 100

// struct Stack {
//     char arr[MAX_SIZE];
//     int top;
// };

// void push(struct Stack *s, char value) {
//     if (s->top == MAX_SIZE - 1) {
//         printf("Stack Overflow\n");
//     } else {
//         s->arr[++(s->top)] = value;
//         printf("%c is pushed into stack\n", value);
//     }
// }

// void pop(struct Stack *s) {
//     if (s->top == -1) {
//         printf("Stack Underflow\n");
//     } else {
//         printf("Popped %c from top\n", s->arr[(s->top)--]);
//     }
// }

// void display(struct Stack s) {
//     printf("\nStack Elements\n");
//     for (int i = 0; i <= s.top; ++i) {
//         printf("%c\t", s.arr[i]);
//     }
//     printf("\n");
// }

// int main() {
//     struct Stack s1 = {.top = -1};
//     int n, option;
//     char value;

//     printf("Menu\n1. Push()\n2. Pop()\n3. Display()\n4. Exit\n");

//     do {
//         printf("\nInput Choice: ");
//         scanf("%d", &option);

//         if (option == 1) {
//             printf("Element to be pushed: ");
//             scanf(" %c", &value);
//             push(&s1, value);
//         } else if (option == 2) {
//             pop(&s1);
//         } else if (option == 3) {
//             display(s1);
//         } else if (option == 4) {
//             printf("Exit\n");
//         } else {
//             printf("Not a Valid Response\n");
//         }
//     } while (option != 4);

//     return 0;
// }


