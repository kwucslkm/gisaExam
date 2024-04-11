1. C언어 4중 for 문 쓰레기 문제(해설만 3시간 13분50초 패스)

2. 관계 대수
    - 관계대수는 관계형 데이터베이스에서 원하는 정보와 그 정보를 검색하기 위해서 
      어떻게 유도하는가를 기술하는 절차적인 언어이다. 관계대수에 사용되는 연산은 다음과 같다.
      - 합집합(UNION) 은 두 릴레이션에 존재하는 튜플의 합집합을 구하되, 결과로 생성된 릴레이션에서 중복되는 튜플은 제거되는 연산으로, 사용하는 기호는 ( U ) 이다.
      - 차집합(DIFFERENCE) 은 두 릴레이션에 존재하는 튜플의 합집합을 구하되, 결과로 생성된 릴레이션에서 중복되느느 튜플은 제거 되는 연산으로, 사용하는 기호는 ( - )이다.
      - 교차곱 (CARTESIAL PRODUCT) 은 두 릴레이션에 있는 튜플들의 순서쌍을 구하는 연산으로, 사용하는 기호는 ( X )이다.
      - 프로젝트(PROJECT) 는 주어진 릴레이션에서 속성 리스트(Attribute List)에 제시된 속성 값만을 추출하여 새로운 릴레이션을 만드는 연산으로, 사용하는 기호는 ( 파이 ) 이다.
      - 조인(JOIN) 은 공통 속성을 중심으로 두 개의 릴레이션을 하나로 합쳐서 새로운 릴레이션을 만드는 연사능로, 사용하는 기호는 ( 보타이 ) 이다.

3. 디자인 패턴
    - (  **Bridge** ) 은 구현부에서 추상층을 분리하여 각자 독립적으로 변형이 가능하고 확장이 가능하도록 합니다. 즉 기능과 구현에 대해서 두 개를 별도의 클래스로 구현을 합니다.
    - ( **observer )** 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고, 자동으로 내용이 갱신되는 방식의 패턴이다. 

4. java 실행 결과
    ```java
    public class exam_22_3_4 {
        public static void main(String[] args) {
            int result[] = new int[5];
            int arr[] = {77, 32, 10, 99, 50};
            for(int i=0;i<5; i++){
                result[i] = 1;
                for(int j=0 ; j<5 ; j++){
                    if(arr[i] < arr[j])
                        result[i]++;
                }
            }
                for(int k=0 ; k<5; k++)
                    System.out.print(result[k]);
            
        }
    }   
    ==> 24513
    ```

5. 서브넷 마스크  192.168.1.0 / 24
      네트워크 주소    브로드캐스트 주소
    - 192.168.1.0  ~ 192.168.1.63
    - 192.168.1.64  ~ 192.168.1.127
    - 192.168.1.128  ~ 192.168.1.191
    - 192.168.1.192  ~ 192.168.1.255

6. 경계값 분석 (Boundary Value Analysis)
 
7. 쿼리 결과
    ```
    SELECT DISTINCT COUNT(부서코드) FROM 직원 WHERE 부서코드 = 20;
    ==> 3
    DELETE FROM 부서 WHERE 부서코드 = 20;
    SELECT DISTINCT COUNT(부서코드) FROM 직원;
    ==> 4

8. 용어
    - ( 사회공학 )은 컴퓨터 보안에 있어서, 인간 상호 작용의 깊은 신회를 바탕으로 사람들을 속여 정상 보안 절차를 깨트리기 위한 비기술적 시스템 침입 수단을 의미한다.
    - ( 다크데이터 ) 는 특정 목적을 가지고 데이터를 수집하였으나, 이후 활용되지 않고 저장만 되어있는 대량의 데이터를 의미한다. 미래에 사용될 가능성을 고려하여 저장 공간에서 삭제되지 않고 보관 되어 있으나, 이는 저장 공간의 낭비뿐만 아니라 보안 위험을 초래 할 수도 있다.
*
    - 세션 하이재킹 
        - 상호 인증 과정을 거친 후 접속해 있는 서버와 서로 접속되어 클라이언트 사이의 세션 정보를 가로채는 공격 기법으로, 접속을 위한 인증 정보 없이도 가로챈 세션을 이용해 공격자가 원래의 클라이언트인 것처럼 위장하여 서버의 자원이나 데이터를 무단으로 사용함.
        - TCP 3-Way-Handshake 과정에 끼어듦으로써 클라이언트와 서버 간의 동기화 된 시퀀스 번호를 가로채 서버에 무단으로 접근하는 TCP 세션 하이재킹이 대표적임
    - ARP Spoofing
        - ARP의 취약점을 이용한 공격 기법으로, 자신의 물리적 주소(MAC)를 공격대상의 것으로 변조하여 공격 대상에게 도달해야 하는 데이터 패킷을 가로채거나 방해함
    - 스미싱(Smishing)
        - 문자메시지를 이용해 사용자의 개인 신용 정보를 빼내는 수법
    - 타이포스쿼팅(Typosquatting)
        - 네트즌들이 사이트에 접속할 때 주소를 잘못 입력하거나 철자를 빠뜨리는 실수를 이용하기 위해 이와 유사한 유명 동메인을 미리 등록하는 일로, URL 하이재킹(Hijacking) 이라고도 함
    - APT(Advanced Persistent Threats, 지능형 지속 위협)
        - 다향한 IT 기술과 방식들을 이용해 조직적으로 특정 기업이나 조직 네트워크에 침투해 활동 거점을 마련한 뒤 때를 기다리면서 보안을 무력화시키고 정보를 수집한 다음 외부로 빼돌리는 형태의 공격 
    - 무작위 대입 공격 (Grute Force Attack)
        - 암호화된 문서의 암호키를 찾아내기 위해 적용 가능한 모든 값을 대입하여 공격하는 방식
    - 큐싱(Qshing)
        - QR코드를 통해 악성 앱의 다운로드를 유도하거나 악성 프로그램을 설치하도록 하는 금융사기 기법
    - SQL 삽입(Injection) 공격
        - 전문 스캐너 프로그램 혹은 봇넷 등을 이용해 웹사이트를 무차별벅으로 공격하는 과정에서 취약한 사이트가 발견되면 데이터베이스 등의 데이터를 조작하는 일련의 공격 방식
    - 크로스 사이트 스크립팅(XSS ; Cross Site Scripting)
        - 네트워크를 통한 컴퓨터 보안 공격의 하나로 , 췝 페이지의 내용을 사용자 브라우저에 표현하기 위해 사용되는 스크립트의 취약점을 악용한 해킹 기법
    - 스티핑(Sniffing)
        - 네트워크의 중간에서 남의 패킷 정보를 도청하는 해킹 유형의 하나로 수동적 공격에 해당함
9. Python
    ```Python
    a = [1, 2, 3, 4, 5]
    a = list(map(lambda num : num + 100, a))
    print(a)

    ==> [101, 102, 103, 104, 105]

10. 다양한 장비에서 발생하는 로그 및 이벤트를 통합하여 관리하는 보안 솔루션으로
    , 방화벽, IDS, IPS, 웹 방화벽, VPN 등에서 발생한 로그 및 이벤트를 통합하여 관리함으로써 비용 및 자원을 절약할 수 있는 특징이 있다. 또한 보안 솔루션 간의 상호 연동을 통해 종합적인 보안 관리 체계를 수립할 수 있다.
    ==> SIEM , Security Information & Event Management

11. 형상 관리 도구 => CVS, Git SVN
12. 학생(STUDENT) 테이블에 전기과 학생 50명, 전산과 학생 100명, 전자과 50명
    ```sql
    select dept from student; 
    ==> 200
    select distinct dept from student;
    ==> 3
    select count(distinct dept) from  student where dept = '전산과'
    ==> 1
14. Trustzone : 칩 설계회사인 ARM(Advanced RISC Machine)에서 개발한 기술로, 하나의 프로세서(Processor)내에 일반 애플리케이션을 처리하는 일반 구역(normal World)과 보안이 필요한 애플리케이션을 처리하는 보안구역(Secure World)으로 분할하여 관리하는 하드웨어 기반의 보안 기술이다.
    Typosquatting : 네티즌들이 사이트에 접속할 때 주소를 잘못 입력하거나 철자를 빠뜨리는 실수를 이용하기 위해 이와 유사한 유명 도메인을 미리 등록하는 것으로 URL 하이재킹(Hijacking) 이라고도 한다. 유명 사이트들의 도메인을 입력할 때 발생할 수 있는 온갖 도에인 이름을 미리 선점해 놓고 이용자가 모르는 사이에 광고 사이트로 이동하게 만든다.

15. SSO

16. 스케뷸링 기법 
    shortest job first : 준비 상태 큐에서 기다리고 있는 프로세스들 중에서 실행  
     시간이 가장 짧은 프로세스에게 먼저 CPU를 핟랑하는 기법이다. 가장 적은 평균 대기 시간을 제공하는 최적 알고리즘이지만, 실행 시간이 긴 프로세스는 실행 시간이 짧은 프로세스에게 할당 순위가 밀려 무한 연기 상태가 발생될 수 있다.
    Round Robin : 시분할 시스템을 위해 고안된 방식으로 , 준비상태 큐에 먼저 들어온  
     프로세스가 먼저 CPU를 할당받지만 각 프로세스는 시간 할당량 동안만 실행한 후 실행이 완료되지 않으면 다음 프로세스에게 CPU를 넘겨주고 준비상태 큐의 가장 뒤로 배치된다. 할당되는 시간이 작을 경우 문맥 교환 및 오버헤드가 자주 발생되어 요청된 작업을 신속히 처리할 수 없다.
    Shortest Remainning Time : 현재 실행중인 프로세스의 남은 시간과 준비 상태  
     큐에 새로 도착한 프로세스의 실행 시간을 비교하여 가장 짧은 실행 시간을 요구하는 프로세스에게 CPU를 할당하는 기법으로, 시분할 시스템에 유용하다. 준비상태 큐에 있는 각 프로세스의 실행 시간을 추적하여 보유하고 있어야 하므로 오버헤드가 증가한다. 
    
17. UML 은 시스템 분석, 설계, 구현 등 시스템 개발 과정에서 시스템 개발자와 고객 또는 
    개발자 상호 간의 의사소통이 원활하게 이루어지도록 표준화한 대표적인 객체지향 모델링 언어로, 사물, 관계, 다이어그램으로 이루어져 있다. 
    - 관계 는 사물과 사물 사이의 연관성을 표현하는 것으로, 연관, 집합, 포함, 일반화 등 다양한 형태의 관계 가 존재한다.
    - 클래스는 UML에 표현되는 사물의 하나로, 객체가 갖는 속성과 동작을 표현한다. 일반
    적으로 직사각형으로 표현하며, 직사각형 안에 이름, 속성, 동작을 표기한다.
    - 인터페이스는 클래스와 같은 UML에 표현되는 사물의 하나로, 클래스나 컴포넌트의 동작을 모아 놓은 것이며, 외부적으로 가시화되는 행동을 표현한다. 단독으로 사용되는 경우는 없으며, 인터페이스 구현을 위한 클래스 또는 컴포넌트와 함께 사용된다. \

18. E-R D 
    - 마름모  : 관계집합
    - 점선 : 관계 집합과 속성 연결
    - 테이블형 : 개체 집합, 키로 사용되는 항목에는 밑눌
    - 사각형 : 관계 집합의 속성
    - 실선 : 개체 집합과 관계 집합 연결
19. java 결과는
    ```java
    public class exam_23_3_19b {
        static int[] mkarr(){
            int[] tmpArr = new int[4];
            for (int i=0; i< tmpArr.length;i++)
                tmpArr[i] = i;
            return tmpArr;

        }
        public static void main(String[] args) {
            int[] arr;
            arr=mkarr();
            for(int i=0 ; i < arr.length; i++)
                System.out.print(arr[i]);
        }
    }
    ==> 0123
    ```
20. java 결과는
    ```java
    public class exam_22_3_20 {
        public static void main(String[] args) {
            int r= 0;
            for(int i =1 ; i<999 ; i++){
                if(i % 3 ==0 && i % 2 == 0)
                    r=i;
            }
            System.out.print(r);
            
        }
    }
    ==> 996
    ```

-------------------------------------------------------------------------
1. 다음 중 형상관리 도구에 해당하는 것을 모두 고르시오.
    - Ant, **CVS**, OLAP, Maven, **SVN**, Jenkins, OLTP, **Git**, Graddle
    - 형상관리 절차
        - 형상 실별 → 형상 통제 → 형상 감사 → 형상 기록
        - 통제 : 소프트웨어 형상 변경 요청을 검토하고 승인하여 현재의 베이스라인에 반영될 수 있도록 통제
2. 디자인 패턴
    - (  **Bridge** ) 은 구현부에서 추상층을 분리하여 각자 독립적으로 변형이 가능하고 확장이 가능하도록 합니다. 즉 기능과 구현에 대해서 두 개를 별도의 클래스로 구현을 합니다.
    - ( **observer )** 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고, 자동으로 내용이 갱신되는 방식의 패턴이다.
3. UML 설명
    - UML 은 컴퓨터 애플리케이션을 모델링 할 수 있는 통합 언어이다. 구성요소로는 **사물,** ( **관계**  ) , **다이어그램**으로 이루어져 있고, 구조 다이어그램중 ( **클래스**  **다이어 그램)** 은, 객체들의 타입을 정의하고, 객체들간의 관게를 도식화하여 시스템의 특정 모듈이나 일부 및 전체를 구조화한다.
    - UML 모델링에서 ( **인터페이스** ) 는 클래스와 같은 기타 모델 요소 또는 컴포넌트가 구현해야 하는 오퍼레이션 세트를 정의하는 모델 요소
    - 
4. 아래 점수에 따라 점수를 출력하는 테스트를 진행하려고한다. 다음과 같은 테스트 방식을 쓰시오. —> 경계점 분석 테스트
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ce43f40a-dca2-408d-96fe-374194f0f142/Untitled.png)
    
    - 블랙박스 테스트
        - 동등분할 기법 (Equivalence Partitioning)
            - 입력 자료에 초점을 맞춰 테스트 케이스를 만들어 검사하는 방법
        - 경계값 분석(Boundary Value Analysis)
            - 입력 조건의 경계값을 테스트 케이스로 선정하는 방법
        - 원인-효과 그래프 검사(Cause Effect Graph)
            - 입력 데이터 간의 관계와 출력에 영향을 미치는 상황을 체계적으로 분석한 다음 효용성이 높은 테스트 케이스를 선정하여 검사하는 기법
        - 오류 예측 검사(Error Guessing)
            - 과거의 경험이나 테스터의 감각으로 테스트하는 기법
        - 비교 검사(Comparison Testing)
            - 여러 버전의 프로그램에 동일한 테스트 자료를 제공하여 동일한 결과가 출력되는지 테스트하는 기법
5. 용어 설명
    - 여러 개의 사이트에서 한번의 로그인으로 여러가지 다른 사이트들을 자동적으로 접속하여 이용하는 방법을 말한다.
    - 하나의 시스템에서 인증을 할 경우 타 시스템에서는 인증 정보가 잇는 지 확인하고있으면, 로그인 처리를 하도록 하고, 없는 경우, 다시 통합 인증을 할 수 있도록 만드는 것을 의미한다.
        
        —> Single Sign ON( SSO )
        
6. ER 다이어그램 기호 문제
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3baba540-c6b2-46a4-856b-24d94cb30b18/Untitled.png)
    
7. 다음은 프로세스 스케쥴링에 관련된 내용이다. 괄호에 맞는 답을 작성하시오.
    - ( SRT ) : 선점형 스케줄링 기법으로 CPU 점유 시간이 가장 짧은 프로세스에 CPU를 먼저 할당하는 방식
    - ( RR ) : 비 선범형 스케줄링 기법으로 실행시간이 가장 짧은 프로세스에게 CPU를 할당하는 방식
    - ( SJF ) : 비 선점형 스케줄링 기법으로 실행시간이 가장 짧은 프로세스에게 CPU를 할당하는 방식
    
    <aside>
    🔥 선점형 기법
    
    - Round Robin
    - SRT(Shortest Remaining Time)
    - 다단계 큐(MLQ, Multi-Level Feedback Que)
    </aside>
    
    <aside>
    🔥 비선점형 기법
    
    - FCFS(First Come First Serve
    - SJF(Shortest Job First)
    - HRN(Highest Response ratio Next)
    - 우선순위(Priority)
    - 기한부(Deadline)
    </aside>
    
8. 192. 168.1.0/24 네트워크를 FLSM 방식으로 3개의 서브넷으로 나눴을때, 두번째 네트워크의 브로드캐스트 IP를 쓰시오. —> 192.168.1.127
9. 아래 설명에 대한 알맞은 답을 작성하시오.
    - ( 사회공학 ) 기술적인 방법이 아닌 사람들 간의 기본적인 신뢰를 바탕으로 사람을 속여 비밀정보를 획득하는 기법
    - ( 다크데이터 ) 기업이 정보를 수집한 후, 저장만 하고 분석에 활용하고 있지 않은 다량의 데이터
10. 아래 설명에 대한 알맞은 답을 작성하시오. —> SIEM
    - 테트워크 하드웨어 및 응용 프로그램에 의해 생성된 보안 경고의 실시간 분석을 제공한다.
    - 빅데이터 수준의 데이터를 장시간 심층 분ㅅ헉한 인덱싱 기반이다.
    - 주요기능은 데이터 통합, 상관관계, 알림, 대시보드
11. 아래 설명에 대한 알맞은 답을 작성하시오.
    - ( Trust Zone ) 독립적인 보안 구역을 따로 두어 중요한 정보를 보호하는 하드웨어 기반의 보안 기술
    - ( 타이포스쿼팅(Typosquatting ) 사용자가 사이트의 URL 주소를 입력할 때 철자를 잘못 입력하거나 빠뜨리는 실수를 이용하여, 해커가 만들어 놓은 유사한 URL로 접속하도록 유도하는 공격
12. 관계대수 기호를 작성하시오.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6f8fbda5-7df5-4d92-a730-157c3da667c2/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b4190b87-4bf7-426f-bd0a-9dbb404a270d/Untitled.png)

관계대수 연산자 

- 순수 관계 연산자 : SELECT( ), PROJECT( ), JOIN( ), DIVISION( )
- 일반 집합 연산자 : 합집합(U), 교집합 ( ), 차집합, 카티션 프로덕트 (x)

1. 아래의 테이블에서, SQL 명령을 수행할 경우 알맞은 값을 작성하시오.
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/69379922-7fcd-457a-a95a-d9d0b9210ae0/Untitled.png)
    
    ```jsx
    select distinct count(직원코드) from 직원 부서코드 ='10'; --> 3
    delect from 부서 where 부서코드='10'; 
    select distinct count(직원코드) from 직원; --> 4
    ```
    
2. student 테이블에 컴퓨터학과 학생 50명, 기계과 학생 100명, 건축과학생 50명의 에잍가 있다.  다음 SQL의 실행결과 튜플의 수는 몇인지 작성하시오.
    1. select dept from student; —>200
    2. select distinct dept from student; —> 3
    3. select count(distinct dept) from student where dept =’건축과’; —>  1
3. 다음 프로그램의 출력결과를 2차원 배열 형태로 작성하시오.
    1. https://www.youtube.com/watch?v=uEkM2lyNnu8
4. 다음 C언어 프로그램의 출력겴과를 쓰시오. —> 24513
    
    ```c
    int main(){
        int result[5];
        int arr[]={77,32,10,99,50};
        for(int i=0; i<5 ; i++){
            result[i]=1;
            for(int j=0;j<5;j++)
                if(arr[i]<arr[j]) result[i]++;
        }
        for(int i=0 ; i<5 ; i++)
            printf("%d",result[i]);
    }
    ==> 24513 나보다 큰 수의 개수 +1
    ```
    
5. 다음 C언어 프로그램의 출력결과를 쓰시오.
    
    ```c
    int main()
    {
        int x, y;
        int cnt = 0;
        for (int i = 6; i <= 30; i++)
        {
            x = 0;
            y = i / 2;
            for (int j = 1; j <= y; j++)
            {
                if (i % j == 0)
                    x = x + j;
            }
            if (x == i)
            {
                cnt++;
            }
        }
        printf("%d", cnt);
    }
    ```
    
6. 다음 JAVA 프로그램의 출력 결과를 쓰시오.
    
    ```java
    class exam_22_3_18 {
        public static void main(String[] args) {
            int[] inData = makeAry();
            for (int i = 0; i < inData.length; i++)
                System.out.println(inData[i]);
        }
    
        static int[] makeAry() {
            int[] tmp = new int[4];
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = i;
            }
            return tmp;
        }
    }
    ```
    
7. 다음 JAVA 프로그램의 출력 결과를 쓰시오.
    
    ```java
    public class exam_22_3_19 {
        public static void main(String[] args) {
            int max =0;
            for(int i=1 ; i<999 ; i++){
                if(i%3==0 && i%2!=0)
                    max = i;
            }
            System.out.println(max);
        }
    }
    ```
    
    —> [101,102,103,104, 105]
    
8. 다음 파이썬 모드에 대한 출력값을 작성하시오.
    
    ```python
    tData = [1, 2, 3, 4, 5]
    tData = list(map(lambda num : num+100, tData))
    print(tData)
    ```