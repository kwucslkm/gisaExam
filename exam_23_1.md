1. 데이터링크 계층의 프로토콜 중 하나로, 터널링 프로토콜인 PPTP 와 VPN의 구현에 사용하는 L2F의 기술적 장점들을 결합하여 만든 프로토콜이다. 자체적으로 암호화 및 인증 기능을 제공하지 않아 다른 보안 프로토콜과 함께 사용되는 경우가 많다.
    =>  L2TP, Layer 2 Tunneling Protocol
---
osi 7 layer
    7 응용
    6 표현
    5 세션
    4 전송           ==> ssl
    3 네트워크       ==> ipSec
    4 데이터링크     ==> PPTP, L2F, L2TP
    5 물리

VPN (Virtual Private Network, 가상 사설 통신망)
    - 인터넷 등 통신 사업자의 공중 네트워크와 암호화 기술을 이용하여 사용자가 마치 자신의 전용 회선을 사용하는 것처럼 해주는 보안 솔루션.
    - SSL VPN : PC에 VPN Client 프로그램을 설치하여 VPN 서버에 접속하는 방식으로 암호화를 위해 SSL 프로토콜을 사용함
    - IPSec VPN : VPN서버가 설치된 각각의 네트워를 서로 연결하는 방식으로, 암호화를 위해 IPSec 프로토콜을 사용함
    - SSL(Secure Sockets Layer)
     : 데이터를 송수신하는 두 컴퓨터 사이에 위치하여 TCP/IP 계층과 애플리케이션 계층 사이에서 인증, 암호화, 무결성을 보장하는 업계표준 프로토콜
    - IPsec(IP Security)
     : 네트워크 계층에서 IP 패킷 단위의 데이터 변조 방지 및 은닉 기능을 제공하는 프로토콜
    - PPTP (Point -to-point Tunneling Protocol) - 지점간 터널링 프로토콜
    마이크로소프트가 제안한 VPN 프로토콜이다. PPP(Point-to-Point Protocol)에 기초하며 두 대의 컴퓨터가 직렬 인터페이스를 이용하여 통신할 때 사용
    - L2F(layer 2 forwarding)
     : 미국 시스코 시스템즈사가 개발한 VPN 프로토콜. PPTP나IPSEC와 달리, 데이터 링크층 수준에서 캡슐화가 가능하고, IP네트워크 이외에서도 이용할 수 있음.
    - L2TP(Layer 2 Tunneling Protocol)
     : 터널링 프로토콜인 PPTP와 VPN 의 구현에 사용하는 L2F의 기술적 장점들을 결합하여 만든 프로토콜. 자체저으로 암호화 및 인증 기능을 제공하지 않아 다른 보안 프로토콜과 함께 사용하는 경우가 많다.    


