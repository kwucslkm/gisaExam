1. 형상 통제에 대해 간략히 설명하시오.
    - 소프트웨어 형상 변경 요청을 검토하고 승인하여 현재의 베이스라인에 반영될 수 있도록 식벽 - 통제 - 감사 - 기록

2. 다음은 EAI 구축 유형에 대한 설명이다. 1,2에 해당하는 유형을 쓰시오.
    
    | 유형 | 설명 |
    | --- | --- |
    | Point to point | - 중간에 미들웨어를 두지 않고 각 애플리케이션 간 직접 연결 
    |                | - 솔루션 구매 없이 통합, 상대적 저렴하게 통합 가능
    |                | - 변경, 재사용 어려움 |
    | --- | --- |
    | hub&spoke      | - 단일 접점이 허브 시스템을 통해 데이터를 전송하는 중앙 집중적 방식
    |                | - 모든 데이터 전송 보장, 확장 및 유지 보수 용이
    |                | - 허브 장애 시 전체 영향 |
    | --- | --- |
    | Message Bus    | - 애플리케이션 사이 미들웨어(버스)를 두어 처리
    | (ESB 방식)     | - 미들웨어 통한 통합
    |                | - 어댑터가 각 시스템과 버스를 두어 연결하므로 뛰어난 확정성, 
    |                |   대용량 처리가능
    | --- | --- |
    | Hybrid         |  - 표준 통합 기술, 데이터 병목 현상 최소화 |
    |                |  - 유연한 통합 작업이 가능
    
3. UI(User Interface) - 설계 원칙 중 직관성에 대해 간략히 서술하시오.
    - 누구나 쉽게 이해하고 사용할 수 있어야 한다.
    
    | 설계원칙 | 설명 |
    | --- | --- |
    | 직관성 | 누구나 쉽게 이해하고 사용할 수 있어야한다. |
    | 유효성 | 사용자의 목적을 정확하게 달성하여야 한다. |
    | 학습성 | 누구나 쉽게 배우고 익힐 수 있어야 한다. |
    | 유연성 | 사용자의 요구사항을 최대한 수용하며, 오류를 최소화하여야 한다. |

4. 다음 제어 흐름 그래프에 대한 분기 커버리지(Branch Coverage)를 수행하는 경우의 테스트 케이스 경로를 7단계와 6단계로 나눠서 순서대로 나열하시오.
    
    1→2→3→4→5→6→1
    
    1→2→4→5→6→7

    * 코드 커버리지(Code Coverage)
      - 조건/결정 커버리지
        - 결정포인트 T/F, 개별조건식 T/F를 가져야 한다.
      - 변경/조건 커버리지
        - 모든 결정 포인트 내의 개별 조건식은 적어도 한 번 T, F를 가져야 한다.
      - 다중 조건 커버리지
        - 결정 포인트 내 모든 개별 조건식의 가능한 조합을 100% 보장해야한다.

    
5. 소프트웨어 테스트 기법 중 소프트웨어의 기능이 완전히 작동하는 것을 입증하는 테스트로, 동치분할/경계값 분석을 이용하여 테스트 하는 기법을 쓰시오.
    - 블랙박스 테스트
        - 동등 분할 기법 - 입력 자료에 초점을 맞춰 테스트 케이스를 만들어 검사하는 방법
        - 경계값 분석 - 입력 조건의 경계값을 테스트 케이스로 선정하는 방법
        - 원인-효과 그래프 검사 - 입력 데이터 간의 관계와 출력에 영향을 미치는 상황을 
          체계적으로 분석한 다음 효용성이 높은 테스트 케이스를 선정하여 검사하는 기법
        - 오류 예측 검사 - 과거의 경험이나 테스터의 감각으로 테스트하는 기법
        - 비교 검사 - 여러 버전의 프로그램에 동일한 테스트 자료를 제공하여 동일한 결과가 출력되는지 테스트하는 기법

6. ( alter ) table 학생 ( add ) 주소 varchar(20);
    - alter add
    - alter modify
    - alter drop
    - alter rename

7.  SQL문 작성
    ```sql
    selet 과목이름, min(점수) as 최소점수, max(점수) as 최대점수 
    from 성적 
    group by 과목 
    having avg(점수) >= 90
    ```
8. delete from 학생 where 이름 = ‘민수’

9. 데이터베이스 스키마(Schema)에 대해 
    - 데이터베이스의 전체적인 구조와 제약조건에 대한 명세를 기술하고 정의한것이다.
    - 외부 스키마 -
    - 내부 스키마 -
    - 개념 스키마 -

10. 다음에서 설명하는 관계 대수 연산의 기호르 쓰시오.
    - 릴레이션 A에서 릴레이션 B의 모든 조건을 만족하는 튜플을 제외한 수 프로젝션하는 연산자이다. —> division( 나누기)
    - 
    
11. 다음 설명에 해당하는 라우팅 프로토콜을 쓰시오.

| - 최단 경로 탐색에 다익스트라 알고리즘 기반 방식 사용
- 최적 경로 선택을 위해 흡수, 대역폭, 지연시간 등을 고려
- 링크 상태 변화시에만 라우팅 정보 전송 |
| --- |

—> OSPF

12. 인터넷 프로토콜의 비신뢰적인 특성을 보완하기 위한 프로토콜로 IP 패킷 전송 중 에러 발생 원인을 알려주거나 네트워크 상태를 진단해주는 기능을 제공하는 프로토콜을 무엇이라고 하는지 영문 약어로 쓰시오.  —> ICMP
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/aa891f60-b253-4bdc-af30-5060960a04d5/Untitled.png)
    
13. 헝가리안 표기법에 대해 간략히 설명하시오.
    - 프로그래밍에서 변수앞에 타입을 붙여서 작성하는 규칙
14. 리팩토링에 대해서 설명하시오.
    - 결과의 변경 없이 코드의 구조를 재조정 한다.
15. 가장적합한용어는
    - 심리학자 톰 마릴은 컴퓨터가 메시지를 전달하고, 메시지가 제대로 도착했는지 확인하며, 도착하지 않았을 경우 메시지를 재전송하는 일련의 방법을 가리켜 ‘기술적 은어’라는 뜻으로 (프로토콜)이라 불렸다.
    - 구문, 의미 , 타이밍
16. C 언어 실행 결과 —> 0
    
    ```c
    #include <stdio.h>
    void main()
    {
    	int i=0, c=0;
    	while (i<10)
        {
    		i++;
    		c*=i
        }
    	printf("%d",c);
    }
    ==> 0
    ```
    
17. C 언어 결과 —> 234
    
    ```c
    #include <studio.h>
    
    int r1()
    {
    	return 4;
    }
    int r10()
    {
    	return (30+r1());
    }
    int r100()
    {
    	return (200+r10());
    }
    int main()
    {
    	printf("%d\n", r100());
        return 0;
    }
    ==>
    ```
    
18. java 출력 결과
    ```java
    public class Exam2 {
        public static void main(String[] args) {
            int i=0; 
            int sum = 0;
            while(i<10){
                i++;
                if(i%2 ==1)
                    continue;
                sum+=i;
            }
            System.out.println(sum);
        }
        
    }
    ```
19.  java 출력 결과
```java
abstract class Vehicle{
    String name;
    abstract public String getName(String val);
    public String getName(){
        return "Vehicle name: " + name;
    }
}
public class Test {
    public static void main(String[] args){
        Vehicle obj = new Car("Spark");
        System.out.print(obj.getName());
    }
}
class Car extends Vehicle {
    private String name;
    public Car(String val){
        name = super.name = val;
    }
    public String getName(String val){
        return "Car name: " + val;
    }
    public String getName(byte[] val){
        return "Car name : " + val;
    }
}
==> Vehicle name: Spark
```
8. java 출력 결과
- Vehicle name : Spark
20. 생성자(Constructor) 에 대해 간략히 설명하시오.
    - 생성자는 객체 생성 시 자동으로 호출되는 메서드로 멤버를 초기화하는 목적으로 주로 사용된다.

```java

```

<aside>
🔥 기출 20년4회

1. 디자인 패턴에 대한 설명이다. 빈 칸에 들어갈 가장 적합한 용어를 쓰시오.
    
    gof 의 디자인 패턴은 생성, 구조, ( 행위 ) 의 3가지로 분류한다.
    
2. UML을 이용한 다이어그램 중 아래 그림에 해당하는 다이어그램을 쓰시오. —>패키지 다이어그램
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/15eb1f63-cfa6-45d4-90ab-8176dee79aa5/Untitled.png)
    
    - 구조적 다이어그램(Structure Diagram)
        1. 클래스 다이어그램
            - 시스템을 구성하는 클래스들 사이의 관계를 표현한다.
        2. 패키지 다이어그램
            - 클래스나 유스 케이스 등을 포함한 여러 모델 요소들을 그룹화하여 패키지를 구성하고 패키지들 사이의 관계를 표현한다.
        3. 복합체 구조 다이어그램
            - 복합 구조의 클래스와 컴포넌트 내부 구조를 표현한다.
        4. 객체 다이어그램
            - 객체 정보를 보여준다.
        5. 컴포넌트 다이어그램
            - 컴포넌트 구조 사이의 관계를 표현한다.
        6. 배치 다이어그램
            - 소프트웨어, 하드웨어, 네트워크를 포함한  실행 시스템의 물리 구조를 표현한다.
3. 일반, 업무용, 게임, 오락 등의 일반적인 업무에 사용하는 테스트 오라클로 특정한 몇 개의 입력 값에 대해서만 기대하는 결과를 제공해 주는 오라클을 쓰시오.
    
    —> 샘플링 오라클
    
4. 테스트 기법 중 다음과 같이 입력값을 넣고, 출력값을 비교하는 테스트 기법을 쓰시오.
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/964118b5-094b-46d8-afda-6bb81323ab0d/Untitled.png)
    
    —> 동치분할 검사
    
5. <학생> 테이블을 대상으로 <요구사항> 을 적용하여 아래 <결과>와 같이 출력하는 SQL문을 작성하시오.
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/52db89dc-70dd-4c80-8357-687a60069cef/Untitled.png)
    

—> select 학과 , count(*) as ‘학과별튜플수’ from 학생 group by 학과

1. 스니핑(Sniffing)에 대하여 간략히 서술하시오.
    - 네트워크상에 통과되는 패킷들의 내용을 엿보는 행위이다.
2. 정보보안의 3요소 중 가용성ㅇ에 대해서 서술하시오.
    - 인가된 사용자가 정보를 요구할 때 적시에 제공되어야 하는 원칙
- 기밀성 - 인가된 사용자만 정보 자산에 접근할 수 있다. → 방화벽, 암호
- 무결성 - 시스템 내의 정보는 오직 인가된 사용자가 인가된 방법으로만 수정할 수 있다.
- 가용성 - 사용자가 필요할 때 데이터에 접근할 수 있는 능력을 말한다.

1. 데이터 이상 현상
    - 삽입 이상
    - 삭제 이상
    - 갱신 이상
    
    데이터베이스 이상 현상을 없애기 위해 정규형
    
     정규형
    
    - 비정규 릴레이션
        
                👇도메인이 원자값
        
    - 제 1 정규형
        
                👇부분적 함수 종속 제거
        
    - 제 2 정규형
        
                👇이행적 함수 종속 제거
        
    - 제 3 정규형
        
                👇결정자이면서 후보키가 아닌 것 제거
        
    - BCNF
        
                👇다치 종속 제거 
        
    - 제 4 정규형
        
                👇조인 종속성 이용
        
    - 제 5정규형
    
2. 데이터베이스 회복 기법에 관련된 설명에서 괄호에 들어갈 가장 알맞은 용어를 쓰시오.
    
    
    | 다양한 데이터 회복 기법 중( 즉시갱신 ) 회복 기법은 로그를 이용한 회복 기법으로 데이터베이스에 대한 갱신 로그를 저장함으로서 회복에 대비한다.
    (  즉시갱신 ) 회복 기법은 트랜잭션이 실행 상태에서 변경되는 내용을 그때그때 바로 데이터베이스에 적용하는 기법이다.
    (  즉시갱신 ) 회복 기법은 장애가 발생하면 로그 파일에 기록 된 내용을 참조하여, 장애 발생 시점에 따라 Redo나 Undo를 실행하여 데이터베이스를 복구한다. |
    | --- |

 10. 다음 프로세스 상태 전이도의 빈 칸 1~3에 알맞은 프로세스 상태를 각각 쓰시오

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c2418968-1b78-4d44-bfee-1d9a76b7911f/Untitled.png)

1. IPv6 
    
    
    | - IPv4 의 주소 고갈 문제를 해결하기 위하여 기존의 IPv4주소 체계를 128비트 크기로 확장한 차세대 인터넷 프로토콜 주소
    - 헤더의 내용을 확인하는 데 소요되는 오버헤드를 최소화하도록 설계
    - 16비트씩 8부분, 128비트로 구성되며, 콜론(:)으로 구분한다.
    - 주소 분류로, 유니캐스트, 멀티캐스트, 애니캐스트를 사용한다. |
    | --- |
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bfb4d6b6-7f4f-42da-be88-c7e7f7b7232c/Untitled.png)
    
2. 다음 운영 체제는 —> 유닉스
    - 1960년대 말 벨 연구소(Bell Labs)에서 개발된 운영체제로 다중 사용자, 멀티태스킹 운영체제이다.
    - 대부분 C언어로 작성되어있어 이식성이 높다.
    - 트리구조의 파일 시스템을 갖는다.
3. 다음 용어는 —> 하둡(Hadoop)
    - 정형 데이터 및 사진 영상 등의 비정형 데이터를 효과적으로 처리하는 오픈소스 빅데이터 솔루션이다.
    - 많은 양의 데이터를 여러 대의 범용 컴퓨터에 나눠서 저장해주고 처리한다.
    - 더그 커팅과 마이크 캐퍼랠라가 개발했으며, 구글의 맵리듀스(MapReduce)엔진을 사용한다.
    
    - 빅데이터 관련 용어
        - Big Data - 대량의 정형 또는 비정형 데이터 집합 및 이러한 데이터로부터 가치를 추출하고 결과를 분석하는 기술
        - Hadoop(하둡)
            - 오픈 소스 기반 분산 컴퓨팅 기술
            - 현재 정형 / 비정형 빅 데이터 분석에 가장 선호되는 솔루션
        - NoSQL
            - 전통적인 관계형 데이터베이스 RDBMS와 다르게 설계된 비관계형 데이터베이스
            - 대규모의 유연한 데이터 처리를 위해서 적합
        - Data Mining (데이터 마이닝)
            - 대규모로 저장된 데이터 안에서 체게적이고 자동적으로 통계적 규칙이나 패턴을 찾아내는 것
        - 데이터웨어하우스
            - 기간 시스템의 데이터베이스에 축적된 데이터를 공통의 형식으로 변환하여 관리하는 데이터베이스
        - 데이터 마트
            - 데이터의 한 부분으로서 특정 사용자가 관심을 갖는 데이터들을 담은 비교적 작은 규모의 데이터웨어 하우스
            - OLAP
                - 이용자가 직접 데이터베이스를 검색, 분석해서 문제점이나 해결책을 찾는 분석형 애플리케이션 개념
            - Mashup
                - 웹에서 제공하는 정보 및 서비스를 이용하는 새로운 소프트웨어나 서비스, 데이터베이스 등을 만드는 기술
4. 다음 용어는  —> 블록체인
    - 관리 대상 데이터를 ‘블록’이라고 하는 소규모 데이터들이 P2P방식을 기반으로 생성된 체인 형태의 연결고리 기반 분산 데이터 저장 환경에 저장하여 누구라도 임의로 수저할 수 없고 누구나 변경의 결과를 열람할 수 있는 분산 컴퓨팅 기술 기반의 원장 관리 기술
5. 다음 용어는 —> NAT(Network Address Translation)
    - 우리나라 말로 번역하면 ‘네트워크 주소 변환’이라는 의미
    - 내부에서 사용한는 사설 IP주소와 외부로 보여지는 공인 IP주소 간의 IP Address 변환 방식을 말한다.
    - 한정된 공인 IP를 여러 개의 내부 사설 IP로 변환하기 위해 사용하는 기술
6. 다음 결과는
    
    ```c
    void main() {
      char *p = "KOREA";
      printf("%s\n", p);
      printf("%s\n", p + 3);
      printf("%c\n", *p);
      printf("%c\n", *(p + 3));
      printf("%c\n", *p + 2);
    }
    ```
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7fce4c31-d1da-4436-a321-69343f206a41/Untitled.png)
    

17.  자바   정답 —> 3,5

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3a61c67e-6448-401b-ba43-9dc8e65ea9ea/Untitled.png)

1. 아래 <처리결과> 처럼 10진수를 2진수로 변환해주는 프로그램이다. JAVA 프로그램의 빈 칸 1~2에 들어갈 JAVA 구문을 쓰시오.
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1a012e96-8738-4864-aa7b-fc3898586fcc/Untitled.png)
    
2. Java 실행 결과 —> 1
    
    ```java
    public class Exam_20_4_19_java {
        public static void main(String[] args) {
            Parent obj = new Child();
            System.out.print(obj.com(4));
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
    
3. Python 언어 출력 결과
    
    ```python
    lol= [[1,2,3],[4,5],[6,7,8,9]]
    print(lol[0])
    print(lol[2][1])
    for sub in lol:
        for item in sub:
            print(item, end="")
        print()
    ```
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3e33b5f4-68af-4890-a0f4-7aa161c8da99/Untitled.png)
    
</aside>