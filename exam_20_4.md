1. 디자인 패턴
    - 디자인 패턴은 객체기향 프로그래밍 설계를 할 때 자주 발생하는 문제들에 대해 재사용할 수 있도록 만들어놓은 패턴들의 모음이다.
    - 에리히 감마(Erich Gamma), 리차드 헬름(Richard Helm), 랄프 존슨, 블리시디스에 의해 개발 영역에서 디자인 패턴을 구체화하고 체계화 시켰다.
    - goF의 디자인 패턴은 **생성, 구조**, ( **행위** ) 의 3가지로 분류한다.
2. UML을 이용한 다이어그램 중 아래 그림에 해당하는 다이어그램을 쓰시오.
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/12acd428-e2fc-42d3-9139-083a4b4ede1a/Untitled.png)
    
    —> 패키지 다이어그램
    
3. 일반, 업무용, 게[임, 오락 등의 일반적인 업무에 사용하는 테스트 오라클로 특정한 몇 개의 입력 값에 대해서만 기대하는 결과를 제공해 주는 오라클을 쓰시오. —> 샘플링 오라클
    - 테스트 오라클
        - 참(True) 오라클 - 모든 입력값에 적합한 결과를 생성하여, 발생한 오류를 모두 검출
        - 일관성 검사(Consistent) 오라클 - 애플리케이션 변경이 있을 때, 수행 전과 후의 결과값이 같은지 확인
        - 샘플링(Sampling) 오라클 - 임의로 선정한 몇 개의 입력값에 대해서만 기대하는 결과를 제공
        - 휴리스틱(Heuristic) 오라클 - 임의의 입력값에 대해 올바른 결과를 제공하고, 나머지 값들에 대해서는 휴리스틱(추정)으로 처리
4. 테스트 기법 중 다음과 같이 입력값을 넣고, 출력값을 비교하는 테스트 기법을 쓰시오.
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d6ccc5d6-f065-4273-a381-632ec4ab4649/Untitled.png)
    
    —> 동치 분할 테스트
    
    블랙박스 테스트 
    
    - 동등 분할 기법
        - 입력자료에 초점을 맞춰 테스트 케이스를 만들어 검사하는 방법
    - 경계값 분석
        - 입력 조건의 경계값을 테스트 케이스로 선정하는 방법
    - 원인-효과 그래프 검사
        - 입력 데이터 간의 관계와 출력에 영향을 미치는 상황을 체계적으로 분석한 다음 효용성이 높은 테스트 케이스를 선정하여 검사하는 기법
    - 오류 예측 검사
        - 과거의 경험이나 테스터의 감각으로 테스트하는 기법
    - 비교 검사
        - 여러 버전의 프로그램에 동일한 테스트 자료를 제공하여 동일한 결과가 출력 되는지 테스트 하는 기법
5. <학생> 테이블을 대상으로 <요구사항> 을 적용하여 아래<결과>와 같이 출력하는 SQL문을 작성하시오.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e6bc57ba-b930-488e-8546-e234cfe08884/Untitled.png)

—> select 학과, count(*) as ‘학과별 튜플 수’ from 학생 group by 학과

1. 스티핑(Sniffing)에 대하여 간략히 서술하시오.
    - 네트워크상에 통과되는 패킷들의 내용을 엿보는 행위이다.
    
    ☠️ 서비스 공격 유형의 종류 - 정리해두자
    
    - DDos(Distributed Denial of Service, 분산 서비스 거부)
    - 피싱(Phishing)
    - 파밍(Pharming)
    - 스니핑(Sniffing)
    - 스미싱(Smishing)
    - 큐싱(Qshing)
    - 랜섬웨어(Ransomware)
    - 키 로거(Key Logger)
    - SQL 삽입(SQL Injection)
    - XSS(Cross Site Scripting)
2. 정보보안의 3요소 중 가용성에 대해서 서술하시오.
    1. 기밀성 - 인가된 사용자만 정보 자산에 접근할 수 있다. 방화벽, 암호
    2. 무결성 - 시스템 내의 정보는 오직 인가된 사용자만 인가된 방법으로 수정할 수 있다.
    3. 가용성 - 인가된 사용자가 정보를 요구할 때 적시에 제공되어야 하는 원칙
3. 데이터베이스의 이상(Anomaly) 의 종류 3가지를 쓰시오.
    1. 삽입 이상
    2. 삭제 이상
    3. 갱신 이상
4. 데이터베이스 회복 기법에 관련된 설명에서 괄호에 들어갈 가장 알맞은 용어를 쓰시오.
    - 다양한 데이터 회복 기법 중 (  ) 회복 기법은 로그를 이용한 회복 기법으로 데이터베이스에 대한 갱신 로그를 저장함으로서 회복에 대비한다.
    - (  ) 회복 기법은 트랜잭션이 실행 상태에서 변경되는 내용을 그때그때 바로 데이터베이스에 적용하는 기법이다.
    - (  ) 회복 기법은 장애가 발생하면 로그 파일에 기록된 내용을 참조하여, 장애 발생 시점에 따라 Redo 나 Undo를 실행하여 데이터베이스를 복구한다.
    
    —> 즉시 갱신
    
    💥 지연 갱신 기법 
    
    - 트랜잭션이 수행되어 부분완료 될 때까지 데이터베이스에 적용하지 않고 지연시킨 후 부분완료가 되면 로그(Log)의 내용을 토대로 데이터베이스에 적용하는 기법
    - Undo 없이 Redo 만수행
    
    💥 검사점 회복 기법 (CheckPoint Recovery)
    
    - 트랜잭션이 실행되는ㄴ 중간에 검사 시점(Check Point)을 지정하여 검사 시점까지 수행 후 완료된 내용을 데이터 베이스에 적용하는 기법
    
    💥 그림자 페이징(Shadow Paging) 기법
    
    - 로그(Log)를 사용하지 않고, 데이터베이스를 동일한 크기의 단위인 페이지로 나누어 각 페이지마다 복사하여 그림자 페이지를 보관
    - 데이터베이스의 변경되는 내용은 원본 페이지에만 적용하고, 장애가 발생되는 경우 그림자 페이지를 이용해 회복
5. 다음 프로세스 상태 전이도의 빈 칸에 알맞은 프로세스 상태를 각각 쓰시오.
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/74bcdacf-bba0-4987-b5f5-9865eb6871c6/Untitled.png)
    
    1. 준비,   2. 실행,  3. 대기
6. 용어를 쓰시오. —> IPv6
    - IPv4의 주소 고갈 문제를 해결하기 위하여 기존의  IPv4주소 체계를 128비트 크기로 확장한 차세대 인터넷 프로토콜 주소
    - 헤더의 내용을 확인하는 데 소요되는 오버헤드를 최소화하도록 설계
    - 16비트씩 8부붙, 128비트로 구성되며, 콜론(:)으로 구분한다.
    - 주소 분류로, 유니캐스트, 애니캐스트를 사용한다.
    - IPv4 는 유니, 멀티, 브로드캐스트 사용한다.
    - IPv4/ IPv6 전환 기술
    
    | 듀얼 스택
    (Dual Stack) | -IPv4/IPv6를 동시에 지원
    -IPv4/IPv6 패킷을 주고받을 수 있음 |
    | --- | --- |
    | 터널링
    (Tunneling) | -두 IPv6 네트워크 간에 터널을 이용하는 기술
    - IPv4 / IPv6 호스트와 라우터에서 IPv6 패킷을 IPv4 패킷에 캡슐화하여 전송 |
    | 주소 변환
    (Address Translation) | IPv4와 IPv6 간에 주소를 변환하여 두 버전을 연동 |
7. 다음 설명에 해당하는 운영체제를 적으시오. —> 유닉스(UNIX)
    - 1960년대 말 벨 연구소(Bell Labs)에서 개발된 운영체제로 다중 사용자, 멀티태스킹 운영체제이다.
    - 대부분 C언어로 작서되어 있어 이식성이 높다.
    - 트리구조의 파일 시스템을 갖는다.
8. 다음 용어는  —> 하둡(Hadoop)
    - 정형 데이터 및 사진 영상 등의 비정형 데이터를 효과적으로 처리하는 오픈소스 빅데이터 솔루션이다.
    - 많은 양의 데이터를 여러 대의 범용 컴퓨터에 나눠서 저장해주고 처리한다.
    - 더그 커팅과 마이크 캐퍼랠라가 개발했으며, 구글의 맵리듀스(MapReduce) 엔진을 사용한다.
    
    💥빅데이터 관련 용어
    
    - Big Data
        - 대량의 정형 똔느 비정형 데이터 집합 및 이러한 데이터로부터 가치를 추출하고 결과를 분석하는 기술
    - Hadoop(하둡)
        - 오픈소스 기반 분산 컴퓨팅 기술
        - 현재 정형/비정형 빅 데이터 분석에 가장 선호되는 솔루션
    - NoSQL
        - 전통적인 관계형 데이터베이스 RDBMS와 다르게 설계된 비관계형 데이터베이스
        - 대규모의 유연한 데이터 처리를 위해서 적합
    - Data Mining (데이터 마이닝)
        - 대규모로 저장된 데이터 안에서 체계적이고 자동적으로 통계적 규칙이나 패턴을 찾아내는 것
    - 데이터웨어 하우스
        - 기단 시스템의 데이터 베이스에 축적된 데이터를 공통의 형식으로 변환하여 관리하는 데이터베이스
    - 데이터마트
        - 데이터의 한 부분으로서 특정 사용자가 관심을 갖는 데이터들을 담은 비교적 작은 규모의 데이터웨어하우스
    - OLAP
        - 이용자가 직접 데이터베이스를 검색, 분석해서 문제점이나 해결책을 찾는 분석형 애플리케이션 개념
    - Mashup
        - 웹에서 제공하는 정보 및 서비스를 이용하는 새로운 소프트웨어나 서비스, 데이터베이스 등을 만드는 기술
9. 다음 용어를 쓰시오. - 블록체인
    - 관리 대상 데이터를 ‘블록’이라고 하는 소규모 데이터들이 P2P 방식을 기반으로 생성된 체인 형태의 연결고리 기반 분산 데이터 저장 환경에 저장하여 누구라도 임의로 수정할 수 없고 누구나 변경의 결과를 열람할 수 있는 분산 컴퓨팅 기술 기반의 원장 관리 기술
10. 다음 용어를 쓰시오 - NAT(Network Address Translation)
    - 우리나라 말로 번역하면 ‘네트워크 주소 변환’이라는 의미
    - 내부에서 사용하는 사설 IP주소와 외부로 보여지는 공인 IP 주소 간의 IP 를 여러 개의 내부 사설 IP로 변환하기 위해 사용하는 기술
11. 다음 C언어로 작성된 프로그램 출력 결과는

```java
void main()
{
    char *p = "KOREA";
    printf("%s\n",p);         --> KOREA
    printf("%s\n",p+3);       --> EA
    printf("%c\n", *p);       --> K
    printf("%c\n",*(p+3));    --> E
    printf("%c\n",*p+2);      --> M
}
```

1. 다음 JAVA 코드의 빈칸에 알맞은 내용을 쓰시오.
    
    ```java
    public class exam_20_4_17 {
        public static void main(String[] args) {
            int[][] arry = new int[3][5];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    arry[i][j] = j * 3 + (i + 1);
                    System.out.print(arry[i][j] + "");
                }
                System.out.println();
            }
        }
    }
    ```
    
2. 다음 JAVA 코드의 빈칸에 알맞은 내용을 쓰시오.
    
    —> 처리 결과    :  00001010
    
    ```java
    public class exam_20_4_18 {
        public static void main(String[] args) {
    
            int a[] = new int[8];
            int i = 0, n = 10;
            while (i < a.length) {       <--------
                a[i++] = n % 2;          <--------
                n /= 2;
            }
            for (i = 7; i >= 0; i--) {
                System.out.printf("%d", a[i]);
            }
        }
    }
    ```
    
3. 다음 JAVA 코드 출력 결과는 —> 1
    
    ```java
    public class exam_20_4_19 {
        public static void main(String[] args) {
            Parent obj = new Child();
            System.out.println(obj.com(4));
        }
    }
    
    class Parent {
        int com(int num) {
            if (num <= 1)
                return num;
            return com(num - 1) + com(num - 2);
        }
    }
    
    class Child extends Parent {
        int com(int num) {
            if (num <= 1)
                return num;
            return com(num - 1) + com(num - 3);
        }
    }
    ```
    
4. 다음 파이썬 언어 출력 결과는

```java
lol= [[1,2,3],[4,5],[6,7,8,9]]
print(lol[0])
print(lol[2][1])
for sub in lol:
    for item in sub:
        print(item, end="")
    print()
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cc7919b0-e9af-4ccb-b119-5977ccb692a8/Untitled.png)