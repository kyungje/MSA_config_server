# MSA_config_server

MSA_config_server은 마이크로서비스 아키텍처(Microservices Architecture) 환경에서 설정 데이터를 중앙에서 관리하기 위한 설정 서버입니다.

## 주요 기능

- 중앙화된 설정 관리
- 설정 데이터의 버전 관리
- Spring Cloud Config 기반 설정 서버 구현

## 기술 스택

- **언어**: Java
- **프레임워크**: Spring Boot, Spring Cloud Config

## 설치 및 실행

1. 저장소를 클론합니다:
   ```bash
   git clone https://github.com/kyungje/MSA_config_server.git
   ```
2. 프로젝트 디렉토리로 이동합니다:
   ```bash
   cd MSA_config_server
   ```
3. 필요한 의존성을 설치하고 애플리케이션을 실행합니다:
   ```bash
   ./mvnw spring-boot:run
   ```

## 사용 방법

1. 설정 저장소를 설정합니다. `application.yml` 파일 또는 `bootstrap.yml` 파일을 수정하여 설정 저장소를 지정합니다.
2. 클라이언트 애플리케이션이 설정 서버에 접근할 수 있도록 설정합니다.
3. 설정 서버에서 제공하는 API를 사용하여 설정 데이터를 가져옵니다.

## 기여

기여를 환영합니다! 이 프로젝트에 기여하려면 다음 단계를 따라주세요:

1. 이 저장소를 포크합니다.
2. 새로운 브랜치를 생성합니다:
   ```bash
   git checkout -b feature/새로운기능
   ```
3. 변경사항을 커밋합니다:
   ```bash
   git commit -m "추가: 새로운 기능 설명"
   ```
4. 브랜치를 푸시합니다:
   ```bash
   git push origin feature/새로운기능
   ```
5. Pull Request를 생성합니다.

## 라이센스

이 프로젝트는 MIT 라이센스를 따릅니다. 세부사항은 [LICENSE](LICENSE) 파일을 참조하세요.
```

이 파일을 프로젝트 루트 디렉토리에 `README.md`로 저장하면 됩니다. 추가적인 내용이 필요하면 알려주세요!
