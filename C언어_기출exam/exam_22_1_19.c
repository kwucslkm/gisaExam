#include<stdio.h>
int main()
{
    int num= 1234;
    int div = 10;
    int res=0;
    while(num>0){
        res=res*div;
        res=res+num % div;
        num = num /div;
    }
    printf("%d",res);
}
