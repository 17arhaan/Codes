#include<stdio.h>
int main()
{
    int n;
    int array1[99];
    printf("Enter the size of array: ");
    scanf("%d",&n);
    printf("Enter the elements: ");
    for (int i = 0 ; i < n ; i++)
    {
        scanf("%d",&array1[i]);
    }
    printf("the array is: \n ");
    for (int i = 0 ; i < n ; i++)
    {
        printf("%d",array1[i]);
        printf("\n");
    }
    return 0;
}
