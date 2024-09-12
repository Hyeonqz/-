## 결제 후 정산 시스템
- 현실에서 직접 겪는 여러 상황을 직접 코드로 설계해보는 레포지토리 입니다.
- 모든 예제는 폴더 단위로 나뉘어져 있으며, 패키지 내부 Application 클래스를 통해 실행해 볼 수 있습니다.
- 패키지 구조는 도메인 계층 패턴을 이용해서 구성했습니다.
- Entity, Service, Repository 에 주석을 통해 간단한 설명을 적어두었습니다.


### 실행환경
- Java 21
- SpringBoot 3.3
- MySQL8.0
- Hibernate 6.1
- Spring Data JPA
- Gradle


#### 공부를 하며 정리한 내용 또는, 도움을 받았던 레퍼런스를 정리해서 src/main/resources 에 MarkDown 파일로 정리를 해둘 예정 입니다.


### 학습 목표
1) JPA 를 활용한 Entity 구성
    - queryDSL 을 활용한 동적쿼리 활용해보기

2) 테스트 커버리지70% 이상 목표

공통 기능에 대한 추상화를 어떻게 시킬지에 대한 고민을 많이 해보자

### 기능 구현
default: 은행 어플에 회원가입 된 User 가 있다.<br>

1) User 가 oo 은행에 계좌를 생성한다. (O)

2) 계좌간 금액 송금이 가능하다
    - 10만원 이하 금액은 수수료 0원, 10만원 이상 금액은 수수료 1000원
        - sendLog 에 보낸 기록 저장
        - receiveLog 에 받은 기록 저장

3) 가맹점에서 결제가 가능하다.
    - 가맹점은 임의로 내가 등록을 해둠.(따로 가맹점 등록 API 는 없음)
    - 결제시 계좌에서 지불 금액만큼 차감이 된다.

4) 모든 결제에 대한 정산은 'HK컴퍼니' 라는 곳에서 도 맡아서 진행한다.
    - 은행은 여러곳 이지만, 정산은 한 회사에 진행을 한다.
    - 그리고 정산에 대한

5) ATM 에서 현금 인출이 가능하다.

6) 매일 밤 11:50 ~ 12:10 분 까지 점검 시간으로 설정을 하여 계좌 이용이 불가능하다.
    - 스케쥴러 작업이 필요

* 기능은 생각나는대로 계속 추가할 예정임.

### API Test
- SwaggerAPI, PostMan

### Ref
- https://github.com/nomoreFt/jpa-best-practice