#include <stdio.h>
#include <stdlib.h>
#define MAX_VALUE 50

int n = 3;
void InsertVertex(int a[MAX_VALUE][MAX_VALUE])
{
    int i;
    for (i = 0; i < n; i++)
    {
        a[i][n - 1] = 0;
        a[n - 1][i] = 0;
    }
}
void create(int a[MAX_VALUE][MAX_VALUE])
{
    int i, j;
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
            a[i][j] = 0;
    }
}
void InsertEdge(int a[MAX_VALUE][MAX_VALUE], int v, int u)
{
    if (v < n && u < n)
    {
        a[u][v] = 1;
        a[v][u] = 1;
    }
    else if (u == v)
    {
        printf("self edge\n");
    }
    else
        printf("edge not valid\n");
}
void DeleteVertex(int a[MAX_VALUE][MAX_VALUE], int v)
{
    int i, j;
    if (v < n)
    {
        for (i = v; i < n; i++)
        {
            for (j = 0; j < n; j++)
                a[j][i] = a[j][i + 1];

            for (j = 0; j < n; j++)
                a[i][j] = a[i + 1][j];
        }
    }
}
void DeleteEdge(int a[MAX_VALUE][MAX_VALUE], int v, int u)
{
    if (u < n && v < u)
    {
        a[u][v] = 0;
        a[v][u] = 0;
    }
    else
        printf("not valid edge\n");
}
int IsEmpty(int a[MAX_VALUE][MAX_VALUE])
{
    int i, j, flag = 1;
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
            if (a[i][j] != 0)
            {
                flag = 0;
                break;
            }
    }

    return flag;
}
void AdjMatrix(int a[MAX_VALUE][MAX_VALUE], int v)
{
    int i, j;
    printf("the adjacent of %d are ", v);
    for (j = 0; j < n; j++)
    {

        if (a[v][j])
            printf("%d ", j);
    }
}
void display(int a[MAX_VALUE][MAX_VALUE])
{
    int i, j;
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
            printf("%d ", a[i][j]);
        printf("\n");
    }
}
int main()
{
    printf("------ Graph ------\n");
    int adjmat[MAX_VALUE][MAX_VALUE];
    int ch, i, j, s;
    create(adjmat);
    do
    {
        printf("1. InserVertex 2. InsertEdge  3. DeleteVertex  4. DeleteEdge  5. IsEmpty 6. Dsiplay  7.Exit\n");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            printf("creating new vertex\n");
            n++;
            InsertVertex(adjmat);
            break;
        case 2:
            printf("enter the edge \n");
            scanf("%d%d", &i, &j);
            InsertEdge(adjmat, i, j);
            break;
        case 3:
            printf("enter the vertex to be deleted\n ");
            scanf("%d", &i);
            DeleteVertex(adjmat, i);
            n = n - 1;
            break;

        case 4:
            printf("enter the edge deletd \n");
            scanf("%d", &i, &j);
            DeleteEdge(adjmat, i, j);
            break;
        case 5:
            s = IsEmpty(adjmat);
            if (s == 1)
                printf("graph is empty\n");
            else
                printf("graph is non-empty\n");
            break;
        case 6:
            display(adjmat);
            break;
        case 7:
            printf("enter the vertex whose adjacent vertex you want to know\n");
            scanf("%d", &i);
            AdjMatrix(adjmat, i);
        }
    } while (ch != 8);

    return 0;
}