1. java 결과는
```java
class SuperObject{
    public void draw(){
        System.out.println("A");
        draw();
    }
    public void paint(){
        System.out.print('B');
        draw();
    }
}
class SubObject extends SuperObject{
    public void paint(){
        super.paint();
        System.out.print('C');
        draw();
    }
    public void draw(){
        System.out.print('D');
    }
}
public class Test{
    public static void main(String[] args){
        SuperObject a= new SubObject();
        a.paint();
        a.draw();
    }
}

BDCDD
```
2. OAuth
    ```
    - 인터넷 애플리케이션에서 사용자 인증에 사용ㅇ되는 표준 인증 방법으로, 공개 API(OpenAPI)로 구현 되었다.
    - 인터넷 사용자가 웹사이트나 애플리케이션에 비밀번호를 제공하지 않고 자신에게 접근 구넌한을 부여하여 사용할 수 있다.
    - 2010년 ETF에서 1.0이 공식 표준안으로 발표되었다.
    ```



18. 프로토콜 설명
    ```
    - 거리 벡터 라우팅 프로토콜이라고도 불리며, 최단 경로 탐색에 Bellman-Ford 알고리즘이 사용된다.
    - 소규모 동종의 네트워크 내에서는 효율적이나, 최대 홉 수가 제한되므로 대규모 네트워크에서는 사용할 수 없다.
    - 일정 시간 동안 라우팅 정보가 갱신되지 않으면 해당 경로를 이상 상태로 간주한다.
    ==> RIP, 경로 선택 정보 프로ㅗ토콜, Routing Information Protocol
    ```
