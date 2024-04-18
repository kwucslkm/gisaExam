1. java 결과

   ```java
    class Static {
        public int a = 20;
        static int b = 0; 
    }
    public class exam_23_1_1 {
        public static void main(String[] args){        
            int a = 10;
            Static.b = 0;
            Static.b = a;
            Static st = new Static();
            System.out.println(Static.b++);
            System.out.println(st.b);
            System.out.println(a);
            System.out.println(st.a);
            
        }
    }
        ==> 10  
            11
            10
            20
    ```
2. C언어 결과
    ```c
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
    ==> Art
        A
        A
        Art
        Art 
    ```
3. c언어 결과

    ```c
    #include <stdio.h>
    main(){
        char* a = "qwer";
        char* b = "qwtety";
        for (int i = 0 ; a[i] != '\0' ; i++)
            for(int j = 0 ; b[j] != '\0' ; j++)
                if(a[i] == b[j])
                    printf("%c", a[i]);
    }
    ==> qwe
    ```
4. 클라이언트와 서버 간 자바스크립트 및 xml을 비동기 방식으로 처리하며, 전체 페이지를
   새로 고치지 않고도 웹페이지 일부 영역만을 업데이트할 수 있도록 하는 기술을 의미하는 용어를 쓰시오.
    ==> AJAX
