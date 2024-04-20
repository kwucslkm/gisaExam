1. 네트워크의 구성 및 유지를 위해 기지국이나 액세스 포인트와 같은 기반 네트워크 장치를 필요로 하지 않고, 멀티 홉 라우팅 기능에 의해 무선 인터페이스가 가지는 통신 거리상의 제약을 극복하며, 노드들의 이동이 자유롭기 때문에 네트워크 토폴로지가 동적으로 변화되는 늑징이 잇다. 응용 분야로는 긴급 구조, 긴급 회의, 전쟁터에서의 군사 네트워크 등이 있다.  —> AD-hoc network
2. 다음 용어
    1. ( UI ) : 사용자가 제품/서비스와 상호작용할 수 있도록 만들어진 매개체
    2. ( UX ) : 사용자 경험의 약자로, 사용자가 어떠한 서비스/제품을 직간접적으로 이용하면서 느끼는 종합적인 만족

3. 원자성 : Atomicity 트랜잭션의 연산은 데이터베이스에 모두 반영되도록 완료 되든지 아니면 전혀 반영되지 않도록 복구 되어야 한다는 특성
    일관성 : 트랜잭션이 그 실행을 성공적으로 완료하면 언제나 일관서이 있는 데이터베이스 상태로 변환 함
    독립성, 격리성, 순차성 : 둘 이상의 트랜잭셩니 동시에 병행 실행되는 경우 어느 하나의 트랜잭션 실행중에 다른 트랜잭션의 연산이 까어들 수 없음
    영속성, 지속성 : 성공적으로 완료된 트랜잭션의 결과는 시스템이 고장나더라도 영구적으로 반영되어야 함
4. 테이블을 만들 때에는 이상(Anomaly) 을 방지하기 위ㅣ해 데이터들의 중복성 및 종속성을 배제하는 정규화를 수행한다. 부분 함수적 종속을 제거하여 제2 정규형을 만든다.
 도 부 이 결 다 조

5. <학부생> 테이블에서 '입학생수'가 300이상인 튜플의 '학과번호'를 999로 갱신하는 SQL
    ==> update 학부생 set 학과번호 = 999 where 입학생수 >= 300;

11. 모듈 응집도
    - 절차적 응집도 : 내부의 요소들이 기능적으로 연관성은 없으나, 순차적으로 실행 될 때의 응집도
    - 교환적 응집도 : 서로 다른 기능을 수행하지만 동일한 입력과 출력을 사용할 때의 응집도
    - 기능적 응집도 : 하나의 기능에 밀접하게 관련되어 있거나 연관되어 있을 때의 응집도

12. 네트워크에 관련된 설명
    - 가상회선 : 연결형 통신에서 주로 사용되는 방식으로, 출발지와 목적지의 전송 경로를 미리 연결하여 논리적으로 고정한 후 통신하는 방식
    - 데이터그램 : 비연결형 통신에서 주로 사용되는 방식으로, 사전에 접속 절차를 수행하지 않고 헤더에 출발지에서 목적지까지의 경로 지정을 위한 충분한 정보를 붙여서 개별적으로 전달하는 방식

13. 디자인 패턴은 모듈 간의 관계 및 인터페이스를 설계할 때 참조할 수 있는 전형적인 
    해결 방식 또는 예제를 의마한다. 그 중 행위 패턴은 클래스나 객체들이 서로 항호작용하는 방법이나 책임 분배 방법을 정의하는 패턴으로, Interpreter, Observer,
    command 등이 그 예에 해당한다.

14. 데이터베이스의 병행제어 기법 중 하나로 , 접근한 데이터에 대한 연산을 모두 마칠 때까지 추가적인 접근을 제한함으로써 상호 배타적으로 접근하여 작업을 수행하도록 하는 기법 ==> 로킹

15. 소프트웨어 구성 요소를 그래픽 표기법을 이용하여 모델링하는 객체지향 분석(Object-oriented Analysis) 기법
    - 객체 모델링(Object Modeling): 객체 다이어그램, 정보 모델링이라고도 하며 시스템에서 요구하는 객체를 찾고 객체들 간의 관계를 정의, 가장 중요하며 선행되어야 함(Information)
    - 동적 모델링(Dynamic Modeling): 상태 다이어그램, 시간의 흐름에 따라 객체들 사이의 제어 흐름, 동작 순서 등의 동적인 행위를 표현
    - 기능 모델링(Functional Modeling): 자료 흐름도(DFD), 프로세스들의 자료 흐름을 중심으로 처리 과정 표현
16. c 언어 결과
    ```c
    #include <stdio.h>
    main(){
        int res = mp(2, 10);
        printf("%d", res);

    }
    int mp(int base, int exp){
        int res = 1;
        for(int i=0; i<exp; i++)
            res *= base;
        return res;
    }
    ```
17. java 언어 결화
    ```java
    public class exam_21_2_17 {
        public static void main(String[] args) {
            String result = exam_21_2_17.check(1);
            System.out.print(result);
        }
        static String check(int num){
            return num >=0 ? "positive" : "negative";
        }
    }
    ```
18. c언어 결과
    ```c
    #include <stdio.h>
    int main(){
        int ary[3];
        int s=0;
        *(ary+0) = 1;
        ary[1] = *(ary+0)+2;
        ary[2] = *ary + 3;
        for(int i = 0; i<3 ; i++)
            s= s+ary[i];
        printf("%d", s);
    }
    ```
19. JAVA 실행 결과 
    
    ```java
    public class exam_21_2_9_java {
        public static void main(String[] args) {
            
            exam_21_2_9_java c1 = new exam_21_2_9_java();
            Class02 c2 = new Class02();
            System.out.println(c1.sum(3,2) + c2.sum(3,2));
        }
        int sum(int x, int y){
            return x+y;
        }
    }
    class Class02 extends exam_21_2_9_java{
        int sum(int x, int y){
            return x-y + super.sum(x,y);
        }
    }
    ```
20. 통합테스트는 단위 테스트가 끝난 모듈을 통합하는 과정에서 발생하는 오류 및 결함을 
    찾는 테스트 기법으로, 하위 모듈에서 상위 모듈 방향으로 통합하는 상향식 통합 테스트와 상위 모듈에서 하위 모듈 방향으로 통합하는 하향식 통합 테스트가 있다. 상향식 통합 테스트는 미완성이거나 문제가 있는 사위 모듈을 대체할 수 있는 테스트 드라이버가, 하향식 통합 테스트는 미완성이거나 문제가 있는 하위 모듈을 대체할 수 있는 테스트 스텁이 있어야 원활한 테스트가 가능하다.
3. 파이썬 결과 쓰시오. —> 26
    
    ```python
    a = 100
    result = 0
    for i in range(1,3):
        result = a>>i
        result = result + 1
    print(result)
    ```
    
4. 디자인 패턴 중 클래스나 서로 상호 작용하는 방법이나 책임 분배 방법을 정의하는 패턴으로, Chain of Responsibility, Command, Iterator, Observer 패턴 등이 있다.
    
    —> 행위패턴
    
5. 트랜잭션의 특성 중 원자성에 대해 설명하시오.
    - 원자성(Atomicity) - 연산의 결과는 모두 Commit 되거나 모두 Rollback 되어야 한다.
    - 일관성
    - 독립성/격리성
    - 영속성
6. 부분 함수적 종속성을 제거하여 완전 함수 종속을 만족하는 정규형이 무엇인지 쓰시오.—> 제2 정규형
    1. 슈퍼키 - 유일성 만족, 최소성 만족 X
    2. 후보키 - 유일성 만족, 최소성 만족
    3. 기본키 - 유일성 만족, 최소성 만족
    4. 대체키 - 유일성 만족, 최소성 만족
7. 대칭키 암호를 쓰시오. —> AES
    - NIST가 주최한 공모전에서 채택된 Rijndael알고리즘을 가리킨다.
    - DES 를 대신하여 새로운 표준이 되었다.
    - 블록 크기는  128bit 이고, 키 길이는 128/192/256bit 이다.
    - SPN 구조이다.
8. 다음 C 프로그램의 실행결과를 쓰시오. —> 8
    
    ```c
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
    ```
    
9. JAVA 실행 결과 
    
    ```java
    public class exam_21_2_9_java {
        public static void main(String[] args) {
            
            exam_21_2_9_java c1 = new exam_21_2_9_java();
            Class02 c2 = new Class02();
            System.out.println(c1.sum(3,2) + c2.sum(3,2));
        }
        int sum(int x, int y){
            return x+y;
        }
    }
    class Class02 extends exam_21_2_9_java{
        int sum(int x, int y){
            return x-y + super.sum(x,y);
        }
    }
    ```
    
10. 다음 테이블에서 이름이 ‘이’씨로 시작하는 사람을 내림차순 정렬로 출력하는 SQL 문을 완성하시오.  —> select 이름 from 학생 where 이름 like ‘이%’ order by desc;
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d966e838-a189-4d06-95d3-2f3f10423d61/Untitled.png)
    
     —> select * from 학생 where 이름 like ‘이%’ order by 이름 desc;
    
11. 하나의 트랜잭션이 데이터를 액세스하는 동안 다른 트랜잭션이 그 데이터 항목을 액세스 할 수 없도록 하는 병행 제어 기법이 무엇인지 쓰시오.
    
    —> 로킹(Locking)
    
12. 다음에 설명하는 알맞은 답안을 쓰시오.
    - ( 절차적 응집도 ) : 모듈이 다수의 관련 기능을 가질 때 모듈 내부의 기능 요소들이 그 기능을 순차적으로 수행 할 경우
    - ( 교환적 응집도 ) : 동일한 입력과 출력을 사용하는 소작업들이 모인 경우
    - ( 기능적 응집도 ) : 모듈 내부의 모든 기능 요소들이 한 문제와 연관 되어 수행되는 경우
13. 학생 테이블에서 점수가 90점 이상인 학생의 과목평가를 ‘A’로 수정하는 SQL 문을 완성하시오.
    
    —> update 학생 set 과목평가 = ‘A’ where 점수 ≥ 90
    
14. 다음 패킷 교환방식에 대한 설명으로  1,2 에 알맞은 용어를 쓰시오.
    1. (가상회선 방식) : 패킷을 전송하기 전에 논리적인 연결을 먼저 수행하여 패킷을 주고 받는다.
    2. (데이터그램 방식) : 각 전송 패킷을 미리 정해진 경로 없이 독립적으로 처리하여 교환하는 방식이다.
15. 학생정보와 학과정보를 조인하여 결과값을 출력하는 select 문을 완성하시오.
    - select * from 학생정보 T1 JOIN 학과정보 T2 ( on ) T1.학과 = T2.( 학과 )
16. 다음에 해당하는 용어를 쓰시오.
    1. 특정 시스템 컴포턴트의 개발이 완료되지 않은 상황에서도 필요한 시험을 진행하기 위해 생성된 더미 컴포넌트이다.
    2. 하향식 통합 테스트에서 사용하는 임시 모듈이다.
    - 정답 스텁(stup)
17. 클래스를 생성하지 않고 사용할 수 있는 메소드를 선언할 때 사용하느 명령어이다. 아래 JAVA 소스코드에 들어갈 명령어가 무엇인지 쓰시오.
    
    ```java
    public class java_exam_21_2_17 {
        public static void main(String[] args) {
            System.out.println(check(1));
        }
        static int check(int num){
            return num;
        }
        
    }
    --> 1
    ```
    
18. 화이트박스 테스트에서 수행하는 구조적 커버리지의 설명으로 알맞은 것을 쓰시오.
    1. ( 구문 / 문장 ) : 시험 대상의 전체 구문 중에 테스트에 의해 실행된 구문을 측정한다.
    2. ( 결정 / 분기 ) : 시험 대상의 전체 분기 중 테스트에 의해 실행된 것을 측정한다.
    3. ( 조건 ) : 모든 조건식의 true, false 중 테스트에 의해 실행된 것을 측정한다.
19. 럼바우 객체지향 분석 기법의 설명이다. 해당 설명의 유형을 쓰시오.
    - ( 기능 모델링 ) : 자료 흐름도(DFD), 프로세스들의 자료 흐름을 중심으로 처리 과정 표현.
    - ( 동적 모델링 ) : 상태 다이어그램, 시간의 흐름에 따라 객체들 사이의 제어 흐름, 동작 순서 등의 동적인 행위를 표현
    - ( 객체 모델링) : 객체 다이어그램, 정보 모델링이라고도 하며 시스템에서 요구하는 객체를 찾고 객체들 간의 관계를 정의, 가장 중요하며 선행되어야 함
20. 다음 C언어 실행결과를 쓰시오. —> 정답: 1024
    
    ```c
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
    ```
    

[기출 21년 1회](https://www.notion.so/21-1-dd1e34a96ee24fe38359bc6f9d6a97ab?pvs=21)

[🤩기출 22년 2회](https://www.notion.so/22-2-dbaa5d4c17974b26bcff5b8814385916?pvs=21)