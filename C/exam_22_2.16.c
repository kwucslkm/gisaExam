#include <stdio.h>
int main()
{
    char *p1 = "2022";
    char *p2 = "202210";
    int i = func(p1);
    int j = func(p2);
    printf("%d", i + j);
    return 0;
}
int func(char *p)
{
    int cnt = 0;
    while (*p != '\0')
    {
        cnt++;
        p++;
    }
    return cnt;
}