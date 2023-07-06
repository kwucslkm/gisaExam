1. 다음 설명에 맞는 RAID 단계는
    - 두 개이상의 하드 디스크를 병렬로 연결해, 하나의 하드디스크로 이용하는 기술이다.
    - 스트라이프(Stripe) 방식으로 구현한다.
    - 데이터가 분산되어 저장되기 때문에 하나의 하드디스크에 문제가 생기면 다른 디스크까지 사용이 불가능 해진다.
    
    —> RAID 0
    
    - RAID 1 - 두 개 이상의 디스크를 미러링을 통해 하나의 디스크 처럼 사용
    - RAID 2 - 오류 정정을 위한 해밍 코드를 사용하는 방식
    - RAID 3 - 하나의 디스크를 패리티(Parity) 정보를 위해 사용하고 나머지 디스크에 데이터를 균등하게 분산 저장
    - RAID 4 - RAID 3과 같은 방식이나, 블록 단위로 분산 저장한다.
    - RAID 5 - 3개 이상의 디스크를 붙여서 하나의 디스크처럼 사용하고 각각의 디스크에 패리티 정보를 가지고 있는 방식
    - RAID 6 - 하나의 패리티를 두개의 디스크에 분산 저장하는 방식
2. 로그 기반 회복 기법에서 사용되는 명령어이다. 해당하는 항목을 보기에서 찾아 쓰시오.
    
    
    | 1. 트랜잭션 로그를 이용하여 오류가 발생한 트랜잭션을 재 실행하여 복구를 수행한다.
    
        ◦ REDO
    2. 트랜잭션 로그를 이용하여 오류와 관련된 내용을 취소하여 복구를 수행한다.
    
        ◦ UNDO |
    | --- |
    - 트랜잭션의 특성
        - 원자성(Atomicity)
        - 일관성(Consistency)
        - 독립성, 격리성(Isolation)
        - 영속성(Durablility)
3. 데이터베이스의 이상현상 중, **삭제 이상**에 대해 간략히 서술하시오.
    
    —> 한 튜플을 삭제할 때 연쇄 삭제 현상으로 인해 정보 손실
    
    —> 삽입 이상이란 릴레이션에서 데이터를 삽입할 때 의도와는 상관없이 원하지 않는 값들로 함께 삽입되는 현상이다.
    
    —> 삭제 이상이란 릴레이션에서 한 튜플을 삭제할 때 의도와는 상관없는 값들로 함께 삭제되는 연쇄 삭제 현상이다.
    
    —> 갱신 이상이란 릴레이션에서 튜플에 있는 속성값을 갱신할 때 일부 튜플의 정보만 갱신되어 정보에 모순이 생기는 현상이다.
    
    —> 정규화로 이상 현상을 해결한다. 
    
    —> 비정규Relation → **도메인이 원자값**
    
     ****→제1정규형→ **부분 함수적 종속 제거**
    
     ****→제2정규형→ **이행적 함수 종속 제거**
    
     **→**제3정규형**→ 결정자이면서 후보키가 아닌 것 제거**
    
     **→**BCNF**→ 다치 종속 제거**
    
     **→**제4정규형**→ 조인 종속성 이용**
    
     **→**제5정규형
    
4. 아래 임시 키 무결성 프로토콜의 영문 약어를 쓰시오.
    
    
    | 임시 키 무결성 프로토콜은 IEEE 802.11의 무선 네트워킹 표준으로 사용되는 보안 프로토콜이다.
    임시 키 무결성 프로토콜을 IEEEE802.11i의 작업 그룹과 와이파이 얼라이언스에서 WEP를 하드웨어의 교체 없이 대체하기 위해 고안되었다. |
    | --- |
    
    —> TKIP(Temporal Key Integrity Protocol)
    
5. 아래 설명하는 내용을 영문 약자로 쓰시오.
    
    
    | 특별한 하드웨어 없이 인간의 자연스러운 움직임을 인식하여 정보를 제공한다. |
    | --- |
    
    —> NUI
    
    - UI 설계 원칙
        - 직관성 - 화면의 버튼, 항목,입력란 등 누구나 쉽게 이해하고 사용할 수 있도록 한다.
        - 유효성 - 사용자의 목적을 정확히 달성할 수 있도록 유용하고 효과적이어야 한다.
        - 학습성 - 사용자가 쉽게 배우고 익힐 수 있어야 한다.
        - 유연성 - 사용자의 요구를 최대한 수용하면서 오류를 최소화해야 한다.
6. 다음 소스코드 분석 도구에 대한 설명으로 알맞은 답을 보기에서 찾아 작성하시오.
    1. 소스코드의 실행 없이, 코드의 의미를 분석하여 결함을 찾아내는 코드 분석 기법
        
        —> static
        
    2. 소스코드를 실행하여 프로그램의 동작이나 결과를 확인하고, 메모리 누수, 스레드 결함등을 분석하는 기법 — > dynamic
    
    - 애플리케이션 테스트 유형 분류
        - 프로그램 실행 여부
            - 정적 테스트
            - 동적 테스트
        - 테스트 기법
            - 화이트박스 테스트
            - 블랙박스 테스트
        - 테스트에 대한 시각
            - 검증 테스트
            - 확인 테스트
        - 테스트 목적
            - 회복, 안전, 강도, 성능, 구조, 회귀, 병행
        - 테스트 기반
            - 명세 기반 테스트
            - 구조 기반 테스트
            - 경험 기반 테스트
7. 아래에 설명하는 테스트 도구를 쓰시오.
    - 자바 프로그래밍 언어용 유닛 테스트 프레임워크
    - 테스트 결과는 Test클래스로 개발자에게 테스트 방법 및 클래스의 History를 공유 가능
    - 어노테이션으로 간결하게 지원
8. 블랙박스 테스트 기법 3가지 골라 작성하시오.
    1. **Equivalence Partitioning** 
    2. **Boundary Value Analysis**
    3. Base Path Test
    4. Loop Test
    5. Decision Coverage
    6. **Cause effect Graph** 
9. 다음 설명에 대한 답을 영어 약자로 쓰시오.
    - 기업이 주요 정보자산을 보호하기 위해 수립, 관리, 운영하sms 정보 보호 관리체계가 인증 기준에 적합한지를 심사하여 인증을 부여하는 제도 —> ISMS
10. 데이터베이스 키
    1. 슈퍼키는 ( 유일성 ) 의 속성을 갖는다.
    2. 후보키는 ( 유일성 )과 ( 최소성 )의 속성을 갖는다.
11. 다음 공격 유형은?
    - 이 공격은 APT공격에서 주로 쓰이는 공격이며, 타겟이 자주 들어가는 홈페이지를 파악했다가, 그 홈페이지의 취약점을 통해 악성코드를 심어 사용자가 모르게 해당 악성 코드를 다운로드 받게 하고, 다운로드 된 악성코드를 통해 공격을 하는 방식을 취한다. —> Watering Hole
12. 다음 V모델에서의 테스트 단계에 대한 설명으로 괄호 안에 들어갈 내용을 쓰시오.
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/90ee1793-ae9a-4913-baf9-a1995509ace5/Untitled.png)
    
    —> 1. 단위 테스트 —> 2. 통합 테스트 —> 3.시스템 테스트 —>4.인수 테스트
    
13. 다음 SQL 결과에 알맞는 쿼리를 작성하시오.
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/83fb399d-24af-4d56-9f7a-7df4937bed83/Untitled.png)
    
    select name, score from 성적 order by score desc
    
14. 다음 설명과 관련된 파이썬 함수를 골라 작성하시오.
    1. 요소를 확장해주는 역할을 하며, 모든 항목을 하나의 요소로 추가
        
        —> extend
        
    2. 리스트 내부 요소를 꺼내주는 함수, 해당 함수를 호출하면 리스트에서 해당 값을 삭제하면서 리턴시켜준다. —> pop
    3. 리스트 내부의 요소의 순서를 뒤집어주는 역할을 한다. —> reverse
15. 다음 파이썬 코드에서 출력되는 결과를 작성하시오.
    
    ```python
    def func1(num1, num2=2):
        print('a=',num1,'b',num2)
    func1(20)
    ```
    
16. 다음 자바 코드 중 밑줄에 들어갈 알맞은 코드를 작성하시오.
    
    ```python
    public class exam_22_1_16 {
        public static void main(String[] args) {
            Thread t1 = new Thread(new Car());
            t1.start();
        }
        
    }
    class Car implements Runnable{
        int a;
        public void fun(){
            System.out.println("func call");
        }
    
    }
    ```
    
17. 다음 JAVA 프로그램의 결과를 쓰시오.
    
    ```java
    class A {
        int a;
        int b;
    }
    public class exam_22_1_17 {
        public static void main(String[] args) {
            A a = new A();
            a.a = 100;
            func1(a);
            a.b = a.a;
            func2(a);
            System.out.println(a.a);
        }
        static void func1(A a) {
            a.a *= 10;
        }
        static void func2(A a) {
            a.a += a.b;
        }
    }#include<stdio.h>
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
    --> 2000
    ```
    
18. C언어 프로그램의 출력결과를 쓰시오.
    
    (단, 입력값은 5가 들어왔다고 가정한다.) —> 2000
    
    ```python
    #include<stdio.h>
    int func(int i){
        if(i<=1) return1;
        returni*func(i-1);
    }
    int main(){
        int in;
        scanf("%d",&in);
        printf("%d",func(in));
    }
    ```
    
19. C언어 괄호에 들어갈 답을 쓰시오.  —> 4321
    
    ```c
    #include<stdio.h>
    int main(){
        int num = 1234;
        int div = 10;
        int res = 0;
        while(num > 0){
            res = res * div;
            res = res + num % div;
            num = num / div;
        }
        printf("%d", res);
    }
    ```
    
20. C언어 프로그램의 결과를 쓰시오. —> 29
    
    ```c
    int isPrime(int number)
    {
        int i;
        for (i = 2; i < number; i++)
        {
            if (number % i == 0)
                return 0;
        }
        return 1;
    }
    int main(void)
    {
        int number = 13195, max_div = 0, i;
        for (i = 2; i < number; i++)
            if (isPrime(i) == 1 && number % i == 0)
                max_div = i;
        printf("%d", max_div);
        return 0;
    }
    ```