int main(){
    struct insa
    {
        char name[10];
        int age;
        /* data */
    } a[] = {"Kim", 28, "Lee", 38, "Park", 41, "Choi",30};
    struct insa* p;
    p = a;
    p++;
    printf("%s\n", p->name);
    printf("%d\n", p->age);
    
}
