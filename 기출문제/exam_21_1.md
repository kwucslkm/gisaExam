
1. 물리주소( MAC Address)를 IP주소로 변화하는 프로토콜을 쓰시오.
    1. —> RARP      —> ARP(Address Resoution Protocol), IP,  ICMP
    2. —> RIP, OSFP ,  알기
2. 데이타베이스 설계 용어
    1. ( 개념적 설계  ) : 현실 세계에 있는 그대로 사람이 이해할 수 있는 형태의 정보구조로 만들어 가는 과정을 의미하기 때문에 정보 모델이라고 한다.
    2. ( 논리적 설계 ) : 추출된 엔티티와 속성들의 관계를 구조적으로 정의하는 단계로, 개념적 설계에서 만들어진 구조를 컴퓨터가 이해하고 처리할 수 있도록 변환하는 과정
    3. ( 물리적 설계) : 실제 저장장치에 어떻게 저장할지 설계하는 단계  

3. 웹 서비스와 관련된 서식이나 프로토콜 등을 표준적인 방법으로 기술하고 게시하기 위한 언어로, XML로 작성 되며 UDDI의 기초가 된다. SOAP, XML스키마와 결합하여 인터넷에서 웹 서비스를 제공하기 위해 사용되며, 클라이언트는 이것을 통해 서버에서 어떠한 조작이 가능한지를 파악할 수 있다.
    ==> WSDL (Web Services Description Language)

4. 요구사항 확인 
    ( 기능 ) 요구사항은 시스템이 무엇을 하는지, 어떤 기능을 하는지 등 사용자가 시스템을 
    통해 제공받기를 원하는 기능이나 시스템이 반드시 수행해야 하는 기능을 의미한다.
    ( 비기능 ) 요구사항은 품질이나 제약사항과 관련된 요구사항으로, 시스템의 장비 구성, 성능, 인터페이스, 테스트, 보안 등의 요구사항을 말한다.
    사용자 요구사항 - 사용자 관점에서 본 시스템이 제공해야 할 요구사항
    시스템 요구사항 - 개발자 관점에서 본 시스템 전체가 사용자와 다른 시스템에 제공해야 할 요구사항

5.  Python 결과
    ```PYthon
    class CharClass:
        a = ['Seoul', 'Kyeongi', 'Inchon', 'Daejeon', 'Daegu', 'Pusan'];
        myVar = CharClass()
        str01 = ''
        for i in myVar.a:
            str01 = str01 + i[0]
        print(str01)

        ==> K
    ```
6. empno   sal
    100     1500
    200     3000
    300     2000
    ==> SELECT COUNT(*) FROM EMP_TBL WHERE EMPNO > 100 AND SAL >= 3000
        OR EMPNO = 200;
        ==> 1
7. JAVA 결과
```java
public class exam_21_1_7 {
    public static void main(String[] args) {
        int aa[][] = {{45, 50, 75},{89}};
        System.out.println(aa[0].length);
        System.out.println(aa[1].length);
        System.out.println(aa[0][0]);
        System.out.println(aa[0][1]);
        System.out.println(aa[1][0]);

    }
}
```
8. 반정규화 : 시스템의 성능을 향상시키고 개발 및 운영의 편의성 등을 높이기 
             위해 정규화된 데이터 모델을 의도덕으로 통합, 중복, 분리하여 정규화 원칙을 위배하는 행위

9. ( 경계값 분석) 은 입력 조건의 중간값보다 경계값에서 오류가 발생될 확률이
    높다는점을 이용한 검사 기법이고, ( 동치 분할 검사)는 입력 조건이 유효한 경우와 그렇지 않은 경우의 입력 자료의 개수를 균등하게 정하는 검사 기법이다. 예를 들어 0<=x <= 10 과 같은 조건이 있을 때, ( 경계값 분석 ) 은 -1, 0, 10, 11을 입력값으로, ( 동치 분할 검사 )는 0이상 10이하의 수 n개와 0미만 10초과의 수 n개를 입력값으로 정한다.
10. 애플리케이션 테스트
    - 단위 테스트 : 코딩 직후 소프트웨어 설계의 최소 단위인 모듈이나 컴포
        넌트에 초점을 맞춰 수행하는 테스트로, 모듈 테스트라고도 불린다. 사용자의 요구사항을 기반으로 한 기능성 테스트를 최우선으로 인터페이스, 외부적 I/O 자료구조, 독립적 기초 경로, 오류 처리 경로, 경계 조건 등을 검사한다.
    - 통합 테스트 : 모듈들을 결합하여 하나의 시스템으로 완성시키는 과정에서의 테스트를 의미하며, 모듈 간 또는 컴포넌트 간의 인터페이스가 정상적으로 실행되는지 검사한다.

11. 인터넷 
    - IPv6 는 128 비트의 주소를 가지며, 인증성, 기밀성, 데이터 무결성의 지원으로 보안 문제를 해결할 수 있고, 주소의 확장성, 융통성, 연동성이 뛰어나다.
    - IPv4는 32비트의 주소를 가지며 8 비트씩 4부분, 총 32비트로 구성되어 있다. IPv4는 네트워크 부분의 길이에 따라 A 클래스에서 E 클래스까지 총
    5단계로 구성되어 있다.
12. IPC (Inter-Pocess Communication)
    -  모듈 간 통신 방식을 구현하기 위해 사용되는 대표적인 프로그래밍 인터페이스 집합으로 , 복수의 프로세스를 수행하며 이뤄지는 프로세스 간 통신까지 구현이 가능하다. 대표적인 메소드에는 공유 메모리, 소켓, 세마포어, 파이프와 네임드 파이프, 메시지 큐잉이 있다.

14. 카디널리티 = ㅡ, 디그리 = |

15. c 언어 결과
```c
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
```
16. 데이터 모델의 구성 요소
    - ( 연산 ) 은 데이터베이스에 저장된 실제 데이터를 처리하는 작업에 대한 명세로서 데이터베이스를 조작하는 기본 도구에 해당한다.
    - ( 구조 )는 논리적으로 표현된 객체 타입들 간의 관계로서 데이터의 구성 및 정적 성질을 표현한다.
    - 제약 조건은 데이터베이스에 저장될 수 있는 실제 데이터의 논리적인 제약 조건을 의미한다.

17. 접근통제는 데이터가 저장된 객체와 이를 사용하려는 주체의 정보 흐름을 
    제한하는 것이다. 이러한 접근통제에 관한 기술 중 ( DAC ) 는 데이터에 접근하는 사용자의 신원에 따라 접근 권한을 부여하여 제어하는 방식으로, 데이터의 소유자가 접근통제 권한을 지정하고 제어한다. 객체를 생성한 사용자가 생성된 객체에 대한 모든 권한을 부여받고, 부여된 권한을 다른 사용자에게 허가할 수도 있다. ==> DAC 임의 접근 통제

18. java 출력 결과
```java
public class exam_21_1_18 {
    public static void main(String[] args) {
        int j, i;
        for(j=0, i=0 ; i <=5; i++){
            j+= i;
            System.out.print(i);
            if(i==5){
                System.out.print("=");
                System.out.print(j);
            }
            else
                System.out.print("+");
        }
        
    }
}
```
19. - 내용 결합도 : 모듈 간의 인터페이스로 데이터, 지역 변수 등을 직접 참조하거나 수정할 때의 결합도다.
    - 스탬프 결합도 : 모듈 간의 인터페이스로 배열이나 레코드 등의 자료 구조가 전달될 때의 결합도다.
    - 공통 결합도 : 모듈 간의 인터페이스로 파라미터가 아닌 모듈 밖에 선언된 전역 변수를 사용하여 전역변수를 갱신하는 방식으로 상호작용하는 때의 결합도

20. 세션 하이재킹 : '세션을 가로채다'라는 의미로, 정상적인 연결을 RST 패밋을 통해 종료시킨 후 재연결 시 희생자가 아닌 공격자에게 연결하는 공격 기법이다.
                   TCP 세션하이재킹은 공격자가 TCP 3-Way-Handshake 과정에 끼어듦으로써 서버와 상호 간의 동기화된 시퀀스 번호를 갖고 인가되지 않은 시스템의 기능을 이용하거나 중요한 정보에 접근할 수 있게 된다.
                   



3. 카디널리티 와 차수 를 구하시오.
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0d241e55-dd60-4248-8e1a-7adf07142c44/Untitled.png)
    
4. 기업 내부에서 운영되는 각종 플랫폼 및 애플리케이션 간의 정보전달, 연계, 통합을 가능하게 하는 솔루션이다. Point to Point, Hub&Spoke, Message Bus, Hybrid 형태로 구성
    
    —> EAI(**Enterprise Application Integration)**
    
5. 다음 데이터 모델 구성 3요소 중 알맞은 데이터 모델 구성 요소를 쓰시오.
    1. ( 연산 ) : 데이터베이스에 저장된 실제 데이터를 처리하는 작업에 대한 명세로 데이터베이스를 조작하는 도구이다.
    2. ( 구조 ) : 논리적으로 표현된 개체 타입들 간의 관계로서 데이터 구조 및 정적 성질을 표현한다.
    3. 제약조건 : 데이터베이스에 저장될 수 있는 실제 데이터의 논리적인 제약 조건
6. 블랙박스 테스트
    1. (  경계값 분석 ) : 0 ≤ X ≤ 10 일 때, -1, 0, 10, 11인 경우 사용하는 테스트
    2. (  동등분할 테스트 ) : 유효값과 그렇지 않은 범위를 나눠야 할 경우 사용하는 테스트
7. 공격기법
    1. (  세션 하이재킹 ) 은 시스템 간 연결이 활성화된 상태, 즉 로그인(Login) 된 상태를 가로채는 것을 뜻한다.
    2. (  ) 은 TCP의 고유한 취약점을 이용해 정상적인 접속을 빼앗는 방법이다. 서버와 클라이언트 통신 시 TCP 의 시퀀스 넘버를 제어하는 데 발생하는 문제를 공격한다. TCP 는 클라이언트와 서버 간 통신을 할 때 패킷의 연속성을 보장하기 위해 각각 시퀀스 넘버를 사용한다. 이 시퀀스 넘버가 잘못되면 이를 바로잡기 위한 작업을 하는데, (  ) 은 서버와 클라이언트에 각각 잘못된 시퀀스 넘버를 위조해서 연결된 세션에 잠시 혼란을 준 뒤 자신이 끼어들어 가는 방식이다.
8. IPv6는 ( 128 ) 비트의 길이를 가진다.
    
    IPv4는 길이가 32비트이며, ( 8  )비트씩 4분할 한다.
    
9. 결합도
    1. ( 스탬프 결합도 ) : 두 모듈이 동일한 자료구조를 조회하는 경우
    2. ( 내용 결합도 ) : 가장 강한 결합도를 가지고 있으며, 한 모듈이 다른 모듈의 내부 기능 및 그 내부 자료를 조회하도록 설계되었을 경우
    3. ( 공통 결합도  ) : 여러 모듈이 공통 자료 영역을 사용하는 경우
    4. 결합도가 강한 순서   (강함) 내 → 공 → 외 → 제 → 스 → 자 (약함)
    5. 응집도가 강한 순서    (약함) 우 → 논 → 시 → 절 → 교(통) → 순 → 기 (강함) 
10. 용어
    1. ( 기능적 ) 요구사항은 제품을 구현하기 위해 소프트웨어가 가져야할 기능적 속성
    2. ( 비기능적 ) 요구사항은 제품 품빌 기준 등의 만족을 위해 소프트웨어가 가져야 할 특성
11. 시스템 객체의 접근을 개인 또는 그룹의 식별자에 기반한 방법으로 어떤 종류의 접근 권한을 가진 사용자가 다른 사용자에게 자신의 판단에 따라 권한을 허용하는 접근 제어 방식은 —> DAC( 임의적 접근 통제)
12. 웹 서비스의 구처젝 내용이 가술되어 있어 서비스 제공 장소, 서비스 메시지 포맷, 프로토콜 등이 기술되어 있는 언어는? WDSL
13. 용어 
    1. ( 단위 테스트 ) 개발자가 원시 코드를 대상으로 다른 부분과 연계된는 부부은 고려하지 않고, 각각의 단위 자체에만 집중 하여 테스트 한다.
    2. ( 통합테스트 ) 인터페이스 간 시스템이 정상적으로 실행되는지 확인하는 테스트이다.
14. 시스템의 성능 향상, 개발 과정의 편의성 등ㅇ르 위해 정규화된 데이터 모델을 분할, 통합, 추가하는 과정으로, 의도적으로 정규화에 위배되는 행위이다.  무엇을 설명하는 것인지 쓰시오. —> 반정규화(비정규화)
15. 실행 프로세스 간에 통신을 가능하게 하는 기술로, 종류에는 파이프, 메시지 큐, 공유메모리, 세마포어, 소켓 등이 있다. —> IPC(inter- Process Communication)
16. 다음 SQL 문의 실행 결과를 쓰시오.
    
    ```sql
    select count(*) from table01 
    								where empno > 100 and sal >= 3000 or empno = 200
    --> 1
    ```
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1e0acc5b-8431-40d2-bd1b-b8c5255d2bb7/Untitled.png)
    
17. 파이썬 프로그램 결과
    
    ```sql
    class arr:
        a= ["Seoul","Kyeonggi","Incheon","Daejeon","Daegu","Pusan"]
    str = ''
    for i in arr.a:
        str = str +i[0]
    print(str)
    
    --> SKIDDP
    ```
    
18. JAVA 프로그램의 실행결과를 쓰시오.
    
    ```java
    public class javasumEs {
        int i, sum;
        for (i = 0;i<=5 ; i++){
            sum += i;
            System.out.println(i);
            if(i==5) {
                System.out.println("=");
                System.out.println(sum);
    
            }
            else {
                System.out.println("+");
            }
    ```
    

20. C언어 결과

```java
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
-->  Lee 38
```

[🤒기출 22년1회](https://www.notion.so/22-1-a56bbbb2a2594501a288463db010446e?pvs=21)