int main(){
    int result[5];
    int ary[]={77,32,10,99,50};
    for(int i=0; i<5 ; i++){
        result[i]=1;
        for(int j=0;j<5;j++)
            if(ary[i]<ary[j]) result[i]++;
        
    }
    for(int i=0 ; i<5 ; i++)
        printf("%d",result[i]);
}