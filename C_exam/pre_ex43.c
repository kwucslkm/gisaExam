#include <stdio.h>
int main()
{
    int i;
    int x = 10;
    int *p;
    int a[100];
    for (i = 0; i < 100; i++)
        a[i] = i * 10;
    p = func(x, a);
    printf("sum=%d", x + a[0] + a[1] + p[0] + p[1]);
}
int *func(int a, int *x)
{
    a = a + 10;
    x = x + 1;
    *x = *x * 2;
    return x;
}