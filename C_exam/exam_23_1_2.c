#include <stdio.h>
int main(int argc, char const *argv[])
{
    char a[] = "Art";
    char* p = NULL;
    p = a;
    printf("%s\n", a);
    printf("%c\n", *p);
    printf("%c\n", *a);
    printf("%s\n", p);
    for (int i=0; a[i] != '\0';i++)
        printf("%c",a[i]);
    return 0;
}
