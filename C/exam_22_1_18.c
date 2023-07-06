#include<stdio.h>
int func(int i){
    if(i<=1) 
        return 1;
    else 
        return i * func(i-1);
}
int main(){
    int in;
    scanf("%d",&in);
    printf("%d",func(in));
}