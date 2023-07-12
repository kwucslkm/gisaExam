1. 정보시스템 운영 중 서버가 다운되거나 자연재해나 시스템 장애 등의 이유로 고객에게 서비스가 불가능한 경우가 종종 발생한다. 이와 같은 상황에서 비상사태 또는 업무 중단 시범부터 업무가 복구되어 다시 정상 가동될때까지의 시간을 의미하는 용어가 무엇인지 쓰시오.
2. 파이썬 출력 결과를 쓰시오.
    
    ```python
    a={'일본','중국','한국'}
    a.add('베트남')
    a.add('중국')
    a.remove('일본')
    a.update(['홍콩','한국','태국'])
    print(a)
    ```
    
3. SOAP - 프로토콜   : 관련 UDDI(도서관..), SMTP11
4. 형상관리 : 식  →  통  →  감  →  기
5. 비동기 방식 처리 기술의 약어를 쓰시오.   →  AJAX
6. UI 설계 원칙 
    1. 직관성 - 누구나 쉽게 이해하고 사용할 수 있어야 한다.
    2. 유효성 - 사용자의 목적을 정확하게 달성하여야 한다.
    3. 학습성 - 누구나 쉽게 배우고 익힐 수 있어야 한다.
    4. 유연성 - 사용자의 요구사항을 최대한 수용하며, 오류를 최소화하여야 한다.
7. 소프트웨어 테스트

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/be6cb8ea-5b56-46bf-bdc3-f7c61bda69e9/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/858aa5bf-e96a-400b-aa63-cfbc61a164ca/Untitled.png)

1. 아래 보기의 <학생> 테이블을 대상으로 <요구사항>을 적용하여 출력하는 SQL문을 작성하시오.  
    
    ```sql
    <요구사항>
    1. 3학년이거나 4학년 학생의 학번과 이름를 검색하시오.
    2. 단, 조건절 작성 시 in 예약어를 사용하여 작성하시오.
     
    --> select 학번, 이름 from 학생 where 학년 in(3, 4);
    
    ```
    
2. 다음 주어진 <student> 테이블의 name 속성을 오름차순하여 idx_name를 인덱스명으로 하는 인덱스를 생성하는 SQL 명령문을 작성하시오.
    
    ```sql
    Create index idx_name on student(name asc)
    ```
    
3. 보안의 취약점 중 하나인 SQL Injection(SQL 인젝션)에 대해 간략히 서술하시오.
    - 웹 프로그램에 SQL 구문을 삽입하여, 서버의 데이터베이스를 공격할 수 있는 공격방식
4. SQL 제어어(DCL) 중 ROLLBACK 명령에 대해 간략히 설명하시오.
    - 데이터베이스의 연산이 비정상적으로 종료되거나 정상수행이 되었다 하더라도 수행되기 이전의 상태로 되돌리기 위한 명령이다.
5. 네트워크 계층(Network Layer, 3계층)인 IP 계층에서 IP 패킷 단위의 데이터 변조 방지 및 암호화 기능을 제공하는 통신규약을 쓰시오.
    - IPSec  → AH , ESP
6. 리눈스 커널을 기반으로 동작하며 자바와 코틀린 언어로 개발된 핸드폰이나 소형기기에 사용되는 오픈소스 플랫폼인 모바일 운영체제는 무엇인지 쓰시오.  —> 안드로이드
7. 리눅스 또는 유닉스에서 a.txt 파일에 대해 다음 조건을 만족하는 권한을 부여하고자 한다. 다음 <조건>을 준수하여 적합한 명령어를 작성하시오. 
    
    
    | <조건>
    • 사용자에게는 읽기, 쓰기, 실행의 세 개의 권한을 모두 부여한다.
    • 그룹에게는 읽기, 실행 두개의 권한을 부여한다.
    • 그룹 외 사용자에게는 실행권한을 부여한다.
    • 한 줄로 명령문이 작성되어야하며, 8진수로 권한을 부여한다. |
    | --- |

—>  chmod 751 a.txt

1. IP 인프라 서비스 관리 실무와 관련된 <실무 사례>에 대한 설명이다. 가장 적합한 용어를 한글 또는 영문으로 쓰시오.  —> RTO(Recovery Time Objective)/ 목표 복구 시간
    
    
    | <실무사례>
    A는 (주)한국아이티 보안 관제실에서 정보시스템의 정보관리를 위해 모니터링을 담당하며 근무하고 있다. 시스템 운영 중 자연재해나 시스템 장애 등의 이유로 대고객 서비스가 불가능한 경우가 종종 발생한다. A는 이런 장애 발생시 서비스를 정상적으로 수행하기 위해 구축 시스템을 관리하는 역할을 한다. 이 용어는 이런 비상 상황이 발생 했을 때, “서비스 중단 시점과 서비스 복원 시점 간에 허용되는 최대 지연 시간”을 가리킨다. |
    | --- |
2. 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고, 자동으로 내용이 갱신되는 방식으로 일대다(one-to-many)의존성을 정의하는 디자인 패턴명을 영문으로 쓰시오. —> 옵저버(Observer pattern)
3. Linked open data
    - 시맨틱 웹
        - 의미론적인 웹, 즉 문서의 의미에 맞게 어플리케이션의 의미에 맞게 구성된 웹
        - 컴퓨터가 사람을 대신하여 정보를 읽고, 이해하고 가공하여 새로운 정보를 만들어 낼 수 있도록 이해하기 쉬운 의미를 가진 차세대 지능형 웹
        - 
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c8ed9687-4a2e-44e8-81cd-d797fe637101/Untitled.png)
        

---

---

- REST
    - 자원을 이름(자원의 표현)으로 구분하여 해당 자원의 상태(정보)를 주고 받는 모든 것
    - HTTP URI를 통해 자원(Resource)을 명시하고, HTTP Method(POST, GET, PUT, DELETE)를 통해 해당 자원에 대한 CRUD Operation을 적용하는 것을 의미한다.
- RESTful
    - REST 라는 아키텍처를 구현하는 웹 서비스
1. 다음은 Python언어로 작성된 프로그램이다. 이를 실행한 출력 결과를 쓰시오.
    1. 
    
    ```sql
    >>> asia = {'한국','중국','일본'}
    >>> asia.add('베트남')
    >>> asia.remove('일본')
    >>> asia.update(['홍콩','한국','태국'])
    >>> print(asia)
    
    정답 : {'한국', '홍콩', '태국', '베트남', '중국'}
    ```
    
2. 다음에 제시된 JAVA 프로그램은 <처리결과>와 같이 결과가 출력된다. JAVA프로그램의 <?> 에 들어갈 JAVA 표현을 대소문자를 구별하여 쓰시오.
    
    ```java
    public class Exam1 {
        public static void main(String[] args) {
            Parent pa = new Child();
            pa.show();
        }
    }
    class Parent{
        void show(){
            System.out.println("Parent");
        }
    }
    class Child extends Parent{
        void show(){
            System.out.println("Child");
        
        }
    }
    ```
    
3. 다음은 JAVA로 작성된 프로그램이다. 이를 실행한 출력 결과를 쓰시오.
    
    ```java
    class A{
        int a;
        public A(int n){
            a=n;
        }
        public void print(){
            System.out.println("a="+a);
        }
    }
    class B extends A{
        public B(int n){
            super(n);
            super.print();
        }
    }
    public class Exam{
        public static void main(String[] args) {
            B obj = new B(10);
        }
    }
    
    ```
    

[기출 21년 2회](https://www.notion.so/21-2-a6752d58126e45e081a60d0b2ce6063c?pvs=21)