#include <stdio.h>
#include <stdlib.h>
#define N 3
int main(void)
{
    int(*in)[N], *out, sum = 0;
    in = (int(*)[N])malloc(N * N * sizeof(int));
    out = (int *)in;
    for (int i = 0; i < N * N; i++)
        out[i];
    for (int i = 0; i < N; i++)
        sum += in[i][i];
    printf("%d", sum);
}