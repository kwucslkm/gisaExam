1. java 결과는
```java
class SuperObject{
    public void draw(){
        System.out.println("A");
        draw();
    }
    public void paint(){
        System.out.print('B');
        draw();
    }
}
class SubObject extends SuperObject{
    public void paint(){
        super.paint();
        System.out.print('C');
        draw();
    }
    public void draw(){
        System.out.print('D');
    }
}
public class Test{
    public static void main(String[] args){
        SuperObject a= new SubObject();
        a.paint();
        a.draw();
    }
}

BDCDD
```
2. OAuth
    ```
    - 인터넷 애플리케이션에서 사용자 인증에 사용ㅇ되는 표준 인증 방법으로, 공개 API(OpenAPI)로 구현 되었다.
    - 인터넷 사용자가 웹사이트나 애플리케이션에 비밀번호를 제공하지 않고 자신에게 접근 구넌한을 부여하여 사용할 수 있다.
    - 2010년 ETF에서 1.0이 공식 표준안으로 발표되었다.
    ```

3.  C언어 결과
    ```c
    #include <stdio.h>
    main(){
        char* p = "KOREA";
        printf("1. %s\n", p);
        printf("2. %s\n", p+1);
        printf("3. %c\n", *p);
        printf("4. %c\n", *(p+3));
        printf("5. %c\n", *p+4);
    }
    ==>
        1. KOREA
        2. OREA
        3. K
        4. E
        5. O

    char *p = "KOREA";
    printf("%s\n", p);      -> KOREA  : %s로 p에 있는 모든 값을 출력 
    printf("%s\n", p+3);    -> EA     : p는 p+0이고 %s로 p+3인 E부터 끝까지 출력
    printf("%c\n", *p);     -> K      : *p는 p+0으로 K 출력
    printf("%c\n", *(p+3)); -> E      : p+3 위치의 E 출력
    printf("%c\n", *p+2);   -> M      : *p는 p+0으로 K이고 +2이므로 K의 다다음  
                                        알파벳인 M 출력 / M
    ```
4. C언 구조체  print("%s", p->name); 화살표 기능(포인터변수의 멤버를 가리킬때)
    ```C
    int main(){
    struct insa
    {
        char name[10];
        int age;
        /* data */
    } a[] = {"Kim", 28, "Lee", 38, "Park", 41, "Choi",30},
    struct insa *p;
    p = a;
    p++;
    print("%s", p->name);
    print("%d", p->age);
    }
    ```
5. 리눅스 또는 유닉스에서 'a.txt' 파일에 대해 다음 <처리 조건>과 같이 권한을 부여하고자 한다. 
    ```
    - 사용자에게 읽기, 쓰기, 실행 권한을 부여한다.
    - 그룹에게 읽기, 실행 권한을 부여한다.
    - 기타 사용자에게 실행 권한을 부여한다.
    - 한 줄로 작성하고, 8진법 숫자를 이용한 명령문을 이용한다.
    ==> chmod 751 a.txt
    ```
6. (패키지 다이어그램) 는 UML정적 모델링의 하나로, 관련있는 객체들을 하나로 묶어    
    상위 개념으로 추상화 한것이다.  
    위의 그림과 같이 유스케이스나 클래스 등의 요소 들을 그룹화하여 의존 관계를 표현하며, 대규모 시스템에서 주요 요소 간의 종속성을 파악하는 데 사용한다. 시스템의 구조를 간략하게 표현할 수 있고 의존 관계를 명확하게 파악할 수 있어, 불필요한 의존 관계를 제거하거나 간략화함으로써 시스템의 복잡도를 낮추는 곳에도 사용할 수 있다.

***** 
-  다이어그램 종류 
    - 클래스 다이어그램
        - 클래스와 클래스가 가지는 속성, 클래스 사이의 관계를 표현함
    - 객체 다이어그램
        - 클래스에 속한 사물(객체)들, 즉 인스턴스를 특정 시점의 객체와 객체 사이의 관계로 표현함
        - 럼바우 객체지향 분석 기법에서 객체지향 분석 기법에서 객체 모델링에 활용
    - 컴포넌트 다이어그램
        - 실제 구현 모듈이 ㄴ컴포넌트 간의 관계나 컴포넌트 간의 인터페이스를 표현함
        - 구현 단계에서 사용됨
    - 배치 다이어그램
        - 결과물 , 프로세스, 컴포넌트 등 물리적 요소들의 위치를 표현함
        - 구현 단계에서 사용됨
    - 복합체 구조 다이어그램
        - 클래스나 컴포넌트가 복합 구조를 갖는 경우 그 내부 구조를 표현함
    - 패키지 다이어그램
        - 유스케이스나 클래스 등의 모델 요소들을 그룹화한 패키지 들의 관계를 표현함

*****
7. 테스트기법 중 다음과 같이 평가 점수표를 미리 정해 놓은 후 각 영역에 해당하는 입력값을 넣고, 예상되는 출력값이 나오는지 실제 값과 비교하는 명세 기반 테스트기법  
<평가 점수표>          <케이스>  
| 평가점수 | 성적등급 |  
| ----- | --- |  
|90~100|A|
|80~89|B|
|70~79|C|
|0~69|D|

Equivalence Partition 동치분할 기법

---
### 화이트박스 테스트
### 블랙박스 테스트
---
8.  < R > 과 < S > 테이블에 대해 <SQL문> 을 실행하였을 때 나타나는 결과를 작성하시오.
    (SQL을 실행하였을 때 출력되는 속성명과 값들을 모두 답안에 적으시오.)
    < R > < S >  
     A B   A B  
     1 a   1 a  
     2 b   2 c  
     3 c   4 d  
     <SQL 문>
     SELECT A FROM R
     UNION
     SELECT A FROM S
     ORDER BY A DESC;
     ==>  
     A  
     4  
     3  
     2  
     1  
10. NAT
    - 우리말로 번역하면 '네트워크 주소 변환'이라는 의미의 영문 3글자 이다.
    - 1개의 정식 ip 주소에 다량ㅇ의 가상 사설 ip주소를 할당 및 연결하는 방식이다.
    - 1개의 IP주소를 사용해서 외부에 접속할 수 있는 노드가 어느 시점에 1개로 제한되는 문제가 있으나 , 이 때는 ip 마스커레이드(Masquerade)를 이용하면 된다.
11. ATM  (Asynchronous Transfer Mode, 비동기 전송 모드)  
    자료를 일정한 크기로 정하여 순서대로 전송하는 자료의 전송방식으로, 셀이라 부르는 53Byte의 고정 길이 패킷을 이용하여 처리가 단순하고 고속망에 적합하다.  
    또한 연속적으로 셀을 보낼 때 다중화를 하지 않고 셀 단위로 동기가 이루어지지만 경우에 따라 동기식 시간 분할 다중화를 사용하기도 한다. CBR, VBR 의 처리가 가능하며, B-ISDN과  
    결합하여 서비스를 제공하기도 한다.  
    - ATM은 교환 전화 등에 쓰이는 회선 교환과 패킷 교환의 장점을 결합한 교환 및 다중화 기술.  
    - ATM은 모든 데이터를 셀로 분할하여 비동기식 시분할 다중화 방식으로 전송함.
    - 셀은 53Byte의 작은 크기이며, 고정 길이이다.
    - 고속, 광대역, 멀티미디어 통신을 모두 수용할 수 있는 기술.
    - 속도가 빠르고, 효율이 높음.
    - 다양한 서비스를 실시간으로 지원함

12. 다음은 오류가 발생한느 JAVA 프로그램이다. 프로그램을 분석하여 오류가 발생하는 라인은
    ```java
    class Person{
        private String name;
        public Person(String val){
            name = val;
        }
        public static String get(){
            return name;
        }
        public void print(){
            System.out.println(name);
        }
    }
    public class exam_23_3_12 {
        public static void main(String[] args) {
            Person obj = new Person("Kim");
            obj.print();        
        }
    }
    ==> 7번째 줄
    ```
13. 접근 권한
    - MAC(Mandatory Access control)
        - 주체와 객체의 등급을 비교하여 접근 권한을 부여하는 방식이다.
        - 시스템이 접근통제 권한을 지정한다.
        - 데이터베이스 객체별로 보안 등급을 부여할 수 있다.
        - 사용자별로 인가 등급을 부여할 수 있다.
    - RBAC(Role Based Access Control)
        - 사용자의 역할에 따라 접근 권한을 부여하는 방식이다.
        - 중앙관리자가 접근통제 권한을 지정한다.
        - 임의 접근통제와 강제접근 통제의 단점을 보완하였다.
        - 다중 프로그래밍 환경에 최적화된 방식이다.
    - DAC(Discretionary Access Control)  
        - 데이터에 접근하는 사용자의 신원에 따라 접근 권한을 부여하는 방식이다.
        - 데이터 소유자가 접근 통제 권한을 지정하고 제어한다.
        - 객체를 생성한 사용자가 생성된 객체에 대한 모든 권한을 부여받고, 부여된 권한을 다른 사용자에게 허가 할 수도 있다.




18. 프로토콜 설명
    ```
    - 거리 벡터 라우팅 프로토콜이라고도 불리며, 최단 경로 탐색에 Bellman-Ford 알고리즘이 사용된다.
    - 소규모 동종의 네트워크 내에서는 효율적이나, 최대 홉 수가 제한되므로 대규모 네트워크에서는 사용할 수 없다.
    - 일정 시간 동안 라우팅 정보가 갱신되지 않으면 해당 경로를 이상 상태로 간주한다.
    ==> RIP, 경로 선택 정보 프로토콜, Routing Information Protocol
    ```

