ex01.  16진수 계산

```c
#include<stdio.h>
void main(){
    int x = 0x11;
    int y,z;
    y= x & 0x0f;
    z= x | 0x0f;
    printf("x=%d, y=%d, z=%d", x, y, z);
}
—> x=17, y=1, z=31
```

ex02. 매크로

```
#include <stdio.h>

#define N 10
#define SQR(X) X*X
void main()
{
    SQR(N);
    printf("%d",SQR(N + 2));
    
}
--> 32
```

ex03. 3항연산

```c
void main(){
    int a, b;
    a=20;
    b=(a>10)?a+a:a*a;
    printf("b=%d\n",b);
}
--> 40
```

ex04. switch case문

```c
#include <stdio.h>
int main()
{
    int a = 0, b = 1;
    switch (a)
    {
    case 0:
        printf("%d\n", b++);
        break;
    case 1:
        printf("%d\n", ++b);
        break;
    default:
        printf("%d\n", b);
        break;
    }
    return 0;
}
--> 1
```

ex05. for문

```c
#include <stdio.h>
int main()
{
    int j;
    int sum = 0;
    for (j = 2; j <= 70; j += 5)
        sum = sum + 1;
    printf("%d", sum);
}
--> 14
```

ex06. while문

```c
int main(int argc, char const *argv[])
{
    int i = 0;
    while (i < 3)
    {
        printf("i=:%d\n", i);
        i++;
    }
    printf("sum=:%d\n", i);
}
-->
	i=:0
	i=:1
	i=:2
	sum=:3

int main()
{
    int count =2;
    int sum =0;
    while(count <+10){
        sum+=count;
        count+=2;
    }
    printf("%d",sum);
}
--> 20
```

ex07.

```c
int main()
{
    int count =2;
    int sum =0;
    while(count <+10){
        sum+=count;
        count+=2;
    }
    printf("%d",sum);
}
--> 20
```

ex08. do while 문

```c
int main()
{
int i = 3;
    do
    {
        printf("%d\n", i);
        i++;

    } while (i < 3);
    printf("sum= %d\n", i);
}
```

ex09. 

```c
int main()
{
    int a, b;
    a = 2;
    while (a-- > 0)
    {
        printf("a=%d\n", a);
    }
    for (b = 0; b < 2; b++)
    {
        printf("a=%d\n", a++);
    }
}
--> 
	a=1
	a=0
	a=-1
	a=0
```

ex10. While , if 문

```c
int main(int argc, char const *argv[])
{
    int a = 120, b = 45;
    while (a != b)
    {
        if (a > b)
            a = a - b;
        else
            b = b - a;
    }
    printf("%d", a);
}
--> 15
```

ex11. for, continue, break, if

```c
int main(int argc, char const *argv[])
{
    int i, sum = 0;
    for (i = 1 ; i <= 10 ; i += 2)
    {
        if (i % 2 && i % 3)
            continue;
            sum+=i;
    }
    printf("%d", sum);
}
-->12
```

ex12. 

```c
int main(int argc, char const *argv[])
{
    int i, j, sum = 0;
    for (i = 1; i < 10; i++)
    {
        for (j = 1; j < 10; j++)
        {
            if (j % 3 == 0)
                continue;
            if (i % 4 == 0)
                break;
            sum++;
        }
    }
    printf("%d", sum);
}
--> 42
```

ex13. 배열

```c
int main(int argc, char const *argv[])
{
    char msg[50] = "Hello World! God Luck!";
    int i=2, number = 0;
    while(msg[i] !='!'){
        if(msg[i] == 'a' || msg[i] == 'e'|| msg[i] =='i'|| msg[i] == 'o' || msg[i] == 'u')
        number++;
        i++;
    }
    printf("%d", number);
    return 0;
}
--> 2
```

ex14. 배열

```c
int main(int argc, char const *argv[])
{
    int i;
    char ch;
    char str[7] = "nation";
    for (i = 0; i < 4; i++)
    {
        ch = str[5 - i];
        str[5 - i] = str[i];
        str[i] = ch;
    }
    printf("%s\n", str);
    return 0;
}
--> notian
```

ex15. 포인터

```c
int main(int argc, char const *argv[])
{
    int A = 10, B;
    int *C = &B;
    B= A--;
    B+=20;
    printf("%d", *C);
    
}
--> 30
```

ex16. scanf 와 변수

```c
#include<stdio.h>
int main()
{
    int i = 10;
    int j = 20;
    int *k = &i;

    scanf("%d", k);
    printf("%d, %d, %d\n", i, j, *k);
    return 0;
}
```

ex17. 배열과 포인터

```c
int main(int argc, char const *argv[])
{
    int i;
    int a[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int *ptr = a + 3;
    for (i = 0; i < 5; ++i)
    {
        printf("%d", *(ptr + i) - 3);
    }
}
--> 3747576777
```

ex18. 배열과 포인터2

```c
#include<stedio.h>
int main()
{
    int a[]= {1,2,4,8};
    int *p=a;
    p[1]=3;
    a[1]=4;
    p[2]=5;
    printf("%d%d\n", a[1]+p[1],a[2]+p[2]);
    return 0;
}
--> 810
```

ex19.배열과 포인터3

```c
int main()
{
    int a[4]={10,20,30};
    int *p = a;
    p++;
    *p++=100;
    *++p = 200;
    printf("a[0]=%d, a[1]=%d,a[2]=%d\n",a[0],a[1],a[2]);
    return 0;
}
-->810
```

ex20. 

```c
int main(int argc, char const *argv[])
{
    int num[4]={1,2,3,4};
    int *pt = num;
    pt++;
    *pt++=5;
    *pt++=10;
     pt--;
     *pt++ += 20;
     printf("%d %d %d %d", num[0],num[1],num[2],num[3]);
    return 0;
}
--> 1 5 30 4
```

ex21. 2차원배열과 포인터

```c
int main(int argc, char const *argv[])
{
    int data[][3] = {1,3,4,5,2,9,6,8,7};
    int *p = data[1];
    int x, y;
    x=*p;
    y=*(p+2);
    printf("x=%d, y=%d\n",x,y);
    
}
--> x=5, y=9
```

ex22. 2차원배열과 포인터

```c
#include<stdio.h>
int main(){
    int darr[3][3] = {{1,2,3},{4,5,6},{7,8,9}};
    int sum1, sum2;
    sum1 = *(*darr+1)+*(*darr+2);
    sum2 = *darr[1]+*darr[2];
    printf("%d, %d", sum1, sum2);
}
--> 5,11
```

ex31. 포인터배열

```c
#include<stdio.h>
int main(){
    static char *c[] = {"aaa", "bbb", "ccc"};
    printf("%s", *(c+1));
}
--> bbb
```

ex32. 포인터배열

```c
#include <stdio.h>
int main()
{
    char *array1[2] = {"Good morning", "C language"};
    printf("%s\n", array1[0] + 5);
    printf("%c\n", *(array1[1] + 6));
}
--> morning
		u
```

ex33. 포인트배열

/코드

```c
#include <stdio.h>
int main()
{
    int a[2][3] = {{-3, 14, 5}, {1, -10, 8}};
    int *b[] = {a[0], a[1]};
    int *p = b[1];
    printf("%d", *b[1]);
    printf("%d", *(++p));
    printf("%d", *(--p-2));
}
--> 1-1014
```

ex34. 포인터배열

```c
int main(){
    int *arr[3];
    int a=12, b=24, c=36;
    arr[0] = &a;
    arr[1] = &b;
    arr[2] = &c;
    printf("%d\n", *arr[1]+ **arr+1);
}
--> 37
```

ex35. 구조체, 포인터 이동

```c
#include <stdio.h>
int main()
{
    struct list
    {
        int *fp;

    } data, *p;
    int x[] = {100, 200, 300, 400};
    p = &data;
    p->fp = x + 1;
    printf("%d", *(++p->fp));
    return 0;
}
--> 300
```

ex36. 배열 포인터 >> 문제가 이상함 pass

```c
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
-->12
```

ex37. 함수

```c
int main()
{
    int data = sum(20, 20);
    printf("%d", data);
}
int sum(int a, int b)
{
    int c = a + b;
    return c;
}
```

```c
#include <stdio.h>
void swap(int a, int b)
{
    int temp;
    temp = a;
    a = b;
    b = temp;
}
int main(void)
{
    int k, j;
    k = 3;
    j = 2;
    swap(k, j);
    printf("k=%d,j=%d", k, j);
    return 0;
}
--> k = 3,j=2       ==> 함정인듯? 
```

ex38. 함수와 반복문

```c
#include<stdio.h>
int func(int n);
int main(void){
    int num;
    printf("%d\n", func(5));
    return 0;
}
int func(int n){
    if(n<2)
        return n;
    else {
        int i, tmp, curent=1, last =0;
        for(i=2; i<=n ; i++){
            tmp=curent;
            curent += last;
            last = tmp;
        }
        return curent;

    }
}
--> 5
```

ex39.  함수에 주소전달

```c
#include<stdio.h>
int main(void){
    int x=10, y=20;
    printf("%d",f(&x,y));
    printf("%d %d\n", x, y);

}
int f(int *i, int j){
    *i+= 5;
    return (2 * *i + ++j);
}
--> 5115 20
```

ex40. 함수와 변수의 유효범위

```c
#include<stdio.h>
int a=1, b=2, c=3;
int f(void);
int main(void){
    printf("%3d\n",f());
    printf("%3d%3d%3d\n", a,b,c);
    return 0;
}
int f(void){
    int b, c;
    a=b=c=4;
    return(a+b+c);
}
--> 
 12
  4  2  3
```

ex41. 함수에 주소전달

```c
#include <stdio.h>
void main()
{
    int a = 5;
    int b = 3;
    int c = 0;
    b = foo(a, &c);
    c = foo(b, &a);
    printf("a=%d b=%d c=%d", a, b, c);
}
int foo(int a, int *b)
{
    int c;
    *b = a + 1;
    c = a - 1;
    return c;
}
--> 5,4,3
```

ex42. 함수에 주소전달

```c
#include<stdio.h>
void main(){
    int value =3, list[4] = {1,3,5,7};
    int i;
    swap(value, &list[0]);
    swap(list[2], &list[3]);
    swap(value, &list[value]);
    for(i=0;i<4;i++)
        printf("%d",list[i]);
}
void swap(int a, int *b){
    int temp;
    temp = a;
    a= *b;
    *b=temp;
}
--> 3353
```

ex43. 함수가 주소를 리턴

```c
#include <stdio.h>
int main()
{
    int i;
    int x = 10;
    int *p;
    int a[100];
    for (i = 0; i < 100; i++)
        a[i] = i * 10;
    p = func(x, a);
    printf("sum=%d", x + a[0] + a[1] + p[0] + p[1]);
}
int *func(int a, int *x)
{
    a = a + 10;
    x = x + 1;
    *x = *x * 2;
    return x;
}
--> sum= 70
```

ex44.  함수에 주소 전달

```c
#include <stdio.h>
void main(void)
{
    int a = 10, b = 20, c = 30, d = 40;
    change(&a, &b, c, d);
    printf("a=%d,b=%d,c=%d,d=%d", a, b, c, d);
}
void change(int *px, int *py, int pc, int pd)
{
    *px = *py + pd;
    *py = pc + pd;
    pc = *px + pd;
    pd = *px + *py;
}
--> a=60,b=70,c=30,d=40
```

ex45. 함수에 주소 전달

```c
#include <stdio.h>
double h(double *f, int d, double x);
int main()
{
    double f[] = {1, 2, 3, 4};
    printf("%3.1f\n", h(f, 4, 2));
    return 0;
}
double h(double *f, int d, double x)
{
    int i;
    double res = 0.0;
    for (i = d - 1; i >= 0; i--)
    {
        res = res * x + f[i];
    }
    return res;
}
--> 49.0
```

ex46. 함수에 주소전달

```c
#include <stdio.h>
void func(int *a, int b, int *c);
int main()
{
    int a, b, c[1];
    a = 20;
    b = 20;
    c[0] = 20;
    func(&a, b, c);
    printf("a=%d b=%d c=%d", a, b, c[0]);
    return 0;
}
void func(int *a, int b, int *c)
{
    int x;
    x = *a;
    *a = x++;
    x = b;
    b = ++x;
    --(*c);
}
--> a=20 b=20 c=19
```

ex47. 함수에 주소전달

```c
#include<stdio.h>
#define SIZE 3
void func(int *m, int *x, int y);
int main()
{
    int num[SIZE] = {1, 3, 6};
    int a = 10, b = 30;
    func(num, &a, b);
    printf("a=%d, b=%d\n", a, b);
    return 0;
}
void func(int *m, int *x, int y)
{
    int i = 0, n = 0;
    y = *x;
    n = *(m + 1) + (*m + 2);
    *x = ++n;
}
--> a=7, b=30
```

ex48. 함수에 주소전달

```c
#include <stdio.h>
void a(int n, int *num);
void b(int n, int *lt);
void c(int *a, int *b);
int main()
{
    int n;
    int *num;
    printf("How many numbers?");
    scanf("%d", &n);
    num = (int *)malloc(sizeof(int) * n);
    a(n, num);
    b(n, num);
    for (int i = 0; i < n; i++)
        printf("%d", num[i]);
}
void a(int n, int *num)
{
    for (int i = 0; i < n; i++)
        scanf("%d", &(num[i]));
}
void b(int n, int *lt)
{
    int a, b;
    for (a = 0; a < n - 1; a++)
    {
        for (b = a + 1; b < n; b++)
        {
            if (lt[a] > lt[b])
                c(lt + a, lt + b);
        }
    }
}
void c(int *a, int *b)
{
    int t;
    t = *a;
    *a = *b;
    *b = t;
}
--> 124
```

ex49. static 변수

```c
 #include<stdio.h>
void funCount();
int main(void){
    int num;
    for(num=0; num<2;num++)
        funCount();
    return 0;
}
void funCount(){
    int num =0;
    static int count;
    printf("num=%d, count=%d\n",++num,count++);
}
-->
	num=1, count=0
	num=1, count=1
```

ex50.static 변수

```c
#include<stdio.h>
void main(){
    int i=0, sum=0;
    while(i<3){
        sum=sum+fo();
        i++;

    }
    printf("sum=%d\n",sum);
}
int fo(void){
    int var1=1;
    static int var2 =1;
    return(var1++)+(var2++);
}
--> sum=9
```

ex51. static 변수

```c
#include <stdio.h>
int funcA(int n);
int funcB(int n);
void main()
{
    int s1, s2;
    s1 = funcA(2);
    printf("F1=%d,", s1);
    s1 = funcA(3);
    printf("F2=%d,", s1);
    s2 = funcB(2);
    printf("F3=%d,", s2);
    s2 = funcB(3);
    printf("F4=%d", s2);
}
int funcA(int n)
{
    static int s = 1;
    s *= n;
    return s;
}
int funcB(int n)
{
    int s = 1;
    s *= n;
    return s;
}
-->
F1=2,F2=6,F3=2,F4=3
```

ex52. static 변수

```c
int a = 10;
int b = 20;
int c = 30;

void main()
{
    func();
    func();
    printf("a=%d,b=%d,c=%d\n", a, b, c);
}
void func(void)
{
    static int a = 100;
    int b = 200;
    a++;
    b++;
    c = a;
}
--> a=10,b=20,c=102
```

ex53.재귀함수

```c
#include<stdio.h>
int func(int num){
    if(num==1)
        return 1;
    else
    return num *func(num-1);
}
void main(){
    int i;
    for(i=5; i>=0; i--){
        if(i%2==1)
            printf("func(%d) : %d\n",i,func(i));
    }
}
-->
func(5) : 120
func(3) : 6
func(1) : 1
```

ex54. 재귀함수

```c
#include <stdio.h>
int f(int n){
    if(n>0)
        return n % 10 + f(n/10);
    else 
        return 0;
}
void main(){
    int result;
    result= f(123);
    printf("%d\n",result);
}
--> 6
```

ex55. 재귀함수

```c
#include <stdio.h>
int main()
{
    int result;
    result = func(19);
    printf("result=%d\n", result);
}
int func(int n)
{
    if (n % 2 == 1)
        n = n - 1;
    if (n == 0)
        return 0;
    return (func(n - 2) + n);
}
--> result = 90
```

ex56. 재귀함수

```c
int main(){
    my(5,14);
    return 0;
}
int my(int i, int j){
    if(i<3) i=j=1;
    else{
        i=i-1;
        j=j-i;
        printf("%d, %d,",i,j);
        return my(i,j);
    }
}
--> 4, 10,3, 7,2, 5,
```

ex57. 재귀함수

```c
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
--> 34
```

ex58. 중복 재귀함수

```c
#include <stdio.h>
int recur(int a, int b)
{
    if (a <= 1)
        return a * b;
    else
        return a * recur(a - 1, b + 1) + recur(a - 1, b);
}
void main()
{
    int a = 3, b = 2;
    printf("%d\n", recur(a, b));
}
--> 41
```

ex59. 중복 재귀 함수

```c
#include<stdio.h>
int main(){
    int a=0;
    a=sub(4);
    printf("%d",a);
}
int sub(int n){
    if(n==0) return 0;
    if(n==1) return 1;
    return (sub(n-1)+sub(n-2));
}
--> 3
```

ex60. 중복 재귀함수 → fib 함수 15번 호출 됨

```c
#include<stdio.h>
int fib(int n){
    if(n==0) return 0;
    if(n==1) return 1;
    return (fib(n-1) + fib(n-2));
}
void main(){
    printf("%d",fib(5));
}
--> 5
```

ex61 ++printf

```c
#include <stdio.h>
int main()
{
    int i = 5;
    printf("%d, %d, %d, %d", i++, ++i, i++, ++i);
}
--> 8,9,6,9
```

```c
#include <stdio.h>
int main()
{
	  int i = 5;
    printf("%d, %d, %d, %d", --i, i--, i--, --i);
}
--> 1,3,4,1
```

ex62. ++ 중복

```c
#include<stdio.h>
int main(){
    int i=5;
    int z=i++ + i++ + i++;
    printf("%d,%d",i,z);
}
--> 8, 18

#include<stdio.h>
int main(){
    int i=5;
    int z=++i + ++i + ++i;
    printf("%d,%d",i,z);
}
--> 8, 22

#include<stdio.h>
int main(){
    int i=5;
    int z=++i + i++ + ++i;
    printf("%d,%d",i,z);
}
--> 8, 21
```

ex63. 나중에 수정~!~~

```c
#include <unistd.h>
int main()
{
    int 9 = 0, v = 1, n = 5;
    pid_t pid;
    pid = fork();

    if (pid < 0)
    {
        for (i = 0; i < n; i++)
            v += (i + 1);
        printf("c=%d", v);
    }
    else if (pid = 0)
    {
        for (i = 0; i < n; i++)
            v *= (i + 1);
        printf("b=%d,", v);
    }
    else
    {
        wait(NULL);
        for (I = 0; i < n; i++)
            v += 1;
        printf("a=%d", v);
    }
}
```