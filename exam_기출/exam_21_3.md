1. AAA, Triple-A라고 읽는 이 용어는 보안의 세 가지를 합쳐 축약한 용어이다. 다음에 해당하는 용어를 <보기>에서 찾아쓰시오.
    
    <보기>
    
    - Authentication(인증) : 보안 기능에서, 사람이나 프로세스의 신분을 확인하는 것
    - Authorization(인가) : 검증된 사용자에게 어떤 수준의 권한과 서비스를 허용하는 것
    - Accounting(계정관리): 사용자의 자원에 대한 사용 정보를 모아서 과금, 감사, 용량증설, 리포팅 등을 실시하는 것
2. 데이터 제어어(DCL)의 하나인 GRANT의 기능에 대해 간략히 서술하시오.
    
    —> 사용자에게 접속권한, 생성권한 등을 부여하는 명령어
    
3. 다음 설명하는 보안위협에서 괄호에 들어갈 알맞은 답을 쓰시오.
    
    ( ARP ) 스푸핑은 MAC 주소를 속여 랜에서의 통신 흐름을 왜곡시키는 공격이다. 공격 대상 컴퓨터와 서버 사이의 트래픽을 공격자의 컴퓨터로 우회시켜 패스워드 정보 등 원하는 정보를 획득할 수 있다.
    
- 스푸핑(Spooping)
    - IP 스푸핑
        - IP자체의 보안 취약성을 악용한 것으로 자신의 IP주소를 속여서 접속하는 공격
        - IP 스푸핑을 통해 서비스 거부 공격(Dos)도 수행 가능하며 공격 대상 컴퓨터와 서버 사이의 연결된 세션을 끊을 수도 있다.
        - 종단 인증(end point authentication)같은 방법으로 해결한다.
    - DNS 스푸핑
        - 공격대상에게 전달되는 DNS IP주소를 조작하여 의도치 않는 주소로 접속하는 공격
        - 공격대상은 정상적인 URL을 통해서 접속하지만, 실제로 가짜 사이트로 접속된다.

3. 데이터 제어어(DCL)의 하나인 GRANT의 기능에 대해 간략히 서술하시오.
    -> 데이터베이스 관리자가 데이터베이스 사용자에게 데이터베이스  접속권한, 생성권한 등을 부여하는 명령어        

4. AAA, Triple-A라고 읽는 이 용어는 보안의 세 가지를 합쳐 축약한 용어이다. 다음에 해당하는 용어를 <보기>에서 찾아쓰시오.
    
    <보기>
    
    - Authentication(인증) : 보안 기능에서, 사람이나 프로세스의 신분을 확인하는 것
    - Authorization(인가) : 검증된 사용자에게 어떤 수준의 권한과 서비스를 허용하는 것
    - Accounting(계정관리): 사용자의 자원에 대한 사용 정보를 모아서 과금, 감사, 용량증설, 리포팅 등을 실시하는 것

5. 디자인 패턴에 관한 설명에서 알맞은 답을 <보기>에서 고르시오.
    - Abstract Factory, FactoryMetthod, Prottottype, Builder, Observer, Facade, Composite, Template Method, Singleton
    - <보기>
        - 객체 생성 처리를 서브 클래스로 분리해 처리하도록 캡슐화하는 패턴
        - 객체의 생성 코드를 별도의 클래스/메서드로 분리함으로서 객체생성의 변화에 대비하는 데 유용하다.
        - 상위클래스에서 객체를 생성하는 인터페이스에 정의하고, 하위클래스에서 인스턴스를 생성하도록 하는 방식
        - Virtual-Constructor 패턴이라고도 함
        
        **—> FactoryMethod**

6. 결합도의 종류 중, 어떤 모듈이 다른 모듈을 호출할 때, 단순히 값만 전달되는 형태가 아닌 제어 신호를 전달할 때 생기는 결합도를 영문으로 쓰시오.
    
    —> Control coupling
    
    - 자료 결합도 - 모듈 간의 인터페이스로 값이 전달되는 경우
    - 스탬프 결합도 - 모듈 간의 인터페이스로 배열이나 오브젝트, 스트럭처 등이 전달되는 경우
    - 제어 결합도 - 단순 처리할 대상인 값만 전달되는게 아니라 어떻게 처리를 해야 한다는 제어 요소가 전달 되는 경우
    - 외부 결합도 - 어떤 모듈에서 선언한 데이터(변수)를 외부에 다른 모듈에서 참조하는 경우
    - 공통 결합도 - 파라미터가 아닌 모듈 밖에 선언되어 있는 전역 변수를 참조하고 전역 변수를 갱신하는 식으로 상호 작용하는 경우
    - 내용 결합도 - 다른 모듈 내부에 있는 변수나 기능을 다른 모듈에서 사용하는 경우  

    - 스파게티 코드 - [프로그램](https://terms.naver.com/entry.nhn?docId=833746&ref=y)에서 제어 흐름이 마치 스파게티 면발처럼 얽혀져 있는 프로그램 코드에 붙여진 이름. GOTO문의 과다한 사용이 이러한 코딩을 유도한다.
    - 에일리언 코드  - 오래되서 출처를 알수 없어 사용하기 힘든
7. c언어 실행 결과
    ```c
    #include <stdio.h>
    struct jsu {
        char nae[12];
        int os, db, hab, hhab;
    };
    int main(){
        struct jsu st[3] = {{"데이터1", 95, 88}, {"데이터2", 84, 91},{"데이터3", 86, 75}};
        struct jsu* p;
        p = &st[0];
        (p+1)-> hab = (p+1) ->os + (p+2)-> db;
        (p+1)-> hhab = (p+1)->hab + p->os + p -> db;
        printf("%d", (p+1)->hab +(p+1)->hhab);
    }
    ```



2. 디자인 패턴에 관한 설명에서 알맞은 답을 <보기>에서 고르시오.
    - Abstract Factory, FactoryMetthod, Prottottype, Builder, Observer, Facade, Composite, Template Method, Singleton
    - <보기>
        - 객체 생성 처리를 서브 클래스로 분리해 처리하도록 캡슐화하는 패턴
        - 객체의 생성 코드를 별도의 클래스/메서드로 분리함으로서 객체생성의 변화에 대비하는 데 유용하다.
        - 상위클래스에서 객체를 생성하는 인터페이스에 정의하고, 하위클래스에서 인스턴스를 생성하도록 하는 방식
        - Virtual-Constructor 패턴이라고도 함
        
        **—> FactoryMethod**
        
3. 다음은 파일 구조에 대한 설명이다. 빈 칸에 알맞은 답을 작성하시오.
    - 파일의 구조는 파일을 구성하는 레코드들이 보조기억장치에 편성되는 방식을 의미하는것으로, 편성 방법에 따라 순차, (색인), 랜덤, 해싱 등이 있다.
    - (색인)은  순차 처리와 랜덤 처리가 모두 가능하도록 레코드들을 키 값 순으로 정렬하여 기록하여 데이터에 접근한다. 자기 디스크에서 주로 사용된다.
4. 소프트웨어 테스트에 관한 설명
    - (상향식 테스트) 소프트웨어의 하위 모듈에서 상위 모듈 방향으로 통합하면서 테스트 하는 기법이다.
    - 상위 모듈의 역할을 하는 ( 드라이버 ) 가 필요하다.
    - ( 드라이버 ) 는 하위 모듈을 순서에 맞게 호출하고, 호출할 때 필요한 매개 변수를 제공하며, 반환 값을 전달하는 역할을 한다.
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9a118f8c-e8e9-49b5-9fe0-0314d7bab9dd/Untitled.png)
    
5. Windows나 Mac OS등에서 사용하는 인터페이스로, 사용자가 명령을 직접 입력하지 않고, 아이콘 등을 클릭하여 작업을 수행하는 사용자 인터페이스를 영문약어로 작성하시오. —> GUI
6. 다음 UML(Unified Modeling Language)에 관한 설명에서 괄호에 들어갈 알맞은 답을 쓰시오.
    1. ( 클래스다이어그램  ) 는 자기만의 속성(atttribute)과 일정한 행동(behavior)으로 구성되어 있다.
    2. 서로 연관이나 상속, 의존 관계 등으로 서로 간의 상호 작용을 표현한다.
    3. 대표적인 구조 다이어그램이다. 
    
    구조적 다이어그램(Structure Diagram)
    
    - 클래스다이어그램 - 시스템을 구성하는 클래스들 사이의 관계를 표현한다.
    - 패키지 다이어그램 - 클래스나 유스케이스 등을 포함한 여러 모델 요소들을 그룹화하여 패키지를 구성하고 패키지들 사이의 관계를 표현한다.
    - 복합체 다이어그램 - 복합 구조의 클래스와 컴포넌트 내부 구조를 표현한다.
    - 객체 다이어그램 - 객체 정보를 보여준다.
    - 컴포넌트 다이어그램 - 컴포넌트 구조 사이의 관계를 표현한다.
    - 배치 다이어그램 - 소프트웨어, 하드웨어, 네트워크를 포함한 실행 시스템의 물리 구조를 표현한다.
7. 블록 암호의 일종으로, IBM에서 개발하고, 미국 NBS(현재 NIST)에서 국가 표준으로 정한 암호화 알고리즘이나 취약점이 발견되어 현재는 잘 사용되지 않는다. 블록크기는 64비트, 키 길이는 56회 이며 16라운드를 수행한다. 페이스텔(Feistel) 구조를 사용하는 암호화 알고리즘은 무엇인지 쓰시오.  —> DES
    - 암호 방식의 분류
        - 대칭키 (비밀키)
            - Stream - LFSR, RC4
            - Block 방식 - DES, AES, IDEA
        - 비대칭키 (공개키)
            - 인수분해 이용 - RSA, Robin
            - 이산대수 - Elgamal, DSA
            - 타원곡선 - ECC
        
8. 테스트케이스의 구성요소에 대한 설명이다. ( ) 안에 들어갈 알맞는 답을 쓰시오.
    
    
    | 식별자_ID | 테스트 항목 | (테스트 조건) | (테스트 데이터) | (예상 결과) |
    | --- | --- | --- | --- | --- |
    | LS_001_1 | 로그인 | 로그인 화면 | 아이디(test)
    패스워드(qwe123) | 로그인 성공 |
    | LS_001_2 |  |  | 아이디(test)
    패스워드(qwe321) | 로그인 실패 |
9. UML 관계에 대한 설명이다. 
    
    
    | ( Aggregation ) : 클래스들 사이의 전체 또는 부분 같은 관계
    ( Generalization ) : 한 클래스가 다른 클래스를 포함하는 상위 개념일 때의  IS-A관계 |
    | --- |
    
    ☠️ UML 관계
    
    - 일반화 관계(Generalization)
        - 한 클래스가 다른 클래스를 포함하는 상위 개념일 때의 관계
    - 연관 관계(Accociation)
        - 2개 이상 사물이 서로 관련된 관계
    - 의존 관계(Dependency)
        - 연관 관계와 같이 한 클래스가 다른 클래스에서 제공한느 기능을 사용할 때 표시
    - 실체화 관계 (Realization)
        - 한 객체가 다른 객체에게 오퍼레이션을 수행하도록 지정
    - 집합 관계 - 집약관계 (Aggregation)
        - 한 객체가 다른 객체를 소유하는 ‘has a’관계
10. OSI 7Layer 에 대한 설명에서 1~3에 들어갈 알맞은 계층을 쓰시오.
    
    
    | - (  ) : 물리계층을 통해 송수신 되는 정보의 오류와 흐름을 관찰하여 안전한 정보의 전달을 수행할 수 있도록 도와준다.
    - (  ) : 데이터를 목적지까지 가장 안전하고 빠르게 전달하는 기술
    - (  ) : 데이터 표현이 상이한 응용 프로세스의 독립성을 제공하고 암호화 한다. |
    | --- |
    
    —> 1. 데이터링크 계층
    
    —> 2. 네트워크 계층
    
    —> 3. 표현 계층
    
    - 물리 → 데이터 → 네트워크 → 전송 → 세션 → 표현 → 응용
    
    ---
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/637ee766-bb40-4c9a-a823-bfc34769174a/Untitled.png)
    
11. 테스트 기법 중, 입력 데이터 간의 관계와 출력에 영향을 미치는 상황을 체계적으로 분석하여 효용성 높은 검사 사례를 선정하여 검사하는 기법을 아래에서 찾아 쓰시오.
    
    
    | Equivalence Partitioning, Boundary Value Analysis, Cause-effect Graphing, Fault based, Base Path Test, Loop Test, Comparison Testing |
    | --- |
    
    Cause - effect Graphing
    
12. T1 테이블과 T2 테이블을 참고하여 SQL 실행결과를 쓰시오.
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/32995fe6-39b9-4da0-9b43-156d6e031c40/Untitled.png)
    
    **—> 4**
    
13. Python 프로그램을 분석하여 실행 결과를 쓰시오.
    
    ```python
    x, y = 100, 200
    print(x == y)
    
    >>> False
    ```
    
14. C 언어 프로그램 분석 결과
    
    ```c
    struct jsu {
        char name[12];
        int os, db, hab, hhab;
    };
    int main(){
        struct jsu st[3] = {{"데이터1", 95, 88},{"데이터2", 84,91},{"데이터3",86, 75}};
        struct jsu* p;
    
        p = &st[0];
        (p+1)->hab = (p+1)->os+(p+2)-> db;
        (p+1)->hhab = (p+1)->hab+p->os+p->db;
        printf("%d\n",(p+1)->hab+(p+1)->hhab);
    }
    ```
    
15. C 언어 프로그램을 분석하여 결과 쓰시오 
    
    ```python
    void main(){
        int *arr[3];
        int a= 12, b= 24, c=36;
        arr[0] = &a;
        arr[1] = &b;
        arr[2] = &c;
        printf("%d\n", *arr[1] + **arr+1);
    }
    
    --> 정답 : 37
    ```
    
16. JAVA언어 프로르램을 분석하여 실행 결과를 쓰시오.
    
    ```java
    public class exam_21_3_19 {
        public static void main(String[] args) {
            int a = 3, b = 4, c = 3, d = 5;
            if ((a == 2 | a == c) & !(c > d) & (1 == b ^ c != d)) {
                a = b + c;
                if (7 == b ^ c != a) {
                    System.out.println(a);
                } else {
                    System.out.println(b);
                }
            } else {
                a = c + d;
                if (7 == c ^ d != a) {
                    System.out.println(a);
                } else {
                    System.out.println(d);
                }
            }
        }
    }
    --> 정답 : 7
    ```
    
17. JAVA 언어 프로그램을 분석하여 실행 결과를 쓰시오.
    
    ```java
    public class exam_21_3_20 {
        public static void main(String[] args) {
            Connection conn1 = Connection.getInsConnection();
            conn1.count();
            Connection conn2 = Connection.getInsConnection();
            conn2.count();
            Connection conn3 = Connection.getInsConnection();
            conn3.count();
            System.out.println(conn1.get()); 
        }
    }
    class Connection {
        private static Connection _in = null;
        private static int count = 0;
        static public Connection getInsConnection(){
            if(_in == null){
                Connection _in = new Connection();
                return _in;
            }
            return _in;
        }
        public void count(){
            count++;
        }
    정답 : 3
    ```
    

public class exam_21_3_20 {
public static void main(String[] args) {
Connection conn1 = Connection.getInsConnection();
conn1.count();
Connection conn2 = Connection.getInsConnection();
conn2.count();
Connection conn3 = Connection.getInsConnection();
conn3.count();
System.out.println(conn1.get());
}

}
class Connection {
private static Connection _in = null;
private static int count = 0;
static public Connection getInsConnection(){
if(_in == null){
Connection _in = new Connection();
return _in;
}
return _in;
}
public void count(){
count++;
}
public int get(){
return count;
}
}