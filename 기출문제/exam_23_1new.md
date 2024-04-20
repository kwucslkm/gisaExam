1. java 결과

   ```java
    class Static {
        public int a = 20;
        static int b = 0; 
    }
    public class exam_23_1_1 {
        public static void main(String[] args){        
            int a = 10;
            Static.b = 0;
            Static.b = a;
            Static st = new Static();
            System.out.println(Static.b++);
            System.out.println(st.b);
            System.out.println(a);
            System.out.println(st.a);
            
        }
    }
        ==> 10  
            11
            10
            20
    ```
2. C언어 결과
    ```c
    #include <stdio.h>
    int main(int argc, char const *argv[])
    {
        char a[] = "Art";
        char* p = NULL;
        p = a;
        printf("%s\n", a);
        printf("%c\n", *p);
        printf("%c\n", *a);
        printf("%s\n", p);
        for (int i=0; a[i] != '\0';i++)
            printf("%c",a[i]);
        return 0;
    }
    ==> Art
        A
        A
        Art
        Art 
    ```
3. c언어 결과

    ```c
    #include <stdio.h>
    main(){
        char* a = "qwer";
        char* b = "qwtety";
        for (int i = 0 ; a[i] != '\0' ; i++)
            for(int j = 0 ; b[j] != '\0' ; j++)
                if(a[i] == b[j])
                    printf("%c", a[i]);
    }
    ==> qwe
    ```
4. 클라이언트와 서버 간 자바스크립트 및 xml을 비동기 방식으로 처리하며, 전체 페이지를
   새로 고치지 않고도 웹페이지 일부 영역만을 업데이트할 수 있도록 하는 기술을 의미하는 용어를 쓰시오.
    ==> AJAX

5. 데이터 교환 방식에 대한 설명
    - (가상회선 방식) : 연결형 통신에서 주로 사용되는 방식으로, 출발지와 목적지의 전송
      경로를 미리 연결하여 논리적으로 고정한 후 통신하는 방식
    - (데이터그램 방식) : 비연결형 통신에서 주로 사용되는 방식으로, 사전에 접속 절차를 수행하지 않고 헤더에 출발지에서 목적지까지의 경로 지정을 위한 충분한 정보를 붙여서 개별적으로 전달하는 방식


6. 용어 설명 ==> L2TP ( Layer 2 Tunneling Protocol )
    - 데이터링크 계층의 프로토콜 중 하나로, 터널링 프로토콜인 PPTP와 VPN의 구현에 사용하는 L2F의 기술적 장점들을 결합하여 만든 프로토콜이다. 자체적으로 암호화 및 인증 기능을 제공하지 않아 다른 보안 프로토몰과 함께 사용되는 경우가 많다.
* osi 7 layer
    7 응용 
    6 표현  
    5 세션               암호화 프로토콜
    4 전송           ==> SSL
    3 네트워크       ==> IPSec  
    4 데이터링크     ==> PPTP, L2F, L2TP  
    5 물리  

7. 용어 설명 ==> SSH
    - 다른 컴퓨터에 로그인, 원격 명령 실행, 파일 복사 등을 수행할 수 있도록 다향한 기능
      을 지원하는 프로토콜 또는 이를 이용한 응용 프로그램이다.
    - 데이터 암호화와 강력한 인증 방법으로 보안성이 낮은 네트워크에서도 안전하게 통신할 
      수 있다.
    - 키(Key)를 통한 인증 방법을 사용하려면 사전에 클라이언트이 공개키를 서버에 등록해야
      한다.
    - 기본적으로는  22번 포트를 사용한다.

* TCP 접속에 사용되는 서비스별 포트 번호(Port Number)
    - FTP : 21(다른번호로 변경 가능) - TELNET : 23 - SMTP : 25
    - DNS : 53  - HTTP : 80

8. 멀웨어(Malware)
    - 웜 : 윈도우나 응용 프로그램의 취약점 또는 E-mail 등을 통해 전파되며, 바이러스와 같이 자기복제가 가능하며 네트워크를 통해 스스로 전파가 가능하다.
    분산 서비스 거부 공격, 버퍼 오버플로 공격, 슬래머 등이 웜 공격의 한 형태임
    - 트로이 목마 : 정산적인 응용 프로그램에 포함되어 실행 되는 악성코드로 , 정상적인 응용 프로그램으로 위장하고 있다가 활성화되면 공격자는 이를 이용하여 사용자의 컴퓨터를 조종할 수 있게 된다.
    - 바이러스 : 정상 파일을 감염시키며, 자기복제가 가능하다. 파일을 통해 감염되며 네트워크를 통해 스스로 전파되지는 못한다.
    - 워터링 홀 : 목표 조직이 자주 방문하는 웹 사이트를 사전에 감염시켜 목표 조직의 일원이 웹 사이트에 방문했을 때 악성 코드에 감염되게 하는 웹 기반 공격
    - 좀비 PC : 악성코드에 감염되어 다른 프로그램이나 컴퓨터를 조종하도록 만들어진 컴퓨터로, C&C (Command & Control) 서버의 제어를 받아 주로 DDos 공격 등에 이용됨
    - C&C 서버 : 해커가 원격지에서  감염된 좀비 PC에 명령을 내리고 악성 코드를 제어하기 위한 용도로 사용하는 서버를 말함
    - 봇넷(Botnet) : 악성 프로그램에 감염되어 악의적인 의도로 사용될수 있는 다수의 컴퓨터들이 네트워크로 연결된 형태를 말함
    - 제로데이 공격 : 보안 취약점이 발견되었을 때 발견된 취약점의 존재 자체가 널리 공표되기도 전에 해당 취약점을 통하여 이루어지는 보안 공격으로, 공격의 신속성을 의미함
    - 키로거 공격 : 컴퓨터 사용자의 키보드 움직임을 탐지해 ID, 패스워드, 계좌번호, 카드 번호 등과 같은 개인의 중요한 정보를 몰래 빼가는 해킹 공격
    - 랜섬웨어 : 인터넷 사용자의 컴퓨터에 잠입해 내부 문서나 파일 등을 암호화해 사용자가 열지 못하게 하는 프로그램으로, 암호 해독용 프로그램의 전달을 조건으로 사용자에게 돈을 요구하기도 함
    - 백도어 : - 시스템 설계자가 서비스 기술자나 유지 보수 프로그램 작성자의 액세스 편의를 위해 시스템 보안을 제거하여 만들어 놓은 비밀 통로로, 컴퓨터 범죄에 악용되기도 함
      - 백도어 탐지 방법 : 무결성 검사, 열린 포트 확인, 로그 분석, SetUID 파일 검사
    
9. c 언어 괄호 넣기
    ```c
    main(){
        int input = 101110;
        int di = 1;
        int sum = 0;
        while(1) {
            if (input ==0) break;
            sum = sum + (input % 10) * di;
            di = di * 2;
            input = input / 10;
        }
        printf("%d", sum);
    }
    ==> ( % ), ( 10 )
    ```

10. 용어 ==> ICMP,Internet Control Message Protocol
    - IP(Internet Protocol)의 주요 구성원 중 하나로, OSI 계층 모델의 네트워크 계층
      에 속한다. 네트워크 컴퓨터의 운영체제에서 오류 메시지를 수신하거나, 전송 경로를 변경하는 등 오류 처리를 위한 제어 메시지를 주로 취급한다. 관련된 도구로 traceroute, ping 이 있으며, ping of death 와 같은 네트워크 공격 기법에 활용되기도 한다.

* TCP/IP 구조  
    |OSI|TCP/IP|기능|  
    |------|---|---|
    |응용 계층     |          |- 응용 프로그램 간의 데이터 송수신 제공
    |표현 계층     |응용계층   |- TELNET, FTP,SMTP, SNMP, DNS, HTTP 등
    |세션 계층     |          |
    |전송 계층     |전송계층   | - 호스트 간의 신뢰성 있는 통신 제공
    |네트워크 계층 |인터넷 계층 | - 데이터 전송을 위한 주소 지정, 경로 설정을 제공함
    |네트워크 계층 |인터넷 계층 | - IP, ICMP, IGMP, ARP, RARP 
    |데이터링크 계층|네트워크 액세스 계층| - 실제 데이터(프레임)를 송수신하는 역할
    |데이터링크 계층|네트워크 액세스 계층| - Ethernet, IEEE 802, HDLC, X.25,    RS-232C ARQ 등
    * 응용 계층의 주요 프로토콜
        - FTP(File Transfer Protocol) - 컴퓨터와 컴퓨터 또는 컴퓨터와인터넷 
          사이에서 파일을 주고 받을 수 있도록 하는 원격 파일 전송 프로토콜
        - SMTP(Simple Mail Transfer Protocol) - 전자 우편을 교환하는 서비스
        - TELNET 
            - 멀리 떨어져 있는 컴퓨터에 접속하여 자신의 컴퓨터처럼 사용할 수  있도록 해주는 서비스
            - 프로그램을 실행하는 등 시스템 관리 작업을 할 수 있는 가상으이 터미널(Virtual Terminal) 기능을 수행함
        - SNMP(Simple Network Management Protocol)
            - TCP/IP의 네트워크 관리 프로토콜로, 라우터나 허브 등 네트워크 기기의 네트워크 정보를 네트워크 관리 시스템에 보내는 데 사용되는 표준 통신 규약
        - DNS - 도메인 네임을  IP 주소로 매핑(Mapping)하는 시스템
        - HTTP(HyperText Transfer Protocol)
            - 월드 와이드 웹(WWW) 에서 HTML문서를 송수신 하기 위한 표준 프로토콜
        - TCP(Transmission Control Protocol)
            - 양방향 연결 (Full Duplex Connection) 형 서비스를 제공함
            - 가상 회선 연결(Virtual Circuit Connection) 형태의 서비스를 제공함
            - 스트림 위주의 전달(패밋 단위)을 함
            - 신뢰성 있는 경로를 확립하고 메시지 전송을 감독 함
            - 순서 제어, 오류 제어, 흐름 제어 기능을 함
            - 패킷의 분실, 손상, 지연이나 순서가 틀린 것 등이 발생할 때 투명성이 보장되는 통신을 제공함
            - TCP 프로토콜의 헤더는 기본적으로 20Byte에서 60Byte 까지 사용할 수 있는데, 선택적으로 40Byte를 더 추가할 수 있으므로 최대 100Byte까지 크기를 확장할 수 있음
        - UDP(User Datagram Protocol)
            - 데이터 전송 전에 연결을 설정하지 않는 비연결형 서비스를 제공함
            - TCp에 비해 상대적으로 단순한 헤더 구조를 가지므로, 오버헤드가 적고, 흐름 제어나 순서 제어가 없어 전송 속도가 빠름
            - 고속의 안정성 있는 전송 매체를 사용하여 빠른 속도를 필요로 하는 경우, 동시에 여러 사용자에게 데이터를 전달할 경우, 정기적으로 반복해서 전송할 경우에 사용함
            - 실시간 전송에 유리하며, 신뢰성 보다는 속도가 중요시되는 네트워크에서 사용됨
            - UDP헤더에는 Source Port Number, Destination Port Number, Length, Checksum 등이 포함됨
        - RTCP(Real-Time Control Protocol)
            - RTP(Real-time Transfer protocol)캐킷의 전송 품질을 제어하기 위한 제어 프로토콜
            - 세션(Sessiona)에 참여한 각 참여자들에게 주기적으로 제어 정보를 전송함
            - 하위 프로토콜은 데이터 패킷과 제어 패킷의 다중화를 제공함
            - 데이터 전송을 모니터링하고 최소한의 제어와 인증 기능만을 제공함
            - RTCP 패킷은 항상 32비트의 경계로 끝남
    * 인터넷 계층의 주요 프로토콜
        - IP(Internet Protocol)
            - 전송할 데이터에 주소를 지정하고, 경로를 설정하는 기능을 함
            - 비연결형인 데이터그램 방식을 사용하는 것으로 신뢰성이 보장되지 않음
        - ICMP(Internet Control Message protocol,인터넷 제어 메시지 프로토콜)
            - IP와 조합하여 통신중에 발생하는 오류의 처리와 전송 경로 변경 등을 위한 제어 메시지를 관리하는 역할을 함
            - 헤더는 8Byte로 구성 됨
        - IGMP(Internet Group Management Protocol, 인터넷 그룹 관리 프로토콜)
            - 멀티캐스트를 지원하는 호스트나 라우터 사이에서 멀티캐스트 그룹 유지를 위해 사용됨
        - ARP(Address Resolution Protocol, 주소 분석 프로토콜)
            - 호스트의 IP 주소를 호스트와 연결된 네트워크 접속 장치의 물리적 주소(Mac Address)로 바꿈
        - RARP(Reverse Address Resolution Protocol)
            - ARP와 반대로 물리적 주소를 IP주소로 변환하는 기능을 함
    * 네트워크 액세스 계층의 주요 프로토콜
        - Ethernet(IEEE 802.3)
            - CSMA/CD 방식의 LAN
        - IEEE 802
            - LAN 을 위한 표준 프로토콜
        - HDLC 
            - 비트 위주의 데이터 링크 제어 프로토콜
        - X.25
            - 패킷 교환망을 통한 DTE와 DCE 간의 인터페이스를 제공하는 프로토콜
        - RS-232C
            - 공중 정화 교환망(PSTN)을 통한 DTE와 DCE 간의 인터페이스를 제공하는 
            프로토콜
        
11. 프록시 디자인 패턴
    - 복잡한 시스템을 개발하기 쉽도록 클래스나 객체들을 조합하는 패턴에 속하며, 대리자라는 이름으로도 불린다. 내부에서는 객체 간의 복잡한 관계를 단수한게 정리해
    주고, 외부에서는 객체의 세부적인 내용을 숨기는 역할을 한다.

12. 릴레이션
    - 튜플 : 릴레이션을 구성하는 각각의 행을 의미하며, 파일 구조에서는 레코드에 해당함
    - 릴레이션 인스턴스 : 데이터 개체를 구성하고 있는 속성들에 데이터 타입이 정의되어 구체적인 데이터 값을 가진 것으로, 실제 값을 가진 튜플을 의미함
    - 카디널리티 : 튜플의 개수를 의미함
13. <학생> 테이블에서 '이름'이 '민수'인 튜플을 삭제하고자 한다. 다음 <처리조건>을 참조 하여 SQL을 작성하시오.
    <처리 조건>
    - 최소한의 코드로 작성될 수 있도록 SQL문을 구성한다.
    - 명령문 마지막의 세미콜론(;)은 생략이 가능하다.
    - 인용 부호가 필요한 경우 작은 따옴표('')를 사용한다.
```sql
    ==>  DELETE FROM 학생 WHERE 이름 = '민수'
```
14. c언어 
```c
#include <stdiolh>
void swap(int*a, intidx1, int idx2){
    int t = a[idx1];
    a[idx1]=a[idx2];
    a[idx2]=t;
}
void Usort(int*a, int len){
    for(int i=0 ; i< len-1 ; i++)
        for(int j=0 ; j< len -1-i ; j++)
            if (a[j]>a[j+1])
                swap(a, j, j+1);

}
main() {
    int a[]={85,75,50, 100,95};
    int nx = 5;
    Usort(a,(nx));
}

```
15. 파이썬 결과
    ```python
    asia={'한국', '중국', '일본'}
    asia.add('베트남')
    asia.remove('일본')
    asia.update({'한국','홍콩','태국'})
    print(asia)
    ==> {'한국', '중국','베트남','홍콩','태국'}
    ```

16. <성적> 테이블에서 과목별 점수의 평균이 90점 이상인 '과목이름', '최소점수', '최대점수'를 검색하고자 한다. <처리조건>을 참고하여 SQL을 작성하시오.
<처리조건>
    - 최소한의 코드로 작성될 수 있도록 SQL문을 구성한다.
    - WHERE문은 사용하지 않는다.
    - GROUP BY 와 HAVING 을 이용한다.
    - 집계함수(Aggregation Function)를 사용하여 명령문을 구성한다.
    - '최소점수', '최대점수'는 별칭(Alias) 을 위한 AS문을 이용한다.
    - 명령문 마지막의 세미콜론(;)은 생략이 가능하다.
    - 인용 부호가 필요한 경우 작은 따옴표('')를 사용한다.
```sql
SELECT 과목이름, MIN(점수) AS 최소점수, MAX(점수) AS 최대점수
FROM 성적
GROUP BY 과목이름 
HAVING AVG(점수) >= 90;
```
```sql
select 과목이름, min(점수) as 최소점수, max(점수) as 최대점수 
from 성적 
group by 과목이름
having avg(점수) >=90;
```
* DML(Data Manipulation Language)
 - select
 - insert
 - delete
 - update

17. java
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
18. 스키마
 - 개념 스키마 
    - 데이터베이스의 전체적인 논리적 구조로, 모든 응용 프로그램이나 사용자들이 필요로 하는 데이터를 종합한 조직 전체의 데이터베이스이다.
    - 개체 간의 관계와 제약 조건을 나타내고, 데이터베이스의 접근 권한, 보안 및 무결성 규칙에 관한 명세를 정의함.
 - 내부 스키마
    - 물리적 저장장치의 입장에서 본 데이터베이스 구조
    - 실제로 저장될 레코드의 형식, 저장 데이터 항목의 표현 방법, 내부 레코드의 물리적 순서 등을 나타낸다.
 - 외부 스키마
    - 사용자나 응용 프로그래머가 각 개인의 입장에서 필요로 하는 데이터베이스의 논리적 구조를 정의한 것이다.

19. 분기 커버리지

20. java 결과
```java
class Parent{
    int x = 1000;
    Parent(){
        this(3000);
    }
    Parent(int x){
        this.x = x;
    }
}
public class Test{
    public static void main(Stirng[] args)
        Child c = new Child();
        System.out.println(c.getX());
}
class Child extends Parent{
    int x = 4000;
    Child(){
        this(5000);
    }
    Child(int x){
        this.x = x;
    }
    int getX(){
        return this.x;
    }
}
```