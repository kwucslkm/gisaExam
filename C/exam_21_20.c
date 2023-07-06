int fp(int base, int exp){
    int result = 1;
    for(int i = 0 ; i< exp;i++){
        result = result*base;
    }
    return result;
}
int main()
{
    int result;
    result = fp(2,10);
    printf("%d",result);
    return 0;
}
