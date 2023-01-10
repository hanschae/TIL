# AWS 서버 구축

[toc]

## 클라우드 서비스란?

- 물리적 자원 혹은 논리적 자원을 대여하는 것

애플리케이션을 구축하는데 필요한 모든 것을 비용을 지불하고 대여 (쉽고 싸고 안전하고 유지가 용이)



## EC2 (Elastic Compute Cloud)

- AWS의 대표적 서비스로, 물리적 자원의 대여

원하는 만큼 CPU, 메모리, 디스크 등 자원의 크기 선택 후 서버 생성 가능



- EC2 자원생성하기

AWS 개인 회원 회원가입 후

AWS Management Console → 우측 상단 자기와 가까운 지역 설정 → EC2 클라우드 가상서버 서비스 →

인스턴스 시작 → 프리티어 사용 가능한 Amazon Linux 2 AMI 사용 → 프리티어 t2.micro → 인스턴스 개수 1 →

네트워크 구성 (소스 0.0.0.0/0 인 규칙은 모든 IP 주소 액세스 허용) → KeyPair .pem 파일 저장 → 인스턴스 시작



## 간단한 Node.js 애플리케이션 만들기

- KeyPair 권한 설정 및 실행

IPv4 퍼블릭 IP 복사 후 Window Powershell 실행

cd Downloads → ls , chmod 400 권한 설정으로 KeyPair.pem 실행

```
(Window 환경에서는 chmod 400 명령어가 사용 불가, 아래 명령어를 cmd에 순차적 실행함으로 권한설정)

icacls.exe KeyPair.pem /reset icacls.exe 
KeyPair.pem /grant:r %username%:(R) 
icacls.exe KeyPair.pem /inheritance:r
```

ssh -i KeyPair.pem ec2-user@ 복사한 IPv4 퍼블릭IP → yes



- instance에 Node 설치하기 (원하는 Node.js 버전을 스위치하며 사용가능)

google에 nvm sh 검색, github 클릭

1. curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.3/install.sh | bash`

2. export NVM_DIR="$([ -z "${XDG_CONFIG_HOME-}" ] && printf %s "${HOME}/.nvm" || printf %s "${XDG_CONFIG_HOME}/nvm")"
   [ -s "$NVM_DIR/nvm.sh" ] && \. "$NVM_DIR/nvm.sh" # This loads nvm
3. nvm install --lts (안정적인 lts 버전 install)
4. nvm use --lts

```
npm -v 입력 시 node: /lib64/libm.so.6: version `GLIBC_2.27' not found (required by node)
라는 에러메세지가 뜸, sudo yum install 명령어로 해결이 되지 않아 버전을 낮춤
nvm install 16
nvm use 16 
```



mkdir app → cd app → npm i -S express 

npm 명령어를 통해 express 패키지 설치 → ls 확인 시 package-lock.json 이라는 node_module 확인가능

vi index.js

```
const express = require('express')
const app = express()

app.get('', async (req,res) => {
        res.send('Hello World')
})

app.listen(3000, () => {
        console.log('App is listening 3000 port')
})
```

esc 누르고 :wq (저장 후 종료)

node index.js 실행 시 'App is listening 3000 port' 확인가능



이후 터미널을 추가 실행해 ssh -i KeyPair.pem ec2-user@ 복사한 IPv4 퍼블릭IP

curl http://localhost:3000

개인요청 발송 시 Hello World라는 응답 옴



이전 터미널에 ctrl+c 로 앱을 끄고, vi index.js 를 통해 수정

Hello world 다음 \n 입력 후 :wq 시 터미널 반영된것 확인 가능



터미널 내 localhost 3000번 요청과, 퍼블릭IP 에 3000번을 요청하는 것은 같다.

바로 실행 시 인스턴스가 3000번 포트를 외부에 오픈하지 않았기에 접속불가, 

인스턴스 창 내 보안그룹 Hans SecurityGroup에서 포트 범위 3000 의 인바운드 규칙을 생성



이후 공용 ip:3000 을 실행 시 hello world 가 나옴



- 요약

EC2 인스턴스 생성 → SSH로 접속해 node, npm 설치 후 index.js 생성 → EC2 내 Node.js 생성

→ 3000번 포트 연결 허용



## EC2 자원 삭제하기

KeyPair.pem 파일 삭제

인스턴스 종료

보안그룹 Hans SecurityGroup 삭제

대시보드 확인 후 KeyPair 삭제, 종료된 인스턴스는 2~4시간 후 삭제됨