1. 용어 문제 - 관계해석
    - 관계 데이터 모델의 제안자인 코드(E.F.Codd)가 수학의 Predicate Calculus(술어 해석)에 기반을 두고 관계 데이터베이스를 위해 제안하였다.
    - ( 관계해석 ) 은 관계 데이터의 연산을 표현하는 방법으로, 원하는 정보를 정의 할 때 계산 수식을 사용.
    - ( 관계해석 ) 은 원하는 정보가 무엇이라는 것만 정의하는 비절차적 특성을 지니며, 원하는 정보를 정의할 때 계산 수식을 사용한다.
    - 튜플 해석식을 사용하는 튜플 (관계해석)과 도메인 해석식을 사용하는 도메인 ( 관계 해석 )으로 구분 된다.
    * 관계대수 : 원하는 정보와 그 정보를 검색하기 위해서 어떻게 유도하는가를 기술하는 절차적인 언어로 릴레이션을 처리하기 위해 연산자와 연산규칙을 제공하며, 피연산자와 연산 결과가 모두 릴레이션이고 질의에 대한 해를 구하기 위해 수행해야 할 연산의 순서를 명시함. 

2. 다음 암호화 알고리즘 용어를 쓰시오.
    1. (  ) 은 1990년 스위스에서 만들어진 PES를 개량하여 만들어진 블록 암호 알고리즘으로 키 길이가 128bit , 블록길이가 64bit이다. Feistel방식과 SPN의 중간 형태 구조이다. - IDEA
    2. (  ) 은 미 국가 안보국(NSA)에서 개발한  알고리즘으로, 64비트의 입출력, 80비트의 키, 32라운드를 가진다. 주로 전화기와 같은 음성을 암호화하는데 사용된다고 한다. - skipjack
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1e16264a-9d90-4c7d-8d17-71ca0c48ec9a/Untitled.png)
        
    - 블록암호 알고리즘
        - AES
            - 128bit 평문을 128/192/356bit 로 암호화
            - 키 크기에 따라 10/12/14회 Round 수행
            - 1997년 NIST에 의해 제정
            - 레인달(RIJNdael)에 기반한 암호화 방식
            - SPN 암호 방식을 사용한다.
        - SEED
            - 순수 국낸기술로 개발한 128비트 및 256비트 대칭키 블록 암호 알고리즘
        - ARIA
            - 국가 보안 기술 연구소(NSRI)필두로 학계, 국가 정보원 등의 암호 기술 전문가들이 개발한 국가 암호화 알고리즘
            - AES 알고리즘과 똑같이 128/192/256비트 암호화키를 지원한다.
            - SPN 암호 방식을 사용한다.
        - IDEA
            - 1990년 스위스에서 마들어진 PES를 개량하여 만들어진 블록 암호 알고리즘
            - 키길이가 128bit, 블록길이가 64bit
            - Feistel  방식과 SPN의 중간형태 구조
    - 스트림암호 알고리즘
        - LFSR
        - RC4
        - A5

3. 다음은 <제품>(제품명, 단가, 제조사) 테이블을 대사으로 "H"제조사에서 생산한 제품들의 '단가'를 가진 제품의 정보를 조회하는 <SQL문> 이다.
    ```sql
    select 제품명, 단가, 제조사
    from 제품
    where 단가 > all (selct 단가 from 제품 where 제조사 = 'H');
    ```

4.


5. 다음 용어를 영문약어로 적으시오. —> VPN
    - 인터넷 등 통신 사업자의 공중 네트워크에 암호화 기술을 이용하여 사용자가 마치 자신의 전용 회선을 사용하는 것처럼 해주는 보안솔루션
    
    - 보안 솔루션
        - 방화벽(Firewall)
            - 네트워크 간에 전송되는 정보를 선별하는 기능을 가진 침입 차단 시스템
        - 웹방화벽(Web Firewall)
            - 웹기반 공격을 방어할 목적으로 만들어진 웹서버 특화 방화벽
        - 침입탐지 시스템(IDS; Intrusion Detection System)
            - 컴퓨터 시스템의 비정상적인 사용, 오용 등을 실시간으로 탐지
            - 이상 탐지, 오용탐지
        - 침입방지 시스템(IPS Intrusion Prevention System)
            - 방화벽과 침입탐지 시스템을 결합한 것.
    - 데이터유출방지(DLp;Data Leakage/Loss Prevention)
        - 내부 정보의 유출을 방지하기 위한 보안솔루션
    - NAC(Network Access Control)
        - 네트워크에 접속하는 내부PC의 MAC주소(고유랜카드주소)를 IP관리 시스템에 등록한 후 일관된 보안관리 기능을 제공하는 보안솔루션
    - ESM(Enterprise Security Management)
        - 다양한 장비에서 발생하는 로그 및 보안 이벤트를 통합관리 하는 보안 솔루션
6. 객체지향 설계 원칙 중 아래에 설명하는 용어를 보기에서 찾아 쓰시오.
    
    자신이 사용하지 않는 인터페이스는 구현하지 말아야하고, 자신이 사용하지 않는 인터페이스 때문에 영향을 받아서는 안된다. 그러므로 인터페이스를 작게 나누어 만들어야한다.
    
    —> 인터페이스 분리 원칙(ISP, Interface Segregation Principle)
    
    - 객체지향 설계원칙 (SOLID)
        - 단일 책임 원칙(SRP, Single responsibility principle)
        - 개방 폐쇄원칙(OCP, Open-closed principle)
            - 확장에는 열려 있고, 수정에는 닫혀 있어야 한다.
        - 리스코프 치환 원칙(LSP, Liskov substitution principle)
            - 자식 클래스는 언제나 자신의 부모 클래스를 대체할 수 있어야 한다.
        - 인터페이스 분리 원칙(ISP, Interface Segregaion Principle)
            - 자신이 사용하지 않는 인터페이스는 구현하지 말아야 한다.
        - 의존성 역전 원칙(DIP, Dependency Inversion Principle)
            - 의존 관계를 맺을 때 자주 변화하는 것보다, 변화가 거의 없는 것에 의존해야 한다.
    - UI 설계 원칙
        - 직관성 - 화면의 버튼, 항목, 입력란 등 누구나 쉽게 이해하고 사요할 수 있도록 한다.
        - 유효성 - 사용자의 목적을 정확히 달성할 수 있도록 유용하고 효과적이어야 한다.
        - 학습성 - 사용자가 쉽게 배우고 익힐 수 있어야 한다.
        - 유연성 - 사용자의 요구를 최대한 수용하면서 오류를 최소화 해야한다.


8. c언어 결과
    ```c
    #include <stdio.h>
    struct A{
        int n;
        int g;
    };
    main(){
        struct A st[2];
        for(int i=0; i<2;i++){
            st[i].n = i;
            st[i].g = i+1;
        }
        printf("%d", st[0].n + st[1].g);
    }
    ==> 2
    ```
9. IP 주소가 192.168.100.132이고, 서브넷 마스크가 255.255.255.192인 경우 (1)~2에 해당하는 값을 쓰시오.
    - 네트워크 주소 192.168.100.  (1) 128
    - 사용 가능한 주소 개수 (2) 62
10. 아래 설명하는 테스트 종류를 쓰시오.
    - 알파테스트는 개발자의 통제 하에 사용자가 개발 환경에서 수행하는 테스트 이다. 내부에서 진행하는 자체 검사로 실제 사용 환경에서 동작시키며 관련자만 참여한다.
    - 베타 테스트는 개발된 소프트웨어를 사용자가 실제 운영환경에서 수행하는 테스트이다.
11. 회기 테스트 - Regression
    - 통합 테스트로 인해 변경된 모듈이나 컴퓨턴트에 새로운 오류가 있는지 확인하는 테스트이다.
    - 이미 테스트 된 프로그램의 테스팅을 반복하는 것이다.
    - 수정한 모듈이나 컴포넌트가 다른 부분에 영향을 미치는지, 오류가 생기지 았았는지 테스트하여 새로운 오류가 발생하지 않음을 보증하기 위해 반복 테스트한다.
12. 관계 대수식

13. Python 결과
    ```Python
    a = "REMEMBER NOVEMBER"
    b = a[0:3] + a[12:16]
    c = "R AND %s" % "STR"
    print(b+c)
    REMEMBER AND STR
    ```

14. 용어를 적으시오.
- 경로 제어 프로토콜은 크게 자율 시스템 내부의 라우팅에 사용되는 IGP와 자율 시스템 간의 라우팅에 사용되는 EGP로 구분할 수 있다.
IGP 는 소규모 동종 자율 시스템에서 효율적인 RIP와 대규모 자유 시스템에서 많이 사용되는 OSPF 로 나뉘어 진다.
OSPF 는 링크 상태(Link state) 를 실시간으로 반영하여 최단 경로로 라우팅을 지원하는 특징이 있다.
BGP는 EGP 의 단점을 보완하여 만들어진 라우팅 프로토콜로, 처음 연결될 때는 전체 라우팅 테이블을 교환하고, 이후에는 변화된 정보만을 교환한다.

- 네트워크 집합을 몇 개의 그룹으로 나우었을 때 동일 그룹 내에서 라우팅 정보를 교환할 때 사용하는 라우팅 프로토콜을 ( IGP )라고 하고, 다른 그룹과 라우팅 정보를 교환하는 프로토콜을 ( EGP  ) 라고 한다. ( IGP )의 대표적인 프로토콜은 RIP와 ( OSPF ) 가 있고, ( EGP  ) 의 대표적인 프로토콜은 ( BGP ) 이다.

🤩 라우팅 프로토콜
    IGP(내부 라우팅 프로토콜)
        RIP
            - 거리 벡터 라우팅 프로토콜(최대 15홉까지)
            - 소규모 동종의 네트워크(자율 시스템, AS) 내에서 효율적인 방법
            - 최단 경로 탐색 시 Bellman-Ford 알고리즘 사용
            - 라우팅 정보를 30초마다 네트워크 내의 모든 라우터에 알리며, 180초 이내에 새로운 라우팅 정보가 수신되지 않으면 해당 경로를 이상 상태로 간주함
        OSPF
            - RIP의 단점 해결하여 새로운 기능을 지원하는 인터넷 프로토몰
            - 대규모 네트워크에서 많이 사용 됨
            - 라우팅 정보에 변화가 생길 경우 변화 된 정보만 네트워크 내의 모든 라우터에 알림
            - 최단 경로 다익스트라(Dijkstra) 알고리즘 사용
    EGP(외부 라우팅 프로토콜) - 단점 보완 => BGP

15. c 언어 결과
    ```c
    #include < stdio.h>
    int len(char* p);
    int main(){
        char* p1 = "2022";
        char* p2 = "202207";
        int a = len(p1);
        int b = len(p2);
        printf("%d", a+b);
    }
    int len(char* p){
        int r= 0;
        while (*p != '\0'){
            p++;
            r++;
        }
        return r;
    }
    ==> 10
    ```
16. c언어 결과
    ```c
    #include<stdio.h>
    int main(){
        int a[4] = {0, 2, 4, 8};
        int b[3];
        int* p;
        int sum = 0;
        for (int i = 1; i<4 ; i++){
            p = a+i;
            b[i-1] = *p -a[i-1];
            sum = sum + b[i-1] + a[i];

        }
        printf("%d", sum);
    }
    ==> 20
    ```
17. java 결과
    ```java
    class Test{
        public static void main(String args[]){
            cond obj = new cond(3);
            obj.a = 5;
            int b = obj.func();
            System.out.print(obj.a + b);
        }
    }
    class cond{
        int a;
        public cond(int a){
            this.a = a;
        }
        public int func(){
            int b = 1;
            for(int i = 1;i<a; i++)
                b += a* i;
            return a+b;
        }
    }
    ==> 61
    ```

18. 함수적 종속
    - Full Functional Dependency
    - Partial Functional Dependency
    - Transitive Functional Dependency

19. 인터넷이란 TCP/IP 프로토콜을 기반으로 하여 전 세계 수많은 컴퓨터와 네트워크들이 연결된 광범위한 컴퓨터 통신망이다.
    - (HTTP) : 월드ㅡ 와이드 웹(WWW) 에서 HTML 문서를 송수신 하기 위한 표준 프로토콜로, GET 과 POST 메소드를 통해 메시지를 주고 받는다.
    - (HYPER TEXT) : 다른 문서나 그림으로 이동할 수 있는 연결을 가지고 있는 텍스트를 의미한다.
    - (HTML) : 인터넷의 표준 문서인 하이퍼텍스트 문서를 만들기 위해 사용하느 언어이다.
20. 팬 인 / 팬 아웃

1. 아래 설명하는 테스트 종류를 쓰시오.
    - 알파테스트는   개발자의 통제 하에 사용자가 개발 환경에서 수행하는 테스트 이다. 내부에서 진행하는 자체 검사로 실제 사용 환경에서 동작시키며 관련자만 참여한다.
    - 베타 테스트는 개발된 소프트웨어를 사용자가 실제 운영환경에서 수행하는 테스트이다.
2. 변경 또는 수정된 코드에 대하여 새로운 결함 발견 여부를 평가하는 테스트는 무엇인지 보기에서 찾아 쓰시오. —> Regression (회기 테스트)
3. Fan in, Fan out 숙지
- 응집도
    - 기능 - 모듈 내부의 모든 기능이 단일한 목적을 위해 수행
    - 순차 - 모듈 내에서 한 활동으로부터 나온 출력값을 다른 활동이 사용
    - 통신 - 동일한 입력과 출력을 사용하여 다른 기능를 수행
    - 절차 - 모듈 안의 구성 요소들이 기능을 순차적으로 수행하는 경우
    - 시간 - 특정 시간에 처리되어야 하는 활동을 한 모듈에서 처리
    - 논리 - 유사한 성격을 갖거나 특정 형태로 분류되는 처리요소들이 한 모듈에서 처리
    - 우연 - 모듈 내부의 각 구성 요소들이 연관이 없는 경우
- 결합도
    - 자료 - 모듈간의 자료(값)를 통해서만 모듈 상호 작용 발생
    - 스탬프 - 모듈간의 배열이나 오브젝트 스트럭처 등이 전달되는 경우
    - 제어 - 값만 전달되는게 아니라, 제어 요소가 전달 되는 경우
    - 외부 - 모듈에서 외부로 선언한 변수를 다른 모듈에서 참조
    - 공통 - 전역변수를 참조
    - 내용 - 다른 모듈 내부에 있는 변수나 기능을 또 다른 모듈에서 사용
1. 아래에서 해당하는 용어를 보기에서 찾아 쓰시오.
    - HTTP는 W3상에서 정보를 주고받을 수 있는 프로토콜이다. GET, POST 방식을 이용하여 문서를 주고 받는데, 이 문서내에서 다른 문서를 링크정보가 드러가는데, 이런 링크 정보를 만들 수 있는게 Hypertext 이다. 이런 Hypertext를 만들 수 있는 마크업언어가 HTML 이다.


4. 다음 직원 릴레이션에서, 다음 관계대수식을 실행한 결과를 쓰시오.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f9bce0b1-f5aa-43e5-a06a-07c26c551161/Untitled.png)

| TTL |
| --- |
| 부장 |
| 대리 |
| 차장 |
| 과장 |

1. 상품 테이블에서 B 제조사 전체 제품의 단가보다 더 큰 단가를 가진 제품을 모두 출력하는 SQL 문을 완성하시오.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/070a86e9-4f50-4b90-9ee4-aa36b3c031cc/Untitled.png)

```sql
select * from 상품
where 단가> ( all )
( select 단가 from 상품 
where 제조사 = 'B' )
```

1. 다음 릴레이션의 데이터는 다음과 같이 저장되어 있다. SQL 을 수행했을 때 결과를 쓰시오.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/85117bef-eb59-4bf1-bd46-92f0506f0165/Untitled.png)

```sql
select count(col2)
from table
where col1 in (2,3) or col2 in(3,5)
```

1. 다음은 한수적 종속에 해당하는 설명이다. 해당 하는 용어를 보기에서 찾아 쓰시오.
- 함수적 종속관계에서 종속자가 기본키에만 종속되며, 기본키가 여러 속성으로 구성되어 있을 경우 기본키를 구성하는 모든 속성이 포함된 기본키의 부분집합에 종속된 경우 이름 ( full(완전한종속) ) 이라 한다.
- 기본키가 여러 속성으로 구성되어 있을 경우 기본키를 구성하는 속성 중 일부만 종속되는 경우 이를 ( Partial(부분종속)  ) 라고 한다.
- X→ Y → Z 이란 종속 관계가 있을 경우, X→ Z가 성립 되는 경우를 ( Transitive(이행적 종속) ) 라 한다.
1. 다음 C언어 프로그램의 출력 결과를 쓰시오.
    
    ```c
    #include<stdio.h>
    struct  st
    {
        int x, y;
    };
    int main()
    {
        struct st dt[2];
        for(int i=0 ; i<2 ; i++){
            dt[i].x = i;
            dt[i].y = i+1;
        }
        printf("%d",dt[0].x + dt[1].y);
    }
    ```
    
2. 다음 C언어 프로그램의 출력 결과를 쓰시오.
    
    ```c
    #include<stdio.h>
    int main(){
        char*p1 = "2022";
        char*p2 = "202210";
        int i = func(p1);
        int j = func(p2);
        printf("%d",i+j);
        return 0;
    }
    int func(char*p){
        int cnt = 0;
        while (*p!='\0')
        {
            cnt++;
            p++;
        }
        return cnt;
    }
    ```
    
3. 다음 C언어 프로그램의 출력 결과를 쓰시오. —> 22
    
    ```c
    #include <stdio.h>
    int main()
    {
        int a[4] = {0, 2, 4, 8};
        int b[3];
        int *p;
        int sum = 0;
        for (int i = 1; i < 4; i++)
        {
            p = a + i;
            b[i - 1] = *p - a[i - 1];
            sum += b[i - 1] + a[i];
        }
        printf("%d", sum);
    }
    ```
    
4. 다음 JAVA 프로그램의 출력결과를 쓰시오. —> 12
    
    ```java
    public class exam_22_2_18 {
        public static void main(String[] args) {
            int i = 3;
            int sum = 0;
            switch (i) {
                case 0:
                    sum++;
                case 1:
                    sum += 3;
                case 2:
                    sum -= 10;
                case 3:
                    sum = 0;
                case 4:
                    sum += 3;
                case 5:
                    sum += 10;
                default:
                    sum--;
            }
            System.out.println(sum);
        }
    }
    ```
    
5. 다음 JAVA 프로그램의 출력결과를 쓰시오. —> 61
    
    ```java
    public class exam_22_2_19 {
        public static void main(String[] args) {
            Cal obj = new Cal(3);
            obj.a = 5;
            int b = obj.func();
            System.out.println(obj.a+b);
        }
    }
    class Cal{
        int a;
        Cal(int a){
            this.a=a;
        }
        int func(){
            int b = 1;
            for(int i=1 ; i<a; i++)
                b=a*i+b;
            return a+b;
        } // 6 16 31 51 +5
    }
    ```
    
6. 다음 파이썬 결과 —> REMEMBER AND STR
    
    ```python
    str1="REMEMBER NOVEMBER"
    str2=str1[:3]+str1[12:16]
    str3="R AND %s"% "STR"
    print(str2+str3)
    ```

10. ip주소가 192.168.100.132 이고, 서브넷 마스크가 255.255.255.192인 경우 1~2에 해당하는 값을 쓰시오.
    - 네트워크 주소 192.168.100.128
    - 사용 가능한 주소 개수 : 62