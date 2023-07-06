int main(){
    int array[3];
    int s = 0;
    *(array+0) =1;
    array[1] = *(array+0)+2;
    array[2] = *array + 3;
    for(int i = 0; i<3; i++){
        s=s+array[i];
    }
    printf("%d",s);
}