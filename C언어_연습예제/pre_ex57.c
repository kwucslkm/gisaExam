#include <stdio.h>
int recursion(int n)
{
    if (n < 5)
        return 1;
    else if (n % 5 == 1)
        {
            return n + recursion(n - 1);
        }
    else
    {
        recursion(n - 1);
    }
}
void main()
{
    int n = recursion(16);
    printf("%d", n);
}